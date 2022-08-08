public class Main {
    public static void main(String[] args) {
        int high = calculateHighScorePosition(1500);
        displayHighScorePosotion("jain", high);
        high = calculateHighScorePosition(900);
        displayHighScorePosotion("Arun", high);
        high = calculateHighScorePosition(400);
        displayHighScorePosotion("Siva", high);
        high = calculateHighScorePosition(50);
        displayHighScorePosotion("raja", high);
        high = calculateHighScorePosition(1000);
        displayHighScorePosotion("kala", high);
    }

    public static void displayHighScorePosotion(String playerName, int highScorePosition) {
        System.out.println(  playerName +"  Manged to get into position "+   highScorePosition     + "    On the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else
            return 4;
    }
}