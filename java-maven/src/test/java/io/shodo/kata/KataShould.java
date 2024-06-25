package io.shodo.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KataShould {

    @Test
    void always_start_with_a_failing_test() {
        assertThat(false).isTrue();
    }

}