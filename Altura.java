import javax.swing.JOptionPane;

public class Altura {
    public static void main(String[] args) {
        double altura;

        altura = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite sua altura: ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null,
                "Altura: " + altura,
                "Saidade de Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}
