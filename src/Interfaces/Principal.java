package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Principal extends JFrame implements ActionListener{
	/**
	 * Luis/Ernesto
	 */
	private static final long serialVersionUID = 1L;
	
	//Constantes
	private JMenuBar barraPrincipal;
	private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
	private JMenuItem miCalculo, miRojo, miNegro, miMorado, miAmarillo, miVerde, miElCreador,
			miSalir, miNuevo, miAcercaDe;
	private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno,
			labelAMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
	private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
	private JComboBox<String> comboDepartamento, comboAntiguedad;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	
	String nombreTrabajador = "";
	
	//constructor
	public Principal() {
		
		//Indice de ventana principal
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pantalla de cálculo");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon("imagen/icon.png").getImage());
		
		//Instanciamos el atributo nombre del trabajador de Bienvenida
		Bienvenida ventanaBienvenida = new Bienvenida ();
		nombreTrabajador = ventanaBienvenida.textoNombre;
		
		//barra de tareas
		barraPrincipal = new JMenuBar ();
		barraPrincipal.setBackground(new Color(255,0,0));
		setJMenuBar(barraPrincipal);
		
		//barra de tareas = Opciones
		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(255,0,0));
		menuOpciones.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.setForeground(new Color(255,255,255));
		barraPrincipal.add(menuOpciones);
		
		//barra de tareas =Calcular
		menuCalcular = new JMenu("Calcular");
		menuCalcular.setBackground(new Color(255,0,0));
		menuCalcular.setFont(new Font("Andale Mono", 1, 14));
		menuCalcular.setForeground(new Color(255,255,255));
		barraPrincipal.add(menuCalcular);
		
		//barra de tareas = Acerca de
		menuAcercaDe = new JMenu("Acerca de");
		menuAcercaDe.setBackground(new Color(255,0,0));
		menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
		menuAcercaDe.setForeground(new Color(255,255,255));
		barraPrincipal.add(menuAcercaDe);
		
		//Sub Menu
		menuColorFondo = new JMenu ("Color de Fondo");
		menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.setForeground(new Color(255, 0, 0));
		menuOpciones.add(menuColorFondo);
		
		miCalculo = new JMenuItem("Vacaciones");
		miCalculo.setFont(new Font("Andale Mono", 1, 14));
		miCalculo.setForeground(new Color(255, 0, 0));
		menuCalcular.add(miCalculo);
		miCalculo.addActionListener(this);
		
		miRojo = new JMenuItem ("Rojo");
		miRojo.setFont(new Font("Andale Mono", 1, 14));
		miRojo.setForeground(new Color(255,0,0));
		menuColorFondo.add(miRojo);
		miRojo.addActionListener(this);
		
		miNegro = new JMenuItem ("Negro");
		miNegro.setFont(new Font("Andale Mono", 1, 14));
		miNegro.setForeground(new Color(255,0,0));
		menuColorFondo.add(miNegro);
		miNegro.addActionListener(this);
		
		miMorado = new JMenuItem ("Morado");
		miMorado.setFont(new Font("Andale Mono", 1, 14));
		miMorado.setForeground(new Color(255,0,0));
		menuColorFondo.add(miMorado);
		miMorado.addActionListener(this);
		
		miAmarillo = new JMenuItem ("Amarillo");
		miAmarillo.setFont(new Font("Andale Mono", 1, 14));
		miAmarillo.setForeground(new Color(255,0,0));
		menuColorFondo.add(miAmarillo);
		miAmarillo.addActionListener(this);
		
		miVerde = new JMenuItem ("Verde");
		miVerde.setFont(new Font("Andale Mono", 1, 14));
		miVerde.setForeground(new Color(255,0,0));
		menuColorFondo.add(miVerde);
		miVerde.addActionListener(this);
			
		miNuevo = new JMenuItem("Limpiar casillas");
		miNuevo.setFont(new Font("Andale Mono", 1, 14));
		miNuevo.setForeground(new Color(255,0,0));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);
		
		miElCreador = new JMenuItem("El creador");
		miElCreador.setFont(new Font("Andale Mono", 1, 14));
		miElCreador.setForeground(new Color(255,0,0));
		menuOpciones.add(miElCreador);
		miElCreador.addActionListener(this);
		
		miSalir = new JMenuItem("Salir");
		miSalir.setFont(new Font("Andale Mono", 1, 14));
		miSalir.setForeground(new Color(255,0,0));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);
		
		miAcercaDe = new JMenuItem("Versiones");
		miAcercaDe.setFont(new Font("Andale Mono", 1, 14));
		miAcercaDe.setForeground(new Color(255,0,0));
		menuAcercaDe.add(miAcercaDe);
		miAcercaDe.addActionListener(this);
		
		ImageIcon imagen = new ImageIcon("imagen/logo-coca.png");
		labelLogo = new JLabel (imagen);
		labelLogo.setBounds(5,5,250,100);
		add(labelLogo);
		
		labelBienvenido = new JLabel("Bienvenido " + nombreTrabajador);
		labelBienvenido.setBounds(280,30,300,50);
		labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
		labelBienvenido.setForeground(new Color(255,255,255));
		add(labelBienvenido);
		
		labelTitle = new JLabel("\n\tAquí aparece el resultado del cálculo de las vacaciones.");
		labelTitle.setBounds(45,140,900,25);
		labelTitle.setFont(new Font("Andale Mono", 0, 24));
		labelTitle.setForeground(new Color(255,255,255));
		add(labelTitle);
		
		labelNombre = new JLabel ("Nombre completo");
		labelNombre.setBounds(25,188,180,25);
		labelNombre.setFont(new Font("Andale Mono", 1, 12));
		labelNombre.setForeground(new Color(255,255,255));
		add(labelNombre);
		
		txtNombreTrabajador = new JTextField ();
		txtNombreTrabajador.setBounds(25,213,150,25);
		txtNombreTrabajador.setBackground(new Color(224,224,224));
		txtNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
		txtNombreTrabajador.setForeground(new Color(255,0,0));
		add(txtNombreTrabajador);
		
		labelAPaterno = new JLabel ("Apellido Paterno");
		labelAPaterno.setBounds(25,248,180,25);
		labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
		labelAPaterno.setForeground(new Color(255,255,255));
		add(labelAPaterno);
		
		txtAPaternoTrabajador = new JTextField ();
		txtAPaternoTrabajador.setBounds(25,273,150,25);
		txtAPaternoTrabajador.setBackground(new Color(224,224,224));
		txtAPaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
		txtAPaternoTrabajador.setForeground(new Color(255,0,0));
		add(txtAPaternoTrabajador);
		
		labelAMaterno = new JLabel ("Apellido Materno");
		labelAMaterno .setBounds(25,308,180,25);
		labelAMaterno .setFont(new Font("Andale Mono", 1, 12));
		labelAMaterno .setForeground(new Color(255,255,255));
		add(labelAMaterno );
		
		txtAMaternoTrabajador = new JTextField ();
		txtAMaternoTrabajador.setBounds(25,334,150,25);
		txtAMaternoTrabajador.setBackground(new Color(224,224,224));
		txtAMaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
		txtAMaternoTrabajador.setForeground(new Color(255,0,0));
		add(txtAMaternoTrabajador);
		
		labelDepartamento = new JLabel ("Selecciona departamento: ");
		labelDepartamento.setBounds(220,188,180,25);
		labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
		labelDepartamento.setForeground(new Color(225,225,255));
		add(labelDepartamento);
		
		comboDepartamento = new JComboBox ();
		comboDepartamento.setBounds(220,213,220,25);
		comboDepartamento.setBackground(new Color (224,224,224));
		comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
		comboDepartamento.setForeground(new Color(255,0,0));
		add(comboDepartamento);
		comboDepartamento.addItem("");
		comboDepartamento.addItem("Atencion al Cliente");
		comboDepartamento.addItem("Departamento de Logística");
		comboDepartamento.addItem("Departamento de Gerencia");
		
		labelAntiguedad = new JLabel ("Selecciona la Antiguedad: ");
		labelAntiguedad.setBounds(220,248,180,25);
		labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
		labelAntiguedad.setForeground(new Color(225,225,255));
		add(labelAntiguedad);
		
		comboAntiguedad = new JComboBox ();
		comboAntiguedad.setBounds(220,273,220,25);
		comboAntiguedad.setBackground(new Color (224,224,224));
		comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
		comboAntiguedad.setForeground(new Color(255,0,0));
		add(comboAntiguedad);
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 año de servicio");
		comboAntiguedad.addItem("2 a 6 años de servicio");
		comboAntiguedad.addItem("7 años o más de servicio");
		
		labelResultado = new JLabel ("Resultado del Cálculo:");
		labelResultado.setBounds(220,307,180,25);
		labelResultado.setFont(new Font("Andale Mono", 1, 12));
		labelResultado.setForeground(new Color(225,225,255));
		add(labelResultado);
		
		textarea1 = new JTextArea ();
		textarea1.setEditable(false);
		textarea1.setBackground(new Color(224,224,244));
		textarea1.setFont(new Font("Andale Mono", 1, 11));
		textarea1.setForeground(new Color(255,0,0));
		textarea1.setText("\n   Aquí aparece el cálculo de las vacaciones.");
		scrollpane1 = new JScrollPane (textarea1);
		scrollpane1.setBounds(220,333,385,90);
		add(scrollpane1);
		
		labelfooter = new JLabel ("®2017 The Coca-Cola Company | Todos los derechos reservados");
		labelfooter.setBounds(135,445,500,30);
		labelfooter.setFont(new Font("Andale Mono", 1, 12));
		labelfooter.setForeground(new Color(255, 255, 255));
		add(labelfooter);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == miCalculo) {
			
			String nombreTrabajador = txtNombreTrabajador.getText();
			String AP = txtAPaternoTrabajador.getText();
			String AM = txtAMaternoTrabajador.getText();
			String Departamento = comboDepartamento.getSelectedItem().toString();
			String Antiguedad = comboAntiguedad.getSelectedItem().toString();
			
			if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") || Departamento.equals("")
					|| Antiguedad.equals("")) {
				
				JOptionPane.showMessageDialog(null, "Debes llenar todos los espacios");
				
			}else {
				
				if(Departamento.equals("Atencion al Cliente")) {
					
					if(Antiguedad.equals("1 año de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + AP + " " + AM +
								"\n  quien labora en " + Departamento + " con " + Antiguedad + 
								"\n  recibe 6 días e vacaciones.");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + AP + " " + AM +
								"\n  quien labora en " + Departamento + " con " + Antiguedad + 
								"\n  recibe 14 días e vacaciones.");
					}
					if(Antiguedad.equals("7 años o más de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + AP + " " + AM +
								"\n  quien labora en " + Departamento + " con " + Antiguedad + 
								"\n  recibe 20 días e vacaciones.");
					}
					
				}
				
				if(Departamento.equals("Departamento de Logística")) {
					
					if(Antiguedad.equals("1 año de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + AP + " " + AM +
								"\n  quien labora en " + Departamento + " con " + Antiguedad + 
								"\n  recibe 7 días e vacaciones.");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + AP + " " + AM +
								"\n  quien labora en " + Departamento + " con " + Antiguedad + 
								"\n  recibe 15 días e vacaciones.");
					}
					if(Antiguedad.equals("7 años o más de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + AP + " " + AM +
								"\n  quien labora en " + Departamento + " con " + Antiguedad + 
								"\n  recibe 22 días e vacaciones.");
					}
					
				}
				
				if(Departamento.equals("Departamento de Gerencia")) {
					
					if(Antiguedad.equals("1 año de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + AP + " " + AM +
								"\n  quien labora en " + Departamento + " con " + Antiguedad + 
								"\n  recibe 10 días e vacaciones.");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + AP + " " + AM +
								"\n  quien labora en " + Departamento + " con " + Antiguedad + 
								"\n  recibe 20 días e vacaciones.");
					}
					if(Antiguedad.equals("7 años o más de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + AP + " " + AM +
								"\n  quien labora en " + Departamento + " con " + Antiguedad + 
								"\n  recibe 30 días e vacaciones.");
					}
					
				}
				
			}
		}
		if(e.getSource() == miRojo) {
			getContentPane().setBackground(new Color(225,0,0));
		}
		if(e.getSource() == miNegro) {
			getContentPane().setBackground(new Color(0,0,0));
		}
		if(e.getSource() == miMorado) {
			getContentPane().setBackground(new Color(51,0,51));
		}
		if(e.getSource() == miAmarillo) {
			getContentPane().setBackground(new Color(255,190,0));
		}
		if(e.getSource() == miVerde) {
			getContentPane().setBackground(new Color(0,150,0));
		}
		if(e.getSource() == miNuevo) {
			
			txtNombreTrabajador.setText("");
			txtAPaternoTrabajador.setText("");
			txtAMaternoTrabajador.setText("");
			comboDepartamento.setSelectedIndex(0);
			comboAntiguedad.setSelectedIndex(0);
			textarea1.setText("\n\tAquí aparece el resultado del cálculo de las vacaciones.");
			
		}
		if(e.getSource() == miAcercaDe) {
			
		JOptionPane.showMessageDialog(null, "\tVersion 1.0: La Geekepedia de Ernesto" +
											"\n\twww.youtube.com/ErnestoPerezM " + " 2018." +
											"\n\n\tVersion 2.0 Luis " +
											"\n\thttps://github.com/Luiso-o " + " 2023.");
			
		}
		if(e.getSource() == miSalir) {
		
			Bienvenida bienvenida = new Bienvenida ();
			bienvenida.setBounds(0,0,350,450);
			bienvenida.setVisible(true);
			bienvenida.setResizable(false);
			bienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
			
		}
		if(e.getSource() == miElCreador) {
			JOptionPane.showMessageDialog(null, "Este programa a sido desarrollado por Luis, \n"+
												"pero orientado y diseñado por Ernesto\n"+
												"\n      www.youtube.com/ErnestoPerezM");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Principal ventanaPrincipal = new Principal ();
		ventanaPrincipal.setBounds(0,0,640,535);
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.setResizable(false);
		ventanaPrincipal.setLocationRelativeTo(null);

	}

}
