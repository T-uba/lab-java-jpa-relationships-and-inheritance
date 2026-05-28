package Lab.JPA.Relationships.InheritanceWeek8.PublicRelationsContactSystem;

import jakarta.persistence.*;

@Embeddable
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Salutation salutation;

    public Name(String firstName, String middleName, String lastName, Salutation salutation) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

