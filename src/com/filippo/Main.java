package com.filippo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Battello> battelli = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cosa vuoi fare?");
        while (true) {
            System.out.println(
                    """
                            1: aggiugi un battello alla flotta
                            2: aggiungi una prenotazione
                            3: rimuovere una prenotazione
                            4: visualizza le prenotazioni
                            5: visualizza la flotta
                            """);
            int scelta = scanner.nextInt();
            scanner.nextLine();
            switch (scelta) {
                case 1: //aggiungo un battello all'arraylist


                case 2: //nuovo cliente
                    Cliente c = Cliente.creaCliente(scanner);
                    battello.addCliente(c);
                    break;
                case 3: //rimuovere cliente
                    Cliente c1 = Cliente.creaCliente(scanner);
                    battello.removeCliente(c1);
                    break;
                case 4: //visualizza prenotazioni
                    battello.visualizzaPrenotazioni();
                    break;
                case 5: //visualizza flotta
                    flotta.stampaBattelli();
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }
    }

}

