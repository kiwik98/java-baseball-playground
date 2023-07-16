package baseball.request;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallRequestTest {

    @Test
    void 입력값_길이_검사() {
        BallRequest request = new BallRequest("1234");
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            request.getRequest();
        });
        assertEquals("유효하지 않은 입력 값입니다.", exception.getMessage());
    }

    @Test
    void 입력값_포맷_검사() {
        BallRequest request = new BallRequest("abc");
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            request.getRequest();
        });
        assertEquals("유효하지 않은 입력 값입니다.", exception.getMessage());
    }

}