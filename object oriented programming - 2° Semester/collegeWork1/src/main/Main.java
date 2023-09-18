package main;

import modelo.Financiamento;

public class Main {

    public static void main(String[] args) {

        double valor = util.InterfaceUsuario.solicitaValorImovel();
        int prazo = util.InterfaceUsuario.solicitaPrazoFinanciamento();
        double taxa = util.InterfaceUsuario.solicitaTaxaJuros();

        double pagamentoMes = Financiamento.pagamentoMensal();
        double totalPagamento = Financiamento.totalPagamento();

        Financiamento finan = new Financiamento(valor, prazo, taxa);

        Financiamento.mostraDados();

    }



}
