package boleto;

public class Boleto {
    String codigo;
    String data;
    int valorPago;

    public Boleto(String codigo, String data, int valorPago) {
        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;
    }

    public int valorPago() {
        return this.valorPago;
    }
}
