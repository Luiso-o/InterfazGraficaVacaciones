package Interfaces;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
	/**
	 * Luis/Ernesto
	 */
	private static final long serialVersionUID = 1L;
	
	//constantes
	private JLabel titulo,imagenInferior;
	private JCheckBox casillaAcepto;
	private JButton botonContinuar, botonNoAcepto;
	private JScrollPane areaTexto;
	private JTextArea textoTerminos;
	String nombre = ""; //usamos esta variable para usar el nombre del trabajador(clase Bienvenida)
	
	//Constructor
	public Licencia() {
		
		//Valores del JFrame
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon("Imagen/icon.png").getImage());//Icono
		Bienvenida ventanaBienvenida = new Bienvenida ();
		nombre = ventanaBienvenida.textoNombre;
		
		//Titulo del JFrame
		titulo = new JLabel("TERMINOS Y CONDICIONES");
		titulo.setBounds(215,5,200,30);
		titulo.setFont(new Font("Andale Mono",1,14));
		titulo.setForeground(new Color(0,0,0));
		add(titulo);
		
		//Area donde escribimos los terminos y condiciones
		textoTerminos = new JTextArea ();
		textoTerminos.setEditable(false);//no es editable
		textoTerminos.setFont(new Font("Andale Mono",0,9));
		textoTerminos.setText("\n\n          TÉRMINOS Y CONDICIONES" +
						"\n\n            A. PROHIBIDA SU VENTA O DISTRIBUSION SIN AUTORIZACION DE LA MARCA CREADORA." +
						"\n            B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
						"\n            C. LA MARCA CREADORA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
						"\n\n            LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA A ESTE SOFWARE" +
						"\n            (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONASABILIZAN DEL USO QUE USTED" +
						"\n            HAGA CON ESTE SOFWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
						"\n            SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACPETO) Y NO UTILICE ESTE SOFWARE." +
						"\n\n             PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVIVIOS, POR FAVOR VISITE" +
						"\n             http//www.youtube.com/ernestoperezm"
				);
		areaTexto = new JScrollPane (textoTerminos);
		areaTexto.setBounds(10,40,565,200);
		add(areaTexto);

		//Creo la casilla para aceptar. Usamos el nombre del trabajador
		casillaAcepto = new JCheckBox("Yo " + nombre +" Acepto");
		casillaAcepto.setBounds(10,250,300,30);
		casillaAcepto.setForeground(Color.RED);
		casillaAcepto.addChangeListener(this);
		add(casillaAcepto);
		
		//creo boton Continuar
		botonContinuar = new JButton("Continuar");
		botonContinuar.setBounds(10,290,100,30);
		botonContinuar.addActionListener(this);
		botonContinuar.setEnabled(false);//el boton estará deshabilitado
		add(botonContinuar);
		
		//creo botonNoAcepto
		botonNoAcepto = new JButton("No acepto");
		botonNoAcepto.setBounds(120,290,100,30);
		botonNoAcepto.addActionListener(this);
		botonNoAcepto.setEnabled(true);//el boton estará habilitado
		add(botonNoAcepto);
		
		//Creo y agrego imagen Coca Cola
		ImageIcon imagen = new ImageIcon("imagen/coca-cola.png");
		imagenInferior = new JLabel(imagen);
		imagenInferior.setBounds(315,135,300,300);
		add(imagenInferior);
		
	}
	
	//ponemos a la escucha la funcion de los botones
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		if(casillaAcepto.isSelected() == true) {
			
			botonContinuar.setEnabled(true);
			botonNoAcepto.setEnabled(false);
			
		}else {//los botones no pueden estar activos a la vez.
			
			botonContinuar.setEnabled(false);
			botonNoAcepto.setEnabled(true);
			
		}
	}

	//le damos las intrucciones a los botones 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == botonContinuar) {
			
			//enlazamos a clase principal instanciado un objeto de la misma
			Principal ventanaPrincipal = new Principal ();
			ventanaPrincipal.setBounds(0,0,640,535);
			ventanaPrincipal.setVisible(true);
			ventanaPrincipal.setResizable(false);
			ventanaPrincipal.setLocationRelativeTo(null);
			this.setVisible(false);
			
		}else if(e.getSource() == botonNoAcepto){
			
			//enlazamos a clase bienvenida instanciando un objeto de la misma
			Bienvenida bienvenida = new Bienvenida ();		
			bienvenida.setBounds(0,0,350,450);
			bienvenida.setVisible(true);
			bienvenida.setResizable(false);
			bienvenida.setLocationRelativeTo(null);
			
		}
	}
	
	//Main
	public static void main(String[] args) {
		
		Licencia marcaRegistrada = new Licencia();
		marcaRegistrada.setBounds(0,0,600,370);
		marcaRegistrada.setVisible(true);
		marcaRegistrada.setResizable(false);
		marcaRegistrada.setLocationRelativeTo(null);
		
	}

}
