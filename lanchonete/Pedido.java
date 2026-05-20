package lanchonete;

public class Pedido {
    int numero;
    String nomeCliente;
    String item;
    double valor;
    String status;

    public Pedido(int numero, String nomeCliente, String item, double valor) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.item = item;
        this.valor = valor;
        this.status = "PENDENTE";
    }

    public void exibir() {
        System.out.println("[" + numero + "] " + nomeCliente + " | " + item + " | R$ " + valor + " | " + status);
    }
}
