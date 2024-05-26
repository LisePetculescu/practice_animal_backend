package kea.exercise.practice_animal_backend;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
@CrossOrigin(origins = "http://localhost:5173")
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> getAnimals() {
        System.out.println("getAnimals");
        return animalService.getAnimals();
    }

    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable int id) {
        System.out.println("getAnimal");
        return animalService.getAnimal(id);
    }



    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal) {
        System.out.println("createAnimal");
        return animalService.createAnimal(animal);
    }

    @PostMapping("/{id}/addTrophy")
    public Animal addTrophy(@PathVariable int id, @RequestBody Trophy trophy) {
        System.out.println("addTrophy");
        return animalService.addTrophy(id, trophy);
    }

    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable int id, @RequestBody Animal animal) {
        System.out.println("updateAnimal");
        return animalService.updateAnimal(id, animal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable int id) {
        System.out.println("deleteAnimal");
        animalService.deleteAnimal(id);
    }



}
