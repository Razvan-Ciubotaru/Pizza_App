import javax.swing.*;
import java.awt.*;

public class Produs extends JLabel {
private int counter;

    public Produs(String title,String imagePath){
        counter=0;
        JLabel counterLabel = new JLabel("0");
       this.setText(title);
        this.setIcon(new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.BOTTOM);
        this.setForeground(Color.red);
        this.setFont(new Font("MV Boli", Font.PLAIN, 20));
        this.setIconTextGap(-125);
        this.setVerticalAlignment(JLabel.TOP);

        //this.counterLabel = counterLabel;


    }
}
