package mobutusesecocubendumbazavanga;


import javafx.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.Dimension2D;
import java.awt.image.BufferedImage;
import java.io.File;

public class GUI extends JFrame {

    private JPanel panou;
    private JTextField legenda;
    private JTextField rezolvarecub;
    private JLabel mov1;
    private ImageIcon image;
    private int Parte = 0;
    private int side[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    private String culoarecasuta0;
    private int Culori_cub[][] = new int[6][9];
    private JLabel pozitie = new JLabel("");
    private JLabel pozitie_cub = new JLabel("");
    private JButton but11, but12, but13, but21, but22, but23, but31, but32, but33, next, done;

    public GUI() {
        super("Cubul Rubik"); // nume frame

        rezolvarecub = new JTextField("", Font.BOLD);
        rezolvarecub.setLocation(10, 200);
        rezolvarecub.setBounds(400, 40, 270, 200);
        rezolvarecub.setFont(new Font("arial", Font.BOLD, 20)); //nu merge
        rezolvarecub.setEditable(false);

        legenda = new JTextField("SansSerif", Font.BOLD);
        legenda.setHorizontalAlignment(JTextField.CENTER);
        legenda.setEditable(false);
        legenda.setFont(new Font("arial", Font.BOLD, 30));
        legenda.setBounds(40, 320, 630, 50);
        legenda.setBackground(Color.getHSBColor(260, 55, 58));
        legenda.setText("Move Notations");

//            image= new ImageIcon(getClass().getResource("img/rubiks_moves.png"));
//            mov1= new JLabel(image);
//            add(mov1);   nu merge
//            pack();

        panou = new JPanel();
        panou.setBackground(Color.white);
        panou.setLayout(null);

        panou.add(rezolvarecub);
        panou.add(legenda);
        setContentPane(panou);

////am definit butoanele

        but11 = new JButton("");
        but12 = new JButton("");
        but13 = new JButton("");
        but21 = new JButton("");
        but22 = new JButton("");
        but23 = new JButton("");
        but31 = new JButton("");
        but32 = new JButton("");
        but33 = new JButton("");
        next = new JButton("Next");
        done = new JButton("Done");

        panou.add(but11);
        panou.add(but12);
        panou.add(but13);
        panou.add(but21);
        panou.add(but22);
        panou.add(but23);
        panou.add(but31);
        panou.add(but32);
        panou.add(but33);
        panou.add(next);
        panou.add(done);

        Dimension dimensiune = new Dimension(70, 70);

        but11.setPreferredSize(dimensiune);
        but11.setBounds(40, 40, 80, 80);
        but12.setPreferredSize(dimensiune);
        but12.setBounds(130, 40, 80, 80);
        but13.setPreferredSize(dimensiune);
        but13.setBounds(220, 40, 80, 80);
        but21.setPreferredSize(dimensiune);
        but21.setBounds(40, 130, 80, 80);
        but22.setPreferredSize(dimensiune);
        but22.setBounds(130, 130, 80, 80);
        but23.setPreferredSize(dimensiune);
        but23.setBounds(220, 130, 80, 80);
        but31.setPreferredSize(dimensiune);
        but31.setBounds(40, 220, 80, 80);
        but32.setPreferredSize(dimensiune);
        but32.setBounds(130, 220, 80, 80);
        but33.setPreferredSize(dimensiune);
        but33.setBounds(220, 220, 80, 80);
        next.setPreferredSize(dimensiune);
        next.setBounds(400, 260, 100, 40);
        done.setPreferredSize(dimensiune);
        done.setBounds(570, 260, 100, 40);

        getBut11();
        getBut12();
        getBut13();
        getBut21();
        getBut22();
        getBut23();
        getBut31();
        getBut32();
        getBut33();
        getNext();
        getDone();

        this.setContentPane(panou);

    }

    public JButton getBut11() {
        but11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Ai apasat butonul 1");
                if (side[0] == 5) {
                    side[0] = 0;
                    but11.setBackground(Color.GREEN);
                    Culori_cub[Parte][0] = 0;
                    culoarecasuta0 = "green";
                } else if (side[0] == 0) {
                    side[0] = 1;
                    but11.setBackground(Color.WHITE);
                    Culori_cub[Parte][0] = 1;
                    culoarecasuta0 = "white";
                } else if (side[0] == 1) {
                    side[0] = 2;
                    but11.setBackground(Color.BLUE);
                    Culori_cub[Parte][0] = 2;
                    culoarecasuta0 = "blue";

                } else if (side[0] == 2) {
                    side[0] = 3;
                    but11.setBackground(Color.YELLOW);
                    Culori_cub[Parte][0] = 3;
                    culoarecasuta0 = "yellow";

                } else if (side[0] == 3) {
                    side[0] = 4;
                    but11.setBackground(Color.ORANGE);
                    Culori_cub[Parte][0] = 4;
                    culoarecasuta0 = "green";

                } else if (side[0] == 4) {
                    side[0] = 5;
                    but11.setBackground(Color.RED);
                    Culori_cub[Parte][0] = 5;
                }

            }
        });
        return but11;
    }

    public JButton getBut12() {
        but12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Ai apasat butonul 2");
                if (side[1] == 5) {
                    side[1] = 0;
                    but12.setBackground(Color.GREEN);
                    Culori_cub[Parte][1] = 0;
                    culoarecasuta0 = "green";
                } else if (side[1] == 0) {
                    side[1] = 1;
                    but12.setBackground(Color.WHITE);
                    Culori_cub[Parte][1] = 1;
                    culoarecasuta0 = "white";
                } else if (side[1] == 1) {
                    side[1] = 2;
                    but12.setBackground(Color.BLUE);
                    Culori_cub[Parte][1] = 2;
                    culoarecasuta0 = "blue";

                } else if (side[1] == 2) {
                    side[1] = 3;
                    but12.setBackground(Color.YELLOW);
                    Culori_cub[Parte][1] = 3;
                    culoarecasuta0 = "yellow";

                } else if (side[1] == 3) {
                    side[1] = 4;
                    but12.setBackground(Color.ORANGE);
                    Culori_cub[Parte][1] = 4;
                    culoarecasuta0 = "green";

                } else if (side[1] == 4) {
                    side[1] = 5;
                    but12.setBackground(Color.RED);
                    Culori_cub[Parte][1] = 5;
                }

            }
        });
        return but12;
    }

    public JButton getBut13() {
        but13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Ai apasat butonul 3");
                if (side[2] == 5) {
                    side[2] = 0;
                    but13.setBackground(Color.GREEN);
                    Culori_cub[Parte][2] = 0;
                    culoarecasuta0 = "green";
                } else if (side[2] == 0) {
                    side[2] = 1;
                    but13.setBackground(Color.WHITE);
                    Culori_cub[Parte][2] = 1;
                    culoarecasuta0 = "white";
                } else if (side[2] == 1) {
                    side[2] = 2;
                    but13.setBackground(Color.BLUE);
                    Culori_cub[Parte][2] = 2;
                    culoarecasuta0 = "blue";

                } else if (side[2] == 2) {
                    side[2] = 3;
                    but13.setBackground(Color.YELLOW);
                    Culori_cub[Parte][2] = 3;
                    culoarecasuta0 = "yellow";

                } else if (side[2] == 3) {
                    side[2] = 4;
                    but13.setBackground(Color.ORANGE);
                    Culori_cub[Parte][2] = 4;
                    culoarecasuta0 = "green";

                } else if (side[2] == 4) {
                    side[2] = 5;
                    but13.setBackground(Color.RED);
                    Culori_cub[Parte][2] = 5;
                }

            }
        });
        return but13;
    }

    public JButton getBut21() {
        but21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Ai apasat butonul 4");
                if (side[3] == 5) {
                    side[3] = 0;
                    but21.setBackground(Color.GREEN);
                    Culori_cub[Parte][3] = 0;
                    culoarecasuta0 = "green";
                } else if (side[3] == 0) {
                    side[3] = 1;
                    but21.setBackground(Color.WHITE);
                    Culori_cub[Parte][3] = 1;
                    culoarecasuta0 = "white";
                } else if (side[3] == 1) {
                    side[3] = 2;
                    but21.setBackground(Color.BLUE);
                    Culori_cub[Parte][3] = 2;
                    culoarecasuta0 = "blue";

                } else if (side[3] == 2) {
                    side[3] = 3;
                    but21.setBackground(Color.YELLOW);
                    Culori_cub[Parte][3] = 3;
                    culoarecasuta0 = "yellow";

                } else if (side[3] == 3) {
                    side[3] = 4;
                    but21.setBackground(Color.ORANGE);
                    Culori_cub[Parte][3] = 4;
                    culoarecasuta0 = "green";

                } else if (side[3] == 4) {
                    side[3] = 5;
                    but21.setBackground(Color.RED);
                    Culori_cub[Parte][3] = 5;
                }

            }
        });
        return but21;
    }

    public JButton getBut22() {
        but22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Ai apasat butonul 5");
                if (side[4] == 5) {
                    side[4] = 0;
                    but22.setBackground(Color.GREEN);
                    Culori_cub[Parte][4] = 0;
                    culoarecasuta0 = "green";
                } else if (side[4] == 0) {
                    side[4] = 1;
                    but22.setBackground(Color.WHITE);
                    Culori_cub[Parte][4] = 1;
                    culoarecasuta0 = "white";
                } else if (side[4] == 1) {
                    side[4] = 2;
                    but22.setBackground(Color.BLUE);
                    Culori_cub[Parte][4] = 2;
                    culoarecasuta0 = "blue";

                } else if (side[4] == 2) {
                    side[4] = 3;
                    but22.setBackground(Color.YELLOW);
                    Culori_cub[Parte][4] = 3;
                    culoarecasuta0 = "yellow";

                } else if (side[4] == 3) {
                    side[4] = 4;
                    but22.setBackground(Color.ORANGE);
                    Culori_cub[Parte][4] = 4;
                    culoarecasuta0 = "green";

                } else if (side[4] == 4) {
                    side[4] = 5;
                    but22.setBackground(Color.RED);
                    Culori_cub[Parte][4] = 5;
                }

            }
        });
        return but22;
    }

    public JButton getBut23() {
        but23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Ai apasat butonul 6");
                if (side[5] == 5) {
                    side[5] = 0;
                    but23.setBackground(Color.GREEN);
                    Culori_cub[Parte][5] = 0;
                    culoarecasuta0 = "green";
                } else if (side[5] == 0) {
                    side[5] = 1;
                    but23.setBackground(Color.WHITE);
                    Culori_cub[Parte][5] = 1;
                    culoarecasuta0 = "white";
                } else if (side[5] == 1) {
                    side[5] = 2;
                    but23.setBackground(Color.BLUE);
                    Culori_cub[Parte][5] = 2;
                    culoarecasuta0 = "blue";

                } else if (side[5] == 2) {
                    side[5] = 3;
                    but23.setBackground(Color.YELLOW);
                    Culori_cub[Parte][5] = 3;
                    culoarecasuta0 = "yellow";

                } else if (side[5] == 3) {
                    side[5] = 4;
                    but23.setBackground(Color.ORANGE);
                    Culori_cub[Parte][5] = 4;
                    culoarecasuta0 = "green";

                } else if (side[5] == 4) {
                    side[5] = 5;
                    but23.setBackground(Color.RED);
                    Culori_cub[Parte][4] = 5;
                }

            }
        });
        return but22;
    }

    public JButton getBut31() {
        but31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Ai apasat butonul 7");
                if (side[5] == 5) {
                    side[5] = 0;
                    but31.setBackground(Color.GREEN);
                    Culori_cub[Parte][5] = 0;
                    culoarecasuta0 = "green";
                } else if (side[5] == 0) {
                    side[5] = 1;
                    but31.setBackground(Color.WHITE);
                    Culori_cub[Parte][5] = 1;
                    culoarecasuta0 = "white";
                } else if (side[5] == 1) {
                    side[5] = 2;
                    but31.setBackground(Color.BLUE);
                    Culori_cub[Parte][5] = 2;
                    culoarecasuta0 = "blue";

                } else if (side[5] == 2) {
                    side[5] = 3;
                    but31.setBackground(Color.YELLOW);
                    Culori_cub[Parte][5] = 3;
                    culoarecasuta0 = "yellow";

                } else if (side[5] == 3) {
                    side[5] = 4;
                    but31.setBackground(Color.ORANGE);
                    Culori_cub[Parte][5] = 4;
                    culoarecasuta0 = "green";

                } else if (side[5] == 4) {
                    side[5] = 5;
                    but31.setBackground(Color.RED);
                    Culori_cub[Parte][4] = 5;
                }

            }
        });
        return but31;
    }

    public JButton getBut32() {
        but32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Ai apasat butonul 8");
                if (side[6] == 5) {
                    side[6] = 0;
                    but32.setBackground(Color.GREEN);
                    Culori_cub[Parte][6] = 0;
                    culoarecasuta0 = "green";
                } else if (side[6] == 0) {
                    side[6] = 1;
                    but32.setBackground(Color.WHITE);
                    Culori_cub[Parte][6] = 1;
                    culoarecasuta0 = "white";
                } else if (side[6] == 1) {
                    side[6] = 2;
                    but32.setBackground(Color.BLUE);
                    Culori_cub[Parte][6] = 2;
                    culoarecasuta0 = "blue";

                } else if (side[6] == 2) {
                    side[6] = 3;
                    but32.setBackground(Color.YELLOW);
                    Culori_cub[Parte][6] = 3;
                    culoarecasuta0 = "yellow";

                } else if (side[6] == 3) {
                    side[6] = 4;
                    but32.setBackground(Color.ORANGE);
                    Culori_cub[Parte][5] = 4;
                    culoarecasuta0 = "green";

                } else if (side[6] == 4) {
                    side[6] = 5;
                    but32.setBackground(Color.RED);
                    Culori_cub[Parte][6] = 5;
                }

            }
        });
        return but32;
    }


    public JButton getBut33() {
        but33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Ai apasat butonul 9");
                if (side[6] == 5) {
                    side[6] = 0;
                    but33.setBackground(Color.GREEN);
                    Culori_cub[Parte][6] = 0;
                    culoarecasuta0 = "green";
                } else if (side[6] == 0) {
                    side[6] = 1;
                    but33.setBackground(Color.WHITE);
                    Culori_cub[Parte][6] = 1;
                    culoarecasuta0 = "white";
                } else if (side[6] == 1) {
                    side[6] = 2;
                    but33.setBackground(Color.BLUE);
                    Culori_cub[Parte][6] = 2;
                    culoarecasuta0 = "blue";

                } else if (side[6] == 2) {
                    side[6] = 3;
                    but33.setBackground(Color.YELLOW);
                    Culori_cub[Parte][6] = 3;
                    culoarecasuta0 = "yellow";

                } else if (side[6] == 3) {
                    side[6] = 4;
                    but33.setBackground(Color.ORANGE);
                    Culori_cub[Parte][5] = 4;
                    culoarecasuta0 = "green";

                } else if (side[6] == 4) {
                    side[6] = 5;
                    but33.setBackground(Color.RED);
                    Culori_cub[Parte][6] = 5;
                }

            }
        });
        return but33;
    }

    public JButton getNext() {
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Next");
                if (Parte == 0) {
                    pozitie.setText("Cubul este orientat cu casuta Alba in centru");
                    Parte++;
                } else if (Parte == 1) {
                    pozitie.setText("Cubul este orientat cu casuta Albastra in centru");
                    Parte++;
                } else if (Parte == 2) {
                    pozitie.setText("Cubul este orientat cu casuta Galbena in centru");
                    Parte++;
                } else if (Parte == 3) {
                    pozitie.setText("Cubul este orientat cu casuta Orange in centru");
                    Parte++;
                } else if (Parte == 4) {
                    pozitie.setText("Cubul este orientat cu casuta Rosie in centru");
                    Parte++;
                } else if (Parte == 5) {
                    Parte = 0;
                    pozitie.setText("Cubul este orientat cu casuta Verde in centru");

                }
            }

        });
        return next;


    }

    public JButton getDone() {
        done.addActionListener(new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Done");
            }
        });
        return next;

    }
}








