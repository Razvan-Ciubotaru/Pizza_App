import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Butoane extends JButton {
    private int counter;
    private JLabel counterLabel;
    private JButton butonIncrementare;
    private JButton butonDecrementare;
    public Butoane(String title, int x, int y) {


        counter = 0;

        counterLabel = new JLabel("0");
        counterLabel.setBounds(170,50,40,40);
        counterLabel.setForeground(Color.blue);
        counterLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));

        butonIncrementare = new JButton("+");
        butonIncrementare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                System.out.println("Aduna " + counter);
                counterLabel.setText(" "+ counter);
            }
        });

        butonDecrementare = new JButton("-");
        butonDecrementare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(counter > 0){
                    counter--;
                    System.out.println("Scade " + counter);
                    counterLabel.setText(" "+ counter);
                }
            }
        });
    }

    // Metode pentru a obține JLabel și JButton-urile
    public JLabel getCounterLabel() {
        return counterLabel;
    }

    public JButton getButonIncrementare() {
        return butonIncrementare;
    }

    public JButton getButonDecrementare() {
        return butonDecrementare;
    }


}


