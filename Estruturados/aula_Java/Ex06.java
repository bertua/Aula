/*Leia a velocidade máxima permitida em uma avenida, a placa do veículo e a velocidade
com que o motorista estava dirigindo nela e calcule a multa que uma pessoa vai
receber, sabendo que são pagos: a) 50 reais se o motorista estiver ultrapassar em até
10km/h a velocidade permitida(ex.: velocidade máxima: 50km/h; motorista a 60km/h ou
a 56km/h); b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade
permitida. c) 200 reais, se estiver acima de 31km/h da velocidade permitida. */
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Velocidade máxima: ");
        int velM = input.nextInt();

        System.out.print("Placa do veículo: ");
        String placa = input.next();

        System.out.print("Velocidade do veículo: ");
        double velV = input.nextDouble();
        
        while(!placa.equals("SAIR")){
            multa(velV, velM);
            System.out.println();
            System.out.print("Placa do veículo: ");
            placa = input.next();
            if(placa.equals("SAIR")){
                break;
            }
            System.out.println("Velocidade do veículo: ");
            velV = input.nextDouble();
        }
        
    }
    
    public static void multa(double velV, int velM){
        if(velV > velM && velV <= velM +10){
            System.out.println("Multa: 50R$");
        } else if(velV > velM +10 && velV <= velM +30){
            System.out.println("Multa: 100R$");
        } else if(velV > velM +30){
            System.out.println("Multa: 200R$");
        } else if(velV < velM){
            System.out.println("Sem multa");
        }
    }
}
