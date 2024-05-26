package kea.exercise.practice_animal_backend.repositories;

import kea.exercise.practice_animal_backend.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
