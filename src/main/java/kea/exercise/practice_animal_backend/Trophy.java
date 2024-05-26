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
    private int year;
    private int placement;
    @ManyToOne
    private CompetitionCategory category;

    public Trophy(int year, int placement, CompetitionCategory category) {
        this.year = year;
        this.placement = placement;
        this.category = category;
    }
}
