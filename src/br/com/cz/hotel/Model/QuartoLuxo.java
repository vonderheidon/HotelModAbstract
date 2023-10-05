package br.com.cz.hotel.Model;

public class QuartoLuxo extends Quarto {
    public boolean possuiHidromassagem;
    public boolean possuiMiniBar;

    public QuartoLuxo(int numeroDeQuarto, String tipoDeQuarto, double precoPorNoite, boolean disponibilidade, int qtdClientes,
                      boolean possuiHidromassagem, boolean possuiMiniBar) {
        super(numeroDeQuarto, tipoDeQuarto, precoPorNoite, disponibilidade, qtdClientes);
        this.possuiHidromassagem = possuiHidromassagem;
        this.possuiMiniBar = possuiMiniBar;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nPossui Hidromassagem: %s\n", this.possuiHidromassagem ? "Sim" : "Nao");
        System.out.printf("\nPossui mini-bar: %s", this.possuiMiniBar ? "Sim" : "Nao");
    }
}
