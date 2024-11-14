
package pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TamanhoCad {

    private int id_tamanho;
    private String tamanho;
    private double preco;
    
    public int getId_tamanho() {
        return id_tamanho;
    }

    public void setId_tamanho(int id_tamanho) {
        this.id_tamanho = id_tamanho;
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void Inserir(){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO tamanho (tamanho, preco) VALUES (?,?)",Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, this.getTamanho());
            stmt.setDouble(2, this.getPreco());
            
            stmt.execute();
            ResultSet result = stmt.getGeneratedKeys();
            result.next();
            this.setId_tamanho(result.getInt(1));
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<TamanhoCad> Listar(){
        Connection conn = Database.getConnection();
        ArrayList<TamanhoCad> list = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tamanho");
            ResultSet result = stmt.executeQuery();
            while(result.next()){
                TamanhoCad tamanhoCad = new TamanhoCad();
                tamanhoCad.setId_tamanho(result.getInt("id_tamanho"));
                tamanhoCad.setTamanho(result.getString("tamanho"));
                tamanhoCad.setPreco(result.getDouble("preco"));
                list.add(tamanhoCad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TamanhoCad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }
    
    public static void Excluir(int id){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM tamanho WHERE id_tamanho=?");
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SaborCad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Atualizar(){
        Connection conn = Database.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE tamanho SET tamanho = ?, preco = ? WHERE id_tamanho = ?");
            stmt.setString(1, this.getTamanho());
            stmt.setDouble(2, this.getPreco());
            stmt.setInt(3, this.getId_tamanho());
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SaborCad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
