package util;

import java.util.Scanner;

public class InterfaceUsuario {

    public static double solicitaValorImovel() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do Imóvel:");
        double valorImovel = scanner.nextDouble();

        if (valorImovel < 0) {
            do {

                System.out.println("O valor Do imóvel deve ser superior ou igual a a zero!");
                System.out.println("Insira um valor válido:");
                valorImovel = scanner.nextDouble();

            }while (valorImovel < 0);
        }

        return valorImovel;
    }

    public static int solicitaPrazoFinanciamento() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o prazo do financiamento em anos:");
        int prazoFinanciamento = scanner.nextInt();

        if (prazoFinanciamento < 0) {
            do {

                System.out.println("O valor do prazo de financiamento deve ser superior ou igual a zero!");
                System.out.println("Insira um valor válido:");
                prazoFinanciamento = scanner.nextInt();

            }while (prazoFinanciamento < 0);
        }

        return prazoFinanciamento;
    }

    public static double solicitaTaxaJuros() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da taxa de juros anual:");
        double taxaJuros = scanner.nextDouble();

        if (taxaJuros < 0) {
            do {

                System.out.println("O valor da taxa de juros deve ser superior ou igual a a zero!");
                System.out.println("Insira um valor válido:");
                taxaJuros = scanner.nextDouble();

            }while (taxaJuros < 0);
        }

        return taxaJuros;
    }

}
