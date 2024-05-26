package kea.exercise.practice_animal_backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Animal {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String species;

    @OneToMany(mappedBy = "winner")
    private List<Trophy> trophies;
}
