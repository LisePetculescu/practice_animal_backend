package kea.exercise.practice_animal_backend;

import kea.exercise.practice_animal_backend.repositories.AnimalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimal(int id) {
        return animalRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Animal not found"));
    }

    public Animal createAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public Animal addTrophy(int id, Trophy trophy) {
        Animal animal = getAnimal(id);
        animal.getTrophies().add(trophy);
        return animalRepository.save(animal);
    }

    public void deleteAnimal(int id) {
        animalRepository.deleteById(id);
    }

    public Animal updateAnimal(int id, Animal animal) {
        Animal existingAnimal = getAnimal(id);
        existingAnimal.setName(animal.getName());
        existingAnimal.setAge(animal.getAge());
        existingAnimal.setSpecies(animal.getSpecies());
        return animalRepository.save(existingAnimal);
    }
}
