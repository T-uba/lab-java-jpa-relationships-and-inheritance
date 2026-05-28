package Lab.JPA.Relationships.InheritanceWeek8.PublicRelationsContactSystem;

import jakarta.persistence.*;

@Entity
@Table (name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company;
    private String title;

    @Embedded
    private Name name;

    public Contact(String company, String title, Name name) {
        this.company = company;
        this.title = title;
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
