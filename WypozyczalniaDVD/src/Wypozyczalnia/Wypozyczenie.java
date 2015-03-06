package Wypozyczalnia;

import java.util.Date;
import java.util.Objects;
/**
 * Klasa definiuje opis wypożyczenia klienta. Metody get pozwalają pobrać dane pole
 * obiektu, natomiast set pozwalaja na zmianę wartości. Wartość datazwrot jest 
 * ustawiana automatycznie i określa przeidywany termin zwrotu filmu przez klienta.
 * @author Kamila
 */
public class Wypozyczenie{
    public int id;
    public int idFilm;
    public String film;
    public Date datawyp;
    public Date datazwrotu;
    
    public int getId() { return id; }
    public int getIdFilm() { return idFilm; }
    public String getFilm() { return film; }
    public Date getDatawyp() { return datawyp; }
    public Date getDatazwrot() { return datazwrotu; }
    
    public void setId(int id) { this.id = id; } 
    public void setIdFilm(int idFilm) { this.idFilm = idFilm; }
    public void setFilm(String film) { this.film = film; }
    public void setDatawyp(Date datawyp) { this.datawyp = datawyp; }
    public void setDatazwrotu(Date datazwrot) { this.datazwrotu = datazwrot; }
    
    public Wypozyczenie(int id, int idFilm, String film, Date datawyp, Date datazwrot) {
        this.id = id;
        this.idFilm = idFilm;
        this.film = film;
        this.datawyp = datawyp;
        this.datazwrotu = datazwrot;
    }
    
    @Override
    public int hashCode() {
        return film.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Wypozyczenie other = (Wypozyczenie) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.idFilm, other.idFilm)) {
            return false;
        }
        if (!Objects.equals(this.film, other.film)) {
            return false;
        }
        if (!Objects.equals(this.datawyp, other.datawyp)) {
            return false;
        }
        if (!Objects.equals(this.datawyp, other.datawyp)) {
            return false;
        }
        if (!Objects.equals(this.datazwrotu, other.datazwrotu)) {
            return false;
        }
        return true;
    }
}
