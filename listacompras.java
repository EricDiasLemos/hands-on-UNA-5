import java.util.ArrayList;

public class listacompras {
    public static void main(String[]args){
        ArrayList<String>  produtos = new ArrayList<>();
        produtos.add("Abacate");
        produtos.add("Laranja");
        produtos.add("Maça");
        produtos.add("Kiwi");
        produtos.add("Ameixa");


        for (int i = 0; i < produtos.size(); i++){
            System.out.println((i+1) + " - " + produtos.get(i));
            if ((i+1) == produtos.size()){
                System.out.println("Existem o total de " + (i+1) + " Produtos");
            }
        }



    }
}