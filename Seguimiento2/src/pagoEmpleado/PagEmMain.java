package pagoEmpleado;

import javax.swing.*;

public class PagEmMain {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");

        String salarioStr = JOptionPane.showInputDialog("Ingrese el salario:");
        int salario = Integer.parseInt(salarioStr);

        String horasStr = JOptionPane.showInputDialog("Ingrese las horas trabajadas:");
        int horas = Integer.parseInt(horasStr);

        String descuentoStr = JOptionPane.showInputDialog("Ingrese el porcentaje de descuento:");
        int descuento = Integer.parseInt(descuentoStr);

        String bonoStr = JOptionPane.showInputDialog("Ingrese el bono:");
        int bono = Integer.parseInt(bonoStr);

        PagoEmpleado empleado = new PagoEmpleado(nombre, salario, horas, descuento, bono);

        JOptionPane.showMessageDialog(null, empleado);

    }
}
