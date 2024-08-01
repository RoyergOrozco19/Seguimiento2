package Envío;

import javax.swing.*;

public class EnvioMain {
    public static void main(String[] args) {
        String guideNum = JOptionPane.showInputDialog("Ingrese el número de guía:");
        String date = JOptionPane.showInputDialog("Ingrese la fecha:");
        String packageType = JOptionPane.showInputDialog("Ingrese el tipo de paquete:");
        String clientID = JOptionPane.showInputDialog("Ingrese el ID del cliente:");
        int weight = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso:"));
        String cityOrigin = JOptionPane.showInputDialog("Ingrese la ciudad de origen:");
        String destinyCity = JOptionPane.showInputDialog("Ingrese la ciudad de destino:");
        int cost = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo:"));
        String shippingStatus = JOptionPane.showInputDialog("Ingrese el estado del envío:");

        Envio envio = new Envio(guideNum, date, packageType, clientID, weight, cityOrigin, destinyCity, cost, shippingStatus);

        JOptionPane.showMessageDialog(null, envio.toString());
    }
}

