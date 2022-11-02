package GUI;/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

/**
 * @author unknown
 */
public class fsmdialog extends JPanel {
    public fsmdialog() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button2 = new JButton();
        panel3 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label3 = new JLabel();
        textField1 = new JTextField();
        panel4 = new JPanel();
        label5 = new JLabel();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        button17 = new JButton();
        button18 = new JButton();
        textField2 = new JTextField();
        button19 = new JButton();
        label6 = new JLabel();
        button20 = new JButton();
        textField3 = new JTextField();
        button21 = new JButton();
        label7 = new JLabel();
        button22 = new JButton();
        button23 = new JButton();
        toggleButton1 = new JToggleButton();
        label8 = new JLabel();
        scrollPane3 = new JScrollPane();
        label9 = new JLabel();
        scrollPane2 = new JScrollPane();
        label4 = new JLabel();

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

            //---- button3 ----
            button3.setText("<<<<");

            //---- button4 ----
            button4.setText(">>>>");

            //---- button5 ----
            button5.setText("save");

            //---- button6 ----
            button6.setText("load");

            //---- button7 ----
            button7.setText("START-Update");

            //---- button8 ----
            button8.setText("Pause");

            //---- button9 ----
            button9.setText("Stop");

            //---- button2 ----
            button2.setText("pulseflow45min");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button3)
                        .addGap(138, 138, 138)
                        .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button9)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button8)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button7)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button3)
                        .addComponent(button4)
                        .addComponent(button5)
                        .addComponent(button6)
                        .addComponent(button7)
                        .addComponent(button8)
                        .addComponent(button9)
                        .addComponent(button2))
            );
        }

        //======== panel3 ========
        {

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                    },
                    new String[] {
                        null, null, null, null, null, null, null, null
                    }
                ));
                table1.setCellSelectionEnabled(true);
                table1.setShowHorizontalLines(true);
                table1.setShowVerticalLines(true);
                scrollPane1.setViewportView(table1);
            }

            //---- label3 ----
            label3.setText("Name");

            //======== panel4 ========
            {

                //---- label5 ----
                label5.setText("Channels");

                //---- button10 ----
                button10.setText("A");

                //---- button11 ----
                button11.setText("B");

                //---- button12 ----
                button12.setText("C");

                //---- button13 ----
                button13.setText("D");

                //---- button14 ----
                button14.setText("E");

                //---- button15 ----
                button15.setText("F");

                //---- button16 ----
                button16.setText("G");

                //---- button17 ----
                button17.setText("H");

                //---- button18 ----
                button18.setText("-");

                //---- button19 ----
                button19.setText("+");

                //---- label6 ----
                label6.setText("Linetime");

                //---- button20 ----
                button20.setText("-");

                //---- button21 ----
                button21.setText("+");

                //---- label7 ----
                label7.setText("Intensity");

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addGroup(panel4Layout.createParallelGroup()
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(button10)
                                    .addGap(4, 4, 4)
                                    .addComponent(button11)
                                    .addGap(4, 4, 4)
                                    .addComponent(button12)
                                    .addGap(9, 9, 9)
                                    .addComponent(button13)
                                    .addGap(4, 4, 4)
                                    .addComponent(button14)
                                    .addGap(9, 9, 9)
                                    .addComponent(button15)
                                    .addGap(4, 4, 4)
                                    .addComponent(button16)
                                    .addGap(4, 4, 4)
                                    .addComponent(button17))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label5)))
                            .addGap(9, 9, 9)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(button18)
                                    .addGap(4, 4, 4)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(button19))
                                .addComponent(label6))
                            .addGap(18, 18, 18)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(label7)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(button20)
                                    .addGap(4, 4, 4)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(button21)
                                    .addGap(0, 55, Short.MAX_VALUE))))
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5)
                                .addComponent(label6)
                                .addComponent(label7))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addComponent(button10)
                                .addComponent(button11)
                                .addComponent(button12)
                                .addComponent(button13)
                                .addComponent(button14)
                                .addComponent(button15)
                                .addComponent(button16)
                                .addComponent(button17)
                                .addComponent(button18)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button19)
                                .addComponent(button20)
                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button21)))
                );
            }

            //---- button22 ----
            button22.setText("insert Line");

            //---- button23 ----
            button23.setText("delete Line");

            //---- toggleButton1 ----
            toggleButton1.setText("Automatic");

            //---- label8 ----
            label8.setText("inactive");
            label8.setBackground(new Color(0x66ff33));
            label8.setOpaque(true);
            label8.setHorizontalTextPosition(SwingConstants.CENTER);

            //======== scrollPane3 ========
            {
                scrollPane3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

                //---- label9 ----
                label9.setText("text");
                scrollPane3.setViewportView(label9);
            }

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(button22)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button23))
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textField1))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(toggleButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                        .addContainerGap())
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button22)
                            .addComponent(button23)
                            .addComponent(toggleButton1)
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
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
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(label4);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public JPanel panel1;
    public JLabel label1;
    public JPanel panel2;
    public JLabel label2;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton button6;
    public JButton button7;
    public JButton button8;
    public JButton button9;
    public JButton button2;
    public JPanel panel3;
    public JScrollPane scrollPane1;
    public JTable table1;
    public JLabel label3;
    public JTextField textField1;
    public JPanel panel4;
    public JLabel label5;
    public JButton button10;
    public JButton button11;
    public JButton button12;
    public JButton button13;
    public JButton button14;
    public JButton button15;
    public JButton button16;
    public JButton button17;
    public JButton button18;
    public JTextField textField2;
    public JButton button19;
    public JLabel label6;
    public JButton button20;
    public JTextField textField3;
    public JButton button21;
    public JLabel label7;
    public JButton button22;
    public JButton button23;
    public JToggleButton toggleButton1;
    public JLabel label8;
    public JScrollPane scrollPane3;
    public JLabel label9;
    public JScrollPane scrollPane2;
    public JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
