import java.util.ArrayList;
public class Player{
    private String name;
    private ArrayList<Piece> hand = new ArrayList<>();

    public Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void draw(Piece piece){
        this.hand.add(piece);
    }

    public ArrayList<Piece> getHand(){
        return this.hand;
    }

    public int mostRelevantPiece(){
        int mostRelevant = 0;
        for(int i = 0; i < hand.size(); i++){
            if (hand.get(i).isPair()) {
                mostRelevant = hand.get(i).numberPiece();
            }
        }
        return mostRelevant;
    }

    public Piece play(int piece) {
        return this.hand.remove(piece);
    }

    public void printHand(){
        for(int i = 0; i < this.hand.size(); i++){
            System.out.print(this.hand.get(i) + " ");
        }
        System.err.println();
    }


}