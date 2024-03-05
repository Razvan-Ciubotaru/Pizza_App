import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Meniu extends JFrame  {
    public JLabel counterLabel;
    public JLabel counterLabel_rosii;
    public JLabel counterLabel_ceapa;
    public JLabel counterLabel_masline;
    public JLabel counterLabel_ciuperci;
    public  JLabel counterLabel_salam;
    public  JLabel counterLabel_ardei;
    public  JLabel counterLabel_porumb;
    public  JLabel counterLabel_branza;
    public  JLabel counterLabel_busuioc;
    public int counter_blat = 0;
    public int counter_rosi=0;
    public int counter_ceapa=0;
    public  int counter_masline=0;
    public  int counter_ciuperci=0;
    public  int counter_salam=0;
    public  int counter_ardei=0;
    public int counter_porumb=0;
    public int counter_busuioc=0;

    public int counter_branza=0;
    public Meniu() {

        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon("src/pizzaLogo.jpeg");

        frame.setTitle("Los Santos Custom Pizza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(32,1,89));

         counterLabel = new JLabel("0");
        counterLabel.setBounds(170,50,40,40);
        counterLabel.setForeground(Color.red);
        counterLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));





        JPanel mainPanel = new JPanel();


        mainPanel.setLayout(new GridLayout(8, 2));
        mainPanel.setBackground(new Color(32,1,89));


//INITIALIZARE CONSTRUCTOR PRODUSE
        Produs blat = new Produs("Cantitae","src/_bb4d07d4-abaa-4aa6-8f07-ec217fde9644.jpeg");
        Produs rosi = new Produs("Rosii(30g)","src/ro_pim_657394001001_01.png");
        Produs ceapa = new Produs("Ceapa(30g)","src/ceap-ro-ie-1.jpg");
        Produs masline = new Produs("Masline(30g)","src/53945.jpg");
        Produs ciuperci = new Produs("Ciuperci(50g)","src/ciuperci.jpg");
        Produs salam = new Produs("Salam(150g)","src/supliment-pizza-salam.png");
        Produs ardei = new Produs("Ardei(50g)","src/ardei-gras-rosu-1.jpg");
        Produs porumb = new Produs("Porumb(50g)","src/porumb.jpg");
        Produs branza = new Produs("Mozzarella(50g)","src/55e2a5fe43d4cece2abb1209f9fa5e7f.jpg");
        Produs busuioc = new Produs("Busuioc(50g)","src/busuioc-30-g-1.jpg");

        //INITIALIZARE CONSTRUCTOR BUTOANE
        Butoane butoane = new Butoane("+",40,40);
        Butoane butoane1 = new Butoane("-",80,80);
        Butoane butoane2 = new Butoane("+",40,40);
        Butoane butoane3 = new Butoane("-",80,80);
        Butoane butoane4 = new Butoane("+",40,40);
        Butoane butoane5 = new Butoane("-",80,80);
        Butoane butoane6 = new Butoane("+",40,40);
        Butoane butoane7 = new Butoane("-",80,80);
        Butoane butoane8 = new Butoane("+",40,40);
        Butoane butoane9 = new Butoane("-",80,80);
        Butoane butoane10 = new Butoane("+",40,40);
        Butoane butoane11 = new Butoane("-",80,80);
        Butoane butoane12 = new Butoane("+",40,40);
        Butoane butoane13 = new Butoane("-",80,80);
        Butoane butoane14 = new Butoane("+",40,40);
        Butoane butoane15 = new Butoane("-",80,80);
        Butoane butoane16 = new Butoane("+",40,40);
        Butoane butoane17 = new Butoane("-",80,80);
        Butoane butoane18 = new Butoane("+",40,40);
        Butoane butoane19 = new Butoane("-",80,80);



//ACTIUNE BUTOANE
butoane.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane){
                    counter_blat++;
                    System.out.println("Aduna " + counter_blat);
                    counterLabel.setText(" "+ counter_blat);

                }

            }

        });

        butoane1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane1) {
                    if(counter_blat>0){
                        counter_blat--;
                        System.out.println("Scade " + counter_blat);
                        counterLabel.setText(" "+ counter_blat);
                    }
                }
            }
        });

        counterLabel_rosii = new JLabel("0");
        counterLabel_rosii.setBounds(170,50,40,40);
        counterLabel_rosii.setForeground(Color.blue);
        counterLabel_rosii.setFont(new Font("MV Boli", Font.PLAIN, 20));

        butoane2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane2) {
                        counter_rosi++;
                        System.out.println("Aduna " + counter_rosi);
                        counterLabel_rosii.setText(" "+ counter_rosi);

                }
            }
        });

        butoane3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane3) {
                    if(counter_rosi>0){
                        counter_rosi--;
                        System.out.println("Scade " + counter_rosi);
                        counterLabel_rosii.setText(" "+ counter_rosi);
                    }
                }
            }
        });
        counterLabel_ceapa = new JLabel("0");
        counterLabel_ceapa.setBounds(170,50,40,40);
        counterLabel_ceapa.setForeground(Color.blue);
        counterLabel_ceapa.setFont(new Font("MV Boli", Font.PLAIN, 20));


        butoane4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane4) {
                    counter_ceapa++;
                    System.out.println("Aduna " + counter_ceapa);
                    counterLabel_ceapa.setText(" "+ counter_ceapa);

                }
            }
        });

        butoane5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane5) {
                    if(counter_ceapa>0){
                        counter_ceapa--;
                        System.out.println("Scade " + counter_ceapa);
                        counterLabel_ceapa.setText(" "+ counter_ceapa);
                    }
                }
            }
        });
        counterLabel_masline = new JLabel("0");
        counterLabel_masline.setBounds(170,50,40,40);
        counterLabel_masline.setForeground(Color.blue);
        counterLabel_masline.setFont(new Font("MV Boli", Font.PLAIN, 20));
        butoane6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane6) {
                    counter_masline++;
                    System.out.println("Aduna " + counter_masline);
                    counterLabel_masline.setText(" "+ counter_masline);

                }
            }
        });

        butoane7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane7) {
                    if(counter_masline>0){
                        counter_masline--;
                        System.out.println("Scade " + counter_masline);
                        counterLabel_masline.setText(" "+ counter_masline);
                    }
                }
            }
        });

        counterLabel_ciuperci = new JLabel("0");
        counterLabel_ciuperci.setBounds(170,50,40,40);
        counterLabel_ciuperci.setForeground(Color.blue);
        counterLabel_ciuperci.setFont(new Font("MV Boli", Font.PLAIN, 20));
        butoane8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane8) {
                    counter_ciuperci++;
                    System.out.println("Aduna " + counter_ciuperci);
                    counterLabel_ciuperci.setText(" "+ counter_ciuperci);

                }
            }
        });

        butoane9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane9) {
                    if(counter_ciuperci>0){
                        counter_ciuperci--;
                        System.out.println("Scade " + counter_ciuperci);
                        counterLabel_ciuperci.setText(" "+ counter_ciuperci);
                    }
                }
            }
        });


        counterLabel_salam = new JLabel("0");
        counterLabel_salam.setBounds(170,50,40,40);
        counterLabel_salam.setForeground(Color.blue);
        counterLabel_salam.setFont(new Font("MV Boli", Font.PLAIN, 20));
        butoane10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane10) {
                    counter_salam++;
                    System.out.println("Aduna " + counter_salam);
                    counterLabel_salam.setText(" "+ counter_salam);

                }
            }
        });

        butoane11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane11) {
                    if(counter_salam>0){
                        counter_salam--;
                        System.out.println("Scade " + counter_salam);
                        counterLabel_salam.setText(" "+ counter_salam);
                    }
                }
            }
        });


        counterLabel_ardei = new JLabel("0");
        counterLabel_ardei.setBounds(170,50,40,40);
        counterLabel_ardei.setForeground(Color.blue);
        counterLabel_ardei.setFont(new Font("MV Boli", Font.PLAIN, 20));
        butoane12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane12) {
                    counter_ardei++;
                    System.out.println("Aduna " + counter_ardei);
                    counterLabel_ardei.setText(" "+ counter_ardei);

                }
            }
        });

        butoane13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane13) {
                    if(counter_ardei>0){
                        counter_ardei--;
                        System.out.println("Scade " + counter_ardei);
                        counterLabel_ardei.setText(" "+ counter_ardei);
                    }
                }
            }
        });
        counterLabel_porumb = new JLabel("0");
        counterLabel_porumb.setBounds(170,50,40,40);
        counterLabel_porumb.setForeground(Color.blue);
        counterLabel_porumb.setFont(new Font("MV Boli", Font.PLAIN, 20));
        butoane14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane14) {
                    counter_porumb++;
                    System.out.println("Aduna " + counter_porumb);
                    counterLabel_porumb.setText(" "+ counter_porumb);

                }
            }
        });

        butoane15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane15) {
                    if(counter_porumb>0){
                        counter_porumb--;
                        System.out.println("Scade " + counter_porumb);
                        counterLabel_porumb.setText(" "+ counter_porumb);
                    }
                }
            }
        });



        counterLabel_branza = new JLabel("0");
        counterLabel_branza.setBounds(170,50,40,40);
        counterLabel_branza.setForeground(Color.blue);
        counterLabel_branza.setFont(new Font("MV Boli", Font.PLAIN, 20));
        butoane16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane16) {
                    counter_branza++;
                    System.out.println("Aduna " + counter_branza);
                    counterLabel_branza.setText(" "+ counter_branza);

                }
            }
        });

        butoane17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane17) {
                    if(counter_branza>0){
                        counter_branza--;
                        System.out.println("Scade " + counter_branza);
                        counterLabel_branza.setText(" "+ counter_branza);
                    }
                }
            }
        });

        counterLabel_busuioc = new JLabel("0");
        counterLabel_busuioc.setBounds(170,50,40,40);
        counterLabel_busuioc.setForeground(Color.blue);
        counterLabel_busuioc.setFont(new Font("MV Boli", Font.PLAIN, 20));
        butoane18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane18) {
                    counter_busuioc++;
                    System.out.println("Aduna " + counter_busuioc);
                    counterLabel_busuioc.setText(" "+ counter_busuioc);

                }
            }
        });

        butoane19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==butoane19) {
                    if(counter_busuioc>0){
                        counter_busuioc--;
                        System.out.println("Scade " + counter_busuioc);
                        counterLabel_busuioc.setText(" "+ counter_busuioc);
                    }
                }
            }
        });

 //PRIMUL PANEL
        JPanel panel1 = new JPanel();
        panel1.add(blat);
        panel1.add(butoane);
        panel1.add(counterLabel);
        panel1.add(butoane1);
        panel1.setBackground(new Color(32,1,89));

