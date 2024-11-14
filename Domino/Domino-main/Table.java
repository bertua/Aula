import java.util.ArrayList;
public class Table{
    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck;
    private int currentPlayer;

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void setDeck(Deck deck){
        this.deck = deck;
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }

    public int getCurrentPlayer(){
        return this.currentPlayer;
    }

    public void initialDraw(){
        for(int i = 0; i < players.size(); i++){
            for (int j = 0; j < 7; j++) {
                this.players.get(i).draw(this.deck.pickPiece());
            }
        }
    }

    public int mostRelevantHand(){
        int mostRelevant = 0;
        int playerMostRelevantPiece;
        for(int i = 0; i < players.size(); i++){
            playerMostRelevantPiece = players.get(i).mostRelevantPiece();
            if(mostRelevant > playerMostRelevantPiece){
                mostRelevant = playerMostRelevantPiece;
                currentPlayer = i;
            }

        }
        return mostRelevant;
    }



}