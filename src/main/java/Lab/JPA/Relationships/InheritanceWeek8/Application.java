package Lab.JPA.Relationships.InheritanceWeek8;

import Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Model.*;
import Lab.JPA.Relationships.InheritanceWeek8.NurseAssociationDivisionManagement.Repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;
import java.util.HashSet;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run(AssociationRepository associationRepository,
	                             DivisionRepository divisionRepository,
	                             MemberRepository memberRepository) {
		return args -> {

			// ==========================================
			// 1. Association erstellen
			// ==========================================
			Association association = associationRepository.save(
					new Association(
							"Nurse Association of Germany",
							new HashSet<>()));

			// ==========================================
			// 2. Divisions (Abteilungen) erstellen
			// ==========================================
			Division d1 = divisionRepository.save(
					new Division(association,
							"Intensive Care & Emergency Division",
							"Berlin Brandenburg",
							"Dr. Lena Meyer",
							new HashSet<>()));

			Division d2 = divisionRepository.save(
					new Division(association,
							"Pediatric & Neonatal Nursing Division",
							"Hamburg Nord",
							"Markus Becker",
							new HashSet<>()));

			Division d3 = divisionRepository.save(
					new Division(association,
							"Geriatric & Long-Term Care Division",
							"München Bayern",
							"Prof. Dr. Hans Schneider",
							new HashSet<>()));

			Division d4 = divisionRepository.save(
					new Division(association,
							"Surgical & Perioperative Division",
							"Köln Rheinland",
							"Sandra Fischer",
							new HashSet<>()));

			Division d5 = divisionRepository.save(
					new Division(association,
							"Psychiatric & Mental Health Division",
							"Frankfurt Hessen",
							"Dr. Tobias Weber",
							new HashSet<>()));

			Division d6 = divisionRepository.save(
					new Division(association,
							"Public Health & Community Care Division",
							"Stuttgart Baden",
							"Kathrin Wagner",
							new HashSet<>()));

			Division d7 = divisionRepository.save(
					new Division(association,
							"Nursing Research & Education Division",
							"Dresden Sachsen",
							"Michael Hoffmann",
							new HashSet<>()));

			// ==========================================
			// 3. Members (Mitglieder) erstellen
			// ==========================================
			Member mbr1 = memberRepository.save(
					new Member(d1, "Dr. Christian Schmidt", MemberStatus.ACTIVE, LocalDate.now().plusMonths(6))
			);
			Member mbr2 = memberRepository.save(
					new Member(d2, "Sarah Wagner", MemberStatus.ACTIVE, LocalDate.now().plusMonths(3))
			);
			Member mbr3 = memberRepository.save(
					new Member(d3, "Thomas Müller", MemberStatus.ACTIVE, LocalDate.now().plusMonths(12))
			);
			Member mbr4 = memberRepository.save(
					new Member(d4, "Sabine Fischer", MemberStatus.ACTIVE, LocalDate.now().plusMonths(2))
			);
			Member mbr5 = memberRepository.save(
					new Member(d5, "Andreas Weber", MemberStatus.LAPSED, LocalDate.now().minusWeeks(2))
			);
			Member mbr6 = memberRepository.save(
					new Member(d6, "Julia Becker", MemberStatus.ACTIVE, LocalDate.now().plusMonths(8))
			);
			Member mbr7 = memberRepository.save(
					new Member(d7, "Stefan Hoffmann", MemberStatus.LAPSED, LocalDate.now().minusWeeks(3))
			);

		};
	}
}
