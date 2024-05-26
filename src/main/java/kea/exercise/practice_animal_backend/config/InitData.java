package kea.exercise.practice_animal_backend.config;

import kea.exercise.practice_animal_backend.repositories.AnimalRepository;
import kea.exercise.practice_animal_backend.repositories.CompetitionCategoryRepository;
import kea.exercise.practice_animal_backend.repositories.TrophyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

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

    private void initTrophies() {
    }

    private void initCategories() {
        
    }

    private void initAnimals() {

    }
}
