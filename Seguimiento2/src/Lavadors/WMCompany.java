package Lavadors;

import javax.swing.*;

public class WMCompany {
        private int tipo;
        private int horas;
        private static final int bigCost = 4000;
        private static final int smallcost = 3000;

    public WMCompany(int tipo, int horas) {
        this.tipo = tipo;
        this.horas = horas;
    }

    public int calcularCosto() {
            if (tipo == 1) {
                return horas * bigCost;
            } else if (tipo == 2) {
                return horas * smallcost;
            } else {
                return 0;
            }
        }
    }


