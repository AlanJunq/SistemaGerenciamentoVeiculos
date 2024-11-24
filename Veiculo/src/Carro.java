public class Carro extends Veiculo {
    public int numeroPortas;

    // Implementação do método abstrato
    @Override
    public String informacoesVeiculo() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + getAno() + "\nNúmero de Portas: " + numeroPortas;
    }
}

