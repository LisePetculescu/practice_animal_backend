package kea.exercise.practice_animal_backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Animal {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String species;

    @OneToMany
    private List<Trophy> trophies;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    public Animal(String name, int age, String species, List<Trophy> trophies) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.trophies = trophies;
    }
}
