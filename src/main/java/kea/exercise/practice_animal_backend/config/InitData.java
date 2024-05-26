package kea.exercise.practice_animal_backend.config;

import kea.exercise.practice_animal_backend.Animal;
import kea.exercise.practice_animal_backend.CompetitionCategory;
import kea.exercise.practice_animal_backend.Trophy;
import kea.exercise.practice_animal_backend.repositories.AnimalRepository;
import kea.exercise.practice_animal_backend.repositories.CompetitionCategoryRepository;
import kea.exercise.practice_animal_backend.repositories.TrophyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {

    private final List<CompetitionCategory> cats = new ArrayList<>();
    private final List<Trophy> trophies = new ArrayList<>();
    private final List<Animal> animals = new ArrayList<>();
    private final AnimalRepository animalRepository;

    private final TrophyRepository trophyRepository;

    private final CompetitionCategoryRepository competitionCategoryRepository;

    public InitData(AnimalRepository animalRepository, TrophyRepository trophyRepository, CompetitionCategoryRepository competitionCategoryRepository) {
        this.animalRepository = animalRepository;
        this.trophyRepository = trophyRepository;
        this.competitionCategoryRepository = competitionCategoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        initCategories();
        initTrophies();
        initAnimals();
    }

    private void initCategories() {
        cats.add(new CompetitionCategory("Snack eating"));
        cats.add(new CompetitionCategory("Sleeping"));
        cats.add(new CompetitionCategory("Running"));
        cats.add(new CompetitionCategory("Jumping"));
        cats.add(new CompetitionCategory("Climbing"));
        cats.add(new CompetitionCategory("Swimming"));
        cats.add(new CompetitionCategory("Cuddling"));

        competitionCategoryRepository.saveAll(cats);
    }

    private void initTrophies() {
        for (CompetitionCategory cat : cats) {
            for (int j = 0; j < 3; j++) {
                trophies.add(new Trophy(2024, j+1, cat));
            }
        }

        trophyRepository.saveAll(trophies);
    }



    private void initAnimals() {
        animals.add(new Animal("Fido", 3, "Dog", List.of(trophies.get(0), trophies.get(5))));
        animals.add(new Animal("Whiskers", 2, "Cat", List.of(trophies.get(1), trophies.get(4))));
        animals.add(new Animal("Bubbles", 1, "Fish", List.of(trophies.get(2), trophies.get(3))));
        animals.add(new Animal("Spike", 4, "Hedgehog", List.of(trophies.get(6), trophies.get(10))));
        animals.add(new Animal("Fluffy", 5, "Rabbit", List.of(trophies.get(7), trophies.get(9))));
        animals.add(new Animal("Squawk", 2, "Parrot", List.of(trophies.get(8), trophies.get(11))));
        animals.add(new Animal("Scales", 1, "Snake", List.of(trophies.get(12), trophies.get(13))));

        animalRepository.saveAll(animals);
    }
}
