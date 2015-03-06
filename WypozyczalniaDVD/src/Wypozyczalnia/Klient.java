package Wypozyczalnia;

import java.util.Objects;
/** Klasa Klient definiuje klientów wypożyczelni. Metody get pozwalają na pobranie
 * wartosci poszczególnych pól, notomiast set na zmianę wartości. 
 * @author Kamila
 */
public class Klient{
    private int id;
    private String nazwisko;
    private String imie;
    private String adres;
    private int numertel;

    public int getId() { return id; }
    public String getNazwisko() { return nazwisko; }
    public String getImie() { return imie; }
    public String getAdres() { return adres; }
    public int getNumer(){ return numertel; }
   
    public void setId(int id) { this.id =id; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }
    public void setImie(String imie) { this.imie = imie; }
    public void setAdres(String adres) { this.adres = adres; }
    public void setNumer(int numer) { this.numertel = numer; }
   
    public Klient(int id, String nazwisko, String imie, String adres, int numer) {
        this.id = id;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.adres = adres;
        this.numertel = numer;
    }
    
    @Override
    public int hashCode() {
        return nazwisko.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Klient other = (Klient) obj;
        
        if(!Objects.equals(this.id, other.id)){
            return false;
        }
        if (!Objects.equals(this.nazwisko, other.nazwisko)) {
            return false;
        }
        if (!Objects.equals(this.imie, other.imie)) {
            return false;
        }
        if (!Objects.equals(this.adres, other.adres)) {
            return false;
        }
        if (this.numertel != other.numertel) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + " " +  nazwisko + " " + imie;
    }    
}
