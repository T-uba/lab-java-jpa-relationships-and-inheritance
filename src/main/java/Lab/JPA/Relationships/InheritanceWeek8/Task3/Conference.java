package Lab.JPA.Relationships.InheritanceWeek8.Task3;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Conference extends Event {
    @OneToMany(mappedBy = "conference", fetch = FetchType.LAZY)
    private Set<Speaker> speakers = new HashSet<>();

    public Conference() {}
    public Conference(String title, LocalDate date, Integer duration, String location, Set<Guest> guests, Set<Speaker> speakers) {
        super(title, date, duration, location, guests);
        this.speakers = speakers;
    }

    public Set<Speaker> getSpeakers() { return speakers; }
    public void setSpeakers(Set<Speaker> speakers) { this.speakers = speakers; }
}
