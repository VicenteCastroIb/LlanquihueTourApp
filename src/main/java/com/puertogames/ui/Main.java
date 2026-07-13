package com.puertogames.ui;
import javax.swing.*;

// Punto de entrada del sistema Llanquihue Tour.
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPrincipalFrame().setVisible(true));
    }
}
