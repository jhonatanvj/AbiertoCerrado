/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cmonedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaConversor extends JFrame {
    private JTextField campoCantidad;
    private JComboBox<String> comboMoneda;
    private JLabel labelResultado;
    private Cmonedas DaE;
    private Cmonedas EaD;
    private Cmonedas DaP;
    private Cmonedas PaD;
    private Cmonedas EaP;
    private Cmonedas PaE;

    public VistaConversor(Cmonedas DaE, Cmonedas EaD, Cmonedas DaP, Cmonedas PaD, Cmonedas EaP, Cmonedas PaE) {
        this.DaE = DaE;
        this.EaD = EaD;
        this.DaP = DaP;
        this.PaD = PaD;
        this.EaP = EaP;
        this.PaE = PaE;

        setTitle("Conversor de Monedas");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Cantidad:"));
        campoCantidad = new JTextField();
        panel.add(campoCantidad);

        panel.add(new JLabel("Conversión:"));
        String[] opciones = {"Dolar a Euro", "Euro a Dolar", "Dolar a Peso", "Peso a Dolar", "Euro a Peso", "Peso a Euro"};
        comboMoneda = new JComboBox<>(opciones);
        panel.add(comboMoneda);

        JButton botonConvertir = new JButton("Convertir");
        botonConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarConversion();
            }
        });
        panel.add(botonConvertir);

        labelResultado = new JLabel("Resultado: ");
        panel.add(labelResultado);

        add(panel);
    }

    private void realizarConversion() {
        try {
            double cantidad = Double.parseDouble(campoCantidad.getText());
            int opcion = comboMoneda.getSelectedIndex();

            double resultado = 0;
            switch (opcion) {
                case 0:
                    resultado = DaE.convertir(cantidad);
                    break;
                case 1:
                    resultado = EaD.convertir(cantidad);
                    break;
                case 2:
                    resultado = DaP.convertir(cantidad);
                    break;
                case 3:
                    resultado = PaD.convertir(cantidad);
                    break;
                case 4:
                    resultado = EaP.convertir(cantidad);
                    break;
                case 5:
                    resultado = PaE.convertir(cantidad);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcion);
            }

            labelResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

