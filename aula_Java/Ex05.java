/*Escreva um programa que solicite ao usuário que insira as 4 notas de um aluno em
cinco disciplinas diferentes. Armazene essas notas em um vetor e, em seguida, calcule
e exiba a média das notas de cada disciplina.*/
import java.util.Scanner;
import java.util.ArrayList;
public class Ex05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Double> matematica = new ArrayList<>();
        ArrayList<Double> portugues = new ArrayList<>();
        ArrayList<Double> fisica = new ArrayList<>();
        ArrayList<Double> quimica = new ArrayList<>();
        ArrayList<Double> sociologia = new ArrayList<>();
        
        String[] materias = {"Matematica", "Portugues", "Fisica", "Quimica", "Sociologia"};
        
        for(int i = 0; i < 5; i++){
            System.out.println("Notas dispciplina: " + materias[i]);
            for(int j = 1; j < 5; j++){
                System.out.print("Nota " + j + ": ");
                double nota = input.nextDouble();
                if(i == 0){
                    matematica.add(nota);
                } else if(i == 1){
                    portugues.add(nota);
                } else if(i == 2){
                    fisica.add(nota);
                } else if(i == 3){
                    quimica.add(nota);
                } else if(i == 4){
                    sociologia.add(nota);
                }
            }
        }
        System.out.println("Media Matematica: " + media(matematica));
        System.out.println("Media Portugues: " + media(portugues));
        System.out.println("Media Fisica: " + media(fisica));
        System.out.println("Media Quimica: " + media(quimica));
        System.out.println("Media Sociologia: " + media(sociologia));
    } 
    
    public static double media(ArrayList<Double> collection){
        double soma = 0;
        for(double item : collection){
            soma += item;
        }
        return soma/collection.size();
    }

}
