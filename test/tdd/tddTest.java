package tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class tddTest {
    
    @Test
    public void primeiroExemplo() {
        Fatura fatura = new Fatura("01/07/2021", 1500, "Cliente 1");
        Boleto boleto1 = new Boleto("Codigo 1", "02/07/2021", 500);
        Boleto boleto2 = new Boleto("Codigo 2", "03/07/2021", 400);
        Boleto boleto3 = new Boleto("Codigo 3", "04/07/2021", 600);

        fatura.efetuaPagamento(boleto1);
        fatura.efetuaPagamento(boleto2);
        fatura.efetuaPagamento(boleto3);

        assertTrue(fatura.verificaPagamento());
    }
}
