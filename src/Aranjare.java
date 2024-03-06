import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aranjare extends JButton {
    private JLabel numeLabel;
    private JLabel cantitateLabel;
    private int cantitate;
    private JButton butonIncrementare;
    private JButton butonDecrementare; private ImageIcon imagine;

    public Aranjare(String nume,ImageIcon imagine,int x,int y,int cantitate) {

        this.numeLabel = new JLabel(nume);
        this.cantitate = 0;
        this.cantitateLabel = new JLabel("Cantitate: " + this.cantitate);
        this.butonIncrementare = new JButton("+");
        this.setBounds(x, y, 50, 50);
        this.setVisible(true);
        this.butonDecrementare = new JButton("-");

        butonIncrementare.addActionListener(e -> {
            this.cantitate++;
            this.cantitateLabel.setText("Cantitate: " + this.cantitate);
        });

        butonDecrementare.addActionListener(e -> {
            if (this.cantitate > 0) {
                this.cantitate--;
                this.cantitateLabel.setText("Cantitate: " + this.cantitate);
            }
        });
    }}

