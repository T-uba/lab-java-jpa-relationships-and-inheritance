package Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;
    private String president;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "association_id")
    private Association association;

    @OneToMany(mappedBy = "division", fetch = FetchType.LAZY)
    private List<Member> members = new ArrayList<>();

    // Pflicht-Standardkonstruktor für JPA
    public Division() {}

    // Dieser Konstruktor passt jetzt exakt zu deinem Aufruf im CommandLineRunner!
    public Division(Association association, String name, String district, String president, Set<Member> members) {
        this.association = association;
        this.name = name;
        this.district = district;
        this.president = president;
    }

    // Helper-Methode
    public void addMember(Member member) {
        this.members.add(member);
        member.setDivision(this);
    }

    // Getter und Setter
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }
    public String getPresident() { return president; }
    public void setPresident(String president) { this.president = president; }
    public Association getAssociation() { return association; }
    public void setAssociation(Association association) { this.association = association; }
    public List<Member> getMembers() { return members; }
    public void setMembers(List<Member> members) { this.members = members; }
}
