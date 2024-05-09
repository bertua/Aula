/*Matrizes: Modifique o programa anterior para permitir que o usuário insira os
números em uma matriz 3x3. Após inserir os números, exiba a matriz na tela. */
import java.util.Scanner;
import java.util.Arrays;
public class Ex08{
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
        System.out.println(Arrays.deepToString(arr));
    }
}
