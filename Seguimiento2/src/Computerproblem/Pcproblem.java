package Computerproblem;

import javax.swing.*;

public class Pcproblem {
    private boolean emitePitido;
    private boolean discoDuroGira;

    public Pcproblem(boolean emitePitido, boolean discoDuroGira) {
        this.emitePitido = emitePitido;
        this.discoDuroGira = discoDuroGira;
    }

    public void determinarEstado() {
        if (emitePitido) {
            if (discoDuroGira) {
                JOptionPane.showMessageDialog(null, "La computadora está en órbita.");
            } else {
                JOptionPane.showMessageDialog(null, "Verificar contactos de la unidad.");
            }
        } else {
            if (discoDuroGira) {
                JOptionPane.showMessageDialog(null, "Traiga la computadora para repararla en la central.");
            } else {
                JOptionPane.showMessageDialog(null, "Compruebe las conexiones de potencia.");
            }
        }
    }
}

