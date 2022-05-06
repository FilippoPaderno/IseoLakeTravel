package com.filippo;

import java.util.ArrayList;
import java.util.Scanner;

public class Battello {
    Scanner scanner = new Scanner(System.in);
    private int identificativoBattello;
    private int postiMassimi;
    private String oraPartenza;
    private ArrayList<Cliente> prenotazione;

    public Battello() {
    }

    public Battello(int identificativoBattello, int postiMassimi, String oraPartenza) {
        this.identificativoBattello = identificativoBattello;
        this.postiMassimi = postiMassimi;
        this.oraPartenza = oraPartenza;
        this.prenotazione = new ArrayList<>();
    }

    public static Battello creaBattello(Scanner scanner) {
        Battello battello = new Battello();
        System.out.println("Inserisci identificativo battello: ");
        battello.identificativoBattello = scanner.nextInt();
        System.out.println("Inserisci posti massimi: ");
        battello.postiMassimi = scanner.nextInt();
        return battello;
    }

    //stampa tutti i battelli
    public static void stampaBattelli(ArrayList<Battello> battelli) {
        for (Battello battello : battelli) {
            System.out.println("Identificativo: " + battello.getIdentificativoBattello() + " Posti massimi: " + battello.getPostiMassimi());
        }
    }

    public int getIdentificativoBattello() {
        return identificativoBattello;
    }

    public void setIdentificativoBattello(int identificativoBattello) {
        this.identificativoBattello = identificativoBattello;
    }

    public int getPostiMassimi() {
        return postiMassimi;
    }

    public void setPostiMassimi(int postiMassimi) {
        this.postiMassimi = postiMassimi;
    }

    public ArrayList<Cliente> getPrenotazione() {
        return prenotazione;
    }

    public void setPrenotazione(ArrayList<Cliente> prenotazione) {
        this.prenotazione = prenotazione;
    }

    //aggiungere un cliente se possibile
    public void addCliente(Cliente cliente) {
        if (this.postiMassimi > this.prenotazione.size()) {
            this.prenotazione.add(cliente);
        }
    }

    //rimuove un cliente se possibile
    public void removeCliente(Cliente cliente) {
        if (this.prenotazione.contains(cliente)) {
            this.prenotazione.remove(cliente);
        }
    }

    //stampa tutti i clienti in base all'identificativo del battello
    public void visualizzaPrenotazioni() {
        for (Cliente cliente : prenotazione) {
            if (cliente.getIdentificativoPrenBattello() == this.identificativoBattello) {
                System.out.println(cliente.toString());
            }
        }
    }

}

