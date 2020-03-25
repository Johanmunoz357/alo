package Practice;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author Johan
 */
public class controllerEjer3 extends JFrame {
    Ejer3 ejer3 = new Ejer3();


    public controllerEjer3() {
        ejer3.setBounds(500, 300, 450, 550);
        ejer3.setVisible(true);
        ejer3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ejer3.setTitle("Formulario");
        ejer3.txtnameTeam.addKeyListener(validacionNombreEquipo());
        ejer3.txtstadiumTeam.addKeyListener(validacionNombreEquipo());
        ejer3.txttitlesTeam.addKeyListener(validacionSoloNumeros());
        ejer3.tabla.addKeyListener(validacionNombreEquipo());
        ejer3.tabla2.addKeyListener(validacionNombreEquipo());
        ejer3.txtnumPlayers.addKeyListener(validacionSoloNumeros());

        ejer3.btnRbasic.addActionListener(accionDelBoton());
        ejer3.btnRdetailed.addActionListener(BDetallado());
    }

    private ActionListener accionDelBoton() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rbasic();
            }
        };
    }

    private ActionListener BDetallado() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rdetallado();
                RDetallado2();
            }
        };
    }

    public void Rbasic() {

        String nameTeam = ejer3.txtnameTeam.getText();
        String nameStadium = ejer3.txtstadiumTeam.getText();
        String championships = ejer3.txttitlesTeam.getText();

        if (nameTeam.isEmpty() || championships.isEmpty() || nameStadium.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, campo(s) vacio(s).");
        } else
            JOptionPane.showMessageDialog(null, "The name of the team is: " + nameTeam + "\n" +
                    "\n" + "The team championships are: " + championships
                    + "\n" + "\n" + "El numero de jugadores es: 23");
    }

    public void Rdetallado() {

        String msj = "";
        String equipoNombre = ejer3.txtnameTeam.getText();

        if(equipoNombre.isEmpty())
            JOptionPane.showMessageDialog(null, "Error, nombre del equipo no ingresado");
        else {
            try {
                for (int i = 0; i < ejer3.celdas.length; i++) {
                    msj = msj.concat(ejer3.tabla.getValueAt(i, 0) + " (" + ejer3.tabla.getValueAt(i, 1).toString() + ")" + "\n");
                }
                JOptionPane.showMessageDialog(null, "Name of team: " + equipoNombre + "\n" + msj, "Titulares", 1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR, celda(s) vacia(s)", "Titulares", 0);
            }
        }

    }
    public void RDetallado2() {
        int fila = 0;
        int columna = 0;
        int dato = Integer.parseInt(ejer3.txtnumPlayers.getText());

        if (dato > 12)
            JOptionPane.showMessageDialog(null, "Error, el número de suplentes no puede ser mayor a 12");
        else {
            for (int j = 0; j < dato; j++) {
                String valor = (String) ejer3.tabla2.getValueAt(fila, columna);
                String posicion = (String) ejer3.tabla2.getValueAt(fila, columna = 1);

                System.out.println(valor);

                fila++;
            }
        }
    }
    public void rDetalladoPosiciones(){
        int fila = 0;
        int columna = 1;
        int dato = Integer.parseInt(ejer3.txtnumPlayers.getText());

            for (int j = 0; j < dato; j++) {
                String posicion = (String) ejer3.tabla2.getValueAt(fila,columna);

                System.out.println(posicion);
                fila++;
            }
        }

    private KeyListener validacionSoloNumeros() {
        return new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
                    e.consume();
                }
            }
        };
    }

    private KeyListener validacionNombreEquipo(){
        return new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char validar = evt.getKeyChar();

                if((validar < 'a' || validar > 'z') && (validar < 'A' || validar > 'Z')) evt.consume();
            }
        };
    }


}


