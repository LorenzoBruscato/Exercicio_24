package exercicio_24;

import javax.swing.JOptionPane;

public class Exercicio_24 {

    public static void main(String[] args) {
        int i, soma;
        i = 14;
        soma = 2;
        while (i < 25) {
            JOptionPane.showMessageDialog(null, "Numero: " + i);
            i = i + soma;
        }
    }
}