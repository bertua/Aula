/*Modifique o programa anterior para permitir que o usuário insira os nomes em uma
matriz 2x3. Após inserir os nomes, exiba a matriz na tela. */
import java.util.Scanner;
import java.util.Arrays;
public class Ex09{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[][] arr = new String[2][3];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print("Nome " + "Linha " + (i+1) + " Coluna " + (j+1) + ": ");
                String nome = input.nextLine();
                arr[i][j] = nome;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
