package modelo;

public class Financiamento {

    private static double valorImovel, taxaJurosAnual;
    private static int prazoFinanciamento;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {

        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;

    }

   public static double pagamentoMensal() {

        double pagamentoMensal = (valorImovel/prazoFinanciamento) * (1 + (taxaJurosAnual / 12));
        return pagamentoMensal;

    }

    public static double totalPagamento() {

        double totalPagamento = pagamentoMensal() * prazoFinanciamento;

        return totalPagamento;
    }

    public static double getValorImovel() {
        return valorImovel;
    }

    public static double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public static int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public static void mostraDados() {

        System.out.println("O valor do imóvel é: " + getValorImovel());
        System.out.println("O valor total do pagamento é: " + totalPagamento());

    }

}
