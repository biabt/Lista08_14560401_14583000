package ex02;

import ex01.View;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.junit.jupiter.api.Test;

class TesteAplicação {

	/* A diferença dos testes de aplicação pros testes de aceitação é que nos testes de aceitação, o foco é 
	 * testar a aplicação como um todo, para ver se o software está pronto para ser distribuido, enquanto
	 * testes de unidade testados pelo JUnit tem o foco em testar funções ou funcionalidades específicas.
	 * 
	 * Para testes de aplicação, é possivel fazer o teste como se um usuário testando, tendo acesso ao mesmos recursos e métodos
	 * enquanto no Teste Unitário consegue-se fazer o teste específico de cada método.
	 * 
	 * */
    @Test
    public void TesteNormal() {
    	View view = new View();
        // Simula a entrada do número 5
    	JTextField numberField = view.numberField;
    	JButton calculateButton = view.calculateButton;
    	JLabel resultLabel = view.resultLabel;
    	
    	numberField.setText("5");
    	calculateButton.doClick();
    	
        assertEquals("Resultado: 120", resultLabel.getText());
    }
    
    @Test
    public void TesteNegativo() {
    	View view = new View();
        // Simula a entrada do número -1
    	JTextField numberField = view.numberField;
    	JButton calculateButton = view.calculateButton;
    	JLabel resultLabel = view.resultLabel;
    	
    	numberField.setText("-1");
    	calculateButton.doClick();
    	
        boolean naoDaPau = false;
        try {
        	naoDaPau = true;
        } catch (Exception e) {
        	naoDaPau = false;
        }
        assertTrue(naoDaPau);
        assertEquals("O número não deve ser negativo.", resultLabel.getText());
    }
    
    @Test
    public void TesteFormatoInvalido() {
    	View view = new View();
        // Simula a entrada dee uma string dedos
    	JTextField numberField = view.numberField;
    	JButton calculateButton = view.calculateButton;
    	JLabel resultLabel = view.resultLabel;
    	
    	numberField.setText("dedos");
    	calculateButton.doClick();
    	
        boolean naoDaPau = false;
        try {
        	naoDaPau = true;
        } catch (Exception e) {
        	naoDaPau = false;
        }
        assertTrue(naoDaPau);
        assertEquals("Input deve ser um inteiro positivo.", resultLabel.getText());
    }

}

/**/


