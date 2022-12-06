package ZipCodeDB;

import Utility.Weather;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPanel is the "base class". GUIPanel is the "derived" class.
public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;

    private Database db;  // The zipcode database

    public GUIPanel() {
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);

        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());

        this.output = new JTextArea(5,20);
        this.add(this.output);

        this.db = new Database();  // load the zipcodes
    }

    class SubmitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // function will get called when the user presses submit

            // get the zipcode out of the text field
            String code = zipcode.getText();

            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
            System.out.println(wob);
        }
    }


}
