public class TesouroDireto extends Investimento{
    public TesouroDireto(double valorInicial, double taxaRendimento, int periodo){
        super(valorInicial,taxaRendimento,periodo);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial * Math.pow(1+taxaRendimento/100,periodo);
    }
}
