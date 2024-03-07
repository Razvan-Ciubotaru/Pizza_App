import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Aranjare implements ActionListener {
    JFrame frame = new JFrame();
    private int nrpizza = 0;
    private JButton inc;
    private JButton dec;
    private JLabel counterLbl;

    JButton confirm =new JButton("Confirm");
    Aranjare(){
        JPanel pan = new JPanel();
        counterLbl = new JLabel("0");
        confirm.setBounds(250,250,50,50);

        confirm.addActionListener(this);
        inc = new JButton("+");
        inc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nrpizza++;
                System.out.println("Aduna " + nrpizza);
                counterLbl.setText(" "+ nrpizza) ;
            }
        });
        dec = new JButton("-");
        dec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(nrpizza>0){
                   nrpizza--;
                   System.out.println("Aduna " + nrpizza);
                   counterLbl.setText(" "+ nrpizza) ;
               }
            }
        });
        inc.setBounds(50,60,50,50);
        dec.setBounds(50,90,100,50);
        pan.add(inc);
        pan.add(counterLbl);
        pan.add(dec);
        pan.add(confirm);
        frame.add(pan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==confirm){

    for(int i=0;i< nrpizza;i++){
       // System.out.println();
        Meniu meniu = new Meniu();
    }
}
    }
}

