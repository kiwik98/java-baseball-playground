package baseball.domain;

public class Score {
    private int strikeScore = 0;
    private int ballScore = 0;

    public void count(String answer, String solve) {
        this.strikeScore = strikeCount(answer, solve);
        this.ballScore = ballCount(answer, solve);
    }


    private int strikeCount(String answer, String solve) {
        int count = 0;
        for (int i = 0; i < answer.length(); i++) {
            if(answer.charAt(i) == solve.charAt(i)) count++;
        }
        return count;
    }

    private int ballCount(String answer, String solve) {
        int count = 0;
        for (int i = 0; i < answer.length(); i++) {
            for(int j = 0; j < solve.length(); j++) {
                if(answer.charAt(i) == solve.charAt(j)) count++;
            }
        }
        return count - this.strikeScore;
    }

    public int getStrikeScore() {
        return strikeScore;
    }

    public int getBallScore() {
        return ballScore;
    }

    public boolean isSolved() {
        boolean solved = false;
        if(this.strikeScore == 3) solved = true;
        return solved;
    }
}
