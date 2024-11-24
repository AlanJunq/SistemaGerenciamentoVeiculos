public class Main {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Fiorino";
        carro.setAno(2020);
        carro.numeroPortas = 2;

        // Criando um objeto Moto
        Moto moto = new Moto();
        moto.marca = "Yamaha";
        moto.modelo = "Fazer";
        moto.setAno(2019);
        moto.setCilindrada(150);

        // Exibindo as informações dos veículos
        System.out.println("Informações do Carro:");
        System.out.println(carro.informacoesVeiculo());

        System.out.println("\nInformações da Moto:");
        System.out.println(moto.informacoesVeiculo());
    }
}

