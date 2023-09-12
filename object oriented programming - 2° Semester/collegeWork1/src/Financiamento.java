public class Financiamento {

    double valorImovel, taxaJurosAnual;
    int prazoFinanciamento;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {

        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;

    }

   public double pagamentoMensal() {

        double pagamentoMensal = (valorImovel/prazoFinanciamento) * (1 + (taxaJurosAnual / 12));
        return pagamentoMensal;

    }

    public double totalPagamento() {

        double totalPagamento = pagamentoMensal() * prazoFinanciamento;

        return totalPagamento;
    }

}
