public class LCI_LCA extends Investimento{
    public LCI_LCA(double valorInicial, double taxaRendimento, int periodo){
        super(valorInicial,taxaRendimento,periodo);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial * Math.pow(1 + taxaRendimento / 100, periodo);
    }
}
