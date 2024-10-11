public abstract class Investimento {
    public double valorInicial;
    public double taxaRendimento;
    public int periodo;

    public Investimento(double valorInicial, double taxaRendimento, int periodo){
        this.valorInicial = valorInicial;
        this.taxaRendimento = taxaRendimento;
        this.periodo = periodo;
    }

    public abstract double calcularRendimento();
}
