public class Moto extends Veiculo {
    private int cilindrada;

    // Implementação do método abstrato
    @Override
    public String informacoesVeiculo() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + getAno() + "\nCilindrada: " + cilindrada;
    }

    // Getter e Setter para cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}

