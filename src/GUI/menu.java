package GUI;/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

import microproware.MiCroProware;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * @author unknown
 */
public class menu extends JPanel {
public static JDialog personsdialog;
    public static JFrame frame;
    public menu() {
        initComponents();
    }

    public static void persons(ActionEvent e) {
       Persons.main(null);
        frame.dispose();
    }

    public void fsm(ActionEvent e) {
        // TODO add your code here
    }

    public void fasciaWafesingle(ActionEvent e) {
        // TODO add your code here
    }

    public void users(ActionEvent e) {
        users.main(null);
        frame.dispose();
        // TODO add your code here
    }

    public void settings(ActionEvent e) {
        // TODO add your code here
    }

    public void label2MousePressed(MouseEvent e) {
        // TODO add your code here
    }

    public void button5(ActionEvent e) {
        try {
            loginpanel.main(null);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        frame.dispose();

    }

    public static void main(String[] args) {
        frame =new JFrame("Menu");
        frame.setContentPane(new menu());
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
frame.setResizable(true);
frame.setVisible(true);
    }

    private void initComponents(){
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        helplabel = new JLabel();
        button5 = new JButton();
        panel3 = new JPanel();
        panel4 = new JPanel();
        personsButton = new JButton();
        settingsButton = new JButton();
        usersButton = new JButton();
        grossbildlabel = new JLabel();

        //======== this ========
        setBackground(new Color(0x000033));

        //======== panel1 ========
        {

            //---- label1 ----
            label1.setText("text");
            label1.setIcon(new ImageIcon(getClass().getResource("/pics/g5632.png")));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(710, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        //======== panel2 ========
        {

            //---- helplabel ----
            helplabel.setText("text");
            helplabel.setIcon(new ImageIcon(getClass().getResource("/pics/rect43.png")));
            helplabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    label2MousePressed(e);
                }
            });

            //---- button5 ----
            button5.setText("<<<<");
            button5.addActionListener(e -> button5(e));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 874, Short.MAX_VALUE)
                        .addComponent(helplabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(helplabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button5))
            );
        }

        //======== panel3 ========
        {

            //======== panel4 ========
            {

                //---- personsButton ----
                personsButton.setText("Persons");
                personsButton.addActionListener(e -> persons(e));

                //---- settingsButton ----
                settingsButton.setText("Settings");
                settingsButton.addActionListener(e -> settings(e));

                //---- usersButton ----
                usersButton.setText("Users");
                usersButton.addActionListener(e -> users(e));

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel4Layout.createParallelGroup()
                                .addComponent(personsButton, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(settingsButton, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(usersButton, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                            .addContainerGap())
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(personsButton)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                            .addComponent(usersButton)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(settingsButton)
                            .addContainerGap())
                );
            }

            //---- grossbildlabel ----
            grossbildlabel.setText("text");

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(grossbildlabel, GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(173, Short.MAX_VALUE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(grossbildlabel, GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public JPanel panel1;
    public JLabel label1;
    public JPanel panel2;
    public JLabel helplabel;
    public JButton button5;
    public JPanel panel3;
    public JPanel panel4;
    public JButton personsButton;
    public JButton settingsButton;
    public JButton usersButton;
    public JLabel grossbildlabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
