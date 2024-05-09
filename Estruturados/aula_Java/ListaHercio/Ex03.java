/*Estruturas Condicionais: Modifique o programa anterior para verificar se a idade é
maior ou igual a 18 anos. Se for, exiba "Você é maior de idade"; caso contrário, exiba
"Você é menor de idade". */
import java.util.Scanner;
public class Ex03{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}
