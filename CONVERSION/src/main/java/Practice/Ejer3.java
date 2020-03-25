package Practice;

import javax.swing.*;

public class Ejer3 extends JFrame  {
    private JLabel lblnameTeam = new JLabel("team's name");
    public JTextField txtnameTeam = new JTextField();
    private JLabel lblnameStadium = new JLabel("stadium's name");
    public JTextField txtstadiumTeam = new JTextField();
    private JLabel lbltitles = new JLabel("team's championships");
    public JTextField txttitlesTeam = new JTextField();
    private JLabel lblstartingPlayers = new JLabel("HEADLINES");
    private JLabel lblsubstitutePlayers = new JLabel("SUBTITUTES");
    private Object titulos []={"Name", "Position"};
    public Object celdas [][]=new Object[11][2];
    public JScrollPane scroll = new JScrollPane();
    public JTable tabla = new JTable(celdas, titulos);
    private Object titulos2 [] = {"Name", "Position"};
    public Object celdas2 [][] = new Object[1][2];
    public JScrollPane scroll2 = new JScrollPane();
    public JTable tabla2 = new JTable(celdas2, titulos2);
    public JButton btnRbasic = new JButton("R.BASIC");
    public JButton btnRdetailed = new JButton("R.DETAILED");
    public JLabel lblnumPlayers = new JLabel("¿Cuantos jugadores suplentes desea ingresar?");
    public JTextField txtnumPlayers= new JTextField();
    public JButton btnAgregarFilas = new JButton("Add row");

    public Ejer3(){
        setLayout(null);

        lblnameTeam.setBounds(10,10,200,25);
        add(lblnameTeam);
        txtnameTeam.setBounds(170,10,150,25);
        add(txtnameTeam);

        lblnameStadium.setBounds(10,70,250,25);
        add(lblnameStadium);
        txtstadiumTeam.setBounds(170,70,150,25);
        add(txtstadiumTeam);

        lbltitles.setBounds(10,130,200,25);
        add(lbltitles);
        txttitlesTeam.setBounds(170,130,150,25);
        add(txttitlesTeam);

        lblstartingPlayers.setBounds(70,260,200,25);
        add(lblstartingPlayers);

        lblsubstitutePlayers.setBounds(270,260,200,25);
        add(lblsubstitutePlayers);

        scroll.setViewportView(tabla);
        scroll.setBounds(10, 280, 200, 200);
        getContentPane();
        add(scroll);

        scroll2.setViewportView(tabla2);
        scroll2.setBounds(220, 280, 200, 200);
        getContentPane();
        add(scroll2);

        btnRbasic.setBounds(40,500,120,40);
        add(btnRbasic);

        btnRdetailed.setBounds(40,570,120,40);
        add(btnRdetailed);

        lblnumPlayers.setBounds(10, 190,300,25);
        add(lblnumPlayers);
        txtnumPlayers.setBounds(300,190,80,25);
        add(txtnumPlayers);

        btnAgregarFilas.setBounds(283,490,90,25);
        add(btnAgregarFilas);
    }
}
