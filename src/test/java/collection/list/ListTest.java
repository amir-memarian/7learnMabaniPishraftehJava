package collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ListTest {
    @Test
    void Should_Be_Empty_When_Created() {
        List<String> strings = new ArrayList<>();


        Assertions.assertThat(strings.isEmpty());
    }

    @Test
    void Should_Sort_List() {
        List<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        Collections.sort(animals);

        LinkedList<String> sortedAnimals = new LinkedList<>();
        sortedAnimals.add("Cat");
        sortedAnimals.add("Cat");
        sortedAnimals.add("Cat");
        sortedAnimals.add("Dog");
        sortedAnimals.add("Rabbit");

        Assertions.assertThat(animals).isEqualTo(sortedAnimals);
    }

    @Test
    void Should_Be_Immutable() {
        List<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        List<String> unmodifiableAnimals = Collections.unmodifiableList(animals);

        // unmodifiableAnimals.add("Snake"); Dose not work
        animals.remove("Cat");

        Assertions.assertThat(animals.size()).isEqualTo(4);
        Assertions.assertThat(unmodifiableAnimals.size()).isEqualTo(4);
    }

    @Test
    void Should_Reverce_A_List() {
        List<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        Collections.reverse(animals);

        List<String> reversedAnimals = new LinkedList<>();

        reversedAnimals.add("Rabbit");
        reversedAnimals.add("Cat");
        reversedAnimals.add("Cat");
        reversedAnimals.add("Cat");
        reversedAnimals.add("Dog");
        Assertions.assertThat(animals).isEqualTo(reversedAnimals);
        Assertions.assertThat(animals.indexOf("Cat")).isEqualTo(1);
        Assertions.assertThat(animals.lastIndexOf("Cat")).isEqualTo(3);
        Assertions.assertThat(animals.contains("Dog")).isTrue();

    }

    @Test
    void Array_to_ArrayList() {
        // Given
        int[] arrayNumbers = {1, 2, 3, 3};

        // When
        Converter converter = new Converter();
        List<Integer> arrayListNumber = converter.convertToArrayList(arrayNumbers);
        arrayListNumber.add(4,99);
        arrayListNumber.add(2,55);
        arrayListNumber.set(1,66);
        arrayListNumber.remove(3);


        // Then
        List<Integer> expectedList = new LinkedList<>();
        expectedList.add(1);    // index 0
        expectedList.add(66);   // index 1
        expectedList.add(55);   // index 2
        //expectedList.add(3);    // index 3
        expectedList.add(3);    // index 4
        expectedList.add(99);   // index 5
        Assertions.assertThat(arrayListNumber).isEqualTo(expectedList);
    }

    private class Converter {
        public List<Integer> convertToArrayList(int[] arrayNumbers) {
            List<Integer> listNumber = new LinkedList<>();
            for (int number : arrayNumbers) {
                listNumber.add(number);
            }
            return listNumber;
        }
    }
}
