package baseball.domain;

import java.util.Objects;

public class Baseball {

    private final int position;
    private final int ballNumber;

    public Baseball(final int position, final int ballNumber) {
        this.position = position;
        this.ballNumber = ballNumber;
    }

    public String getBallNumber() {
        return String.valueOf(ballNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baseball baseball = (Baseball) o;
        return position == baseball.position && ballNumber == baseball.ballNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, ballNumber);
    }
}
