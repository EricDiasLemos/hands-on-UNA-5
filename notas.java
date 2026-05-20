import java.util.ArrayList;
import java.util.Scanner;

public class notas{

    public static void main(String[]args){
        double quantidadenotas = 4;
        double soma = 0;
        
        ArrayList<Double> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < quantidadenotas; i++){
            System.out.print("Insira a "+ (i+1)+ "° nota: ");

            notas.add(sc.nextDouble());
        
            soma = soma + notas.get(i);

        }

        double media = soma/quantidadenotas;

        if (media >= 7) {
            System.out.print("A média da turma é: "+ media);
        }







        
    }

}