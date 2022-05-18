package com.filippo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Battello> battelli = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Cosa vuoi fare?");
        while(true){
            System.out.println(
                    """
                    ------------------------------------
                    0: Esci
                    1: aggiugi un battello alla flotta
                    2: visualizza la lista dei battelli
                    3: aggiungi una prenotazione
                    4: rimuovere una prenotazione
                    5: visualizza le prenotazioni
                    """);
            int scelta = scanner.nextInt();
            switch(scelta){
                case 0: //esci
                    System.out.println("Arrivederci!");
                    return;

                case 1: //aggiungo un battello all'arraylist
                    Battello b = new Battello();
                    System.out.println("Inserisci l'id del battello");
                    b.setIdentificativoBattello(scanner.next());
                    System.out.println("Inserisci i posti massimi del battello");
                    b.setPostiMassimi(scanner.nextInt());
                    battelli.add(b);
                    break;

                case 2: //stampo la lista dei battelli
                    if (battelli.size() == 0) {
                        System.out.println("Nessun battello presente");
                        break;
                    }
                    for (Battello b4 : battelli){
                        System.out.println(b4.toString()+ ", i posti disponibili sono: "+ b4.getPostiDisponibili()+ "-->" + ((b4.getPostiDisponibili()*100)/b4.getPostiMassimi()) + "% di disponibilita posti");
                    }
                    break;

                case 3: //nuovo cliente se ci sono posti disponibili
                    if (battelli.size() == 0) {
                        System.out.println("Non ci sono battelli da prenotare");
                        break;
                    }
                    System.out.println("Inserisci l'identificativo del battello che vuoi prenotare");
                    String idBattello = scanner.next();
                    boolean trov1 = false;
                    int j = 0;
                    for( j = 0; j < battelli.size(); j++){
                        if(battelli.get(j).getIdentificativoBattello().equals(idBattello)){
                            trov1 = true;
                            break;
                        }else{
                            System.out.println("Nessun battello con questo id trovato");
                            break;
                        }
                    }
                    if (trov1){
                        battelli.get(j).aggiungiCliente();
                    }
                    break;

                case 4: //rimuovere cliente
                    if (battelli.size() == 0) {
                        System.out.println("Non ci sono battelli con prenotazioni");
                        break;
                    }
                    System.out.println("Inserisci l'identificativo del battello che hai prenotato");
                    String idBattello2 = scanner.next();
                    for(int i = 0; i < battelli.size(); i++) {
                        if (battelli.get(i).getIdentificativoBattello().equals(idBattello2)) {
                            battelli.get(i).rimuoviCliente();
                            break;
                        }else {
                            System.out.println("Non è presente il battello che hai prenotato");
                        }
                    }
                    break;

                case 5: //visualizza prenotazioni in base all'id del battello
                    if (battelli.size() == 0){
                        System.out.println("Non ci sono battelli");
                        break;
                    }
                    System.out.println("Inserisci l'identificativo del battello che vuoi visualizzare");
                    String idBattello4 = scanner.next();
                    for (int i = 0; i < battelli.size(); i++) {
                        if (battelli.get(i).getIdentificativoBattello().equals(idBattello4)) {
                            battelli.get(i).stampaClienti();

                        }
                    }
                    break;

                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }
    }

}

