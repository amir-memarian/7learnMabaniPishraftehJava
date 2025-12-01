package kata.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void init(){
        stack = new Stack(5);

    }

    @Test
    void newly_Created_Stacks_Should_Be_Empty() {
        Assertions.assertThat(stack.getSize()).isEqualTo(0);
    }

    @Test
    void After_one_push_stack_size_should_be_one() {
        stack.push("A");

        Assertions.assertThat(stack.getSize()).isEqualTo(1);
    }

    @Test
    void after_one_push_and_one_pop_stack_should_be_empty() {
        stack.push("A");
        stack.pop();

        Assertions.assertThat(stack.getSize()).isEqualTo(0);
    }

    @Test
    void when_pushed_passed_limit_throw_stack_overflow_exception() {
        stack.push("A");
        stack.push("A");
        stack.push("A");
        stack.push("A");
        stack.push("A");
        Assertions.assertThatExceptionOfType(StackOverflowException.class)
                        .isThrownBy(() -> stack.push("A"));


    }
}
