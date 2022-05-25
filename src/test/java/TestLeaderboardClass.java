import com.example.tictactoejavaproject2022.Leaderboard;
import com.example.tictactoejavaproject2022.Winner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestLeaderboardClass {

        //If score is set
        @Test
        void setPlayer1Score_IsSetCorrectly(){
            Leaderboard player1 = new Leaderboard();
            player1.setPlayer1Score(1);
            assertEquals(1, player1.getPlayer1Score());
        }

        @Test
        void setPlayer2Score_IsSetCorrectly(){
            Leaderboard player2 = new Leaderboard();
            player2.setPlayer2Score(4);
            assertEquals(4, player2.getPlayer2Score());
        }

        //Count
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

        //Announce winner
        @Test
        void setWinner_IsSetCorrectly(){
            Leaderboard player1 = new Leaderboard();
            player1.setWinner("X");
            assertEquals("X", player1.getWinner());
        }

    }