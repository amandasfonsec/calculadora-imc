package ado_3;

//Amanda Silva Fonseca

import javax.swing.JOptionPane;

public class IMC {

    public static void main(String[] args) {
        int op = 0;

        do{
        String valores[] = {"Feminino", "Masculino", "SAIR"};
        op = JOptionPane.showOptionDialog(null, "        Informe o sexo:",
					"Calculadora de IMC", 
                                        JOptionPane.DEFAULT_OPTION, 
                                        JOptionPane.QUESTION_MESSAGE,
					null, valores, valores[0]);
        if(op == 0){
            Mulher m = new Mulher();
            String altura;
            String peso;
            
            do{
                altura = JOptionPane.showInputDialog(null, "Digite a altura:\n(Coloque em metros, ex 1.70)");
            } while (!altura.contains("."));
            do {
                peso = JOptionPane.showInputDialog(null, "Digite o peso:\n(Coloque em Kg)");
            } while(!peso.matches("\\d+(\\.\\d+)?"));
            
           
            m.setAltura(Double.parseDouble(altura));
            m.setPeso(Double.parseDouble(peso));
            
            JOptionPane.showMessageDialog(null, m.mostraIMC());
        }
        else if (op == 1){
            Homem h = new Homem();
            String altura;
            String peso;
            
            do{
                altura = JOptionPane.showInputDialog(null, "Digite a altura:\n(Coloque em metros, ex 1.70)");
            } while (!altura.contains("."));
            do {
                peso = JOptionPane.showInputDialog(null, "Digite o peso:\n(Coloque em Kg)");
            } while(!peso.matches("\\d+(\\.\\d+)?"));
            
           
            h.setAltura(Double.parseDouble(altura));
            h.setPeso(Double.parseDouble(peso));
            
            JOptionPane.showMessageDialog(null, h.mostraIMC());
        }
        
        } while( op != 2);
    }
}
