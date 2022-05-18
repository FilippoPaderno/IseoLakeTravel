package com.filippo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Battello {
    Scanner scanner = new Scanner(System.in);
    private String identificativoBattello;
    private int postiMassimi;
    private ArrayList<Cliente> prenotazione;

    public Battello() {
        this.prenotazione = new ArrayList<Cliente>();
    }

    public Battello(String identificativoBattello, int postiMassimi) {
        this.identificativoBattello = identificativoBattello;
        this.postiMassimi = postiMassimi;
        this.prenotazione = new ArrayList<Cliente>();
    }


    public String getIdentificativoBattello() {
        return identificativoBattello;
    }

    public void setIdentificativoBattello(String identificativoBattello) {
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


    //aggiungere un cliente controllando se ci sono posti disponibili
    public void aggiungiCliente() throws ParseException {
        if (this.postiMassimi > this.prenotazione.size()) {
            Cliente cliente = new Cliente();
            System.out.println("Inserisci il nome");
            cliente.setNome(scanner.nextLine());
            System.out.println("Inserisci il cognome");
            cliente.setCognome(scanner.nextLine());
            System.out.println("Inserisci la data di prenotazione");
            SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            String d = data.format(data.parse(scanner.nextLine()));
            cliente.setDataPrenotazione(d);
            System.out.println("Inserisci l'ora di prenotazione");
            SimpleDateFormat ora = new SimpleDateFormat("HH:mm");
            String o = ora.format(ora.parse(scanner.nextLine()));
            cliente.setOraPrenotazione(o);
            this.prenotazione.add(cliente);
        } else {
            System.out.println("Non ci sono posti disponibili");
        }
    }


    //rimuove un cliente se è presente nella prenotazione
    public void rimuoviCliente(){
        System.out.println("Inserisci il nome");
        String nome = scanner.nextLine();
        System.out.println("Inserisci il cognome");
        String cognome = scanner.nextLine();
        Cliente clienteTrovato=null;
        for(Cliente cliente : this.prenotazione){
            if(cliente.getNome().equals(nome) && cliente.getCognome().equals(cognome)){
                clienteTrovato = cliente;
            }
        }
        if(clienteTrovato != null){
            this.prenotazione.remove(clienteTrovato);
            System.out.println("Cliente rimosso");
        }else{
            System.out.println("Cliente non presente");
        }

    }

    public int getPostiDisponibili(){
        int postDisp = this.postiMassimi-this.prenotazione.size();
        return postDisp;
    }

    @Override
    public String toString() {
        return "Battello: " + identificativoBattello;
    }

    public void stampaClienti(){
        if(this.prenotazione.size()>0){
            for(Cliente cliente : this.prenotazione){
                System.out.println(cliente.toString());
            }
        }else{
            System.out.println("Nessun cliente presente");
        }
    }

}

