package collection.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    @Test
    void Should_have_uniqe_Keys_and_Values() {
        Map<String, Integer> geometrics = new HashMap<>();
        geometrics.put("Mosalas" , 20);  // Duplicated value is allowed
        geometrics.put("Mostatil" , 30);
        geometrics.put("SheshZelei" , 32);
        geometrics.put("Moraba" , 20);   // Duplicated value is allowed
        geometrics.put("Moraba" , 20);   // Duplicated key is not allowed

        Set<Map.Entry<String, Integer>> entries = geometrics.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key :: " + key + " value :: " + value);
        }

    }

    @Test
    void Should_Preserve_insertion_order() {
        Map<String, Integer> geometrics = new LinkedHashMap<>();
        geometrics.put("Mosalas" , 20);
        geometrics.put("Mostatil" , 30);
        geometrics.put("SheshZelei" , 32);
        geometrics.put("Moraba" , 20);

        Set<Map.Entry<String, Integer>> entries = geometrics.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key :: " + key + " value :: " + value);
        }
    }

    
}
