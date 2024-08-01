package SubjectAverage;

import javax.swing.*;
import java.util.Scanner;

public class SubjectMain {

    public static void main(String[] args) {

        String inputChemistry = JOptionPane.showInputDialog("Input the chemistry grade(0 to 10):");
        double chemistry = Double.parseDouble(inputChemistry);

        String inputPhysics = JOptionPane.showInputDialog("Input the psysics grade (0 to 10):");
        double physics = Double.parseDouble(inputPhysics);

        String inputBiology = JOptionPane.showInputDialog("Input the biology grade (0 to 10):");
        double biology = Double.parseDouble(inputBiology);

        String inputMathematics = JOptionPane.showInputDialog("Input mathematics grade(0 to 10):");
        double mathematics = Double.parseDouble(inputMathematics);

        double average = (chemistry + physics + biology + mathematics) / 4;

        if (average >= 0 && average <= 10) {
            if (average >= 7) {
                JOptionPane.showMessageDialog(null, "Average: " + average + " (Good grade)");
            } else if (average >= 4) {
                JOptionPane.showMessageDialog(null, "Average: " + average + " (Fair grade)");
            } else {
                JOptionPane.showMessageDialog(null, "Average: " + average + " (Poor grade)");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid average. May be between 0 and 10.");
        }
    }
}
