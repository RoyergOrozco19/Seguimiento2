package AyudaAlcaldía;

public class BenefitMain {
    public static void main(String[] args) {
        benefit recipient = new benefit("femenino", 55);
        System.out.println("El monto de ayuda es: $" + recipient.calculateAid());
    }
}
