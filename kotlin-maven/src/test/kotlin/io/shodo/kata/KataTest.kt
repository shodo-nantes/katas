package io.shodo.kata

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class KataTest {
    @Test
    fun always_start_with_a_failing_test() {
        Assertions.assertThat(false).isTrue
    }
}