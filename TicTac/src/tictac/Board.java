/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictac;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author faridz
 */
public class Board extends javax.swing.JFrame {

    private String startGame = "x";
    int min = 0;
    int max = 8;
    int count = 0;
    private int pscore=0;
    private int cscore=0;
    
    private void clear()
    {
        txbtn1.setText(null);
        txbtn2.setText(null);
        txbtn3.setText(null);
        
        txbtn4.setText(null);
        txbtn5.setText(null);
        txbtn6.setText(null);
        
        txbtn7.setText(null);
        txbtn8.setText(null);
        txbtn9.setText(null);
        count=0;
    }
    private void choose() {
        String side = sidebox.getSelectedItem().toString();
        
        if(side == "x"){            
        startGame = "x";
        }
        else if (side == "o"){
        startGame ="o";
        }
    }
    
    private void score1()
    {
        String side = sidebox.getSelectedItem().toString();
        if(side=="x"){
            pscore++;
        }
        else if(side=="o"){
            cscore++;
        }
    }
    
    private void score2()
    {
        String side = sidebox.getSelectedItem().toString();
        if(side=="x"){
            cscore++;
        }
        else if(side=="o"){
            pscore++;
        }
    }
    
    private void gameScore()
    {
        String side = sidebox.getSelectedItem().toString();
        
        if (side=="x"){
        int player = pscore;
        int comp = cscore;
        playerx.setText(String.valueOf(player));
        playero.setText(String.valueOf(comp)); 
        }
        else if(side=="o"){
        int player = pscore;
        int comp = cscore;
        playerx.setText(String.valueOf(player));
        playero.setText(String.valueOf(comp)); 
        }
    }
    private void win() {
        String side = sidebox.getSelectedItem().toString();
        String b1 = txbtn1.getText();
        String b2 = txbtn2.getText();
        String b3 = txbtn3.getText();

        String b4 = txbtn4.getText();
        String b5 = txbtn5.getText();
        String b6 = txbtn6.getText();

        String b7 = txbtn7.getText();
        String b8 = txbtn8.getText();
        String b9 = txbtn9.getText();
        
        // PLAYER X CODING
        if (b1 == ("x") && b2 == ("x") && b3 == ("x")) {
            live();
            txbtn1.setBackground(Color.ORANGE);
            txbtn2.setBackground(Color.ORANGE);
            txbtn3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score1();
            gameScore();
        clear();
        txbtn1.setBackground(Color.LIGHT_GRAY);
        txbtn2.setBackground(Color.LIGHT_GRAY);
        txbtn3.setBackground(Color.LIGHT_GRAY);
        }
        if (b4 == ("x") && b5 == ("x") && b6 == ("x")) {
            live();
            txbtn4.setBackground(Color.PINK);
            txbtn5.setBackground(Color.PINK);
            txbtn6.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score1();
            gameScore();
        clear();
        txbtn4.setBackground(Color.LIGHT_GRAY);
        txbtn5.setBackground(Color.LIGHT_GRAY);
        txbtn6.setBackground(Color.LIGHT_GRAY);
        }

        if (b7 == ("x") && b8 == ("x") && b9 == ("x")) {
            live();
            txbtn7.setBackground(Color.YELLOW);
            txbtn8.setBackground(Color.YELLOW);
            txbtn9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score1();
            gameScore();
        clear();
        txbtn7.setBackground(Color.LIGHT_GRAY);
        txbtn8.setBackground(Color.LIGHT_GRAY);
        txbtn9.setBackground(Color.LIGHT_GRAY);
        }

        if (b1 == ("x") && b4 == ("x") && b7 == ("x")) {
            live();;
            txbtn1.setBackground(Color.ORANGE);
            txbtn4.setBackground(Color.ORANGE);
            txbtn7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score1();;
            gameScore();
        clear();
        txbtn1.setBackground(Color.LIGHT_GRAY);
        txbtn4.setBackground(Color.LIGHT_GRAY);
        txbtn7.setBackground(Color.LIGHT_GRAY);
        }

        if (b2 == ("x") && b5 == ("x") && b8 == ("x")) {
            live();
            txbtn2.setBackground(Color.PINK);
            txbtn5.setBackground(Color.PINK);
            txbtn8.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score1();
            gameScore();
        clear();
        txbtn2.setBackground(Color.LIGHT_GRAY);
        txbtn5.setBackground(Color.LIGHT_GRAY);
        txbtn8.setBackground(Color.LIGHT_GRAY);
        }
        if (b3 == ("x") && b6 == ("x") && b9 == ("x")) {
            live();
            txbtn3.setBackground(Color.YELLOW);
            txbtn6.setBackground(Color.YELLOW);
            txbtn9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score1();
            gameScore();
        clear();
        txbtn3.setBackground(Color.LIGHT_GRAY);
        txbtn6.setBackground(Color.LIGHT_GRAY);
        txbtn9.setBackground(Color.LIGHT_GRAY);
        }

        if (b1 == ("x") && b5 == ("x") && b9 == ("x")) {
            live();
            txbtn1.setBackground(Color.ORANGE);
            txbtn5.setBackground(Color.ORANGE);
            txbtn9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score1();
            gameScore();
        clear();
        txbtn1.setBackground(Color.LIGHT_GRAY);
        txbtn5.setBackground(Color.LIGHT_GRAY);
        txbtn9.setBackground(Color.LIGHT_GRAY);
        }

        if (b3 == ("x") && b5 == ("x") && b7 == ("x")) {
            live();
            txbtn3.setBackground(Color.PINK);
            txbtn5.setBackground(Color.PINK);
            txbtn7.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score1();
            gameScore();
        clear();
        txbtn3.setBackground(Color.LIGHT_GRAY);
        txbtn5.setBackground(Color.LIGHT_GRAY);
        txbtn7.setBackground(Color.LIGHT_GRAY);
        }

        // PLAYER o CODING
        if (b1 == ("o") && b2 == ("o") && b3 == ("o")) {
            live();
            txbtn1.setBackground(Color.ORANGE);
            txbtn2.setBackground(Color.ORANGE);
            txbtn3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score2();
            gameScore();
        clear();
        txbtn1.setBackground(Color.LIGHT_GRAY);
        txbtn2.setBackground(Color.LIGHT_GRAY);
        txbtn3.setBackground(Color.LIGHT_GRAY);
        }
        if (b4 == ("o") && b5 == ("o") && b6 == ("o")) {
            live();
            txbtn4.setBackground(Color.PINK);
            txbtn5.setBackground(Color.PINK);
            txbtn6.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score2();
            gameScore();
        clear();
        txbtn4.setBackground(Color.LIGHT_GRAY);
        txbtn5.setBackground(Color.LIGHT_GRAY);
        txbtn6.setBackground(Color.LIGHT_GRAY);
        }

        if (b7 == ("o") && b8 == ("o") && b9 == ("o")) {
            live();
            txbtn7.setBackground(Color.YELLOW);
            txbtn8.setBackground(Color.YELLOW);
            txbtn9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Player o wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score2();
            gameScore();
        clear();
        txbtn7.setBackground(Color.LIGHT_GRAY);
        txbtn8.setBackground(Color.LIGHT_GRAY);
        txbtn9.setBackground(Color.LIGHT_GRAY);
        }

        if (b1 == ("o") && b4 == ("o") && b7 == ("o")) {
            live();            
            txbtn1.setBackground(Color.ORANGE);
            txbtn4.setBackground(Color.ORANGE);
            txbtn7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player o wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score2();
            gameScore();
        clear();
        txbtn1.setBackground(Color.LIGHT_GRAY);
        txbtn4.setBackground(Color.LIGHT_GRAY);
        txbtn7.setBackground(Color.LIGHT_GRAY);
        }

        if (b2 == ("o") && b5 == ("o") && b8 == ("o")) {
            live();
            txbtn2.setBackground(Color.PINK);
            txbtn5.setBackground(Color.PINK);
            txbtn8.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player o wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score2();
            gameScore();
        clear();
        txbtn2.setBackground(Color.LIGHT_GRAY);
        txbtn5.setBackground(Color.LIGHT_GRAY);
        txbtn8.setBackground(Color.LIGHT_GRAY);
        }
        if (b3 == ("o") && b6 == ("o") && b9 == ("o")) {
            live();
            txbtn3.setBackground(Color.YELLOW);
            txbtn6.setBackground(Color.YELLOW);
            txbtn9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Player o wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score2();
            gameScore();
        clear();
        txbtn3.setBackground(Color.LIGHT_GRAY);
        txbtn6.setBackground(Color.LIGHT_GRAY);
        txbtn9.setBackground(Color.LIGHT_GRAY);
        }

        if (b1 == ("o") && b5 == ("o") && b9 == ("o")) {
            live();
            txbtn1.setBackground(Color.ORANGE);
            txbtn5.setBackground(Color.ORANGE);
            txbtn9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player o wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score2();
            gameScore();
        clear();
        txbtn1.setBackground(Color.LIGHT_GRAY);
        txbtn5.setBackground(Color.LIGHT_GRAY);
        txbtn9.setBackground(Color.LIGHT_GRAY);
        }

        if (b3 == ("o") && b5 == ("o") && b7 == ("o")) {
            live();
            txbtn3.setBackground(Color.PINK);
            txbtn5.setBackground(Color.PINK);
            txbtn7.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player o wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score2();
            gameScore();
        clear();
        txbtn3.setBackground(Color.LIGHT_GRAY);
        txbtn5.setBackground(Color.LIGHT_GRAY);
        txbtn7.setBackground(Color.LIGHT_GRAY);
        }

        if (count >= 9) {
        JOptionPane.showMessageDialog(this, "Game Tie", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        clear();
        live();
        }
    }

    /**
     * Creates new form Board
     */
    private void rng() {
        String side = sidebox.getSelectedItem().toString();
        String b1 = txbtn1.getText();
        String b2 = txbtn2.getText();
        String b3 = txbtn3.getText();

        String b4 = txbtn4.getText();
        String b5 = txbtn5.getText();
        String b6 = txbtn6.getText();

        String b7 = txbtn7.getText();
        String b8 = txbtn8.getText();
        String b9 = txbtn9.getText();
        win();
        int random_int = (int) Math.floor(Math.random() * (max + min + 1) + min);
        if (random_int <= 2) {

            if (random_int == 0) {
                if (b1 == ("x") || b1 == ("o")) {
                    rng();

                } else {
                    if(side == "x"){            
                    txbtn1.setText("o");
                    txbtn1.setForeground(Color.BLUE);
                    count++;
                    txbtn1.setEnabled(false);
                    win(); 
                    }
                    else if (side == "o"){
                    txbtn1.setText("x");
                    txbtn1.setForeground(Color.BLUE);
                    count++;
                    txbtn1.setEnabled(false);
                    win();
                    }                                      
                }

            } else if (random_int == 1) {
                if (b2 == ("x") || b2 == ("o")) {
                    rng();

                } else {
                    if(side == "x"){            
                    txbtn2.setText("o");
                    txbtn2.setForeground(Color.BLUE);
                    count++;
                    txbtn2.setEnabled(false);
                    win(); 
                    }
                    else if (side == "o"){
                    txbtn2.setText("x");
                    txbtn2.setForeground(Color.BLUE);
                    count++;
                    txbtn2.setEnabled(false);
                    win();
                    }                   
                }
            } else {
                if (b3 == ("x") || b3 == ("o")) {
                    rng();

                } else {
                    if(side == "x"){            
                    txbtn3.setText("o");
                    txbtn3.setForeground(Color.BLUE);
                    count++;
                    txbtn3.setEnabled(false);
                    win(); 
                    }
                    else if (side == "o"){
                    txbtn3.setText("x");
                    txbtn3.setForeground(Color.BLUE);
                    count++;
                    txbtn3.setEnabled(false);
                    win();
                    }
                }
            }

        } else if (random_int >= 3 && random_int <= 5) {
            if (random_int == 3) {
                if (b4 == ("x") || b4 == ("o")) {
                    rng();

                } else {
                    if(side == "x"){            
                    txbtn4.setText("o");
                    txbtn4.setForeground(Color.BLUE);
                    count++;
                    txbtn4.setEnabled(false);
                    win(); 
                    }
                    else if (side == "o"){
                    txbtn4.setText("x");
                    txbtn4.setForeground(Color.BLUE);
                    count++;
                    txbtn4.setEnabled(false);
                    win();
                    }
                }
            } else if (random_int == 4) {
                if (b5 == ("x") || b5 == ("o")) {
                    rng();

                } else {
                    if(side == "x"){            
                    txbtn5.setText("o");
                    txbtn5.setForeground(Color.BLUE);
                    count++;
                    txbtn5.setEnabled(false);
                    win(); 
                    }
                    else if (side == "o"){
                    txbtn5.setText("x");
                    txbtn5.setForeground(Color.BLUE);
                    count++;
                    txbtn5.setEnabled(false);
                    win();
                    }
                }
            } else {
                if (b6 == ("x") || b6 == ("o")) {
                    rng();

                } else {
                    if(side == "x"){            
                    txbtn6.setText("o");
                    txbtn6.setForeground(Color.BLUE);
                    count++;
                    txbtn6.setEnabled(false);
                    win(); 
                    }
                    else if (side == "o"){
                    txbtn6.setText("x");
                    txbtn6.setForeground(Color.BLUE);
                    count++;
                    txbtn6.setEnabled(false);
                    win();
                    }
                }
            }
        } else {
            if (random_int == 6) {
                if (b7 == ("x") || b7 == ("o")) {
                    rng();

                } else {
                    if(side == "x"){            
                    txbtn7.setText("o");
                    txbtn7.setForeground(Color.BLUE);
                    count++;
                    txbtn7.setEnabled(false);
                    win(); 
                    }
                    else if (side == "o"){
                    txbtn7.setText("x");
                    txbtn7.setForeground(Color.BLUE);
                    count++;
                    txbtn7.setEnabled(false);
                    win();
                    }
                }
            } else if (random_int == 7) {
                if (b8 == ("x") || b8 == ("o")) {
                    rng();

                } else {
                    if(side == "x"){            
                    txbtn8.setText("o");
                    txbtn8.setForeground(Color.BLUE);
                    count++;
                    txbtn8.setEnabled(false);
                    win(); 
                    }
                    else if (side == "o"){
                    txbtn8.setText("x");
                    txbtn8.setForeground(Color.BLUE);
                    count++;
                    txbtn8.setEnabled(false);
                    win();
                    }
                }
            } else if (random_int == 8){
                if (b9 == ("x") || b9 == ("o")) {
                    rng();

                } else {
                    if(side == "x"){            
                    txbtn9.setText("o");
                    txbtn9.setForeground(Color.BLUE);
                    count++;
                    txbtn9.setEnabled(false);
                    win(); 
                    }
                    else if (side == "o"){
                    txbtn9.setText("x");
                    txbtn9.setForeground(Color.BLUE);
                    count++;
                    txbtn9.setEnabled(false);
                    win();
                    }
                }
            }
              else
            {
                rng();
                win();
            }
        }

    }
    
    private void live()
    {
        txbtn1.setEnabled(true);
        txbtn2.setEnabled(true);
        txbtn3.setEnabled(true);
        
        txbtn4.setEnabled(true);
        txbtn5.setEnabled(true);
        txbtn6.setEnabled(true);
        
        txbtn7.setEnabled(true);
        txbtn8.setEnabled(true);
        txbtn9.setEnabled(true);
    }
    
    public Board() {
        initComponents();
        jLabel2.setEnabled(false);
        jLabel3.setEnabled(false);
        jLabel4.setEnabled(false);
        plyrbtn.setEnabled(false);
        compbtn.setEnabled(false);
        clearbtn.setEnabled(false)
                ;
        txbtn1.setEnabled(false);
        txbtn2.setEnabled(false);
        txbtn3.setEnabled(false);

        txbtn4.setEnabled(false);
        txbtn5.setEnabled(false);
        txbtn6.setEnabled(false);

        txbtn7.setEnabled(false);
        txbtn8.setEnabled(false);
        txbtn9.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txbtn1 = new javax.swing.JButton();
        txbtn2 = new javax.swing.JButton();
        txbtn3 = new javax.swing.JButton();
        txbtn4 = new javax.swing.JButton();
        txbtn5 = new javax.swing.JButton();
        txbtn6 = new javax.swing.JButton();
        txbtn7 = new javax.swing.JButton();
        txbtn8 = new javax.swing.JButton();
        txbtn9 = new javax.swing.JButton();
        compbtn = new javax.swing.JButton();
        plyrbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playerx = new javax.swing.JTextField();
        playero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clearbtn = new javax.swing.JButton();
        sidebox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jButton6.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(172, 138, 0), 7, true));
        jPanel1.setForeground(new java.awt.Color(91, 71, 8));

