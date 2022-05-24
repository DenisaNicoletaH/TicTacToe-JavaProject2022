import com.example.tictactoejavaproject2022.Leaderboard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestLeaderboardClass {
    @Test
    void countIncrementsForPlayer1_whenScoreChanges() {
        Leaderboard player1 = new Leaderboard();
        player1.setPlayer1Score(2);
        assertEquals(3, player1.getIncrementedScoreXPlayer1());
    }

    @Test
    void countIncrementsForPlayer2_whenScoreChanges() {
        Leaderboard player2 = new Leaderboard();
        player2.setPlayer2Score(3);
        assertEquals(4, player2.getIncrementedScoreOPlayer2());
    }
}