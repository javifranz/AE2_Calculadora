package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ManejadorEventos;

public class Ventana extends JFrame {
	
	private JTextField cajaNum1,cajaNum2;
	private JButton botonSum, botonRes, botonMul, botonDiv, botonR2, botonR3;
	private JLabel etiquetaNum1, etiquetaNum2, etiquetaResul,IconImg;
	
	public Ventana () {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora Grupo 9 AE2");
		setIconImage(Toolkit.getDefaultToolkit().getImage("calculator.png"));
		setBounds(100, 100, 350, 460);
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
	public JLabel getIconImg() {
		return IconImg;
	}
	
	/**
	 * 
	 */
	private void inicializarComponentes() {
		
		//estilo color de ventana
		
		//colores
		//rgb(108, 74, 182)
		//rgb(141, 114, 225)
		//rgb(141, 158, 255)
		//rgb(185, 224, 255)
		//
		
		Color color1 = new Color (108, 74, 182);
		Color color2 = new Color (141, 114, 225);
		Color color3 = new Color (141, 158, 255);
		Color color4 = new Color (185, 224, 255);
		Font fuente1 = new Font ("Sans Serif",Font.PLAIN,14);
		Font fuente1Big = new Font ("Sans Serif",Font.PLAIN,22);
		getContentPane().setBackground(color1);
		
		
		IconImg = new JLabel(new ImageIcon("paste.png"));
		IconImg.setBounds(100, 10, 130, 130);

		
		
		
		etiquetaNum1 = new JLabel("Número 1");
		etiquetaNum1.setBounds(70, 160, 80, 20);
		etiquetaNum1.setBorder(null);
		etiquetaNum1.setForeground(color4);
		etiquetaNum1.setFont(fuente1);
		
		
		
		cajaNum1 = new JTextField();
		cajaNum1.setBounds(180, 160, 100, 20);
		cajaNum1.requestFocus();
		cajaNum1.setBorder(null);
		
		etiquetaNum2 = new JLabel("Número 2");
		etiquetaNum2.setBounds(70, 190, 80, 20);
		etiquetaNum2.setFont(fuente1);
		etiquetaNum2.setForeground(color4);
		
		
		cajaNum2 = new JTextField();
		cajaNum2.setBounds(180, 190, 100, 20);
		cajaNum2.setBorder(null);
		
		botonSum = new JButton ("Sumar");
		botonSum.setBounds(50, 230, 100, 25);
		botonSum.setBorder(null);
		botonSum.setBackground(color2);
		botonSum.setFont(fuente1);
		
		botonMul = new JButton ("Multiplicar");
		botonMul.setBounds(50, 260, 100, 25);
		botonMul.setBorder(null);
		botonMul.setBackground(color3);
		botonMul.setFont(fuente1);
		
		botonR2 = new JButton ("Raíz 2");
		botonR2.setBounds(50, 290, 100, 25);
		botonR2.setBorder(null);
		botonR2.setBackground(color4);
		botonR2.setFont(fuente1);
		
		
		botonRes = new JButton ("Restar");
		botonRes.setBounds(180, 230, 100, 25);
		botonRes.setBorder(null);
		botonRes.setBackground(color2);
		botonRes.setFont(fuente1);
		
		
		botonDiv = new JButton ("Dividir");
		botonDiv.setBounds(180, 260, 100, 25);
		botonDiv.setBorder(null);
		botonDiv.setBackground(color3);
		botonRes.setFont(fuente1);
		
		
		botonR3 = new JButton ("Raíz 3");
		botonR3.setBounds(180, 290, 100, 25);
		botonR3.setBorder(null);
		botonR3.setBackground(color4);
		botonR3.setFont(fuente1);
		
		
		etiquetaResul = new JLabel("Resultado: ");
		etiquetaResul.setBounds(10, 340, 200, 20);
		etiquetaResul.setForeground(color4);
		etiquetaResul.setFont(fuente1Big);
		
		
		
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
		add (IconImg);
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
