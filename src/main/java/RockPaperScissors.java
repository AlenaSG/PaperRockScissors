import java.io.Console;

public class RockPaperScissors {

  public String compareStrings(String playerOneChoice, String playerTwoChoice) {
    if (playerOneChoice.equals(playerTwoChoice)) {
      return "It's a tie!";
    } else if ((playerOneChoice.equals("rock")) && (playerTwoChoice.equals("paper"))) {
      return "Player Two wins!";
    } else if ((playerOneChoice.equals("rock")) && (playerTwoChoice.equals("scissors"))) {
      return "Player One wins!";
    } else if ((playerOneChoice.equals("paper")) && (playerTwoChoice.equals("rock"))) {
      return "Player One wins!";
    } else if ((playerOneChoice.equals("paper")) && (playerTwoChoice.equals("scissors"))) {
      return "Player Two wins!";
    } else if ((playerOneChoice.equals("scissors")) && (playerTwoChoice.equals("rock"))) {
      return "Player Two wins!";
    } else {
      return "Player One wins!";
  }
}

}
