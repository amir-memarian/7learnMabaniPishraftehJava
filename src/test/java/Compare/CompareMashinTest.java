package Compare;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import vasileyeNaglieh.mashin.Dande;
import vasileyeNaglieh.mashin.Mashin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CompareMashinTest {
    @Test
    void Should_Compare_Mashin() {
        Mashin bmw_1 = new Mashin("BMW",150, Dande.AUTOMATIC);
        Mashin bmw_2 = new Mashin("BMW",150, Dande.AUTOMATIC);

        Assertions.assertThat(bmw_1.equals(bmw_2)).isTrue();
        Assertions.assertThat(Objects.equals(bmw_1,bmw_2)).isTrue();
        Assertions.assertThat(bmw_1).isEqualTo(bmw_2);
    }

    @Test
    void Should_Sort_Mashins() {
        Mashin bmw_1 = new Mashin("BMW",150, Dande.MANUAL);
        Mashin bmw_2 = new Mashin("BMW",100, Dande.AUTOMATIC);
        Mashin bmw_3 = new Mashin("BMW",50, Dande.MANUAL);
        Mashin bmw_4 = new Mashin("BMW",50, Dande.AUTOMATIC);
        List<Mashin> mashins = new ArrayList<>();
        mashins.add(bmw_1);
        mashins.add(bmw_2);
        mashins.add(bmw_3);
        mashins.add(bmw_4);

        Collections.sort(mashins);

        List<Mashin> expectedMashins = new ArrayList<>();
        expectedMashins.add(new Mashin("BMW",50, Dande.AUTOMATIC));
        expectedMashins.add(new Mashin("BMW",50, Dande.MANUAL));
        expectedMashins.add(new Mashin("BMW",100, Dande.AUTOMATIC));
        expectedMashins.add(new Mashin("BMW",150, Dande.MANUAL));


        Assertions.assertThat(mashins).isEqualTo(expectedMashins);

    }
}
