package kea.exercise.practice_animal_backend.repositories;

import kea.exercise.practice_animal_backend.Trophy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrophyRepository extends JpaRepository<Trophy, Integer> {
}
