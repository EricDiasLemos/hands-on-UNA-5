import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class fila{

    public static void main(String[]args){
        
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.add("Eric");
        fila.add("Carlos");
        fila.add("Rafaela");
        fila.add("Daniel");

        System.out.println("Fila: "+ fila);

        String atendido = fila.poll() +", "+ fila.poll();
        
        System.out.println("Atendido: " + atendido);        
        System.out.println("Fila atual: " + fila);  

    }
}