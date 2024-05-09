/*Desenvolva um pequeno sistema Java, operado via console, que ofereça quatro
funcionalidades básicas: soma, divisão, multiplicação e subtração. O sistema deverá
solicitar ao usuário que escolha uma das funções disponíveis e, em seguida, a função
selecionada deverá pedir os números necessários para realizar a operação e exibir o
resultado. O sistema continuará a solicitar operações até que o usuário decida sair,
digitando a palavra "SAIR".*/
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1: Soma");
        System.out.println("2: Subtração");
        System.out.println("3: Multiplicação");
        System.out.println("4: Divisão");
        System.out.println("5: SAIR");
        System.out.print("Escolha a operação: ");
        int ope = input.nextInt();

        while(ope != 5){
            switch(ope){
                case 1:
                    soma();
                    break;

                case 2:
                    menos();
                    break;

                case 3:
                    vezes();
                    break;

                case 4:
                    div();
                    break;

                default:
                    System.out.println("Número incorreto");
            }

            System.out.println("1: Soma");
            System.out.println("2: Subtração");
            System.out.println("3: Multiplicação");
            System.out.println("4: Divisão");
            System.out.println("5: SAIR");
            System.out.println();
            System.out.print("Escolha a operação: ");
            ope = input.nextInt();
       }
    }

    public static void soma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double a = input.nextInt();
        System.out.print("Segundo número: ");
        double b = input.nextInt();
        System.out.println("Soma: " + (a + b));
    }
    public static void menos(){
        Scanner input = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double a = input.nextInt();
        System.out.print("Segundo número: ");
        double b = input.nextInt();
        System.out.println("Subtração: " + (a - b));
    }
    public static void vezes(){
        Scanner input = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double a = input.nextInt();
        System.out.print("Segundo número: ");
        double b = input.nextInt();
        System.out.println("Multiplicação: " + (a * b));
    }
    public static void div(){
        Scanner input = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double a = input.nextInt();
        System.out.print("Segundo número: ");
        double b = input.nextInt();
        if(b == 0){
            System.out.println("ERROR");
        } else {
            System.out.println("Divisão: " + (a/b));
        }
    }

}
