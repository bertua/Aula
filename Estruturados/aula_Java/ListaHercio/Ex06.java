/*Vetores: Crie um programa que solicite ao usuário que insira 5 números inteiros e
armazene-os em um vetor. Em seguida, exiba os números na ordem inversa em que
foram digitados. */
import java.util.Scanner;
public class Ex06{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Numero " + (i+1) + ": ");
            int num = input.nextInt();
            arr[i] = num;
        }
        for(int j = arr.length -1; j >=0; j--){
            System.out.println(arr[j]);
        }
    }
}
