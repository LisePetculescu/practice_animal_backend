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
    private String name;
    public CompetitionCategory(String name) {
        this.name = name;
    }
}
