package br.com.cz.hotel.Model;

public class QuartoCompartilhado extends Quarto {
    public int qtdCama;
    public int camasReservadas;

    public QuartoCompartilhado(int numeroDeQuarto, String tipoDeQuarto, double precoPorNoite, boolean disponibilidade,
                               int qtdCama) {
        super(numeroDeQuarto, tipoDeQuarto, precoPorNoite, disponibilidade, qtdCama);
        this.qtdCama = qtdCama;
        this.camasReservadas = 0;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nQuantidade de camas: %d\n", this.qtdCama);
    }
    @Override
    public boolean verificarDisponibilidade() {
        int camasDisponiveis = this.qtdCama - this.camasReservadas;
        if (camasDisponiveis > 0) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void adicionarCliente(Cliente cliente) {
        for (int i = 0; i < super.listaDeClientes.length; i++) {
            if (super.listaDeClientes[i] == null) {
                super.listaDeClientes[i] = cliente;
                camasReservadas++;
                System.out.printf("\nO cliente %s foi adicionado ao quarto nº %d.", cliente.nome, super.numeroDeQuarto);
                return;
            }
        }
    }
    @Override
    public void removerCliente(Cliente cliente) {
        for (int i = 0; i < super.listaDeClientes.length; i++) {
            if (super.listaDeClientes[i].equals(cliente)) {
                super.listaDeClientes[i] = null;
                camasReservadas--;
                System.out.printf("\nO cliente %s foi removido do quarto nº %d.", cliente.nome, super.numeroDeQuarto);
                return;
            }
        }
    }
}
