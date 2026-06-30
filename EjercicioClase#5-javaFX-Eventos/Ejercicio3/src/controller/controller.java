package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import java.util.Random;

public class controller {

    @FXML 
    private TextField txtLongitud;
    
    @FXML 
    private CheckBox chkMayusculas;
    
    @FXML 
    private CheckBox chkNumeros;
    
    @FXML 
    private CheckBox chkSimbolos;
    
    @FXML 
    private Label lblResumen;

    @FXML
    public void initialize() {
        lblResumen.setText("Esperando los datos...");
    }


    @FXML
    void generarAction(ActionEvent event) {
        procesarGeneracion();
    }

    @FXML
    void generarOnEnter(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            procesarGeneracion();
        }
    }

    @FXML
    void limpiarAction(ActionEvent event) {
        txtLongitud.clear();
        chkMayusculas.setSelected(false);
        chkNumeros.setSelected(false);
        chkSimbolos.setSelected(false);
        lblResumen.setText("Esperando los datos...");
    }

    @FXML
    void onMouseEntered(MouseEvent event) {
        lblResumen.setText("Presione para generar una nueva contraseña.");
    }

    @FXML
    void onMouseExited(MouseEvent event) {
        lblResumen.setText("Esperando configuración...");
    }


    private void procesarGeneracion() {
        String erroresEncontrados = validarDatos();
        
        if (!erroresEncontrados.isEmpty()) {
            lblResumen.setText("Errores encontrados:\n" + erroresEncontrados);
            return; 
        }

        int longitud = Integer.parseInt(txtLongitud.getText());
        boolean usaMayusculas = chkMayusculas.isSelected();
        boolean usaNumeros = chkNumeros.isSelected();
        boolean usaSimbolos = chkSimbolos.isSelected();

        String passwordFinal = crearPassword(longitud, usaMayusculas, usaNumeros, usaSimbolos);

        lblResumen.setText("Contraseña generada:\n" + passwordFinal);
    }

    private String validarDatos() {
        String errores = "";

        if (txtLongitud.getText().isEmpty()) {
            errores = errores + "Debe colocar una longitud.\n";
        } else {
            try {
                int longitud = Integer.parseInt(txtLongitud.getText());
                if (longitud < 6) {
                    errores = errores + "Debe ser mayor que o igual que 6.\n";
                }
            } catch (Exception e) {
                errores = errores + "La longitud debe ser un número.\n";
            }
        }

        return errores;
    }

    private String crearPassword(int longitud, boolean usaMayus, boolean usaNums, boolean usaSimbs) {
        String caracteresPermitidos = "abcdefghijklmnopqrstuvwxyz";

        if (usaMayus == true) {
            caracteresPermitidos = caracteresPermitidos + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (usaNums == true) {
            caracteresPermitidos = caracteresPermitidos + "0123456789";
        }
        if (usaSimbs == true) {
            caracteresPermitidos = caracteresPermitidos + "!@#$%&*?";
        }

        Random generadorAleatorio = new Random();
        String passwordGenerada = "";

        for (int i = 0; i < longitud; i++) {
            int posicionAlAzar = generadorAleatorio.nextInt(caracteresPermitidos.length());
            
            char letraElegida = caracteresPermitidos.charAt(posicionAlAzar);
            passwordGenerada = passwordGenerada + letraElegida;
        }

        return passwordGenerada;
    }
}