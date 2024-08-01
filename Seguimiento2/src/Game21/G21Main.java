package Game21;

public class G21Main {
    public static void main(String[] args) {
        G21 game = new G21();
        game.dealCards();
        game.revealComputerCard();
        game.determineWinner();
    }
}