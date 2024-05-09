import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Horas trabalhadas: ");
        double horasT = input.nextDouble();

        System.out.print("Valor horas: ");
        double valorH = input.nextDouble();

        System.out.print("Horas extras trabalhadas: ");
        double horasET = input.nextDouble();

        double valorHE = valorH * 1.5;
        System.out.println("Valor horas extras: " + valorHE);

        double salarioB = horasT * valorH;
        System.out.println("Salario basico: " + salarioB);

        double salarioHE = horasET * valorHE;
        System.out.println("Salario horas extras: " + salarioHE);

        double salarioM = salarioB + salarioHE;
        System.out.println("Salario mensal: " + salarioM);

        double total = 0;
        double faixa1 = 1412.00 * 0.075;
        double faixa2 = (2666.68 - 1412.00) * 0.09;
        double faixa3 = (4000.03 - 2666.68) * 0.12;
        double faixa4 = (7786.02 - 4000.03) * 0.14
        if(salarioM <= 1412.00){
            total = salarioM * 0.075;
        } else if (salarioM > 1412.00 && salarioM <= 2666.68){
            total = faixa1 + (salarioM - 1412.00) * 0.09; 
        } else if (salarioM > 2666.68 && salarioM <= 4000.03){
            total = faixa1 + faixa2 + (salarioM - 2666.68) * 0.12;
        } else if (salarioM > 4000.04 && salarioM <= 7786.02){
            total = faixa1 + faixa2 + faixa3 + (salarioM - 4000.03) * 0.14;
        } else {
            total = faixa1 + faixa2 + faixa3 + faixa4;
        }
        System.out.println("INSS: " + total);
        
        double salarioF = salarioM - total;
        System.out.println("Salario final: " + salarioF);
    }
}
