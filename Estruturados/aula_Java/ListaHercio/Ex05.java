/*Estruturas de Repetição: Escreva um programa que solicite ao usuário um número
inteiro positivo e, em seguida, exiba todos os números de 1 até o número inserido
pelo usuário. */
import java.util.Scanner;
public class Ex05{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Numero positivo: ");
        int num = input.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
}
