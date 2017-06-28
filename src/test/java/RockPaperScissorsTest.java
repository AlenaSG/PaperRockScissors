import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void runRPS_checkForupdate_String() {
//    Player testPlayer = new Player();
    String userInput =  "test";
    assertEquals(true, userInput instanceof String);
  }

  @Test
  public void compareStrings_checkForSameInput_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    RockPaperScissors testRockPaperScissorsTwo = new RockPaperScissors();
    String userInputOne =  "rock";
    String userInputTwo =  "rock";
    String expected = "It's a tie!";
    assertEquals(expected, testRockPaperScissors.compareStrings(userInputOne, userInputTwo));
  }

  @Test
  public void compareStrings_checkForRockPaper_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    RockPaperScissors testRockPaperScissorsTwo = new RockPaperScissors();
    String userInputOne =  "rock";
    String userInputTwo =  "paper";
    String expected = "Player Two wins!";
    assertEquals(expected, testRockPaperScissors.compareStrings(userInputOne, userInputTwo));
  }

  @Test
  public void compareStrings_checkForScissorsPaper_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    RockPaperScissors testRockPaperScissorsTwo = new RockPaperScissors();
    String userInputOne =  "scissors";
    String userInputTwo =  "paper";
    String expected = "Player One wins!";
    assertEquals(expected, testRockPaperScissors.compareStrings(userInputOne, userInputTwo));
  }
}