//PANEL_2
        JPanel panel2 = new JPanel();
        panel2.add(rosi);
        panel2.add(butoane2);
        panel2.add(counterLabel_rosii);
        panel2.add(butoane3);
        panel2.setBackground(new Color(32,1,89));



//PANEL_3
JPanel panel3 = new JPanel();
        panel3.add(ceapa);
        panel3.add(butoane4);
        panel3.add(counterLabel_ceapa);
        panel3.add(butoane5);
        panel3.setBackground(new Color(32,1,89));

//PANEL_4
        JPanel panel4 = new JPanel();
        panel4.add(masline);
        panel4.add(butoane6);
        panel4.add(counterLabel_masline);
        panel4.add(butoane7);
        panel4.setBackground(new Color(32,1,89));

//PANEL_5
        JPanel panel5 = new JPanel();
        panel5.add(ciuperci);
        panel5.add(butoane8);
        panel5.add(counterLabel_ciuperci);
        panel5.add(butoane9);
        panel5.setBackground(new Color(32,1,89));

//PANEL_6
        JPanel panel6 = new JPanel();
        panel6.add(salam);
        panel6.add(butoane10);
        panel6.add(counterLabel_salam);
        panel6.add(butoane11);
        panel6.setBackground(new Color(32,1,89));

//PANEL_7
        JPanel panel7 = new JPanel();
        panel7.add(ardei);
        panel7.add(butoane12);
        panel7.add(counterLabel_ardei);
        panel7.add(butoane13);
        panel7.setBackground(new Color(32,1,89));

//PANEL8
        JPanel panel8 = new JPanel();
        panel8.add(porumb);
        panel8.add(butoane14);
        panel8.add(counterLabel_porumb);
        panel8.add(butoane15);
        panel8.setBackground(new Color(32,1,89));

//PANEL9
        JPanel panel9 = new JPanel();
        panel9.add(branza);
        panel9.add(butoane16);
        panel9.add(counterLabel_branza);
        panel9.add(butoane17);
        panel9.setBackground(new Color(32,1,89));
//PANEL10
        JPanel panel10 = new JPanel();
        panel10.add(busuioc);
        panel10.add(butoane18);
        panel10.add(counterLabel_busuioc);
        panel10.add(butoane19);
        panel10.setBackground(new Color(32,1,89));



        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        mainPanel.add(panel4);
        mainPanel.add(panel5);
        mainPanel.add(panel6);
        mainPanel.add(panel7);
        mainPanel.add(panel8);
       mainPanel.add(panel9);
       mainPanel.add(panel10);


        frame.add(mainPanel);


        frame.setSize(620,1200);
        frame.setVisible(true);
       // frame.setResizable(false);


    }

}
