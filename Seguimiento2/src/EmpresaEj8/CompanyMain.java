package EmpresaEj8;

import javax.swing.*;

public class CompanyMain {
    public static void main(String[] args) {
        String salary = JOptionPane.showInputDialog("Input the salary:");
        String workHours = JOptionPane.showInputDialog("Input the work hour:");
        String totalSalary = JOptionPane.showInputDialog("Input the total salary:");

        Company company = new Company(salary, workHours, totalSalary);

        JOptionPane.showMessageDialog(null, company.toString());
    }
}
