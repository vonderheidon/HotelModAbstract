package br.com.cz.hotel.Main;

import br.com.cz.hotel.Model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        QuartoLuxo quartoLuxo = new QuartoLuxo(
                15,
                "Luxo",
                25.0,
                true,
                true,
                false
        );
        QuartoSimples quartoSimples = new QuartoSimples(
                21,
                "Simples",
                45.0,
                true,
                true,
                true
        );

        ClienteAdulto clienteAdulto = new ClienteAdulto(
                "Richard",
                157,
                "poofesfafic@gmail.com"
        );

        HotelBeiraMar hotelBeiraMar = new HotelBeiraMar(
                "Neutral Milk Hotel",
                "Ruston, Luisiana"
        );
        HotelSimples hotelSimples = new HotelSimples(
                "California",
                "EUA"
        );

        hotelBeiraMar.adicionarQuarto(quartoLuxo);
        hotelSimples.adicionarQuarto(quartoSimples);

        Reserva reserva1 = new Reserva(
                LocalDate.of(2023,9,18),
                LocalDate.of(2023,9,21),
                clienteAdulto,
                quartoLuxo,
                hotelBeiraMar
        );
        Reserva reserva2 = new Reserva(
                LocalDate.of(2023,9,18),
                LocalDate.of(2023,9,21),
                clienteAdulto,
                quartoSimples,
                hotelSimples
        );

        System.out.print("## Localizando quarto por tipo");
        hotelBeiraMar.localizarQuartoPorTipo("luxo");

        System.out.print("\n\n## Exibindo info do quarto");
        quartoLuxo.exibirInfo();

        System.out.print("\n\n## Fazendo reservas");
        hotelBeiraMar.fazerReserva(reserva1);
        hotelSimples.fazerReserva(reserva2);

        System.out.print("\n\n## Calculando total de uma reserva");
        reserva1.calcularTotal();

        System.out.print("\n\n## Exibindo info de uma reserva");
        reserva1.exibirInfo();

        System.out.print("\n\n## Exibindo info do cliente");
        clienteAdulto.exibirInfo();

        System.out.print("\n\n## Cancelando reserva");
        hotelBeiraMar.cancelarReserva(clienteAdulto, 15, "neutral Milk HoTeL");

        System.out.print("\n\n## Verificando disponibilidade do hotel");
        hotelBeiraMar.verificarDisponibilidade();

        System.out.print("\n\n## Exibindo info do hotel");
        hotelSimples.exibirInfo();
    }
}