/*Entrada e Saída de Dados: Escreva um programa Java que solicite ao usuário seu
nome e idade e, em seguida, exiba essas informações na tela. */
import java.util.Scanner;
public class Ex01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        System.out.println(nome + ", " + idade);
    }
}
