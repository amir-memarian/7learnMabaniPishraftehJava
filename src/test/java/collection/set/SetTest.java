package collection.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    @Test
    void HashSet_Should_Remove_Duplication() {
        Set<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        Set<String> expectedAnimals = new HashSet<>();
        expectedAnimals.add("Dog");
        expectedAnimals.add("Cat");
        expectedAnimals.add("Rabbit");
        Assertions.assertThat(animals).isEqualTo(expectedAnimals);

        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    @Test
    void LinkedHashSet_Should_Maintain_Insertion_Oreder() {
        Set<String> animals = new LinkedHashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        for (String animal : animals) {
            System.out.println(animal);
        }

    }

    @Test
    void TreeSet_Should_Sort_Data() {
        Set<String> animals = new TreeSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
