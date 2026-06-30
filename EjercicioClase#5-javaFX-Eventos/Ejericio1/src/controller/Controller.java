package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML 
    private TextField txtMonto;
    
    @FXML 
    private ComboBox<String> cmbMoneda;

    @FXML 
    private Label lblResultado;

    @FXML 
    private Button btnCalcular;

    @FXML
    public void initialize() {
        cmbMoneda.getItems().addAll("Dólar estadounidense", "Euro");
    }

    @FXML
    private void accionCalcular(ActionEvent event) {
        realizarConversion();
    }

    @FXML
    private void teclaPresionada(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            realizarConversion();
        }
    }

    private void realizarConversion() {
        if (txtMonto.getText().isEmpty()) {
            lblResultado.setText("Error: Ingrese un monto.");
            return;
        }

        if (cmbMoneda.getValue() == null) {
            lblResultado.setText("Error: Seleccione una moneda destino.");
            return;
        }

        try {
            double monto = Double.parseDouble(txtMonto.getText());
            String moneda = cmbMoneda.getValue();
            
            double resultado = 0;
            String simbolo = "";

            if (moneda.equals("Euro")) {
                resultado = monto / 64.00;      
                simbolo = "EUR";
            } else if (moneda.equals("Dólar estadounidense")) {
                resultado = monto / 59.00;      
                simbolo = "USD";
            }

            lblResultado.setText(String.format("RD$ %,.2f equivale a %,.2f %s", monto, resultado, simbolo));
            
        } catch (NumberFormatException e) {
            lblResultado.setText("Error: El monto ingresado debe ser numérico.");
        }
    }

    @FXML
    private void accionLimpiar(ActionEvent event) {
        txtMonto.clear();
        cmbMoneda.getSelectionModel().clearSelection();
        lblResultado.setText("Esperando información...");
    }

    @FXML
    private void mouseEntra(MouseEvent event) {
        lblResultado.setText("Presione para realizar la conversión.");
    }

    @FXML
    private void mouseSale(MouseEvent event) {
        if (lblResultado.getText().equals("Presione para realizar la conversión.")) {
            lblResultado.setText("Esperando información...");
        }
    }
}