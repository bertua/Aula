/*Escreva um programa que solicite ao usuário que insira dois números inteiros e
realize a soma desses números. Em seguida, exiba o resultado da soma. */
import java.util.Scanner;
public class Ex02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int n1 = input.nextInt();
        System.out.print("Numero 2: ");
        int n2 = input.nextInt();
        int soma = n1 + n2;
        System.out.println("Soma: " + soma);
    }
}
