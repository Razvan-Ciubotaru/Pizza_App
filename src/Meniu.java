import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Meniu  {
    JFrame frame = new JFrame();
    JPanel mainPanel = new JPanel();
    public Meniu() {


        ImageIcon image = new ImageIcon("src/pizzaLogo.jpeg");

        frame.setTitle("Los Santos Custom Pizza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(32,1,89));
        ArrayList<Produs> listaProduse = new ArrayList<>();






        mainPanel.setLayout(new GridLayout(7, 2));
        mainPanel.setBackground(new Color(32,1,89));

        Produs blat = new Produs("Cantitae","src/_bb4d07d4-abaa-4aa6-8f07-ec217fde9644.jpeg");
        Butoane BUT = new Butoane("but","");
        JPanel panel = new JPanel();
        panel.add(blat);
        panel.add(BUT.getButonIncrementare());
        panel.add(BUT.getCounterLabel());
        panel.add(BUT.getButonDecrementare());
        panel.setBackground(new Color(32,1,89));

        Produs rosi = new Produs("Rosii(30g)","src/ro_pim_657394001001_01.png");
        Butoane BUT1 = new Butoane("but","rosii");
        JPanel panel1 = new JPanel();
        panel1.add(rosi);
        panel1.add(BUT1.getButonIncrementare());
        panel1.add(BUT1.getCounterLabel());
        panel1.add(BUT1.getButonDecrementare());
        panel1.setBackground(new Color(32,1,89));

      Produs ceapa = new Produs("Ceapa(30g)","src/ceap-ro-ie-1.jpg");
       Butoane but2 = new Butoane("but","Ceapa");
      JPanel panel2 = new JPanel();
      panel2.add(ceapa);
       panel2.add(but2.getButonIncrementare());
       panel2.add(but2.getCounterLabel());
       panel2.add(but2.getButonDecrementare());
       panel2.setBackground(new Color(32,1,89));

        Produs masline = new Produs("Masline(30g)","src/53945.jpg");
        Butoane but3 = new Butoane("but","masline");
        JPanel panel3 = new JPanel();
        panel3.add(masline);
        panel3.add(but3.getButonIncrementare());
        panel3.add(but3.getCounterLabel());
        panel3.add(but3.getButonDecrementare());
        panel3.setBackground(new Color(32,1,89));

        Produs ciuperci = new Produs("Ciuperci(50g)","src/ciuperci.jpg");
        Butoane but4 = new Butoane("but","ciuperic");
        JPanel panel4 = new JPanel();
        panel4.add(ciuperci);
        panel4.add(but4.getButonIncrementare());
        panel4.add(but4.getCounterLabel());
        panel4.add(but4.getButonDecrementare());
        panel4.setBackground(new Color(32,1,89));

        Produs salam = new Produs("Salam(150g)","src/supliment-pizza-salam.png");
        Butoane but5 = new Butoane("but","salam");
        JPanel panel5 = new JPanel();
        panel5.add(salam);
        panel5.add(but5.getButonIncrementare());
        panel5.add(but5.getCounterLabel());
        panel5.add(but5.getButonDecrementare());
        panel5.setBackground(new Color(32,1,89));

        Produs ardei = new Produs("Ardei(50g)","src/ardei-gras-rosu-1.jpg");
        Butoane but6 = new Butoane("but","ardei");
        JPanel panel6 = new JPanel();
        panel6.add(ardei);
        panel6.add(but6.getButonIncrementare());
        panel6.add(but6.getCounterLabel());
        panel6.add(but6.getButonDecrementare());
        panel6.setBackground(new Color(32,1,89));

        Produs porumb = new Produs("Porumb(50g)","src/porumb.jpg");
        Butoane but7 = new Butoane("but","porumb");
        JPanel panel7 = new JPanel();
        panel7.add(porumb);
        panel7.add(but7.getButonIncrementare());
        panel7.add(but7.getCounterLabel());
        panel7.add(but7.getButonDecrementare());
        panel7.setBackground(new Color(32,1,89));

        Produs branza = new Produs("Mozzarella(50g)","src/55e2a5fe43d4cece2abb1209f9fa5e7f.jpg");
        Butoane but8 = new Butoane("but","branza");
        JPanel panel8 = new JPanel();
        panel8.add(branza);
        panel8.add(but8.getButonIncrementare());
        panel8.add(but8.getCounterLabel());
        panel8.add(but8.getButonDecrementare());
        panel8.setBackground(new Color(32,1,89));


        Produs busuioc = new Produs("Busuioc(50g)","src/busuioc-30-g-1.jpg");
        Butoane but9 = new Butoane("but","busuioc");
        JPanel panel9 = new JPanel();
        panel9.add(busuioc);
        panel9.add(but9.getButonIncrementare());
        panel9.add(but9.getCounterLabel());
        panel9.add(but9.getButonDecrementare());
        panel9.setBackground(new Color(32,1,89));

        listaProduse.add(blat);


        mainPanel.add(panel);
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        mainPanel.add(panel4);
       mainPanel.add(panel5);
        mainPanel.add(panel6);
        mainPanel.add(panel7);
       mainPanel.add(panel8);
        mainPanel.add(panel9);

        frame.add(mainPanel);


        frame.setSize(620,1200);
        frame.setVisible(true);



    }

}
