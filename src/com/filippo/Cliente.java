package com.filippo;

import java.util.Date;

public class Cliente extends Battello{
    private String nome;
    private String cognome;
    private String dataPrenotazione;
    private String oraPrenotazione;

    public Cliente(String nome, String cognome, String dataPrenotazione, String oraPrenotazione) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataPrenotazione = dataPrenotazione;
        this.oraPrenotazione = oraPrenotazione;
    }

    public Cliente(){}

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

    public String getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(String dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public String getOraPrenotazione() {
        return oraPrenotazione;
    }

    public void setOraPrenotazione(String oraPrenotazione) {
        this.oraPrenotazione = oraPrenotazione;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nCognome: " + cognome + "\nData: " + dataPrenotazione + "\nOra: " + oraPrenotazione;
    }


}
