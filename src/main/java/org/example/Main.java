package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Crear un nuevo frame (ventana)
        JFrame frame = new JFrame("Smart-training");

        // Configurar el tamaño de la ventana
        frame.setSize(400, 300);

        // Configurar la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un cartel (JLabel) con un mensaje
        JLabel label = new JLabel("Detectar postura");

        // Crear un botón
        JButton button = new JButton("Iniciar");
        Dimension buttonSize = new Dimension(150, 50);
        button.setPreferredSize(buttonSize);

        // Configurar la disposición del frame usando BorderLayout
        frame.getContentPane().setLayout(new BorderLayout());

        // Agregar el cartel (label) en el centro del frame
        frame.getContentPane().add(label, BorderLayout.CENTER);

        // Agregar el botón en la parte inferior del frame
        frame.getContentPane().add(button, BorderLayout.SOUTH);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}