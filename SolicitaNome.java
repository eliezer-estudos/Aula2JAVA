import javax.swing.JOptionPane;

public class SolicitaNome {
    public static void main(String[] args) {
        String nome, sobrenome;
        int idade;

        nome = JOptionPane.showInputDialog(null,
                "Digite seu nome: ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
        sobrenome = JOptionPane.showInputDialog(null,
                "Digite seu sobrenome: ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite sua idade: ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null,
                "Nome: " + nome + " "
                        + sobrenome
                        + "\nIdade: "
                        + idade,
                "Saida de Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}