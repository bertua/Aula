/*Crie um programa que solicite ao usuário que insira 5 nomes e armazene-os em um
vetor. Em seguida, exiba os nomes em ordem alfabética. */
import java.util.Scanner;
import java.util.Arrays;
public class Ex07{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Nome " + (i+1) + ": ");
            String nome = input.nextLine();
            arr[i] = nome;
        }
        Arrays.sort(arr);
        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
