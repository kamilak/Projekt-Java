package Wypozyczalnia;

import java.awt.TextField;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JList;
import javax.swing.SwingUtilities;
/**
 * Wątek, który sprawdza, który z klientów przekroczył czas wypożyczenia. 
 * Wypożyczenie automatycznie ustawia się na 2 dni.
 * @author Kamila
 */

public class PrzekroczonyCzasWyp extends Thread{
     List <Klient> klienci;
     Map<Klient,List<Wypozyczenie>> wypk;
     List<Film> filmy;
     TextField textfield;
     
    PrzekroczonyCzasWyp(List <Klient> klienci, Map<Klient, List<Wypozyczenie>> wypozyczeniaklienta, List<Film> filmy, TextField textfield){
        this.klienci = klienci;
        this.wypk = wypozyczeniaklienta;
        this.filmy = filmy;
        this.textfield = textfield;
    }

    
    public void run(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        long ds = d.getTime();
        String powiadomienia = "";
        for(int i=0; i<klienci.size(); i++){
            List<Wypozyczenie> wypozyczenia = wypk.get(klienci.get(i));
            if(wypozyczenia != null){
                for(Wypozyczenie w : wypozyczenia){
                    for(Film f : filmy){
                        if(w.getIdFilm() == f.getId() && "Nie".equals(f.getDostepne())){
                            
                            Date z = w.getDatazwrot();
                            long dz =  z.getTime();
                            if ( ds-dz > 2){
                            powiadomienia += ("Klient: " + klienci.get(i).getNazwisko() + " " + klienci.get(i).getImie() + " przekroczył datę zwrotu filmu: " + f.getNazwa() + "! ");
                        }
                    }                      
                }
            }
        }
    }
        final String fPowiadomienia = powiadomienia;
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            textfield.setText(fPowiadomienia);
        } });
  }
    
}
