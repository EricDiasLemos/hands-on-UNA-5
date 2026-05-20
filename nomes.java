import java.util.HashSet;

public class nomes{

    public static void main(String[]args){
        HashSet<String> conjunto = new HashSet<>();
        AdicionarNomes(conjunto);
        System.out.println(conjunto);     




    }
    static void AdicionarNomes(HashSet<String> conjunto) {

            conjunto.add("Ana");        
            conjunto.add("Bruno");        
            conjunto.add("Ana");
        }
        
}
   
