package com.puertogames.ui;

import com.puertogames.data.GestorEntidades;
import com.puertogames.model.ColaboradorExterno;
import com.puertogames.model.GuiaTuristico;
import com.puertogames.model.Registrable;
import com.puertogames.model.Vehiculo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Segunda interfaz grafica del sistema: version simple ("nivel junior")
 * hecha con JFrame en lugar de JOptionPane.
 *
 * Diferencias respecto de VentanaPrincipal:
 *  - Los registros se muestran SIEMPRE dentro de la misma ventana
 *    principal (JTextArea integrada), no en un dialogo aparte.
 *  - La ventana NO se cierra al hacer click fuera de ella: un JFrame
 *    normal de Swing solo se cierra con el boton X o con el boton
 *    "Salir"; perder el foco nunca dispara su cierre.
 */
public class VentanaPrincipalFrame extends JFrame {

    private final GestorEntidades gestor = new GestorEntidades();

    private final JComboBox<String> comboTipo = new JComboBox<>(
            new String[]{"Guia Turistico", "Vehiculo", "Colaborador Externo"});

    private final JTextField campoNombre = new JTextField(15);
    private final JTextField campoCorreo = new JTextField(15);
    private final JTextField campoExtra = new JTextField(15); // tours / tipo / empresa segun el caso

    private final JLabel labelNombre = new JLabel("Nombre / Patente:");
    private final JLabel labelCorreo = new JLabel("Correo:");
    private final JLabel labelExtra = new JLabel("Tours realizados:");

    private final JTextArea areaRegistros = new JTextArea();

    public VentanaPrincipalFrame() {
        super("Llanquihue Tour");
        construirInterfaz();
        cargarDatosIniciales();
        actualizarListado();
    }

    private void construirInterfaz() {
        // Solo se cierra con el boton X o "Salir"
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(700, 550);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        add(construirPanelFormulario(), BorderLayout.NORTH);
        add(construirPanelListado(), BorderLayout.CENTER);
        add(construirPanelBotones(), BorderLayout.SOUTH);

        comboTipo.addActionListener(e -> actualizarEtiquetasSegunTipo());
        actualizarEtiquetasSegunTipo();
    }

    private JPanel construirPanelFormulario() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
        panel.setBorder(BorderFactory.createTitledBorder("Registrar nueva entidad"));

        panel.add(new JLabel("Tipo de entidad:"));
        panel.add(comboTipo);

        panel.add(labelNombre);
        panel.add(campoNombre);

        panel.add(labelCorreo);
        panel.add(campoCorreo);

        panel.add(labelExtra);
        panel.add(campoExtra);

        return panel;
    }

    private JPanel construirPanelListado() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Entidades registradas"));

        areaRegistros.setEditable(false);
        areaRegistros.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

        panel.add(new JScrollPane(areaRegistros), BorderLayout.CENTER);
        return panel;
    }

    private JPanel construirPanelBotones() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton botonRegistrar = new JButton("Registrar");
        botonRegistrar.addActionListener(this::registrar);

        JButton botonSalir = new JButton("Salir");
        botonSalir.addActionListener((ActionEvent e) -> dispose());

        panel.add(botonRegistrar);
        panel.add(botonSalir);
        return panel;
    }

    private void actualizarEtiquetasSegunTipo() {
        String tipo = (String) comboTipo.getSelectedItem();

        if ("Vehiculo".equals(tipo)) {
            labelNombre.setText("Nombre / Patente:");
            labelCorreo.setText("(no aplica):");
            campoCorreo.setEnabled(false);
            labelExtra.setText("Tipo de vehiculo:");

        } else if ("Colaborador Externo".equals(tipo)) {
            labelNombre.setText("Nombre representante:");
            labelCorreo.setText("Correo:");
            campoCorreo.setEnabled(true);
            labelExtra.setText("Empresa:");

        } else {
            labelNombre.setText("Nombre:");
            labelCorreo.setText("Correo:");
            campoCorreo.setEnabled(true);
            labelExtra.setText("Tours realizados:");
        }
    }

    private void registrar(ActionEvent evento) {
        String tipo = (String) comboTipo.getSelectedItem();
        String nombre = campoNombre.getText().trim();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre es obligatorio.",
                    "Dato faltante", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Registrable nuevo;

        if ("Vehiculo".equals(tipo)) {
            String tipoVehiculo = campoExtra.getText().trim();
            nuevo = new Vehiculo(nombre, tipoVehiculo);

        } else if ("Colaborador Externo".equals(tipo)) {
            String correo = campoCorreo.getText().trim();
            String empresa = campoExtra.getText().trim();
            nuevo = new ColaboradorExterno(nombre, correo, empresa);

        } else {
            String correo = campoCorreo.getText().trim();
            int tours;
            try {
                tours = Integer.parseInt(campoExtra.getText().trim());
            } catch (NumberFormatException e) {
                tours = 0;
            }
            nuevo = new GuiaTuristico(nombre, correo, tours);
        }

        gestor.aniadirALista(nuevo);
        limpiarCampos();
        actualizarListado();
    }

    private void limpiarCampos() {
        campoNombre.setText("");
        campoCorreo.setText("");
        campoExtra.setText("");
        campoNombre.requestFocusInWindow();
    }

    private void cargarDatosIniciales() {
        gestor.generarListaRegistrables();
    }

    // Vuelca el resumen de todas las entidades en el area de texto de la
    // MISMA ventana principal: no se abre ninguna ventana ni dialogo adicional.
    private void actualizarListado() {
        if (gestor.estaVacia()) {
            areaRegistros.setText("Aun no hay entidades registradas.");
            return;
        }
        areaRegistros.setText(gestor.obtenerResumenTexto());
        areaRegistros.setCaretPosition(0);
    }
}