        txbtn1.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        txbtn1.setForeground(new java.awt.Color(0, 153, 153));
        txbtn1.setBorder(null);
        txbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbtn1ActionPerformed(evt);
            }
        });

        txbtn2.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        txbtn2.setForeground(new java.awt.Color(0, 153, 153));
        txbtn2.setBorder(null);
        txbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbtn2ActionPerformed(evt);
            }
        });

        txbtn3.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        txbtn3.setForeground(new java.awt.Color(0, 153, 153));
        txbtn3.setBorder(null);
        txbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbtn3ActionPerformed(evt);
            }
        });

        txbtn4.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        txbtn4.setForeground(new java.awt.Color(0, 153, 153));
        txbtn4.setBorder(null);
        txbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbtn4ActionPerformed(evt);
            }
        });

        txbtn5.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        txbtn5.setForeground(new java.awt.Color(0, 153, 153));
        txbtn5.setBorder(null);
        txbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbtn5ActionPerformed(evt);
            }
        });

        txbtn6.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        txbtn6.setForeground(new java.awt.Color(0, 153, 153));
        txbtn6.setBorder(null);
        txbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbtn6ActionPerformed(evt);
            }
        });

        txbtn7.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        txbtn7.setForeground(new java.awt.Color(0, 153, 153));
        txbtn7.setBorder(null);
        txbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbtn7ActionPerformed(evt);
            }
        });

        txbtn8.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        txbtn8.setForeground(new java.awt.Color(0, 153, 153));
        txbtn8.setBorder(null);
        txbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbtn8ActionPerformed(evt);
            }
        });

        txbtn9.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        txbtn9.setForeground(new java.awt.Color(0, 153, 153));
        txbtn9.setBorder(null);
        txbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbtn9ActionPerformed(evt);
            }
        });

        compbtn.setBackground(new java.awt.Color(153, 153, 255));
        compbtn.setFont(new java.awt.Font("STXihei", 0, 12)); // NOI18N
        compbtn.setText("Computer");
        compbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compbtnActionPerformed(evt);
            }
        });

        plyrbtn.setBackground(new java.awt.Color(204, 255, 204));
        plyrbtn.setFont(new java.awt.Font("STXihei", 0, 12)); // NOI18N
        plyrbtn.setText("Player");
        plyrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plyrbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel2.setText("Score player");

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel3.setText("Score computer ");

        playerx.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        playerx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerx.setText("0");
        playerx.setEnabled(false);

        playero.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        playero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playero.setText("0");
        playero.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Juice ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Choose who play first");

        clearbtn.setBackground(new java.awt.Color(255, 102, 102));
        clearbtn.setFont(new java.awt.Font("STXihei", 0, 12)); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        sidebox.setEditable(true);
        sidebox.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        sidebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x", "o" }));
        sidebox.setBorder(null);
        sidebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideboxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Choose your side");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(compbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(plyrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sidebox, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sidebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compbtn)
                            .addComponent(plyrbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        clear();
        clearbtn.setEnabled(false);
        jLabel5.setEnabled(true);
        sidebox.setEnabled(true);
        jLabel2.setEnabled(false);
        jLabel3.setEnabled(false);
        
        txbtn1.setEnabled(false);
        txbtn2.setEnabled(false);
        txbtn3.setEnabled(false);

        txbtn4.setEnabled(false);
        txbtn5.setEnabled(false);
        txbtn6.setEnabled(false);

        txbtn7.setEnabled(false);
        txbtn8.setEnabled(false);
        txbtn9.setEnabled(false);
    }//GEN-LAST:event_clearbtnActionPerformed

    private void plyrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plyrbtnActionPerformed
        // TODO add your handling code here:
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        plyrbtn.setEnabled(false);
        compbtn.setEnabled(false);
        clearbtn.setEnabled(true);

        txbtn1.setEnabled(true);
        txbtn2.setEnabled(true);
        txbtn3.setEnabled(true);

        txbtn4.setEnabled(true);
        txbtn5.setEnabled(true);
        txbtn6.setEnabled(true);

        txbtn7.setEnabled(true);
        txbtn8.setEnabled(true);
        txbtn9.setEnabled(true);
    }//GEN-LAST:event_plyrbtnActionPerformed

    private void compbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compbtnActionPerformed
        // TODO add your handling code here:
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        plyrbtn.setEnabled(false);
        compbtn.setEnabled(false);
        clearbtn.setEnabled(true);

        txbtn1.setEnabled(true);
        txbtn2.setEnabled(true);
        txbtn3.setEnabled(true);

        txbtn4.setEnabled(true);
        txbtn5.setEnabled(true);
        txbtn6.setEnabled(true);

        txbtn7.setEnabled(true);
        txbtn8.setEnabled(true);
        txbtn9.setEnabled(true);
        rng();
    }//GEN-LAST:event_compbtnActionPerformed

    private void txbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbtn9ActionPerformed
        // TODO add your handling code here:
        choose();
        txbtn9.setText(startGame);
        txbtn9.setForeground(Color.RED);       
        count++;
        txbtn9.setEnabled(false);
        rng();
    }//GEN-LAST:event_txbtn9ActionPerformed

    private void txbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbtn8ActionPerformed
        // TODO add your handling code here:
        choose();
        txbtn8.setText(startGame);
        txbtn8.setForeground(Color.RED);
        count++;
        txbtn8.setEnabled(false);
        rng();
    }//GEN-LAST:event_txbtn8ActionPerformed

    private void txbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbtn7ActionPerformed
        // TODO add your handling code here:
        choose();
        txbtn7.setText(startGame);
        txbtn7.setForeground(Color.RED);
        count++;
        txbtn7.setEnabled(false);
        rng();
    }//GEN-LAST:event_txbtn7ActionPerformed

    private void txbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbtn6ActionPerformed
        // TODO add your handling code here:
        choose();
        txbtn6.setText(startGame);
        txbtn6.setForeground(Color.RED);
        count++;
        txbtn6.setEnabled(false);
        rng();
    }//GEN-LAST:event_txbtn6ActionPerformed

    private void txbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbtn5ActionPerformed
        // TODO add your handling code here:
        choose();
        txbtn5.setText(startGame);
        txbtn5.setForeground(Color.RED);
        count++;
        txbtn5.setEnabled(false);
        rng();
    }//GEN-LAST:event_txbtn5ActionPerformed

    private void txbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbtn4ActionPerformed
        // TODO add your handling code here:
        choose();
        txbtn4.setText(startGame);
        txbtn4.setForeground(Color.RED);
        count++;
        txbtn4.setEnabled(false);
        rng();
    }//GEN-LAST:event_txbtn4ActionPerformed

    private void txbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbtn3ActionPerformed
        // TODO add your handling code here:
        choose();
        txbtn3.setText(startGame);
        txbtn3.setForeground(Color.RED);
        count++;
        txbtn3.setEnabled(false);
        rng();
    }//GEN-LAST:event_txbtn3ActionPerformed

    private void txbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbtn2ActionPerformed
        // TODO add your handling code here:
        choose();
        txbtn2.setText(startGame);
        txbtn2.setForeground(Color.RED);
        count++;
        txbtn2.setEnabled(false);
        rng();        
    }//GEN-LAST:event_txbtn2ActionPerformed

    private void txbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbtn1ActionPerformed
        // TODO add your handling code here:
        choose();
        txbtn1.setText(startGame);
        txbtn1.setForeground(Color.RED);
        count++;
        txbtn1.setEnabled(false);
        rng();
    }//GEN-LAST:event_txbtn1ActionPerformed

    private void sideboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideboxActionPerformed
        // TODO add your handling code here:
        plyrbtn.setEnabled(true);
        compbtn.setEnabled(true);
        jLabel5.setEnabled(false);
        sidebox.setEnabled(false);
    }//GEN-LAST:event_sideboxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton compbtn;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField playero;
    private javax.swing.JTextField playerx;
    private javax.swing.JButton plyrbtn;
    private javax.swing.JComboBox<String> sidebox;
    private javax.swing.JButton txbtn1;
    private javax.swing.JButton txbtn2;
    private javax.swing.JButton txbtn3;
    private javax.swing.JButton txbtn4;
    private javax.swing.JButton txbtn5;
    private javax.swing.JButton txbtn6;
    private javax.swing.JButton txbtn7;
    private javax.swing.JButton txbtn8;
    private javax.swing.JButton txbtn9;
    // End of variables declaration//GEN-END:variables
}
