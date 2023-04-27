package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BotonReloj extends JFrame {
    private JButton boton;
    private Timer timer;

    public BotonReloj() {
        super("Botón Reloj");

        // Crea un JPanel que contendrá el botón.
        JPanel panel = new JPanel();

        // Crea un objeto JButton que contendrá la hora actual.
        boton = new JButton();
        panel.add(boton);

        // Crea un objeto Timer que actualizará el texto del botón cada segundo.
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                boton.setText(sdf.format(new Date()));
            }
        });
        timer.start();

        add(panel);
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BotonReloj();
    }
}