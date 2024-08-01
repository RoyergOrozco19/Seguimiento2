package pagoEmpleado;

public class PagoEmpleado {

    public String employe;
    private int salary;
    public int extraHours;
    private int hoursNum;
    private int disscountP;
    private int bonus;
    private int overall;

    public PagoEmpleado(String employe, int salary, int extraHours, int hoursNum, int disscountP) {
        this.employe = employe;
        this.salary = salary;
        this.extraHours = extraHours;
        this.hoursNum = hoursNum;
        this.disscountP = disscountP;
        this.bonus = bonus;
        this.overall = overall;
    }
}
