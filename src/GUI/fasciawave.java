package GUI;/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class fasciawave extends JPanel {
    public fasciawave() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        button17 = new JButton();
        panel3 = new JPanel();
        label4 = new JLabel();
        panel4 = new JPanel();
        label3 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        label5 = new JLabel();
        textField2 = new JTextField();
        button3 = new JButton();
        button4 = new JButton();
        label6 = new JLabel();
        textField3 = new JTextField();
        button5 = new JButton();
        button6 = new JButton();
        label7 = new JLabel();
        textField4 = new JTextField();
        button7 = new JButton();
        button8 = new JButton();
        toggleButton1 = new JToggleButton();
        button10 = new JButton();
        button13 = new JButton();
        label9 = new JLabel();
        textField5 = new JTextField();
        button18 = new JButton();
        button19 = new JButton();
        button20 = new JButton();
        toggleButton2 = new JToggleButton();
        comboBox1 = new JComboBox();
        panel5 = new JPanel();
        scrollPane1 = new JScrollPane();
        label8 = new JLabel();

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

            //---- label2 ----
            label2.setText("text");
            label2.setIcon(new ImageIcon(getClass().getResource("/pics/rect43.png")));

            //---- button14 ----
            button14.setText("Start");

            //---- button15 ----
            button15.setText("Pause");

            //---- button16 ----
            button16.setText("Stop");

            //---- button17 ----
            button17.setText("<<<<");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button17)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 640, Short.MAX_VALUE)
                        .addComponent(button16)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button15)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button14)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button14)
                        .addComponent(button15)
                        .addComponent(button16)
                        .addComponent(button17))
            );
        }

        //======== panel3 ========
        {

            //======== panel4 ========
            {

                //---- label3 ----
                label3.setText("Frequency");

                //---- button1 ----
                button1.setText("-");

                //---- button2 ----
                button2.setText("+");

                //---- label5 ----
                label5.setText("Intensity");

                //---- button3 ----
                button3.setText("-");

                //---- button4 ----
                button4.setText("+");

                //---- label6 ----
                label6.setText("Duration");

                //---- button5 ----
                button5.setText("-");

                //---- button6 ----
                button6.setText("+");

                //---- label7 ----
                label7.setText("pendlefreq. +");

                //---- button7 ----
                button7.setText("-");

                //---- button8 ----
                button8.setText("+");

                //---- toggleButton1 ----
                toggleButton1.setText("Pendlemode");

                //---- button10 ----
                button10.setText("X");

                //---- button13 ----
                button13.setText("X");

                //---- label9 ----
                label9.setText("pendletime s");

                //---- button18 ----
                button18.setText("-");

                //---- button19 ----
                button19.setText("X");

                //---- button20 ----
                button20.setText("+");

                //---- toggleButton2 ----
                toggleButton2.setText("Sweep");

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(button1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button10)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button2))
                                .addGroup(panel4Layout.createParallelGroup()
                                    .addComponent(label3)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
                            .addGap(24, 24, 24)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addComponent(label5)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(button3)
                                    .addGap(43, 43, 43)
                                    .addComponent(button4)))
                            .addGap(18, 18, 18)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addComponent(label6)
                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(button5)
                                    .addGap(43, 43, 43)
                                    .addComponent(button6)))
                            .addGap(18, 18, 18)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addComponent(label7)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(toggleButton1))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(button7)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button13)
                                    .addGap(9, 9, 9)
                                    .addComponent(button8)))
                            .addGap(18, 18, 18)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addComponent(label9)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(toggleButton2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(button18)
                                    .addGap(8, 8, 8)
                                    .addComponent(button19)
                                    .addGap(13, 13, 13)
                                    .addComponent(button20)))
                            .addContainerGap(28, Short.MAX_VALUE))
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(label7)
                                    .addGap(12, 12, 12)
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(toggleButton1))
                                    .addGap(6, 6, 6)
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addComponent(button7)
                                        .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(button8)
                                            .addComponent(button13))))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button1)
                                        .addComponent(button2)
                                        .addComponent(button10)))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addGap(12, 12, 12)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addComponent(button3)
                                        .addComponent(button4)))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(label6)
                                    .addGap(12, 12, 12)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addComponent(button5)
                                        .addComponent(button6)))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(label9)
                                    .addGap(9, 9, 9)
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(toggleButton2)
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(8, 8, 8)
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addComponent(button18)
                                        .addComponent(button19)
                                        .addComponent(button20))))
                            .addContainerGap(23, Short.MAX_VALUE))
                );
            }

            //======== panel5 ========
            {

                //======== scrollPane1 ========
                {

                    //---- label8 ----
                    label8.setText("text");
                    scrollPane1.setViewportView(label8);
                }

                GroupLayout panel5Layout = new GroupLayout(panel5);
                panel5.setLayout(panel5Layout);
                panel5Layout.setHorizontalGroup(
                    panel5Layout.createParallelGroup()
                        .addGroup(panel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
                            .addContainerGap())
                );
                panel5Layout.setVerticalGroup(
                    panel5Layout.createParallelGroup()
                        .addGroup(panel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addContainerGap())
                );
            }

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(985, 985, 985)
                                .addComponent(label4)
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(label4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
    public JLabel label2;
    public JButton button14;
    public JButton button15;
    public JButton button16;
    public JButton button17;
    public JPanel panel3;
    public JLabel label4;
    public JPanel panel4;
    public JLabel label3;
    public JTextField textField1;
    public JButton button1;
    public JButton button2;
    public JLabel label5;
    public JTextField textField2;
    public JButton button3;
    public JButton button4;
    public JLabel label6;
    public JTextField textField3;
    public JButton button5;
    public JButton button6;
    public JLabel label7;
    public JTextField textField4;
    public JButton button7;
    public JButton button8;
    public JToggleButton toggleButton1;
    public JButton button10;
    public JButton button13;
    public JLabel label9;
    public JTextField textField5;
    public JButton button18;
    public JButton button19;
    public JButton button20;
    public JToggleButton toggleButton2;
    public JComboBox comboBox1;
    public JPanel panel5;
    public JScrollPane scrollPane1;
    public JLabel label8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
