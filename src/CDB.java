public class CDB extends Investimento{
    public CDB(double valorIncial, double taxaRendimento, int periodo){
        super(valorIncial,taxaRendimento,periodo);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial * Math.pow(1 + taxaRendimento/100 , periodo);
    }
}
