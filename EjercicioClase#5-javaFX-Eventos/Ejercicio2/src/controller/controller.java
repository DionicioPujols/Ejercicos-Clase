package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class controller {

    @FXML 
    private TextField txtNombre;
    
    @FXML 
    private ComboBox<String> cmbBebida;
    
    @FXML 
    private TextField txtCantidad;
    
    @FXML 
    private CheckBox chkPostre;
    
    @FXML 
    private Button btnCalcular;
    
    @FXML 
    private Button btnLimpiar;
    
    @FXML 
    private Label lblResumen;
    
    @FXML private Label lblMensaje;

    @FXML
    public void initialize() {

        cmbBebida.getItems().addAll(
            "Café americano",
            "Cappuccino",
            "Chocolate caliente",
            "Jugo natural"
        );
        lblMensaje.setText("Esperando datos de la compra...");
        lblResumen.setText("");
    }

    @FXML
    void calcularAction(ActionEvent event) {
        procesarCompra();
    }

    @FXML
    void calcularOnEnter(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            procesarCompra();
        }
    }

   @FXML
    void limpiarAction(ActionEvent event) {
        txtNombre.clear();
        cmbBebida.getSelectionModel().clearSelection();
        txtCantidad.clear();
        chkPostre.setSelected(false);
        lblResumen.setText("");
        lblMensaje.setText("Esperando datos de la compra...");
    }

    @FXML
    void onMouseEntered(MouseEvent event) {
        lblMensaje.setText("Presione para calcular el total.");
    }

    @FXML
    void onMouseExited(MouseEvent event) {
        lblMensaje.setText("Esperando datos de la compra...");
    }

    private void procesarCompra() {

        String erroresEncontrados = validarDatos();
        
        if (!erroresEncontrados.isEmpty()) {
            lblResumen.setText("Corrige esto primero:\n" + erroresEncontrados);
            return; 
        }

        String nombre = txtNombre.getText();
        String bebida = cmbBebida.getValue();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        boolean llevaPostre = chkPostre.isSelected();

        double subtotal = calcularSubtotal(bebida, cantidad);
        double total = calcularTotal(subtotal, llevaPostre);

        mostrarResultadoFinal(nombre, bebida, cantidad, subtotal, llevaPostre, total);
    }


    private String validarDatos() {
        String errores = ""; 

        if (txtNombre.getText().isEmpty()) {
            errores = errores + "Aun no se desconoce su nombre.\n";
        }

        if (cmbBebida.getValue() == null) {
            errores = errores + "Debe seleccionar una bebida.\n";
        }

        if (txtCantidad.getText().isEmpty()) {
            errores = errores + "Debe ingresar la cantidad deseada.\n";
        } else {
            try {
                int cantidad = Integer.parseInt(txtCantidad.getText());
                if (cantidad <= 0) {
                    errores = errores + "- La cantidad debe ser mayor a 0.\n";
                }
            } catch (Exception e) {
                errores = errores + "- La cantidad debe ser un número.\n";
            }
        }

        return errores;
    }

    private double calcularSubtotal(String bebida, int cantidad) {
        double precioDeLaBebida = 0;

        if (bebida.equals("Café americano")) {
            precioDeLaBebida = 100;
        } else if (bebida.equals("Cappuccino")) {
            precioDeLaBebida = 150;
        } else if (bebida.equals("Chocolate caliente")) {
            precioDeLaBebida = 130;
        } else if (bebida.equals("Jugo natural")) {
            precioDeLaBebida = 120;
        }

        return precioDeLaBebida * cantidad;
    }


    private double calcularTotal(double subtotal, boolean llevaPostre) {
        double total = subtotal;
        
        if (llevaPostre == true) {
            total = total + 75; 
        }
        
        return total;
    }

    private void mostrarResultadoFinal(String nombre, String bebida, int cantidad, double subtotal, boolean llevaPostre, double total) {
        
        String textoDelPostre = "No";
        if (llevaPostre == true) {
            textoDelPostre = "Sí (RD$75.00)";
        }

        String mensaje = "Cliente: " + nombre + "\n" +
                         "Producto: " + bebida + "\n" +
                         "Cantidad: " + cantidad + "\n" +
                         "Subtotal: RD$" + subtotal + "\n" +
                         "Postre: " + textoDelPostre + "\n" +
                         "Total: RD$" + total;

        lblResumen.setText(mensaje);
    }
}