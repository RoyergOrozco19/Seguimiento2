package Lavadors;


import javax.swing.*;

public class WmMain {
    public static void main(String[] args) {

        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo (1 o 2):"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas:"));

        WMCompany company = new WMCompany(tipo, horas);

        int costo = company.calcularCosto();
        JOptionPane.showMessageDialog(null, "El costo calculado es: " + costo);
    }
}

