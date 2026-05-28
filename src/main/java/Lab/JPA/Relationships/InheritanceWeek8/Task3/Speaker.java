package Lab.JPA.Relationships.InheritanceWeek8.Task3;

import jakarta.persistence.*;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer presentationDuration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conference_id")
    private Conference conference;

    public Speaker() {}
    public Speaker(Conference conference, String name, Integer presentationDuration) {
        this.conference = conference;
        this.name = name;
        this.presentationDuration = presentationDuration;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getPresentationDuration() { return presentationDuration; }
    public void setPresentationDuration(Integer presentationDuration) { this.presentationDuration = presentationDuration; }
    public Conference getConference() { return conference; }
    public void setConference(Conference conference) { this.conference = conference; }
}
