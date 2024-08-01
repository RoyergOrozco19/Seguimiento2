package CitaMedica;

import javax.swing.*;

public class CitaMain {
    public static void main(String[] args) {
        String codCita = JOptionPane.showInputDialog(null, "Please input your appointment code: ");
        String userName = JOptionPane.showInputDialog(null, "User, please input your name");
        String doctorName = "Dr Royerg";
        String consultory = JOptionPane.showInputDialog(null, "Input the consultory (in numbers only): ");
        String date = JOptionPane.showInputDialog(null, "User, please input your appointment date");
        String hour = "3:00pm";
        String medicalCenter= "General Hospital That Save Lifes";

        Cita info = new Cita(codCita, date, hour, consultory, userName, doctorName, medicalCenter);

        JOptionPane.showMessageDialog(null,"Información de la cita:" + info );


    }
}