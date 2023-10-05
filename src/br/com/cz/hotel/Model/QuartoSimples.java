package br.com.cz.hotel.Model;

public class QuartoSimples extends Quarto {
    public boolean possuiArCondicionado;
    public boolean wifiGratis;

    public QuartoSimples(int numeroDeQuarto, String tipoDeQuarto, double precoPorNoite, boolean disponibilidade, int qtdClientes,
                         boolean possuiArCondicionado, boolean wifiGratis) {
        super(numeroDeQuarto, tipoDeQuarto, precoPorNoite, disponibilidade, qtdClientes);
        this.possuiArCondicionado = possuiArCondicionado;
        this.wifiGratis = wifiGratis;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nPossui ar-condicionado: %s\n", this.possuiArCondicionado ? "Sim" : "Nao");
        System.out.printf("Wifi gratis: %s", this.wifiGratis ? "Sim" : "Nao");
    }
}
