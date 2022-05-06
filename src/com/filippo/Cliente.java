package com.filippo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cliente extends Battello {
    private String nome;
    private String cognome;
    private Date dataPrenotazione;
    private double oraPrenotazione;
    private int numeroPosti;

    public Cliente() {
    }

    public Cliente(String nome, String cognome, Date dataPrenotazione, double oraPrenotazione, int numeroPosti) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataPrenotazione = dataPrenotazione;
        this.oraPrenotazione = oraPrenotazione;
        this.numeroPosti = numeroPosti;
    }

    public static Cliente creaCliente(Scanner scanner) throws ParseException {
        Cliente cliente = new Cliente();
        System.out.println("Inserisci il nome");
        cliente.setNome(scanner.nextLine());
        System.out.println("Inserisci il cognome");
        cliente.setCognome(scanner.nextLine());
        System.out.println("Inserisci la data di prenotazione");
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        cliente.dataPrenotazione = data.parse(scanner.nextLine());
        System.out.println("Inserisci l'ora di prenotazione");
        cliente.oraPrenotazione = scanner.nextDouble();
        System.out.println("Inserisci il numero di posti da prenotare");
        cliente.numeroPosti = scanner.nextInt();
        return cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(Date dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public double getOraPrenotazione() {
        return oraPrenotazione;
    }

    public void setOraPrenotazione(double oraPrenotazione) {
        this.oraPrenotazione = oraPrenotazione;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCognome: " + cognome + "\nData: " + dataPrenotazione + "\nOra: " + oraPrenotazione;
    }


}
