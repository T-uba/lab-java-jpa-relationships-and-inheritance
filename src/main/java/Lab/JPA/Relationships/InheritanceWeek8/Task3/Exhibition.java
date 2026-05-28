package Lab.JPA.Relationships.InheritanceWeek8.Task3;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Exhibition extends Event {

    public Exhibition() {}
    public Exhibition(String title, LocalDate date, Integer duration, String location, Set<Guest> guests) {
        super(title, date, duration, location, guests);
    }
}