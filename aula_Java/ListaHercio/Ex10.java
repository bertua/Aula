/*Funções: Refaça o seu programa anterior para incluir uma função que receba a
matriz como parâmetro e a exiba na tela. Em seguida, chame essa função no
programa principal. */
import java.util.Scanner;
import java.util.Arrays;
public class Ex10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j ++){
                System.out.print("Linha " + (i+1) + " Coluna " + (j+1) + ": ");
                int num = input.nextInt();
                arr[i][j] = num;
            }
        }
        printMatriz(arr);
    }

    public static void printMatriz(int[][] matriz){
        System.out.println(Arrays.deepToString(matriz));
    }
}
