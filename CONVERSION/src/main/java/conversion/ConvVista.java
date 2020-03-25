package conversion;

import javax.swing.*;
import java.awt.*;

public class ConvVista extends JFrame {

    private JLabel lblLat = new JLabel("Lat");
    private JLabel lblLong = new JLabel("Long");
    public JLabel lblError = new JLabel("FILL ALL FIELDS");
    public JTextField txtDegreesLat = new JTextField();
    public JTextField txtMinutesLat = new JTextField();
    public JTextField txtSecondsLat = new JTextField();
    public JTextField txtDegreesLong = new JTextField();
    public JTextField txtMinutesLong = new JTextField();
    public JTextField txtSecondsLong = new JTextField();
    public JToggleButton btnDMS = new JToggleButton("DMS");
    public JToggleButton btnDecimal =new JToggleButton("DECIMAL");
    public JToggleButton btnGms = new JToggleButton("GMS");

    public JTextField txtlat = new JTextField();
    public JTextField txtlong = new JTextField();

    private JPanel jPanel = new JPanel();

    public ConvVista(){
        add(jPanel);
        initialStatesComponents();
        setLocationLabels(jPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,300,315,125);
        lblError.setForeground(Color.RED);
    }

    public void initialStatesComponents() {
        lblError.setVisible(false);
    }

    private void setLocationLabels(JPanel jPanel) {
        GroupLayout groupLayout = new GroupLayout(jPanel);
        jPanel.setLayout(groupLayout);

        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup()
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblLat)
                                                .addGap(24)
                                        )
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblLong)
                                                .addGap(12)
                                        )
                                )
                                .addGroup(groupLayout.createParallelGroup()
                                        .addGroup(groupLayout.createSequentialGroup()
                                        .addComponent(txtDegreesLat,40,40,40)
                                        .addGap(10)
                                        .addComponent(txtMinutesLat,40,40,40)
                                        .addGap(10)
                                        .addComponent(txtSecondsLat,40,40,40)
                                        .addGap(20)
                                        )
                                        .addGroup(groupLayout.createParallelGroup()
                                                .addComponent(txtlat,110,110,110)
                                                .addComponent(txtlong,110,110,110)
                                        )
                                        .addGroup(groupLayout.createSequentialGroup()
                                        .addComponent(txtDegreesLong,40,40,40)
                                        .addGap(10)
                                        .addComponent(txtMinutesLong,40,40,40)
                                        .addGap(10)
                                        .addComponent(txtSecondsLong,40,40,40)
                                        .addGap(20)
                                        )
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(lblError)
                                        )
                                )

                                .addGroup(groupLayout.createParallelGroup()
                                        .addComponent(btnDMS)
                                        .addComponent(btnDecimal)
                                        .addComponent(btnGms)
                                )
                        )

        );

        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(groupLayout.createParallelGroup()
                                                .addComponent(lblLat)
                                                .addComponent(txtDegreesLat,20,20,20)
                                                .addComponent(txtMinutesLat,20,20,20)
                                                .addComponent(txtSecondsLat,20,20,20)
                                                .addComponent(txtlat,20,20,20)
                                )
                                .addGap(20)
                                .addGroup(groupLayout.createParallelGroup()
                                        .addComponent(lblLong)
                                        .addComponent(txtDegreesLong,20,20,20)
                                        .addComponent(txtMinutesLong,20,20,20)
                                        .addComponent(txtSecondsLong,20,20,20)
                                )
                                .addGroup(groupLayout.createSequentialGroup()
                                        .addComponent(txtlong,20,20,20)
                                )
                                .addGroup(groupLayout.createParallelGroup()
                                        .addComponent(lblError)
                                )
                        )

                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnDMS)
                                .addComponent(btnDecimal)
                                .addComponent(btnGms)
                        )
        );

    }

    public void convertDmsToDeciaml(){
        btnDMS.setSelected(true);
        btnDecimal.setSelected(false);
        btnGms.setSelected(false);

        txtDegreesLat.setVisible(true);
        txtMinutesLat.setVisible(true);
        txtSecondsLat.setVisible(true);
        txtDegreesLong.setVisible(true);
        txtMinutesLong.setVisible(true);
        txtSecondsLong.setVisible(true);

        txtlat.setVisible(false);
        txtlong.setVisible(false);
    }

    public void convertDecimalsToDms(){
        btnDMS.setSelected(false);
        btnDecimal.setSelected(true);
        btnGms.setSelected(false);

        txtDegreesLat.setVisible(false);
        txtMinutesLat.setVisible(false);
        txtSecondsLat.setVisible(false);
        txtDegreesLong.setVisible(false);
        txtMinutesLong.setVisible(false);
        txtSecondsLong.setVisible(false);

        txtlat.setVisible(true);
        txtlong.setVisible(true);
    }

    public void Gms(){
        btnDMS.setSelected(false);
        btnDecimal.setSelected(false);
        btnGms.setSelected(true);

        txtDegreesLat.setVisible(true);
        txtMinutesLat.setVisible(true);
        txtSecondsLat.setVisible(false);
        txtDegreesLong.setVisible(true);
        txtMinutesLong.setVisible(true);
        txtSecondsLong.setVisible(false);

        txtlat.setVisible(false);
        txtlong.setVisible(false);
    }
}
