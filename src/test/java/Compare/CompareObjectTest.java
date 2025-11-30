package Compare;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareObjectTest {
    @Test
    void Should_Compare_primitive_Type() {
        assertThat(1 == 1).isTrue();
        assertThat(1 != 2).isFalse();
    }

    @Test
    void Should_Compare_non_primitive_Type() {
        String s1 = new String("Amir");
        String s2 = new String("Amir");
        String s3 = new String("AMIR");

        System.out.println(s1);
        System.out.println(s2);

        assertThat(s1 == s2).isFalse();
        assertThat(s1.equals(s2)).isTrue();
        assertThat(s1.equalsIgnoreCase(s2)).isTrue();

        String str1 = "Amir";
        String str2 = "Amir";

        assertThat(str1 == str2).isTrue();


        String str_1 = null;
        String str_2 = "Amir";

        // assertThat(str_1.equals(str_2)).isTrue();  //exception - not support null value
        assertThat(Objects.equals(str_1,str_2)).isFalse();

    }
}
