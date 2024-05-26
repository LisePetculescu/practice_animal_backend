package kea.exercise.practice_animal_backend.repositories;

import kea.exercise.practice_animal_backend.CompetitionCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionCategoryRepository extends JpaRepository<CompetitionCategory, Integer>{
}
