
import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {
        try {
            float peso = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Digite seu peso (kg): ",
                    "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
            float altura = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Digite sua altura (m): ",
                    "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));

            float imc = calcularIMC(peso, altura);

            JOptionPane.showMessageDialog(null,
                    String.format("IMC: %.2f", imc),
                    "Saída de Dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Entrada inválida. Por favor, insira números válidos.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static float calcularIMC(float peso, float altura) {
        return peso / (altura * altura);
    }
}