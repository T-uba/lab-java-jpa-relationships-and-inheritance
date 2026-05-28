package Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "association", fetch = FetchType.LAZY)
    private Set<Division> divisions = new HashSet<>();

    public Association() {
    }

    public Association(String name, Set<Division> divisions) {
        this.name = name;
        this.divisions = divisions;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(Set<Division> divisions) {
        this.divisions = divisions;
    }

}


