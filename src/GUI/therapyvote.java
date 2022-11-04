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
        forwardbutton = new JButton();
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
        panel5 = new JPanel();
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

            //---- forwardbutton ----
            forwardbutton.setText(">>>>");
            forwardbutton.addActionListener(e -> forward(e));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(forwardbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbutton)
                        .addComponent(forwardbutton))
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
                                            .addComponent(comboBox8, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                            .addComponent(label3)
                                            .addComponent(button1, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                            .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                            .addComponent(button2, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
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
                                        .addContainerGap(57, Short.MAX_VALUE))
                                    .addComponent(programlist, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)))
                    );
                }
                tabbedPane1.addTab("Automatic", panel4);

                //======== panel5 ========
                {

                    GroupLayout panel5Layout = new GroupLayout(panel5);
                    panel5.setLayout(panel5Layout);
                    panel5Layout.setHorizontalGroup(
                        panel5Layout.createParallelGroup()
                            .addGap(0, 996, Short.MAX_VALUE)
                    );
                    panel5Layout.setVerticalGroup(
                        panel5Layout.createParallelGroup()
                            .addGap(0, 475, Short.MAX_VALUE)
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
    public JButton forwardbutton;
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
    public JPanel panel5;
    public JPanel panel6;
    public JPanel panel7;
    public JPanel panel8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
