package br.com.cz.hotel.Model;

public abstract class Quarto {
    public int numeroDeQuarto;
    public String tipoDeQuarto;
    public double precoPorNoite;
    public boolean disponibilidade;
    public Cliente[] listaDeClientes;

    public Quarto(int numeroDeQuarto, String tipoDeQuarto, double precoPorNoite, boolean disponibilidade, int qtdClientes){
        this.numeroDeQuarto = numeroDeQuarto;
        this.tipoDeQuarto = tipoDeQuarto;
        this.precoPorNoite = precoPorNoite;
        this.disponibilidade = disponibilidade;
        this.listaDeClientes = new Cliente[qtdClientes];
    }

    public void exibirInfo(){
        System.out.printf("\nNumero do quarto: %d \n", this.numeroDeQuarto);
        System.out.printf("Tipo de quarto: %s \n", this.tipoDeQuarto);
        System.out.printf("Preco por noite: %.2f  \n", this.precoPorNoite);
        System.out.printf("Disponibilidade: %s", this.disponibilidade ? "Disponivel" : "Indisponivel");
    }
    public boolean verificarDisponibilidade() {
        if (this.disponibilidade == true) {
            return true;
        } else {
            return false;
        }
    }
    public void adicionarCliente(Cliente cliente) {
        for (int i = 0; i < this.listaDeClientes.length; i++) {
            if (this.listaDeClientes[i] == null) {
                this.listaDeClientes[i] = cliente;
                System.out.printf("\nO cliente %s foi adicionado ao quarto nº %d.", cliente.nome, this.numeroDeQuarto);
                return;
            }
        }
    }
    public void removerCliente(Cliente cliente) {
        for (int i = 0; i < this.listaDeClientes.length; i++) {
            if (this.listaDeClientes[i].equals(cliente)) {
                this.listaDeClientes[i] = null;
                System.out.printf("\nO cliente %s foi removido do quarto nº %d.", cliente.nome, this.numeroDeQuarto);
                return;
            }
        }
    }
}