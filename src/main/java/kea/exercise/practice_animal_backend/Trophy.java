package kea.exercise.practice_animal_backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Trophy {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int year;
    @ManyToOne
    private CompetitionCategory category;
}
