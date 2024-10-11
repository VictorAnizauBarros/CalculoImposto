public class RendaVariavel extends Investimento{
    public RendaVariavel(double valorInicial, double taxaRendimento,int periodo){
        super(valorInicial,taxaRendimento,periodo);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial*(1+ taxaRendimento /100 *periodo);
    }
}
