package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer2 extends JFrame implements ActionListener {
    private  JTextField txtHours = new JTextField();
    private JTextField txtminutes = new JTextField();
    private JButton btnConvert = new JButton("Convert");
    private JLabel lblmessage = new JLabel();
    private JLabel lblHours = new JLabel("Ingrese el numero de horas");
    private JLabel lblMinutes = new JLabel("Ingrese el numero de minutos");

    public Ejer2(){
        setLayout(null);

        txtHours.setBounds(50,30,80,25);
        add(txtHours);

        txtminutes.setBounds(51,120,80,25);
        add(txtminutes);

        btnConvert.setBounds(250,50,100,30);
        add(btnConvert);
        btnConvert.addActionListener(this::actionPerformed);

        lblmessage.setBounds(200,150,300,30);
        add(lblmessage);

        lblHours.setBounds(3,8,200,25);
        add(lblHours);

        lblMinutes.setBounds(3,90,300,25);
        add(lblMinutes);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        errorVacio();

        if (mensajeHoras()) {
            lblmessage.setText( hours() + " y " + tensInText());
            lblmessage.setVisible(true);
        } else {
            errorHoras();
            errorMinutos();
        }
    }

    private boolean mensajeHoras() {
        if (Integer.parseInt(txtHours.getText()) >= 0 && Integer.parseInt(txtminutes.getText()) >= 0) {
            return true;
        }else
            return false;
    }

    private void errorMinutos() {
        if(Integer.parseInt(txtminutes.getText()) > 60) {
            lblmessage.setText("Minutos mayor a 60");
            lblmessage.setForeground(Color.red);
            lblmessage.setVisible(true);
        }
    }

    private void errorHoras() {
        if(Integer.parseInt(txtHours.getText()) > 24) {
            lblmessage.setText("Hora mayor a 24");
            lblmessage.setForeground(Color.red);
            lblmessage.setVisible(true);
        }
    }

    private void errorVacio() {
        if (txtHours.getText().isEmpty() || txtminutes.getText().isEmpty()) {
            lblmessage.setText("Ingrese Valores");
            lblmessage.setForeground(Color.red);
            lblmessage.setVisible(true);
        }
    }

    public static void main(String[] args) {
        Ejer2 ejer2 = new Ejer2();
        ejer2.setBounds(500,300,450,200);
        ejer2.setVisible(true);
        ejer2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public String hours(){
        int  numero = Integer.parseInt(txtHours.getText());

        switch (numero) {
            case 1:
                return "una";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            case 10:
                return "diez";
            case 11:
                return "unce";
            case 12:
                return "doce";
            case 0:
                return "cero";
            case 13:
                return "trece";
            case 14:
                return "catorce";
            case 15:
                return "quince";
            case 16:
                return "diesciseis";
            case 17:
                return "diescisiete";
            case 18:
                return "diesciocho";
            case 19:
                return "diescinueve";
            case 20:
                return "veinte";
            case 21:
                return "veintiuno";
            case 22:
                return "veintidos";
            case 23:
                return "veintitres";
            case 24:
                return "veinticuatro";
            default:
                return "";
        }
    }

    public String tensInText(){
        String cadena = txtminutes.getText();

        if(cadena.charAt(0) > 49 && cadena.charAt(0) < 55){
            switch (cadena.charAt(0)){
                case '2':
                    return "veiti" + unitsInText();
                case '3':
                    return "treinta y " + unitsInText();
                case '4':
                    return "cuarenta y " + unitsInText();
                case '5':
                    return "cincuenta y " + unitsInText();
                case '6':
                    return "sesenta" + unitsInText();
                case '0':
                    return " ";
            }
        }
        return null;
    }
    
    public String unitsInText() {
        String dato = txtminutes.getText();

        if (dato.charAt(1) > 46 && dato.charAt(1) < 58) {
            switch (dato.charAt(1)) {
                case '1':
                    return "una";
                case '2':
                    return "dos";
                case '3':
                    return "tres";
                case '4':
                    return "cuatro";
                case '5':
                    return "cinco";
                case '6':
                    return "seis";
                case '7':
                    return "siete";
                case '8':
                    return "ocho";
                case '9':
                    return "nueve";

            }
        }
        return null;
    }
}
