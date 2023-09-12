import java.util.Scanner;

public class InterfaceUsuario {

    public static double solicitaValorImovel() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do Imóvel:");
        double valorImovel = scanner.nextDouble();

        return valorImovel;
    }

    public static int solicitaPrazoFinanciamento() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o prazo do financiamento em anos:");
        int prazoFinanciamento = scanner.nextInt();

        return prazoFinanciamento;
    }

    public static double solicitaTaxaJuros() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da taxa de juros anual:");
        double taxaJuros = scanner.nextDouble();

        return taxaJuros;
    }

}
