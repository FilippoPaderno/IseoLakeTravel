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
                    2: aggiungi una prenotazione
                    3: rimuovere una prenotazione
                    4: visualizza le prenotazioni
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

                case 2: //nuovo cliente se ci sono posti disponibili
                    System.out.println("Inserisci l'identificativo del battello che vuoi prenotare");
                    String idBattello = scanner.next();
                    for(int i = 0; i < battelli.size(); i++){
                        if(battelli.get(i).getIdentificativoBattello().equals(idBattello)){
                            battelli.get(i).aggiungiCliente();
                        }else{
                            System.out.println("Non è presente il battello che vuoi prenotare");
                        }
                    }
                    break;

                case 3: //rimuovere cliente
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

                case 4: //visualizza prenotazioni in base all'id del battello
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

