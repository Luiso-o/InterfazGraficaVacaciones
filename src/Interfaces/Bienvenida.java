package Interfaces;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class Bienvenida extends JFrame implements ActionListener {
	/**
	 * Luis/Ernesto
	 */
	private static final long serialVersionUID = 1L;
	
	//Constantes
	private JTextField escribeTexto;
	private JLabel imagenTitulo, subtitulo, enunciado, pieDePagina, hora;
	private JButton botonEntrar;
	private Timer horaLocal;
	public String textoNombre = "";
	
	//constructor
	public Bienvenida() {
		
		//Creamos los atributos de la interfaz Bienvenida
		setLayout(null);//cancelamos el administrador de diseño predeterminado.
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Cerrará el programa definitivamente
		setTitle("Bienvenido");//titulo
		getContentPane().setBackground(new Color(255,0,0));//panel-color del panel(rojo,0,0)
		setIconImage(new ImageIcon("Imagen/icon.png").getImage());//personalizamos el icono del panel
			
		//Creamos las caracteristicas del titulo del contenido
		ImageIcon imagen = new ImageIcon("Imagen/logo-coca.png");
		imagenTitulo = new JLabel(imagen);
		imagenTitulo.setBounds(25,15,300,150);
		add(imagenTitulo);
		
		//creamos las caracteristicas del subtitulo del contenido
		subtitulo = new JLabel("Sistema de Control Vacacional");
		subtitulo.setBounds(35,135,300,30);
		subtitulo.setFont(new Font("Andale Mono", 3, 18));
		subtitulo.setForeground(new Color(255,255,255));
		add(subtitulo);
		
		// Creo un objeto JLabel que contendrá la hora actual.
        hora = new JLabel();
        hora.setBounds(135,180,200,30);
        hora.setFont(new Font("Andale Mono", 1, 18));
		hora.setForeground(new Color(255,255,255));
        add(hora);
        
        //Creamos un reloj digital que se actualizará al abrir el programa
    	horaLocal = new Timer(1000, this);
    	horaLocal.start(); 	    		
     		  		
		//Enunciado del espacio donde introduces el nombre del trabajador
		enunciado = new JLabel("Ingrese su nombre");
		enunciado.setBounds(45,212,200,30);
		enunciado.setFont(new Font("Andale Mono", 1, 12));
		enunciado.setForeground(new Color(255,255,255));
		add(enunciado);
		
		//creamos las caracteristicas del pie de página
		pieDePagina = new JLabel("®2017 The Coca-Cola company");
		pieDePagina.setBounds(85,375,300,30);
		pieDePagina.setFont(new Font("Andale Mono", 1, 12));
		pieDePagina.setForeground(new Color(255,255,255));
		add(pieDePagina);
		
		//caracteriscas que tendrá la casilla de texto (introduce nombre)
		escribeTexto = new JTextField();
		escribeTexto.setBounds(45,240,255,25);
		escribeTexto.setBackground(new Color (224,224,224));
		escribeTexto.setFont(new Font("Andale Mono", 1, 14));
		escribeTexto.setForeground(new Color(255,0,0));
		add(escribeTexto);
		
		//caracteristicas del boton entrar
		botonEntrar = new JButton ("Entrar");
		botonEntrar.setBounds(125,280,100,30);
		botonEntrar.setBackground(new Color(255,255,255));
		botonEntrar.setFont(new Font("Andale Mono", 1,14));
		botonEntrar.setForeground(new Color(255,0,0));
		botonEntrar.addActionListener(this);
		add(botonEntrar);
		
	}
	
	//Acciones al escucha
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == botonEntrar) {
			textoNombre = escribeTexto.getText().trim();//trim borra los espacios y los guarda dentro de la variable 
				if(textoNombre.equals("")) {
					JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
				}else {
					//Instancio un Objeto Licencia con los parametros que quiero
					Licencia marcaRegistrada = new Licencia();
					marcaRegistrada.setBounds(0,0,600,370);
					marcaRegistrada.setVisible(true);
					marcaRegistrada.setResizable(false);
					marcaRegistrada.setLocationRelativeTo(null);
					this.setVisible(false);
				}	
			}		
			
			//ponemos a la escucha el formato y actualizamos la hora
			SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
			hora.setText(formato.format(new Date()));
			
		}	
	
	//metodo Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bienvenida bienvenida = new Bienvenida ();
		bienvenida.setBounds(0,0,350,450);
		bienvenida.setVisible(true);
		bienvenida.setResizable(false);
		bienvenida.setLocationRelativeTo(null);
		 
		
	}

	
}
