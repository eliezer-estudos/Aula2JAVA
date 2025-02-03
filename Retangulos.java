import javax.swing.JOptionPane;

public class Retangulos {
    public static void main(String[] args) {
        int a, b, d, a1, a2, atotal;

        a = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a largura menor(em cm): ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
        d = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a largura maior(em cm):",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a altura dos dois retângulos (em cm): ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));

        a1 = a * b;
        a2 = d * b; 
        atotal = a1 + a2;

        JOptionPane.showMessageDialog(null, 
                "Área do primeiro retângulo: " + a1 + " cm²\n" +
                "Área do segundo retângulo: " + a2 + " cm²\n" +
                "Área total: " + atotal + " cm²",
                "Saída de Dados", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
