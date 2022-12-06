package GUI;/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class therapyrun extends JPanel {
    public therapyrun() {
        initComponents();
    }

    public void back(ActionEvent e) {
        // TODO add your code here
    }

    public void GetintoTherapy(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        backbutton = new JButton();
        spinner1 = new JSpinner();
        button14 = new JButton();
        label10 = new JLabel();
        toggleButton3 = new JToggleButton();
        toggleButton4 = new JToggleButton();
        spinner3 = new JSpinner();
        label11 = new JLabel();
        spinner4 = new JSpinner();
        label12 = new JLabel();
        spinner5 = new JSpinner();
        label13 = new JLabel();
        label14 = new JLabel();
        panel3 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        label3 = new JLabel();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();

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
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

            //---- label2 ----
            label2.setText("text");
            label2.setIcon(new ImageIcon(getClass().getResource("/pics/rect43.png")));

            //---- backbutton ----
            backbutton.setText("<<<<");
            backbutton.addActionListener(e -> back(e));

            //---- button14 ----
            button14.setText(">>>");
            button14.addActionListener(e -> GetintoTherapy(e));

            //---- label10 ----
            label10.setText("INTENSITY");

            //---- toggleButton3 ----
            toggleButton3.setText("1 X");

            //---- toggleButton4 ----
            toggleButton4.setText("MultiStaging");

            //---- label11 ----
            label11.setText("Staging intensity");

            //---- label12 ----
            label12.setText("Staging width");

            //---- label13 ----
            label13.setText("Fascia");

            //---- label14 ----
            label14.setText("int.");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbutton)
                        .addGap(6, 6, 6)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(label13)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(label14)))
                        .addGap(6, 6, 6)
                        .addComponent(spinner5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(label12)
                        .addGap(6, 6, 6)
                        .addComponent(spinner4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(label11)
                        .addGap(6, 6, 6)
                        .addComponent(spinner3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(toggleButton4)
                        .addGap(6, 6, 6)
                        .addComponent(toggleButton3)
                        .addGap(6, 6, 6)
                        .addComponent(label10)
                        .addGap(6, 6, 6)
                        .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(button14)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(backbutton))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(label13)
                                .addGap(11, 11, 11)
                                .addComponent(label14))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(spinner5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(label12))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(spinner4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(label11))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(spinner3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(toggleButton4))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(toggleButton3))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(label10))
                            .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(button14))))
            );
        }

        //======== panel3 ========
        {

            //---- button1 ----
            button1.setText("A");

            //---- button2 ----
            button2.setText("B");

            //---- button3 ----
            button3.setText("C");

            //---- button4 ----
            button4.setText("D");

            //---- button5 ----
            button5.setText("E");

            //---- button6 ----
            button6.setText("F");

            //---- button7 ----
            button7.setText("G");

            //---- button8 ----
            button8.setText("H");

            //---- button9 ----
            button9.setText("N");

            //---- label3 ----
            label3.setText("text");
            label3.setBackground(Color.white);
            label3.setOpaque(true);

            //---- button10 ----
            button10.setText("START");

            //---- button11 ----
            button11.setText("PAUSE");

            //---- button12 ----
            button12.setText("STOP");

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(button1)
                            .addComponent(button2)
                            .addComponent(button3)
                            .addComponent(button4)
                            .addComponent(button5)
                            .addComponent(button6)
                            .addComponent(button7)
                            .addComponent(button8)
                            .addComponent(button9)
                            .addComponent(button10)
                            .addComponent(button11)
                            .addComponent(button12))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 913, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(button1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button6)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button7)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button8)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button9)
                                .addGap(18, 18, 18)
                                .addComponent(button10)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button11)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button12))
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
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
    public JLabel label2;
    public JButton backbutton;
    public JSpinner spinner1;
    public JButton button14;
    public JLabel label10;
    public JToggleButton toggleButton3;
    public JToggleButton toggleButton4;
    public JSpinner spinner3;
    public JLabel label11;
    public JSpinner spinner4;
    public JLabel label12;
    public JSpinner spinner5;
    public JLabel label13;
    public JLabel label14;
    public JPanel panel3;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton button6;
    public JButton button7;
    public JButton button8;
    public JButton button9;
    public JLabel label3;
    public JButton button10;
    public JButton button11;
    public JButton button12;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
