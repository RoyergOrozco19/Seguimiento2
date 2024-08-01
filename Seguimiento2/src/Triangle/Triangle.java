package Triangle;

import javax.swing.*;

public class Triangle {
    private int angle1, angle2, angle3;

public Triangle(int angle1, int angle2, int angle3) {
    System.out.println("Digite los angulos del triangulo: ");
    this.angle1 = angle1;
    this.angle2 = angle2;
    this.angle3 = angle3;
}
public Boolean isValidTriangle(){
    return(angle1 + angle2 + angle3)==180;

    }
}
