package Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Repository;

import Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Model.Association;
import Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Model.Division;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DivisionRepository extends JpaRepository<Division, Long> {
    List<Division> findByDistrict(String district);

    List<Division> findByAssociation(Association association);
}