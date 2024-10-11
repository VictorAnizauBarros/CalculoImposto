public class Poupanca extends Investimento{
    public double valorInicial;
    public double taxaJuros = 0.005;
    public double tempo;

    public double calculoInvestimento(){
        double montante = valorInicial * Math.pow(1 + taxaJuros, tempo);
        return montante;
    }
}
