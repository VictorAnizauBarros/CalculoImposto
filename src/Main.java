import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Valor inical do investimento: ");
        double valorInicial = scanner.nextDouble();

        System.out.println("Taxa de Rendimento (em %): ");
        double taxaRendimento = scanner.nextDouble();

        System.out.println("Periodo de investimento (em meses):");
        int periodo = scanner.nextInt();

        System.out.println("Escolha o tipo de investimento:");
        System.out.println("1. Poupança");
        System.out.println("2. Renda Fixa");
        System.out.println("3. Renda Variavel");
        System.out.println("4. Tesouro Direto");
        System.out.println("5. LCI/LCA");
        System.out.println("6. CDB");
        int escolha = scanner.nextInt();

        Investimento investimento = null;

        switch (escolha){
            case 1:
                investimento = new Poupanca(valorInicial,taxaRendimento,periodo);
                break;
            case 2:
                investimento = new RendaFixa(valorInicial,taxaRendimento,periodo);
                break;
            case 3:
                investimento = new RendaVariavel(valorInicial,taxaRendimento,periodo);
                break;

            case 4:
                investimento = new TesouroDireto(valorInicial,taxaRendimento,periodo);
                break;
            case 5:
                investimento = new LCI_LCA(valorInicial,taxaRendimento,periodo);
                break;
            case 6:
                investimento = new CDB(valorInicial,taxaRendimento,periodo);
                break;
            default:
                System.out.println("Esolha inválida");
                return;
        }

        double rendimento = investimento.calcularRendimento();
        System.out.printf("O rendimento após %d em meses é: R$ %.2f%n", periodo,rendimento);
    }
}