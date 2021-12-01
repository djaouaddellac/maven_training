package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {


    @Test
    void operation_by_int_should_produce() {
        Sample object = new Sample();

        int x = object.op(Sample.Operation.ADD, 5, 6);
        int y = object.op(Sample.Operation.MULT, 5, 6);

        Assertions.assertThat(x).as("5 + 6 = ").isEqualTo(11);
        Assertions.assertThat(y).as("5 * 6 = ").isEqualTo(30);
    }


    @Test
    void fact_by_negative_int_should_produce_an_exception() {

        Sample object = new Sample();

        //int t = object.fact(-3);

        //Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(t)

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> object.fact(-3)
        );

    }


    @Test
    void fact_by_int_should_produce() {

        Sample object = new Sample();

        int j = object.fact(3);

        Assertions.assertThat(j).as("fact(3) = ").isEqualTo(6);

    }

}
