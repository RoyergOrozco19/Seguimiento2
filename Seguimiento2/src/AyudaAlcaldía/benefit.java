package AyudaAlcaldía;

public class benefit {
    private String gender;
    private int age;

    public benefit (String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public int calculateAid() {
        if (gender.equalsIgnoreCase("femenino")) {
            if (age > 50) {
                return 120000;
            } else if (age >= 30) {
                return 100000;
            }
        } else if (gender.equalsIgnoreCase("masculino")) {
            return 40000;
        }

        return 0;
    }

}
