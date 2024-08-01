package Game21;

import javax.swing.*;
import java.util.Random;

public class G21 {
    private int userScore;
    private int computerScore;

    public G21() {
        userScore = 0;
        computerScore = 0;
    }

    public void dealCards() {
        Random random = new Random();
        int userCard1 = random.nextInt(10) + 1;
        int userCard2 = random.nextInt(10) + 1;
        int computerCard1 = random.nextInt(10) + 1;
        int computerCard2 = random.nextInt(10) + 1;

        userScore = userCard1 + userCard2;
        computerScore = computerCard1 + computerCard2;

        JOptionPane.showMessageDialog(null, "Tus cartas: " + userCard1 + " y " + userCard2);
    }

    public void revealComputerCard() {
        JOptionPane.showMessageDialog(null, "Carta de la computadora: " + computerScore);
    }

    public void determineWinner() {
        if (userScore <= 21 && (userScore > computerScore || computerScore > 21)) {
            JOptionPane.showMessageDialog(null, "¡Ganaste!");
        } else {
            JOptionPane.showMessageDialog(null, "La computadora gana.");
        }
    }
}

