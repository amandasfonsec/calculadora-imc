package ado_3;

//Amanda Silva Fonseca

public class Homem {
    
    private double altura;
    private double peso;

    public Homem() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String mostraIMC() {
        double imc = this.peso / (this.altura * this.altura);

        if (imc < 20) {
            return "Abaixo do peso\nIMC: " + String.format("%.2f", imc);
        } else if (imc >= 20 && imc <= 24.9) {
            return "Normal\nIMC: " + String.format("%.2f", imc);
        } else if (imc >= 25 && imc <= 29.9) {
            return "Obesidade leve\nIMC: " + String.format("%.2f", imc);
        } else if (imc >= 30 && imc <= 39.9) {
            return "Obesidade moderada\nIMC: " + String.format("%.2f", imc);
        }
        return "Obesidade mórbida\nIMC: " + String.format("%.2f", imc);
    }
    
}
