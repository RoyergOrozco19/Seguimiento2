package Computerproblem;

import javax.swing.*;

public class PcMain {
    public static void main(String[] args) {
            boolean emitePitido = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Emite un pitido al iniciar? (true/false)"));
            boolean discoDuroGira = Boolean.parseBoolean(JOptionPane.showInputDialog("¿El disco duro gira? (true/false)"));

            Pcproblem problema = new Pcproblem(emitePitido, discoDuroGira);
            problema.determinarEstado();
        }
    }

