package ex01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class View extends JFrame {
    public JTextField numberField;
    public JButton calculateButton;
    public JLabel resultLabel;

    public View() {

        // Configurações da janela
        setTitle("Calculadora de Fatorial");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Componentes da interface
        JLabel numberLabel = new JLabel("Digite um número:");
        numberField = new JTextField();
        calculateButton = new JButton("Calcular");
        resultLabel = new JLabel("Resultado:");

        // Adicionando componentes ao JFrame
        add(numberLabel);
        add(numberField);
        add(calculateButton);
        add(resultLabel);
        
        class OurActionListener implements ActionListener  {
        	public OurActionListener() {
            }
        	
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int number = Integer.parseInt(numberField.getText());
                        if (number < 0) {
                            throw new IllegalArgumentException("O número não deve ser negativo.");
                        }

                        // Calcula o fatorial usando o Controller
                        BigDecimal result = Controller.calculaFatorial(number);
                        resultLabel.setText("Resultado: " + result.toString());

                    } catch (NumberFormatException ex) {
                    	JOptionPane.showMessageDialog(View.this, "Input deve ser um inteiro positivo.", 
                        		"Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                    	resultLabel.setText("Input deve ser um inteiro positivo.");
                    } catch (IllegalArgumentException ex) {
                    	JOptionPane.showMessageDialog(View.this, ex.getMessage(), 
                        		"Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                    	resultLabel.setText("O número não deve ser negativo.");
                    }
                }
            
        }

        // Adicionar listener ao botão
        calculateButton.addActionListener(new OurActionListener());

        // Tornar a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        new View();
    }
}


        