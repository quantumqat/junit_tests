public class Grading {
    public Grading() {
    }

    public char returnLetterGrade(int score){
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative. Re-enter number to be evaluated!");
        } else if (score < 60) {
            return 'F';
        } else if (score < 70) {
            return 'D';
        } else if (score < 80) {
            return 'C';
        } else if (score < 90) {
            return 'B';
        } else if (score < 100) {
            return 'A';
        } else {
            throw new IllegalArgumentException("Please enter a valid score");
        }

    }
}
