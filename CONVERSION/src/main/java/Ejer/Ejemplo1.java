package Ejer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo1 extends JFrame implements ActionListener {
    private JLabel lblNameMovie = new JLabel("Name of the movie");
    private JTextField txtMovie = new JTextField();
    private JList ltMovieAdded = new JList();
    DefaultListModel modeloLista;
    JButton btnAdd = new JButton("ADD");
    private JButton btnDelete = new JButton("Delete");

    public Ejemplo1 (){
        setLayout(null);
        modeloLista = new DefaultListModel();
        ltMovieAdded.setModel(modeloLista);

        lblNameMovie.setBounds(25,15,200,40);
        add(lblNameMovie);

        txtMovie.setBounds(10,60,200,30);
        add(txtMovie);

        btnAdd.setBounds(10,110,80,25);
        add(btnAdd);
        btnAdd.addActionListener(this::actionPerformed);

        ltMovieAdded.setBounds(250,20,150,180);
        add(ltMovieAdded);

        btnDelete.setBounds(10,150,130,25);
        add(btnDelete);
        btnDelete.addActionListener(this::aquitarValores);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addValues();
        }

    public void aquitarValores(ActionEvent e){
        deleteValues();
    }

    public static void main(String[] args) {
        Ejemplo1 ejemplo1 = new Ejemplo1();
        ejemplo1.setBounds(500,300,450,220);
        ejemplo1.setVisible(true);
        ejemplo1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ejemplo1.setTitle("Add Movies");
    }

    public void addValues(){
        String valores = txtMovie.getText();
        modeloLista.addElement(valores);
    }

    public void deleteValues(){
        int pos = ltMovieAdded.getSelectedIndex();
        modeloLista.remove(pos);
    }
}
