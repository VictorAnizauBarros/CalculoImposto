import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Calculo do investimento da poupança:
    Poupanca poupanca = new Poupanca();
    System.out.println("Digite o valor inicial de investimento:");
    poupanca.valorInicial = scanner.nextDouble();
    System.out.println("Digite o tempo de investimento (em meses):");
    poupanca.tempo = scanner.nextDouble();

        double retorno = poupanca.calculoInvestimento();
        System.out.printf("Retorno do investimento: %.2f%n", retorno);
    }
}