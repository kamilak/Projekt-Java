package Wypozyczalnia;

import java.util.Objects;
/** Klasa definiująca obiekt film. Metody get pozwalają pobrać wartość konkretnych pól obiektu, 
 * natomiast set pozwala na zmianę wartości.
 * @author Kamila
 */
 
 
public class Film{
    private int id;
    private String nazwa;
    private float cena;
    private int rokwydania;
    private String gatunek;
    private String rezyser;
    private int wiek;
    public String dostepne;
    
    public int getId() { return id; }
    public String getNazwa() { return nazwa; }
    public float getCena() { return cena; }
    public int getRok(){ return rokwydania; }
    public String getGatunek(){ return gatunek; }
    public String getRezyser(){ return rezyser; }
    public int getWiek(){ return wiek; }
    public String getDostepne(){ return dostepne; }
    
    public void setId(int id) { this.id = id; }
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }
    public void setCena(float cena) { this.cena = cena; }
    public void setRokwydania(int rok) { this.rokwydania = rok; }
    public void setGatunek(String rezyser) { this.rezyser = rezyser; }
    public void setWiek(int wiek){ this.wiek = wiek; }
    public void setDOstepne(String dostepne) { this.dostepne = dostepne; }
    
    public Film(int id, String nazwa, float cena, int rok, String gatunek, String rezyser, int wiek, String dostepne) {
        this.id = id;
        this.nazwa = nazwa;
        this.cena = cena;
        this.rokwydania = rok;
        this.gatunek = gatunek;
        this.rezyser = rezyser;
        this.wiek = wiek;
        this.dostepne = dostepne;
    }
    
    @Override
    public int hashCode() {
        return nazwa.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nazwa, other.nazwa)) {
            return false;
        }
        if (Float.floatToIntBits(this.cena) != Float.floatToIntBits(other.cena)) {
            return false;
        }
        if (this.rokwydania != other.rokwydania) {
            return false;
        }
        if (!Objects.equals(this.gatunek, other.gatunek)) {
            return false;
        }
        if (!Objects.equals(this.rezyser, other.rezyser)) {
            return false;
        }
        if (this.wiek != other.wiek) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + " " + nazwa + " " + rezyser + " " + rokwydania + " " + wiek;
    }
}
