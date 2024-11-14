public class Piece{
    private int n1;
    private int n2;
    private String position;
    private boolean hidden;

    public Piece(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1(){
        return this.n1;
    }

    public void setN1(int n1){
        this.n1 = n1;
    }

    public int getN2(){
        return this.n2;
    }

    public void setN2(int n2){
        this.n2 = n2;
    }

    public String getPosition(){
        return this.position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public boolean getHidden(){
        return this.hidden;
    }

    public void setHidden(boolean hidden){
        this.hidden = hidden;
    }

    public boolean isPair(){
        return this.n1 == this.n2;
    }

    public int numberPiece(){
        return this.n1 + this.n2;
    }

    public String toString(){
        return this.n1 + "*" + this.n2;
    }


}