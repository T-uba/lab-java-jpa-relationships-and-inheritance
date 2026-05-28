package Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "division_id")
    private Division division;

    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    private LocalDate renewalDate;

    // Standardkonstruktor für JPA/Hibernate
    public Member() {}

    // Dieser Konstruktor passt jetzt exakt zu deinem Aufruf: new Member(d1, "Namen", Status, Datum)
    public Member(Division division, String name, MemberStatus status, LocalDate renewalDate) {
        this.division = division;
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    // Getter und Setter
    public Long getId() { return id; }
    public Division getDivision() { return division; }
    public void setDivision(Division division) { this.division = division; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public MemberStatus getStatus() { return status; }
    public void setStatus(MemberStatus status) { this.status = status; }
    public LocalDate getRenewalDate() { return renewalDate; }
    public void setRenewalDate(LocalDate renewalDate) { this.renewalDate = renewalDate; }
}
