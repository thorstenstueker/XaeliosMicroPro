package GUI;/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.table.*;
//import com.jgoodies.forms.factories.*;

/**
 * @author unknown
 */
public class therapyvote extends JPanel {
    public boolean allowstart=true;
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

    public void GetintoTherapy(ActionEvent e) {
        if(allowstart){
            application.main(null);
            frame.dispose();

        }
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
        panel16 = new JPanel();
        programlist2 = new JList();
        workmodecombobox2 = new JComboBox();
        kategorycombobox2 = new JComboBox();
        kategorylabel2 = new JLabel();
        workmodelabel2 = new JLabel();
        comboBox25 = new JComboBox<>();
        comboBox26 = new JComboBox<>();
        comboBox27 = new JComboBox<>();
        comboBox28 = new JComboBox<>();
        comboBox29 = new JComboBox<>();
        comboBox30 = new JComboBox<>();
        comboBox31 = new JComboBox<>();
        comboBox32 = new JComboBox<>();
        panel7 = new JPanel();
        panel17 = new JPanel();
        programlist3 = new JList();
        workmodecombobox3 = new JComboBox();
        kategorycombobox3 = new JComboBox();
        kategorylabel3 = new JLabel();
        workmodelabel3 = new JLabel();
        comboBox35 = new JComboBox<>();
        workmodelabel4 = new JLabel();
        kategorylabel4 = new JLabel();
        workmodecombobox4 = new JComboBox();
        kategorycombobox4 = new JComboBox();
        programlist4 = new JList();
        comboBox33 = new JComboBox<>();
        comboBox34 = new JComboBox<>();
        comboBox36 = new JComboBox<>();
        comboBox37 = new JComboBox<>();
        comboBox38 = new JComboBox<>();
        comboBox39 = new JComboBox<>();
        comboBox40 = new JComboBox<>();
        comboBox41 = new JComboBox<>();
        panel8 = new JPanel();
        panel15 = new JPanel();
        scrollPane2 = new JScrollPane();
        table1 = new JTable();
        comboBox17 = new JComboBox<>();
        comboBox18 = new JComboBox<>();
        comboBox19 = new JComboBox<>();
        comboBox20 = new JComboBox<>();
        comboBox21 = new JComboBox<>();
        comboBox22 = new JComboBox<>();
        comboBox23 = new JComboBox<>();
        comboBox24 = new JComboBox<>();
        toggleButton1 = new JToggleButton();
        label3 = new JLabel();
        spinner2 = new JSpinner();
        toggleButton2 = new JToggleButton();
        panel18 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button13 = new JButton();
        button15 = new JButton();
        button16 = new JButton();

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

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label12)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinner4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label11)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinner3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toggleButton4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toggleButton3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addComponent(toggleButton3)
                        .addComponent(toggleButton4))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(spinner3)
                            .addComponent(spinner4, GroupLayout.Alignment.TRAILING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(label12)
                                    .addComponent(label11)
                                    .addComponent(label10))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
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

                    //======== panel16 ========
                    {

                        //---- kategorylabel2 ----
                        kategorylabel2.setText("Kategory");

                        //---- workmodelabel2 ----
                        workmodelabel2.setText("Workmode");

                        //---- comboBox25 ----
                        comboBox25.setModel(new DefaultComboBoxModel<>(new String[] {
                            "A AUTO",
                            "A +",
                            "A -",
                            "A +/-",
                            "A OFF"
                        }));

                        //---- comboBox26 ----
                        comboBox26.setModel(new DefaultComboBoxModel<>(new String[] {
                            "B AUTO",
                            "B +",
                            "B -",
                            "B +/-",
                            "B OFF"
                        }));

                        //---- comboBox27 ----
                        comboBox27.setModel(new DefaultComboBoxModel<>(new String[] {
                            "C AUTO",
                            "C +",
                            "C -",
                            "C +/-",
                            "C OFF"
                        }));

                        //---- comboBox28 ----
                        comboBox28.setModel(new DefaultComboBoxModel<>(new String[] {
                            "F AUTO",
                            "F +",
                            "F -",
                            "F +/-",
                            "F OFF"
                        }));

                        //---- comboBox29 ----
                        comboBox29.setModel(new DefaultComboBoxModel<>(new String[] {
                            "E AUTO",
                            "E +",
                            "E -",
                            "E +/-",
                            "E OFF"
                        }));

                        //---- comboBox30 ----
                        comboBox30.setModel(new DefaultComboBoxModel<>(new String[] {
                            "D AUTO",
                            "D +",
                            "D -",
                            "D +/-",
                            "D OFF"
                        }));

                        //---- comboBox31 ----
                        comboBox31.setModel(new DefaultComboBoxModel<>(new String[] {
                            "G AUTO",
                            "G +",
                            "G -",
                            "G +/-",
                            "G OFF"
                        }));

                        //---- comboBox32 ----
                        comboBox32.setModel(new DefaultComboBoxModel<>(new String[] {
                            "H AUTO",
                            "H +",
                            "H -",
                            "H +/-",
                            "H OFF"
                        }));

                        GroupLayout panel16Layout = new GroupLayout(panel16);
                        panel16.setLayout(panel16Layout);
                        panel16Layout.setHorizontalGroup(
                            panel16Layout.createParallelGroup()
                                .addGroup(panel16Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel16Layout.createParallelGroup()
                                        .addGroup(panel16Layout.createSequentialGroup()
                                            .addComponent(workmodelabel2, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(kategorylabel2, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel16Layout.createSequentialGroup()
                                            .addComponent(workmodecombobox2, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(kategorycombobox2, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(programlist2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panel16Layout.createParallelGroup()
                                        .addGroup(panel16Layout.createParallelGroup()
                                            .addGroup(panel16Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(panel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(comboBox25, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                    .addComponent(comboBox26)
                                                    .addComponent(comboBox27)))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel16Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panel16Layout.createParallelGroup()
                                                    .addComponent(comboBox30, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(comboBox29, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(comboBox28, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel16Layout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(comboBox31, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                .addComponent(comboBox32))))
                                    .addContainerGap())
                        );
                        panel16Layout.setVerticalGroup(
                            panel16Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel16Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel16Layout.createParallelGroup()
                                        .addComponent(workmodelabel2)
                                        .addComponent(kategorylabel2))
                                    .addGap(6, 6, 6)
                                    .addGroup(panel16Layout.createParallelGroup()
                                        .addComponent(workmodecombobox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(kategorycombobox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBox25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel16Layout.createParallelGroup()
                                        .addGroup(panel16Layout.createSequentialGroup()
                                            .addComponent(comboBox26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(comboBox27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(comboBox30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(comboBox29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(comboBox28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(comboBox31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(comboBox32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(175, Short.MAX_VALUE))
                                        .addComponent(programlist2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        );
                    }

                    GroupLayout panel6Layout = new GroupLayout(panel6);
                    panel6.setLayout(panel6Layout);
                    panel6Layout.setHorizontalGroup(
                        panel6Layout.createParallelGroup()
                            .addGroup(panel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    panel6Layout.setVerticalGroup(
                        panel6Layout.createParallelGroup()
                            .addGroup(panel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }
                tabbedPane1.addTab("FIXApplication", panel6);

                //======== panel7 ========
                {

                    //======== panel17 ========
                    {

                        //---- kategorylabel3 ----
                        kategorylabel3.setText("Kategory");

                        //---- workmodelabel3 ----
                        workmodelabel3.setText("Microcurrent-Mode");

                        //---- comboBox35 ----
                        comboBox35.setModel(new DefaultComboBoxModel<>(new String[] {
                            "N AUTO",
                            "N +",
                            "N -",
                            "N +/-",
                            "N OFF"
                        }));

                        //---- workmodelabel4 ----
                        workmodelabel4.setText("Fasciawave-Mode");

                        //---- kategorylabel4 ----
                        kategorylabel4.setText("Kategory");

                        //---- comboBox33 ----
                        comboBox33.setModel(new DefaultComboBoxModel<>(new String[] {
                            "A AUTO",
                            "A +",
                            "A -",
                            "A +/-",
                            "A OFF"
                        }));

                        //---- comboBox34 ----
                        comboBox34.setModel(new DefaultComboBoxModel<>(new String[] {
                            "B AUTO",
                            "B +",
                            "B -",
                            "B +/-",
                            "B OFF"
                        }));

                        //---- comboBox36 ----
                        comboBox36.setModel(new DefaultComboBoxModel<>(new String[] {
                            "C AUTO",
                            "C +",
                            "C -",
                            "C +/-",
                            "C OFF"
                        }));

                        //---- comboBox37 ----
                        comboBox37.setModel(new DefaultComboBoxModel<>(new String[] {
                            "D AUTO",
                            "D +",
                            "D -",
                            "D +/-",
                            "D OFF"
                        }));

                        //---- comboBox38 ----
                        comboBox38.setModel(new DefaultComboBoxModel<>(new String[] {
                            "E AUTO",
                            "E +",
                            "E -",
                            "E +/-",
                            "E OFF"
                        }));

                        //---- comboBox39 ----
                        comboBox39.setModel(new DefaultComboBoxModel<>(new String[] {
                            "F AUTO",
                            "F +",
                            "F -",
                            "F +/-",
                            "F OFF"
                        }));

                        //---- comboBox40 ----
                        comboBox40.setModel(new DefaultComboBoxModel<>(new String[] {
                            "G AUTO",
                            "G +",
                            "G -",
                            "G +/-",
                            "G OFF"
                        }));

                        //---- comboBox41 ----
                        comboBox41.setModel(new DefaultComboBoxModel<>(new String[] {
                            "H AUTO",
                            "H +",
                            "H -",
                            "H +/-",
                            "H OFF"
                        }));

                        GroupLayout panel17Layout = new GroupLayout(panel17);
                        panel17.setLayout(panel17Layout);
                        panel17Layout.setHorizontalGroup(
                            panel17Layout.createParallelGroup()
                                .addGroup(panel17Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel17Layout.createParallelGroup()
                                        .addGroup(panel17Layout.createSequentialGroup()
                                            .addComponent(workmodelabel3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(kategorylabel3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel17Layout.createSequentialGroup()
                                            .addComponent(workmodecombobox3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(kategorycombobox3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(programlist3, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panel17Layout.createSequentialGroup()
                                            .addGroup(panel17Layout.createParallelGroup()
                                                .addGroup(panel17Layout.createSequentialGroup()
                                                    .addComponent(workmodelabel4, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(6, 6, 6)
                                                    .addComponent(kategorylabel4, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panel17Layout.createSequentialGroup()
                                                    .addComponent(workmodecombobox4, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(6, 6, 6)
                                                    .addComponent(kategorycombobox4, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))
                                            .addGap(232, 232, 232))
                                        .addGroup(panel17Layout.createSequentialGroup()
                                            .addComponent(programlist4, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(comboBox35, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                .addComponent(comboBox36, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                .addComponent(comboBox34, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                .addComponent(comboBox33, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                .addComponent(comboBox37, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                .addComponent(comboBox38, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                .addComponent(comboBox39, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                .addComponent(comboBox40, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                .addComponent(comboBox41, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                            .addContainerGap())))
                        );
                        panel17Layout.setVerticalGroup(
                            panel17Layout.createParallelGroup()
                                .addGroup(panel17Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel17Layout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel17Layout.createSequentialGroup()
                                            .addGroup(panel17Layout.createParallelGroup()
                                                .addComponent(workmodelabel3)
                                                .addComponent(kategorylabel3))
                                            .addGap(6, 6, 6)
                                            .addGroup(panel17Layout.createParallelGroup()
                                                .addComponent(workmodecombobox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(kategorycombobox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(programlist3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(panel17Layout.createSequentialGroup()
                                            .addGroup(panel17Layout.createParallelGroup()
                                                .addComponent(workmodelabel4)
                                                .addComponent(kategorylabel4))
                                            .addGap(6, 6, 6)
                                            .addGroup(panel17Layout.createParallelGroup()
                                                .addComponent(workmodecombobox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(kategorycombobox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addGap(12, 12, 12)
                                            .addGroup(panel17Layout.createParallelGroup()
                                                .addGroup(panel17Layout.createSequentialGroup()
                                                    .addComponent(comboBox33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(comboBox34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(comboBox36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(comboBox37, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(comboBox38, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(comboBox39, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(comboBox40, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(comboBox41, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                                    .addComponent(comboBox35, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addComponent(programlist4, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)))))
                        );
                    }

                    GroupLayout panel7Layout = new GroupLayout(panel7);
                    panel7.setLayout(panel7Layout);
                    panel7Layout.setHorizontalGroup(
                        panel7Layout.createParallelGroup()
                            .addGroup(panel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    panel7Layout.setVerticalGroup(
                        panel7Layout.createParallelGroup()
                            .addGroup(panel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }
                tabbedPane1.addTab("FasciaWave", panel7);

                //======== panel8 ========
                {

                    //======== panel15 ========
                    {

                        //======== scrollPane2 ========
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
                            ) {
                                Class<?>[] columnTypes = new Class<?>[] {
                                    String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
                                };
                                @Override
                                public Class<?> getColumnClass(int columnIndex) {
                                    return columnTypes[columnIndex];
                                }
                            });
                            table1.setBorder(new EtchedBorder());
                            table1.setCellSelectionEnabled(true);
                            table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                            table1.setShowHorizontalLines(true);
                            table1.setShowVerticalLines(true);
                            scrollPane2.setViewportView(table1);
                        }

                        GroupLayout panel15Layout = new GroupLayout(panel15);
                        panel15.setLayout(panel15Layout);
                        panel15Layout.setHorizontalGroup(
                            panel15Layout.createParallelGroup()
                                .addGroup(panel15Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                        panel15Layout.setVerticalGroup(
                            panel15Layout.createParallelGroup()
                                .addGroup(panel15Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }

                    //---- comboBox17 ----
                    comboBox17.setModel(new DefaultComboBoxModel<>(new String[] {
                        "A AUTO",
                        "A +",
                        "A -",
                        "A +/-",
                        "A OFF"
                    }));

                    //---- comboBox18 ----
                    comboBox18.setModel(new DefaultComboBoxModel<>(new String[] {
                        "B AUTO",
                        "B +",
                        "B -",
                        "B +/-",
                        "B OFF"
                    }));

                    //---- comboBox19 ----
                    comboBox19.setModel(new DefaultComboBoxModel<>(new String[] {
                        "C AUTO",
                        "C +",
                        "C -",
                        "C +/-",
                        "C OFF"
                    }));

                    //---- comboBox20 ----
                    comboBox20.setModel(new DefaultComboBoxModel<>(new String[] {
                        "D AUTO",
                        "D +",
                        "D -",
                        "D +/-",
                        "D OFF"
                    }));

                    //---- comboBox21 ----
                    comboBox21.setModel(new DefaultComboBoxModel<>(new String[] {
                        "G AUTO",
                        "G +",
                        "G -",
                        "G +/-",
                        "G OFF"
                    }));

                    //---- comboBox22 ----
                    comboBox22.setModel(new DefaultComboBoxModel<>(new String[] {
                        "H AUTO",
                        "H +",
                        "H -",
                        "H +/-",
                        "H OFF"
                    }));

                    //---- comboBox23 ----
                    comboBox23.setModel(new DefaultComboBoxModel<>(new String[] {
                        "F AUTO",
                        "F +",
                        "F -",
                        "F +/-",
                        "F OFF"
                    }));

                    //---- comboBox24 ----
                    comboBox24.setModel(new DefaultComboBoxModel<>(new String[] {
                        "E AUTO",
                        "E +",
                        "E -",
                        "E +/-",
                        "E OFF"
                    }));

                    //---- toggleButton1 ----
                    toggleButton1.setText("AUTOSCAN");

                    //---- label3 ----
                    label3.setText("Linetime");

                    //---- toggleButton2 ----
                    toggleButton2.setText("Singleline");

                    //======== panel18 ========
                    {

                        //---- button1 ----
                        button1.setText("+ Line");

                        //---- button2 ----
                        button2.setText("- Line");

                        //---- button13 ----
                        button13.setText("Load");

                        //---- button15 ----
                        button15.setText("save");

                        //---- button16 ----
                        button16.setText("delete");

                        GroupLayout panel18Layout = new GroupLayout(panel18);
                        panel18.setLayout(panel18Layout);
                        panel18Layout.setHorizontalGroup(
                            panel18Layout.createParallelGroup()
                                .addGroup(panel18Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel18Layout.createParallelGroup()
                                        .addGroup(panel18Layout.createSequentialGroup()
                                            .addComponent(button1)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button2))
                                        .addGroup(panel18Layout.createSequentialGroup()
                                            .addGroup(panel18Layout.createParallelGroup()
                                                .addGroup(panel18Layout.createSequentialGroup()
                                                    .addComponent(button13)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(button15))
                                                .addComponent(button16))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())
                        );
                        panel18Layout.setVerticalGroup(
                            panel18Layout.createParallelGroup()
                                .addGroup(panel18Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button1)
                                        .addComponent(button2))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button13)
                                        .addComponent(button15))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button16)
                                    .addContainerGap(16, Short.MAX_VALUE))
                        );
                    }

                    GroupLayout panel8Layout = new GroupLayout(panel8);
                    panel8.setLayout(panel8Layout);
                    panel8Layout.setHorizontalGroup(
                        panel8Layout.createParallelGroup()
                            .addGroup(panel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel8Layout.createParallelGroup()
                                    .addComponent(comboBox18)
                                    .addComponent(comboBox17)
                                    .addComponent(comboBox19)
                                    .addComponent(comboBox20)
                                    .addComponent(comboBox24)
                                    .addComponent(comboBox23)
                                    .addComponent(comboBox21)
                                    .addComponent(comboBox22)
                                    .addComponent(toggleButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel8Layout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spinner2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(toggleButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel8Layout.createSequentialGroup()
                                        .addComponent(panel18, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(12, 12, 12))
                    );
                    panel8Layout.setVerticalGroup(
                        panel8Layout.createParallelGroup()
                            .addGroup(panel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel8Layout.createParallelGroup()
                                    .addComponent(panel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel8Layout.createSequentialGroup()
                                        .addComponent(comboBox17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBox18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBox19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(comboBox20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBox24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(comboBox23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(comboBox21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(comboBox22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(toggleButton1)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel8Layout.createParallelGroup()
                                            .addComponent(label3)
                                            .addComponent(spinner2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(toggleButton2)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 7, Short.MAX_VALUE)))
                                .addContainerGap())
                    );
                }
                tabbedPane1.addTab("IndividualFrequenceApplication", panel8);
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
    public JPanel panel3;
    public JTabbedPane tabbedPane1;
    public JPanel panel4;
    public JList programlist;
    public JComboBox workmodecombobox;
    public JComboBox kategorycombobox;
    public JLabel kategorylabel;
    public JLabel workmodelabel;
    public JComboBox<String> comboBox1;
    public JComboBox<String> comboBox2;
    public JComboBox<String> comboBox3;
    public JComboBox<String> comboBox4;
    public JComboBox<String> comboBox5;
    public JComboBox<String> comboBox6;
    public JComboBox<String> comboBox7;
    public JComboBox<String> comboBox8;
    public JPanel panel5;
    public JPanel panel9;
    public JButton button7;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton button6;
    public JScrollPane scrollPane1;
    public JList list1;
    public JLabel label4;
    public JPanel panel10;
    public JList list2;
    public JLabel label5;
    public JButton button8;
    public JComboBox<String> comboBox9;
    public JComboBox<String> comboBox13;
    public JPanel panel11;
    public JLabel label6;
    public JList list3;
    public JButton button9;
    public JComboBox<String> comboBox10;
    public JComboBox<String> comboBox14;
    public JPanel panel12;
    public JComboBox<String> comboBox15;
    public JComboBox<String> comboBox11;
    public JButton button10;
    public JList list4;
    public JLabel label7;
    public JPanel panel13;
    public JLabel label8;
    public JList list5;
    public JComboBox<String> comboBox16;
    public JComboBox<String> comboBox12;
    public JButton button11;
    public JPanel panel14;
    public JLabel label9;
    public JList list6;
    public JButton button12;
    public JPanel panel6;
    public JPanel panel16;
    public JList programlist2;
    public JComboBox workmodecombobox2;
    public JComboBox kategorycombobox2;
    public JLabel kategorylabel2;
    public JLabel workmodelabel2;
    public JComboBox<String> comboBox25;
    public JComboBox<String> comboBox26;
    public JComboBox<String> comboBox27;
    public JComboBox<String> comboBox28;
    public JComboBox<String> comboBox29;
    public JComboBox<String> comboBox30;
    public JComboBox<String> comboBox31;
    public JComboBox<String> comboBox32;
    public JPanel panel7;
    public JPanel panel17;
    public JList programlist3;
    public JComboBox workmodecombobox3;
    public JComboBox kategorycombobox3;
    public JLabel kategorylabel3;
    public JLabel workmodelabel3;
    public JComboBox<String> comboBox35;
    public JLabel workmodelabel4;
    public JLabel kategorylabel4;
    public JComboBox workmodecombobox4;
    public JComboBox kategorycombobox4;
    public JList programlist4;
    public JComboBox<String> comboBox33;
    public JComboBox<String> comboBox34;
    public JComboBox<String> comboBox36;
    public JComboBox<String> comboBox37;
    public JComboBox<String> comboBox38;
    public JComboBox<String> comboBox39;
    public JComboBox<String> comboBox40;
    public JComboBox<String> comboBox41;
    public JPanel panel8;
    public JPanel panel15;
    public JScrollPane scrollPane2;
    public JTable table1;
    public JComboBox<String> comboBox17;
    public JComboBox<String> comboBox18;
    public JComboBox<String> comboBox19;
    public JComboBox<String> comboBox20;
    public JComboBox<String> comboBox21;
    public JComboBox<String> comboBox22;
    public JComboBox<String> comboBox23;
    public JComboBox<String> comboBox24;
    public JToggleButton toggleButton1;
    public JLabel label3;
    public JSpinner spinner2;
    public JToggleButton toggleButton2;
    public JPanel panel18;
    public JButton button1;
    public JButton button2;
    public JButton button13;
    public JButton button15;
    public JButton button16;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
