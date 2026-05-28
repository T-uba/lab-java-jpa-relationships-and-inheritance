package Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Repository;

import Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Model.Association;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AssociationRepository extends JpaRepository<Association, Long> {

    List<Association> findByName(Long id);
}

