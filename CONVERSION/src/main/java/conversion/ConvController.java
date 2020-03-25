package conversion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvController {

    ConvVista convVista = new ConvVista();
    ConvModel convModel = new ConvModel();

    public ConvController() {
        convVista.setVisible(true);
        convVista.btnDMS.setSelected(true);

        convVista.btnDMS.addActionListener(actionBtnDMS());
        convVista.btnDecimal.addActionListener(actionBtnDecimal());
        convVista.btnGms.addActionListener(actionbtnGms());
    }

    private ActionListener actionBtnDMS() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convVista.convertDmsToDeciaml();
                conversionDecimalToDmsLat();
                convertDecimalToDmsLong();
            }
        };
    }

    private ActionListener actionBtnDecimal(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                condicion();
            }
        };
    }

    private ActionListener actionbtnGms() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convVista.Gms();
                convertWithButtonGms();
            }
        };
    }

    private void condicion(){
        if(convVista.txtDegreesLat.getText().isEmpty()||convVista.txtMinutesLat.getText().isEmpty()||convVista.txtSecondsLat.getText().isEmpty()||convVista.txtDegreesLong.getText().isEmpty()||
                convVista.txtMinutesLong.getText().isEmpty()||convVista.txtSecondsLong.getText().isEmpty()){

            convVista.lblError.setVisible(true);
            convVista.btnDecimal.setSelected(false);

        }else{
            tomaDeDatos();
            convVista.lblError.setVisible(false);
            convVista.convertDecimalsToDms();
            conversionDmsToDecimal();
        }
    }

    public void conversionDmsToDecimal(){
        convModel.setTxtlat((((convModel.getTxtSecondsLat() / 60) + convModel.getTxtMinutesLat()) / 60) + convModel.getTxtDegreesLat());
        convVista.txtlat.setText(String.valueOf(convModel.getTxtlat()));

        convModel.setTxtlong((((convModel.getTxtSecondsLong() / 60) + convModel.getTxtMinutesLong()) / 60) + convModel.getTxtDegreesLong());
        convVista.txtlong.setText(String.valueOf(convModel.getTxtlong()));
    }

    public void conversionDecimalToDmsLat(){
        convModel.setTxtlat(Float.parseFloat(convVista.txtlat.getText()));


        convModel.setDecimalPartDegreesLat(convModel.getTxtlat() % 1);

        convModel.setWholePart(convModel.getTxtlat() - convModel.getDecimalPartDegreesLat());
        convVista.txtDegreesLat.setText(String.valueOf(convModel.getWholePart()));



        convModel.setNumForMinutesLat(convModel.getDecimalPartDegreesLat() * 60);
        convModel.setDecimalPartMinutesLat(convModel.getNumForMinutesLat() % 1);

        convModel.setWholePartMinutesLat(convModel.getNumForMinutesLat() - convModel.getDecimalPartMinutesLat());
        convVista.txtMinutesLat.setText(String.valueOf(convModel.getWholePartMinutesLat()));


        convModel.setNumForSecondsLat(convModel.getDecimalPartMinutesLat() * 60);
        convModel.setDecimalPartSecondsLat(convModel.getNumForSecondsLat() % 1);

        convModel.setWholePartSecondsLat(convModel.getNumForSecondsLat() - convModel.getDecimalPartSecondsLat());
        convVista.txtSecondsLat.setText(String.valueOf(convModel.getWholePartSecondsLat()));
    }

    public void convertDecimalToDmsLong(){
        convModel.setTxtlong(Float.parseFloat(convVista.txtlong.getText()));


        convModel.setDecimalPartDegreesLong(convModel.getTxtlong() % 1);

        convModel.setWholePartDegreesLong(convModel.getTxtlong() - convModel.getDecimalPartDegreesLong());
        convVista.txtDegreesLong.setText(String.valueOf(convModel.getWholePartDegreesLong()));



        convModel.setNumForMinutesLong(convModel.getDecimalPartDegreesLong() * 60);
        convModel.setDecimalPartMinutesLong(convModel.getNumForMinutesLong() % 1);

        convModel.setWholePartMinutesLong(convModel.getNumForMinutesLong() - convModel.getDecimalPartMinutesLong());
        convVista.txtMinutesLong.setText(String.valueOf(convModel.getWholePartMinutesLong()));


        convModel.setNumForSecondsLong(convModel.getDecimalPartMinutesLong() * 60);
        convModel.setDecimalPartSecondsLong(convModel.getNumForSecondsLong() % 1);

        convModel.setWholePartSecondsLong(convModel.getNumForSecondsLong() - convModel.getDecimalPartSecondsLong());
        convVista.txtSecondsLong.setText(String.valueOf(convModel.getWholePartSecondsLong()));
    }

    public void convertWithButtonGms(){
        convModel.setTxtSecondsLat(Float.parseFloat(convVista.txtSecondsLat.getText()));
        convModel.setTxtSecondsLong(Float.parseFloat(convVista.txtSecondsLong.getText()));

        convModel.setGmsLong((convModel.getWholePartSecondsLong() / 60) + convModel.getWholePartMinutesLong());
        convVista.txtMinutesLong.setText(String.valueOf(convModel.getGmsLong()));

        convModel.setGmsLat((convModel.getWholePartSecondsLat() / 60) + convModel.getWholePartMinutesLat());
        convVista.txtMinutesLat.setText(String.valueOf(convModel.getGmsLat()));
    }
  /*  private void condicion2(){
        if(convVista.txtDegreesLat.getText().isEmpty()||convVista.txtMinutesLat.getText().isEmpty()||convVista.txtSecondsLat.getText().isEmpty()||convVista.txtDegreesLong.getText().isEmpty()||
                convVista.txtMinutesLong.getText().isEmpty()||convVista.txtSecondsLong.getText().isEmpty()){

            convVista.lblError.setVisible(true);
            convVista.btnGms.setSelected(false);

        }else{
            tomaDeDatos();
            convVista.lblError.setVisible(false);
            convVista.Gms();
            convertWithButtonGms();
        }
    }*/

    private void tomaDeDatos() {
        convModel.setTxtDegreesLat(Float.parseFloat(convVista.txtDegreesLat.getText()));
        convModel.setTxtMinutesLat(Float.parseFloat(convVista.txtMinutesLat.getText()));
        convModel.setTxtSecondsLat(Float.parseFloat(convVista.txtSecondsLat.getText()));
        convModel.setTxtDegreesLong(Float.parseFloat(convVista.txtDegreesLong.getText()));
        convModel.setTxtMinutesLong(Float.parseFloat(convVista.txtMinutesLong.getText()));
        convModel.setTxtSecondsLong(Float.parseFloat(convVista.txtSecondsLong.getText()));
    }

    public static void main(String[] args) {
        new ConvController();
    }
}