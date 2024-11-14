import java.util.ArrayList;
import java.util.Random;

public class Deck{
    private ArrayList<Piece> pieces = new ArrayList<>();
    private Random random = new Random();

    public Deck(){
        this.populate();
    }

    public void populate(){
        for(int i = 0; i < 7; i++){
            for(int j = i; j < 7; j++){
                this.pieces.add(new Piece(i,j));
            }
        }
    }

    public ArrayList<Piece> getPieces(){
        return this.pieces;
    }
    
    public Piece pickPiece(){
        return pieces.remove(random.nextInt(this.pieces.size()));
    }
}
