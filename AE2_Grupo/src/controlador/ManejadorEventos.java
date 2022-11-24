package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import vista.Ventana;

public class ManejadorEventos implements ActionListener {

	private Ventana ventana;
	
	public ManejadorEventos(Ventana ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (ventana.getcajaNum1().getText().length()==0 || ventana.getcajaNum2().getText().length()==0) {
			JOptionPane.showMessageDialog(null, "Ingrese los dos números");
		} else if (ventana.getcajaNum1().getText().contains("-") || ventana.getcajaNum2().getText().contains("-")) {
			JOptionPane.showMessageDialog(null, "Solo números positivos");
		}
		
		else {
		
		double num1 = Double.parseDouble(ventana.getcajaNum1().getText());
		double num2 = Double.parseDouble(ventana.getcajaNum2().getText());
		
		double suma = num1 + num2;
		double resta = num1 - num2;
		double producto = num1 * num2;
		double division = num1 / num2;
		double raiz = Math.cbrt(num1);
		
		
		
		if (e.getSource() == ventana.getbotonSum()) {
			ventana.getetiquetaResul().setText("Resultado :" + suma);
		} else if  (e.getSource() == ventana.getbotonRes()) {
			ventana.getetiquetaResul().setText("Resultado :" + resta);
		}else if  (e.getSource() == ventana.getbotonMul()) {
			ventana.getetiquetaResul().setText("Resultado :" + producto);
		}else if  (e.getSource() == ventana.getbotonDiv()) {
			ventana.getetiquetaResul().setText("Resultado :" + division);
		}else if (e.getSource() == ventana.getbotonR2()) {
			JOptionPane.showMessageDialog(null, "Funcionalidad no disponible");
		}else if (e.getSource() == ventana.getbotonR3()) {
			JPasswordField pf = new JPasswordField();
			int okCxl = JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			String password = new String(pf.getPassword());
			if (okCxl == JOptionPane.OK_OPTION && password.equals("1234")) {
				ventana.getetiquetaResul().setText("Resultado :" + raiz);
            }else {
            	JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA");
            }
			
		  
			
		}
				
	}

   }
}
