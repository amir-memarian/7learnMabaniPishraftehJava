package Compare;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import vasileyeNaglieh.mashin.Dande;
import vasileyeNaglieh.mashin.Mashin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareCollectionTest {
    @Test
    void Should_compare_non_hash_collection() {
        List<Mashin> mashinha_1 = new ArrayList<>();
        mashinha_1.add(new Mashin("benz",15, Dande.MANUAL));

        List<Mashin> mashinha_2 = new ArrayList<>();
        mashinha_2.add(new Mashin("benz",15, Dande.MANUAL));

        Assertions.assertThat(mashinha_1.equals(mashinha_2)).isTrue();
    }

    @Test
    void Should_compare_hash_collection() {
        Set<Mashin> mashinha_1 = new HashSet<>();
        mashinha_1.add(new Mashin("benz",15, Dande.MANUAL));

        Set<Mashin> mashinha_2 = new HashSet<>();
        mashinha_2.add(new Mashin("benz",15, Dande.MANUAL));

        Assertions.assertThat(mashinha_1.equals(mashinha_2)).isTrue();
        Assertions.assertThat(mashinha_1.hashCode()==mashinha_2.hashCode()).isTrue();
    }

}
