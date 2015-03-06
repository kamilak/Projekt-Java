package Wypozyczalnia;

import java.util.Date;
/**
 * Klasa zwroty jest pochodną klasy wypożyczenie. Klasa ma dodatkowe pole 
 * datazwrotuklienta, które określa w jakim konkretnym terminie nastąpiło zwrócenie filmu
 * przez klienta.
 * @author Kamila
 */
public class Zwrot extends Wypozyczenie{
    private Date datazwrotklienta;
    
    public Date getDatazwrotklienta() { return datazwrotklienta; }
    
    public void setDatazwrotklienta(Date datazwrotklient) { this.datazwrotklienta = datazwrotklient; }
    
    public Zwrot(int id, int idf, String film, Date datawyp, Date datazwrot, Date datazwrotklient) {
        super(id, idf, film, datawyp, datazwrot);
        this.datazwrotklienta = datazwrotklient;
    }
    @Override
     public int hashCode() {
        return film.hashCode();
    }  
}