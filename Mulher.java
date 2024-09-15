package ado_3;

//Amanda Silva Fonseca

public class Mulher {

    private double altura;
    private double peso;

    public Mulher() {
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

        if (imc < 19) {
            return "Abaixo do peso\nIMC: " + String.format("%.2f", imc);
        } else if (imc >= 19 && imc <= 23.9) {
            return "Normal\nIMC: " + String.format("%.2f", imc);
        } else if (imc >= 24 && imc <= 28.9) {
            return "Obesidade leve\nIMC: " + String.format("%.2f", imc);
        } else if (imc >= 29 && imc <= 38.9) {
            return "Obesidade moderada\nIMC: " + String.format("%.2f", imc);
        }
        return "Obesidade mórbida\nIMC: " + String.format("%.2f", imc);
    }

}
