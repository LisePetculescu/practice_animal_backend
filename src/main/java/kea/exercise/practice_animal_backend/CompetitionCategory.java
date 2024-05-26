package kea.exercise.practice_animal_backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class CompetitionCategory {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private int minAge;
    private int maxAge;
    private String species;
    private String breed;
}
