import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class alunoMap {

    public static void main(String[]args){

        HashMap<Integer,String> Alunos = new HashMap<>();

        Alunos.put(101, "Ana");        
        Alunos.put(102, "Bruno");        
        Alunos.put(103, "Carla"); 

        Alunos.get(101);
        Alunos.remove(101);
        
        System.out.println(Alunos); 
    }
}