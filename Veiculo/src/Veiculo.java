public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract String informacoesVeiculo();

    // Getter e Setter para o atributo ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
