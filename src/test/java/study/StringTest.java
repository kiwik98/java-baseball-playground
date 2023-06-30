package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] values = "1,2".split(",");
        int length = values.length;
        assertThat(length).isEqualTo(2);
    }

    @Test
    void substring() {
        String st = "(1,2)";
        assertThat(st.substring(1, st.length() - 1)).isEqualTo("1,2");
    }

    @Test
    void charAt() {
        String ch = "abc";
        assertThat(ch.charAt(1)).isEqualTo('b');

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    ch.charAt(3);
                }).withMessageContaining("%d", 3);
    }
}
