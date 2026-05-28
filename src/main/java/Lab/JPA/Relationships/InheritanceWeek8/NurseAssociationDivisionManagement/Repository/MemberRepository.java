package Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Repository;

import Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Model.Division;
import Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Integer> {

    List<Member> findByDivision(Division division);
}