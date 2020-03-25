package Practice;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer1 extends JFrame implements ActionListener {
    private JTextField txtNum = new JTextField();
    private JButton btnAnalyze = new JButton("ANALYZE");
    private JLabel lblMessage = new JLabel("Ingrese un número entre 1 y 100");
    private JLabel lblMessage2 = new JLabel("que ademas sea entero.");

    public Ejer1(){
        setLayout(null);

        lblMessage.setBounds(25,3,500,60);
        add(lblMessage);

        lblMessage2.setBounds(25,23,500,60);
        add(lblMessage2);

        txtNum.setBounds(60,85,200, 30);
        ((AbstractDocument) txtNum.getDocument()).setDocumentFilter(validateDataInsertedOnlyNumber(3));
        add(txtNum);

        btnAnalyze.setBounds(110,135,96,25);
        add(btnAnalyze);
        btnAnalyze.addActionListener(this::actionPerformed);
    }


    /**
         * restringe la entrada de datos, para que sean solo caracteres numericos
         * @param textLength Cantidad de caracteres maximo que se pueden ingresar
         * @return Texto filtrado
         */
        public static DocumentFilter validateDataInsertedOnlyNumber(Integer textLength){
            return new DocumentFilter(){
                @Override
                public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                    if(string.length() <= textLength){
                        super.insertString(fb, offset, string.matches("[0-9]+") ? string : "", attr);
                    }
                }

                @Override
                public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                    if(text.length() <= textLength && offset < textLength){
                        int totalLength = offset+text.length();
                        if (totalLength <= textLength){
                            super.replace(fb, offset, length, text.matches("[0-9]+") ? text : "", attrs);
                        }
                    }
                }
            };
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        camposVacios();
    }

    public static void main(String[] args) {
        Ejer1 ejer1 = new Ejer1();
        ejer1.setBounds(500,300,350,220);
        ejer1.setVisible(true);
        ejer1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }



    public void camposVacios(){
        String numero = txtNum.getText();
        numero = numero.replaceAll(" ","");

        if(numero.length() == 0){
            JOptionPane.showMessageDialog(null,"Error, campo vacio");
        }else{
            condiciones();
        }
    }



    public void condiciones(){
        int num = Integer.parseInt(txtNum.getText());

        if (num < 1 || num > 100) {
            JOptionPane.showMessageDialog(null, "Error, condiciones no validas");
        } else if(num % 2 == 0 && num >= 2 && num <= 5){
            JOptionPane.showMessageDialog(null,"No Quipux");
        }else if (num % 2 == 0 && num >= 6 && num <= 20){
            JOptionPane.showMessageDialog(null,"Quipux");
        }else if(num % 2 == 0 && num > 20){
            JOptionPane.showMessageDialog(null,"No Quipux");
        }else {
            JOptionPane.showMessageDialog(null,"Quipux");
        }
    }
}
