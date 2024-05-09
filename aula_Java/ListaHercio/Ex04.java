/*Modifique o programa anterior para verificar se a soma dos números é maior que 10.
Se for, exiba "A soma é maior que 10"; caso contrário, exiba "A soma é menor ou
igual a 10". */
import java.util.Scanner;
public class Ex04{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int n1 = input.nextInt();
        System.out.print("Numero 2: ");
        int n2 = input.nextInt();
        int soma = n1 + n2;
        System.out.println("Soma: " + soma);
        if(soma > 10){
            System.out.println("A soma é maior que 10");
        } else {
            System.out.println("A soma é menor ou igual a 10");
        }
    }
}
