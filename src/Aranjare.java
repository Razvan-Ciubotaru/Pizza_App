import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aranjare extends JPanel {


    public  Aranjare(){
        JFrame frame = new JFrame("Exemplu GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creăm un container principal pentru a adăuga bucățile
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 3)); // 2 rânduri și 2 coloane

        // Creăm și adăugăm componente în fiecare bucățică
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Bucata 1"));
        panel1.add(new JButton("Buton 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Bucata 2"));
        panel2.add(new JButton("Buton 2"));

        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("Bucata 3"));
        panel3.add(new JButton("Buton 3"));

        JPanel panel4 = new JPanel();
        panel4.add(new JLabel("Bucata 4"));
        panel4.add(new JButton("Buton 4"));

        // Adăugăm bucățile în containerul principal
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        mainPanel.add(panel4);

        // Adăugăm containerul principal în frame
        frame.add(mainPanel);

        frame.pack();
        frame.setVisible(true);
    }
    }

