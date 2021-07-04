package fatura;

import java.util.ArrayList;

public class Fatura {
    ArrayList<Boleto> boletos = new ArrayList<Boleto>();
    String data;
    int valorTotal;
    String nomeCliente;

    public Fatura(String data, int valorTotal, String nomeCliente) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
    }

    public void efetuaPagamento(Boleto boleto) {
        this.boletos.add(boleto);
    }

    public boolean verificaPagamento() {
        int soma;
        for (int i = 0; i < this.boletos.size(); i++) {
            soma += this.boletos[i].valorPago();
        }
        if (soma >= this.valorTotal) {
            return true;
        } else {
            return false;
        }
    }
}
