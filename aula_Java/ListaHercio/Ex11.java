/*Escreva uma função que receba um vetor de inteiros como parâmetro e retorne o
maior elemento do vetor. Em seguida, utilize essa função para encontrar e exibir o
maior elemento do vetor inserido pelo usuário. */
import java.util.Scanner;
public class Ex11{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Numero " + (i+1) + ": ");
            int num = input.nextInt();
            arr[i] = num;
        }
        System.out.println(maior(arr));
    }

    public static int maior(int[] vetor){
        int maior = vetor[0];
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }
}
