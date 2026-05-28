package Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Repository;

import Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Model.Association;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AssociationRepository extends JpaRepository<Association, Long> {}

