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
        spinner1 = new JSpinner();
        button14 = new JButton();
        label10 = new JLabel();
        panel3 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel4 = new JPanel();
        programlist = new JList();
        workmodecombobox = new JComboBox();
        kategorycombobox = new JComboBox();
        kategorylabel = new JLabel();
        workmodelabel = new JLabel();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        comboBox3 = new JComboBox<>();
        comboBox4 = new JComboBox<>();
        comboBox5 = new JComboBox<>();
        comboBox6 = new JComboBox<>();
        comboBox7 = new JComboBox<>();
        comboBox8 = new JComboBox<>();
        panel5 = new JPanel();
        panel9 = new JPanel();
        button7 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        label4 = new JLabel();
        panel10 = new JPanel();
        list2 = new JList();
        label5 = new JLabel();
        button8 = new JButton();
        comboBox9 = new JComboBox<>();
        comboBox13 = new JComboBox<>();
        panel11 = new JPanel();
        label6 = new JLabel();
        list3 = new JList();
        button9 = new JButton();
        comboBox10 = new JComboBox<>();
        comboBox14 = new JComboBox<>();
        panel12 = new JPanel();
        comboBox15 = new JComboBox<>();
        comboBox11 = new JComboBox<>();
        button10 = new JButton();
        list4 = new JList();
        label7 = new JLabel();
        panel13 = new JPanel();
        label8 = new JLabel();
        list5 = new JList();
        comboBox16 = new JComboBox<>();
        comboBox12 = new JComboBox<>();
        button11 = new JButton();
        panel14 = new JPanel();
        label9 = new JLabel();
        list6 = new JList();
        button12 = new JButton();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();

        //======== this ========
        setBackground(new Color(0x000033));
        setMinimumSize(new Dimension(1024, 768));
        setPreferredSize(new Dimension(1024, 768));

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

            //---- label10 ----
            label10.setText("INTENSITY");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label10)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button14)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbutton)
                        .addComponent(button14)
                        .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label10)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

                    //---- comboBox1 ----
                    comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                        "A AUTO",
                        "A +",
                        "A -",
                        "A +/-",
                        "A OFF"
                    }));

                    //---- comboBox2 ----
                    comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                        "B AUTO",
                        "B +",
                        "B -",
                        "B +/-",
                        "B OFF"
                    }));

                    //---- comboBox3 ----
                    comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                        "C AUTO",
                        "C +",
                        "C -",
                        "C +/-",
                        "C OFF"
                    }));

                    //---- comboBox4 ----
                    comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
                        "F AUTO",
                        "F +",
                        "F -",
                        "F +/-",
                        "F OFF"
                    }));

                    //---- comboBox5 ----
                    comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
                        "E AUTO",
                        "E +",
                        "E -",
                        "E +/-",
                        "E OFF"
                    }));

                    //---- comboBox6 ----
                    comboBox6.setModel(new DefaultComboBoxModel<>(new String[] {
                        "D AUTO",
                        "D +",
                        "D -",
                        "D +/-",
                        "D OFF"
                    }));

                    //---- comboBox7 ----
                    comboBox7.setModel(new DefaultComboBoxModel<>(new String[] {
                        "G AUTO",
                        "G +",
                        "G -",
                        "G +/-",
                        "G OFF"
                    }));

                    //---- comboBox8 ----
                    comboBox8.setModel(new DefaultComboBoxModel<>(new String[] {
                        "H AUTO",
                        "H +",
                        "H -",
                        "H +/-",
                        "H OFF"
                    }));

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
                                            .addComponent(comboBox8, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
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
                                        .addContainerGap())
                                    .addComponent(programlist, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)))
                    );
                }
                tabbedPane1.addTab("Automatic", panel4);

                //======== panel5 ========
                {

                    //======== panel9 ========
                    {

                        //---- button7 ----
                        button7.setText("E-H+");

                        //---- button3 ----
                        button3.setText("A+");

                        //---- button4 ----
                        button4.setText("B+");

                        //---- button5 ----
                        button5.setText("C+");

                        //---- button6 ----
                        button6.setText("D+");

                        //======== scrollPane1 ========
                        {
                            scrollPane1.setViewportView(list1);
                        }

                        //---- label4 ----
                        label4.setText("Tissues");

                        GroupLayout panel9Layout = new GroupLayout(panel9);
                        panel9.setLayout(panel9Layout);
                        panel9Layout.setHorizontalGroup(
                            panel9Layout.createParallelGroup()
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel9Layout.createParallelGroup()
                                        .addComponent(button7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel9Layout.createSequentialGroup()
                                            .addComponent(label4)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel9Layout.createSequentialGroup()
                                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(12, 12, 12)
                                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(button4, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                                .addComponent(button6, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))))
                                    .addContainerGap())
                        );
                        panel9Layout.setVerticalGroup(
                            panel9Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button4)
                                        .addComponent(button3))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button5)
                                        .addComponent(button6))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button7)
                                    .addContainerGap())
                        );
                    }

                    //======== panel10 ========
                    {

                        //---- label5 ----
                        label5.setText("Channel A");

                        //---- button8 ----
                        button8.setText("A-");

                        //---- comboBox9 ----
                        comboBox9.setModel(new DefaultComboBoxModel<>(new String[] {
                            "A AUTO",
                            "A +",
                            "A -",
                            "A +/-",
                            "A OFF"
                        }));

                        //---- comboBox13 ----
                        comboBox13.setModel(new DefaultComboBoxModel<>(new String[] {
                            "E AUTO",
                            "E +",
                            "E -",
                            "E +/-",
                            "E OFF"
                        }));

                        GroupLayout panel10Layout = new GroupLayout(panel10);
                        panel10.setLayout(panel10Layout);
                        panel10Layout.setHorizontalGroup(
                            panel10Layout.createParallelGroup()
                                .addGroup(panel10Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel10Layout.createParallelGroup()
                                        .addGroup(panel10Layout.createSequentialGroup()
                                            .addComponent(label5)
                                            .addGap(0, 80, Short.MAX_VALUE))
                                        .addComponent(comboBox13, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(comboBox9, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(button8, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(list2, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                    .addContainerGap())
                        );
                        panel10Layout.setVerticalGroup(
                            panel10Layout.createParallelGroup()
                                .addGroup(panel10Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(list2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button8)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                        );
                    }

                    //======== panel11 ========
                    {

                        //---- label6 ----
                        label6.setText("Channel B");

                        //---- button9 ----
                        button9.setText("B-");

                        //---- comboBox10 ----
                        comboBox10.setModel(new DefaultComboBoxModel<>(new String[] {
                            "B AUTO",
                            "B +",
                            "B -",
                            "B +/-",
                            "B OFF"
                        }));

                        //---- comboBox14 ----
                        comboBox14.setModel(new DefaultComboBoxModel<>(new String[] {
                            "F AUTO",
                            "F +",
                            "F A +/-",
                            "F OFF"
                        }));

                        GroupLayout panel11Layout = new GroupLayout(panel11);
                        panel11.setLayout(panel11Layout);
                        panel11Layout.setHorizontalGroup(
                            panel11Layout.createParallelGroup()
                                .addGroup(panel11Layout.createSequentialGroup()
                                    .addGroup(panel11Layout.createParallelGroup()
                                        .addGroup(panel11Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(panel11Layout.createParallelGroup()
                                                .addComponent(list3, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                                .addGroup(panel11Layout.createSequentialGroup()
                                                    .addComponent(label6)
                                                    .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel11Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(panel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(comboBox14, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                                .addComponent(comboBox10, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                                .addComponent(button9, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                                    .addContainerGap())
                        );
                        panel11Layout.setVerticalGroup(
                            panel11Layout.createParallelGroup()
                                .addGroup(panel11Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label6)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(list3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button9)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                        );
                    }

                    //======== panel12 ========
                    {

                        //---- comboBox15 ----
                        comboBox15.setModel(new DefaultComboBoxModel<>(new String[] {
                            "G AUTO",
                            "G +",
                            "G -",
                            "G +/-",
                            "G OFF"
                        }));

                        //---- comboBox11 ----
                        comboBox11.setModel(new DefaultComboBoxModel<>(new String[] {
                            "C AUTO",
                            "C +",
                            "C -",
                            "C +/-",
                            "C OFF"
                        }));

                        //---- button10 ----
                        button10.setText("C-");

                        //---- label7 ----
                        label7.setText("Channel C");

                        GroupLayout panel12Layout = new GroupLayout(panel12);
                        panel12.setLayout(panel12Layout);
                        panel12Layout.setHorizontalGroup(
                            panel12Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel12Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel12Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.LEADING, panel12Layout.createSequentialGroup()
                                            .addComponent(label7)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(list4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(button10, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(comboBox11)
                                        .addComponent(comboBox15, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addGap(10, 10, 10))
                        );
                        panel12Layout.setVerticalGroup(
                            panel12Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel12Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label7)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(list4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button10)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                        );
                    }

                    //======== panel13 ========
                    {

                        //---- label8 ----
                        label8.setText("Channel D");

                        //---- comboBox16 ----
                        comboBox16.setModel(new DefaultComboBoxModel<>(new String[] {
                            "H AUTO",
                            "H +",
                            "H -",
                            "H +/-",
                            "H OFF"
                        }));

                        //---- comboBox12 ----
                        comboBox12.setModel(new DefaultComboBoxModel<>(new String[] {
                            "D AUTO",
                            "D +",
                            "D -",
                            "D +/-",
                            "D OFF"
                        }));

                        //---- button11 ----
                        button11.setText("D-");

                        GroupLayout panel13Layout = new GroupLayout(panel13);
                        panel13.setLayout(panel13Layout);
                        panel13Layout.setHorizontalGroup(
                            panel13Layout.createParallelGroup()
                                .addGroup(panel13Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel13Layout.createParallelGroup()
                                        .addGroup(panel13Layout.createSequentialGroup()
                                            .addComponent(label8)
                                            .addGap(0, 100, Short.MAX_VALUE))
                                        .addComponent(list5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(button11, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(comboBox12, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(comboBox16, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                    .addContainerGap())
                        );
                        panel13Layout.setVerticalGroup(
                            panel13Layout.createParallelGroup()
                                .addGroup(panel13Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label8)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(list5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button11)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                        );
                    }

                    //======== panel14 ========
                    {

                        //---- label9 ----
                        label9.setText("E-H");

                        //---- button12 ----
                        button12.setText("E-E -");

                        GroupLayout panel14Layout = new GroupLayout(panel14);
                        panel14.setLayout(panel14Layout);
                        panel14Layout.setHorizontalGroup(
                            panel14Layout.createParallelGroup()
                                .addGroup(panel14Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel14Layout.createParallelGroup()
                                        .addGroup(panel14Layout.createSequentialGroup()
                                            .addComponent(label9)
                                            .addGap(0, 99, Short.MAX_VALUE))
                                        .addComponent(button12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(list6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
                        );
                        panel14Layout.setVerticalGroup(
                            panel14Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel14Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label9)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(list6, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button12)
                                    .addContainerGap())
                        );
                    }

                    GroupLayout panel5Layout = new GroupLayout(panel5);
                    panel5.setLayout(panel5Layout);
                    panel5Layout.setHorizontalGroup(
                        panel5Layout.createParallelGroup()
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    panel5Layout.setVerticalGroup(
                        panel5Layout.createParallelGroup()
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel5Layout.createParallelGroup()
                                    .addComponent(panel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
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
                        .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
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
    public static JPanel panel1;
    public static JLabel label1;
    public static JPanel panel2;
    public static JLabel label2;
    public static JButton backbutton;
    public static JSpinner spinner1;
    public static JButton button14;
    public static JLabel label10;
    public static JPanel panel3;
    public static JTabbedPane tabbedPane1;
    public static JPanel panel4;
    public static JList programlist;
    public static JComboBox workmodecombobox;
    public static JComboBox kategorycombobox;
    public static JLabel kategorylabel;
    public static JLabel workmodelabel;
    public static JComboBox<String> comboBox1;
    public static JComboBox<String> comboBox2;
    public static JComboBox<String> comboBox3;
    public static JComboBox<String> comboBox4;
    public static JComboBox<String> comboBox5;
    public static JComboBox<String> comboBox6;
    public static JComboBox<String> comboBox7;
    public static JComboBox<String> comboBox8;
    public static JPanel panel5;
    public static JPanel panel9;
    public static JButton button7;
    public static JButton button3;
    public static JButton button4;
    public static JButton button5;
    public static JButton button6;
    public static JScrollPane scrollPane1;
    public static JList list1;
    public static JLabel label4;
    public static JPanel panel10;
    public static JList list2;
    public static JLabel label5;
    public static JButton button8;
    public static JComboBox<String> comboBox9;
    public static JComboBox<String> comboBox13;
    public static JPanel panel11;
    public static JLabel label6;
    public static JList list3;
    public static JButton button9;
    public static JComboBox<String> comboBox10;
    public static JComboBox<String> comboBox14;
    public static JPanel panel12;
    public static JComboBox<String> comboBox15;
    public static JComboBox<String> comboBox11;
    public static JButton button10;
    public static JList list4;
    public static JLabel label7;
    public static JPanel panel13;
    public static JLabel label8;
    public static JList list5;
    public static JComboBox<String> comboBox16;
    public static JComboBox<String> comboBox12;
    public static JButton button11;
    public static JPanel panel14;
    public static JLabel label9;
    public static JList list6;
    public static JButton button12;
    public static JPanel panel6;
    public static JPanel panel7;
    public static JPanel panel8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
