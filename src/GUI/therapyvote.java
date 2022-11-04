package GUI;/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class therapyvote extends JPanel {
public static JFrame frame = new JFrame();
    public therapyvote() {
        initComponents();
    }

    public static void back(ActionEvent e) {
        // TODO add your code here
    }

    public static void forward(ActionEvent e) {
        application.main(null);
        frame.dispose();
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        backbutton = new JButton();
        panel3 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel4 = new JPanel();
        programlist = new JList();
        workmodecombobox = new JComboBox();
        kategorycombobox = new JComboBox();
        kategorylabel = new JLabel();
        workmodelabel = new JLabel();
        comboBox1 = new JComboBox();
        comboBox2 = new JComboBox();
        comboBox3 = new JComboBox();
        comboBox4 = new JComboBox();
        comboBox5 = new JComboBox();
        comboBox6 = new JComboBox();
        comboBox7 = new JComboBox();
        comboBox8 = new JComboBox();
        label3 = new JLabel();
        button1 = new JButton();
        textField1 = new JTextField();
        button2 = new JButton();
        button13 = new JButton();
        panel5 = new JPanel();
        label4 = new JLabel();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        list2 = new JList();
        list3 = new JList();
        list4 = new JList();
        list5 = new JList();
        list6 = new JList();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button14 = new JButton();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();

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

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbutton))
            );
        }

        //======== panel3 ========
        {

            //======== tabbedPane1 ========
            {

                //======== panel4 ========
                {

                    //---- kategorylabel ----
                    kategorylabel.setText("Kategory");

                    //---- workmodelabel ----
                    workmodelabel.setText("Workmode");

                    //---- label3 ----
                    label3.setText("Intensity");

                    //---- button1 ----
                    button1.setText("+10");

                    //---- textField1 ----
                    textField1.setText("100");
                    textField1.setHorizontalAlignment(SwingConstants.RIGHT);

                    //---- button2 ----
                    button2.setText("-10");

                    //---- button13 ----
                    button13.setText("Start");

                    GroupLayout panel4Layout = new GroupLayout(panel4);
                    panel4.setLayout(panel4Layout);
                    panel4Layout.setHorizontalGroup(
                        panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel4Layout.createParallelGroup()
                                    .addGroup(panel4Layout.createSequentialGroup()
                                        .addComponent(workmodelabel, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(kategorylabel, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel4Layout.createSequentialGroup()
                                        .addComponent(workmodecombobox, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(kategorycombobox, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(programlist, GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE))
                                .addGroup(panel4Layout.createParallelGroup()
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addGroup(panel4Layout.createParallelGroup()
                                            .addGroup(panel4Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                    .addComponent(comboBox2, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                    .addComponent(comboBox3, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panel4Layout.createParallelGroup()
                                                    .addComponent(comboBox6, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(comboBox5, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(comboBox4, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(comboBox7, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                .addComponent(comboBox8, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                .addComponent(label3)
                                                .addComponent(button1, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                .addComponent(button2, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button13)))
                                .addContainerGap())
                    );
                    panel4Layout.setVerticalGroup(
                        panel4Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel4Layout.createParallelGroup()
                                    .addComponent(workmodelabel)
                                    .addComponent(kategorylabel))
                                .addGap(6, 6, 6)
                                .addGroup(panel4Layout.createParallelGroup()
                                    .addComponent(workmodecombobox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(kategorycombobox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel4Layout.createParallelGroup()
                                    .addGroup(panel4Layout.createSequentialGroup()
                                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboBox6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(comboBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(comboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboBox7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(comboBox8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button1)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button2)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(button13)
                                        .addContainerGap())
                                    .addComponent(programlist, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)))
                    );
                }
                tabbedPane1.addTab("Automatic", panel4);

                //======== panel5 ========
                {

                    //---- label4 ----
                    label4.setText("Tissues");

                    //======== scrollPane1 ========
                    {
                        scrollPane1.setViewportView(list1);
                    }

                    //---- label5 ----
                    label5.setText("Channel A");

                    //---- label6 ----
                    label6.setText("Channel B");

                    //---- label7 ----
                    label7.setText("Channel C");

                    //---- label8 ----
                    label8.setText("Channel D");

                    //---- label9 ----
                    label9.setText("E-H");

                    //---- button3 ----
                    button3.setText("A+");

                    //---- button4 ----
                    button4.setText("B+");

                    //---- button5 ----
                    button5.setText("C+");

                    //---- button6 ----
                    button6.setText("D+");

                    //---- button7 ----
                    button7.setText("E-H+");

                    //---- button8 ----
                    button8.setText("A-");

                    //---- button9 ----
                    button9.setText("B-");

                    //---- button10 ----
                    button10.setText("C-");

                    //---- button11 ----
                    button11.setText("D-");

                    //---- button12 ----
                    button12.setText("E-E -");

                    //---- button14 ----
                    button14.setText("Start");

                    GroupLayout panel5Layout = new GroupLayout(panel5);
                    panel5.setLayout(panel5Layout);
                    panel5Layout.setHorizontalGroup(
                        panel5Layout.createParallelGroup()
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel5Layout.createParallelGroup()
                                    .addGroup(panel5Layout.createSequentialGroup()
                                        .addGroup(panel5Layout.createParallelGroup()
                                            .addComponent(label4)
                                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
                                        .addGap(7, 7, 7)
                                        .addGroup(panel5Layout.createParallelGroup()
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(list2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18))
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(label5)
                                                .addGap(105, 105, 105)))
                                        .addGroup(panel5Layout.createParallelGroup()
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(list3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18))
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(label6)
                                                .addGap(106, 106, 106)))
                                        .addGroup(panel5Layout.createParallelGroup()
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(list4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18))
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(label7)
                                                .addGap(105, 105, 105)))
                                        .addGroup(panel5Layout.createParallelGroup()
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(list5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18))
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(label8)
                                                .addGap(105, 105, 105)))
                                        .addGroup(panel5Layout.createParallelGroup()
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(label9)
                                                .addGap(0, 126, Short.MAX_VALUE))
                                            .addComponent(list6, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                                    .addGroup(panel5Layout.createSequentialGroup()
                                        .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(button7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel5Layout.createParallelGroup()
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(button8, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button9, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button10, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button11, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button12, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                                                .addGap(0, 750, Short.MAX_VALUE)
                                                .addComponent(button14)))))
                                .addContainerGap())
                    );
                    panel5Layout.setVerticalGroup(
                        panel5Layout.createParallelGroup()
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(label5)
                                    .addComponent(label6)
                                    .addComponent(label7)
                                    .addComponent(label8)
                                    .addComponent(label9))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(list6, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                    .addComponent(list5, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                    .addComponent(list4, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                    .addComponent(list3, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                    .addComponent(list2, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button3)
                                    .addComponent(button4)
                                    .addComponent(button8)
                                    .addComponent(button9)
                                    .addComponent(button10)
                                    .addComponent(button11)
                                    .addComponent(button12))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button5)
                                    .addComponent(button6))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button7)
                                    .addComponent(button14))
                                .addContainerGap(8, Short.MAX_VALUE))
                    );
                }
                tabbedPane1.addTab("TissueSelect", panel5);

                //======== panel6 ========
                {

                    GroupLayout panel6Layout = new GroupLayout(panel6);
                    panel6.setLayout(panel6Layout);
                    panel6Layout.setHorizontalGroup(
                        panel6Layout.createParallelGroup()
                            .addGap(0, 996, Short.MAX_VALUE)
                    );
                    panel6Layout.setVerticalGroup(
                        panel6Layout.createParallelGroup()
                            .addGap(0, 475, Short.MAX_VALUE)
                    );
                }
                tabbedPane1.addTab("FSM", panel6);

                //======== panel7 ========
                {

                    GroupLayout panel7Layout = new GroupLayout(panel7);
                    panel7.setLayout(panel7Layout);
                    panel7Layout.setHorizontalGroup(
                        panel7Layout.createParallelGroup()
                            .addGap(0, 996, Short.MAX_VALUE)
                    );
                    panel7Layout.setVerticalGroup(
                        panel7Layout.createParallelGroup()
                            .addGap(0, 475, Short.MAX_VALUE)
                    );
                }
                tabbedPane1.addTab("FasciaWave", panel7);

                //======== panel8 ========
                {

                    GroupLayout panel8Layout = new GroupLayout(panel8);
                    panel8.setLayout(panel8Layout);
                    panel8Layout.setHorizontalGroup(
                        panel8Layout.createParallelGroup()
                            .addGap(0, 996, Short.MAX_VALUE)
                    );
                    panel8Layout.setVerticalGroup(
                        panel8Layout.createParallelGroup()
                            .addGap(0, 475, Short.MAX_VALUE)
                    );
                }
                tabbedPane1.addTab("Fix", panel8);
            }

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabbedPane1)
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

    public static void main(String[] args) {
frame.add(new therapyvote());
frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
frame.pack();
frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
frame.setVisible(true);



    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public JPanel panel1;
    public JLabel label1;
    public JPanel panel2;
    public JLabel label2;
    public JButton backbutton;
    public JPanel panel3;
    public JTabbedPane tabbedPane1;
    public JPanel panel4;
    public JList programlist;
    public JComboBox workmodecombobox;
    public JComboBox kategorycombobox;
    public JLabel kategorylabel;
    public JLabel workmodelabel;
    public JComboBox comboBox1;
    public JComboBox comboBox2;
    public JComboBox comboBox3;
    public JComboBox comboBox4;
    public JComboBox comboBox5;
    public JComboBox comboBox6;
    public JComboBox comboBox7;
    public JComboBox comboBox8;
    public JLabel label3;
    public JButton button1;
    public JTextField textField1;
    public JButton button2;
    public JButton button13;
    public JPanel panel5;
    public JLabel label4;
    public JScrollPane scrollPane1;
    public JList list1;
    public JList list2;
    public JList list3;
    public JList list4;
    public JList list5;
    public JList list6;
    public JLabel label5;
    public JLabel label6;
    public JLabel label7;
    public JLabel label8;
    public JLabel label9;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton button6;
    public JButton button7;
    public JButton button8;
    public JButton button9;
    public JButton button10;
    public JButton button11;
    public JButton button12;
    public JButton button14;
    public JPanel panel6;
    public JPanel panel7;
    public JPanel panel8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
