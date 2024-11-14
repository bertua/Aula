import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        Table table = new Table();
        table.setDeck(deck);

        System.out.print("Number of players: ");
        int np= input.nextInt();
        input.nextLine();

        for (int i = 0; i < np; i++){
            System.out.print("Player " + (i+1) + " name: ");
            String name = input.nextLine();
            Player player = new Player(name);
            table.addPlayer(player);
        }

        table.initialDraw();
        table.mostRelevantHand();
        int currentPlayer = table.getCurrentPlayer();
        while (true) {
            System.out.println(table.getPlayers().get(currentPlayer).getName() + "'s turn:");
            table.getPlayers().get(currentPlayer).printHand();
            for (int i =0; i<table.getPlayers().get(currentPlayer).getHand().size(); i++) {
                System.out.print(" "+ i +"  ");
            }
            System.out.println("");


            for (int i = 0; i <) {
                
                
                
                for(Piece piece : player.getHand()){
                    System.out.print(piece);
                }
            }
        



        }



        if(deck.getPieces().isEmpty()){
            
        } else{
            player.draw(deck.pickPiece());
        }
    }
}