package org.example;

public class Mascota {

    private int energia;
    private int humor;

    public static void comer(String[] args) {

    }

    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100) {
            this.energia = energia;
        } else {
            throw new IllegalArgumentException("La edad debe ser entre 0 y 100");
        }
    }

    public void setHumor(int humor) {
        if (humor >= 0 && humor <= 5) {
            this.humor = humor;
        } else {
            throw new IllegalArgumentException("El humor debe ser entre 1 y 5");
        }
    }

    public int getEnergia() {
        return energia;
    }

    public int getHumor() {
        return humor;
    }

    public Mascota(int energia, int humor) {
        setEnergia(energia);
        setHumor(humor);
    }
}
