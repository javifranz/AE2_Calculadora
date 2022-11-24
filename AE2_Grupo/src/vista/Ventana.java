package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ManejadorEventos;

public class Ventana extends JFrame {
	
	private JTextField cajaNum1,cajaNum2;
	private JButton botonSum, botonRes, botonMul, botonDiv, botonR2, botonR3;
	private JLabel etiquetaNum1, etiquetaNum2, etiquetaResul;
	
	public Ventana () {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 350);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public JTextField getcajaNum1() {
		return cajaNum1;
	}
	
	public JTextField getcajaNum2() {
		return cajaNum2;
	}
	
	public JButton getbotonSum () {
		return botonSum;
	}
	
	public JButton getbotonRes () {
		return botonRes;
	}
	
	public JButton getbotonMul () {
		return botonMul;
	}
	
	public JButton getbotonDiv () {
		return botonDiv;
	}
	
	public JButton getbotonR2 () {
		return botonR2;
	}
	
	public JButton getbotonR3 () {
		return botonR3;
	}
	
	public JLabel getetiquetaResul() {
		return etiquetaResul;
	}
	
	private void inicializarComponentes() {
		etiquetaNum1 = new JLabel("Número 1");
		etiquetaNum1.setBounds(10, 10, 80, 20);
		
		cajaNum1 = new JTextField();
		cajaNum1.setBounds(100, 10, 100, 20);
		cajaNum1.requestFocus();
		
		etiquetaNum2 = new JLabel("Número 2");
		etiquetaNum2.setBounds(10, 35, 80, 20);
		
		
		cajaNum2 = new JTextField();
		cajaNum2.setBounds(100, 40, 100, 20);
		
		botonSum = new JButton ("Sumar");
		botonSum.setBounds(50, 70, 100, 30);
		
		botonRes = new JButton ("Restar");
		botonRes.setBounds(180, 70, 100, 30);
		
		botonMul = new JButton ("Multiplicar");
		botonMul.setBounds(50, 120, 100, 30);
		
		botonDiv = new JButton ("Dividir");
		botonDiv.setBounds(180, 120, 100, 30);
		
		botonR2 = new JButton ("Raíz 2");
		botonR2.setBounds(50, 170, 100, 30);
		
		botonR3 = new JButton ("Raíz 3");
		botonR3.setBounds(180, 170, 100, 30);
		
		etiquetaResul = new JLabel("Resultado: ");
		etiquetaResul.setBounds(10, 250, 200, 20);
		
		
		
		add(etiquetaNum1);
		add(cajaNum1);
		add(etiquetaNum2);
		add(cajaNum2);
		add(botonSum);
		add(botonRes);
		add(botonMul);
		add(botonDiv);
		add(botonR2);
		add(botonR3);
		add(etiquetaResul);
	}
	
	public void establecerManejador(ManejadorEventos manejador) {
		botonSum.addActionListener(manejador);
		botonRes.addActionListener(manejador);
		botonMul.addActionListener(manejador);
		botonDiv.addActionListener(manejador);
		botonR2.addActionListener(manejador);
		botonR3.addActionListener(manejador);
	}

}
