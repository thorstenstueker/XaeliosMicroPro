package GUI;/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class personeditdialog extends JPanel {
    public personeditdialog() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        panel3 = new JPanel();
        personnumberlabel = new JLabel();
        personnumberfield = new JTextField();
        genderlabel = new JLabel();
        genderbox = new JComboBox<>();
        lastnamelabel = new JLabel();
        lastnamefield = new JTextField();
        dateofbirthlabel = new JLabel();
        dateofbirthfield = new JTextField();
        firstnamelabel = new JLabel();
        firstnamefield = new JTextField();
        lastappointmentlabel = new JLabel();
        lastappointmentfield = new JTextField();
        med1toggle = new JToggleButton();
        med2toggle = new JToggleButton();
        med3toggle = new JToggleButton();
        med4toggle = new JToggleButton();
        med5toggle = new JToggleButton();
        med6toggle = new JToggleButton();
        med7toggle = new JToggleButton();
        med8toggle = new JToggleButton();
        med9toggle = new JToggleButton();
        med10toggle = new JToggleButton();
        notestextarea = new JTextArea();
        noteslabel = new JLabel();

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

            //---- button1 ----
            button1.setText("<<<<");

            //---- button2 ----
            button2.setText(">>>>");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1)
                        .addComponent(button2))
            );
        }

        //======== panel3 ========
        {

            //---- personnumberlabel ----
            personnumberlabel.setText("Person Number");

            //---- personnumberfield ----
            personnumberfield.setEditable(false);

            //---- genderlabel ----
            genderlabel.setText("Gender");

            //---- genderbox ----
            genderbox.setModel(new DefaultComboBoxModel<>(new String[] {
                "Female",
                "Male",
                "Diverse"
            }));
            genderbox.setFocusable(false);
            genderbox.setEditable(true);

            //---- lastnamelabel ----
            lastnamelabel.setText("Last Name");

            //---- dateofbirthlabel ----
            dateofbirthlabel.setText("Date of Birth");

            //---- firstnamelabel ----
            firstnamelabel.setText("First Name");

            //---- lastappointmentlabel ----
            lastappointmentlabel.setText("last Appointment");

            //---- med1toggle ----
            med1toggle.setText("text");

            //---- med2toggle ----
            med2toggle.setText("text");

            //---- med3toggle ----
            med3toggle.setText("text");

            //---- med4toggle ----
            med4toggle.setText("text");

            //---- med5toggle ----
            med5toggle.setText("text");

            //---- med6toggle ----
            med6toggle.setText("text");

            //---- med7toggle ----
            med7toggle.setText("text");

            //---- med8toggle ----
            med8toggle.setText("text");

            //---- med9toggle ----
            med9toggle.setText("text");

            //---- med10toggle ----
            med10toggle.setText("text");

            //---- noteslabel ----
            noteslabel.setText("Notes");

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(personnumberlabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lastnamelabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(firstnamelabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(personnumberfield, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lastnamefield, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(firstnamefield, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(genderlabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(dateofbirthlabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(lastappointmentlabel, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(genderbox, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(dateofbirthfield, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(lastappointmentfield, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(med1toggle, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(med2toggle, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(med3toggle, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(med4toggle, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(med5toggle, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(med6toggle, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(med7toggle, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(med8toggle, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(med9toggle, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(med10toggle, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(noteslabel, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
                            .addComponent(notestextarea, GroupLayout.PREFERRED_SIZE, 473, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(personnumberlabel)
                            .addComponent(lastnamelabel)
                            .addComponent(firstnamelabel))
                        .addGap(6, 6, 6)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(personnumberfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastnamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstnamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(genderlabel)
                            .addComponent(dateofbirthlabel)
                            .addComponent(lastappointmentlabel))
                        .addGap(6, 6, 6)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(genderbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateofbirthfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastappointmentfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(med1toggle)
                            .addComponent(med2toggle))
                        .addGap(6, 6, 6)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(med3toggle)
                            .addComponent(med4toggle))
                        .addGap(6, 6, 6)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(med5toggle)
                            .addComponent(med6toggle))
                        .addGap(6, 6, 6)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(med7toggle)
                            .addComponent(med8toggle))
                        .addGap(6, 6, 6)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(med9toggle)
                            .addComponent(med10toggle))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(noteslabel)
                        .addGap(9, 9, 9)
                        .addComponent(notestextarea, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
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
    public JButton button1;
    public JButton button2;
    public JPanel panel3;
    public JLabel personnumberlabel;
    public JTextField personnumberfield;
    public JLabel genderlabel;
    public JComboBox<String> genderbox;
    public JLabel lastnamelabel;
    public JTextField lastnamefield;
    public JLabel dateofbirthlabel;
    public JTextField dateofbirthfield;
    public JLabel firstnamelabel;
    public JTextField firstnamefield;
    public JLabel lastappointmentlabel;
    public JTextField lastappointmentfield;
    public JToggleButton med1toggle;
    public JToggleButton med2toggle;
    public JToggleButton med3toggle;
    public JToggleButton med4toggle;
    public JToggleButton med5toggle;
    public JToggleButton med6toggle;
    public JToggleButton med7toggle;
    public JToggleButton med8toggle;
    public JToggleButton med9toggle;
    public JToggleButton med10toggle;
    public JTextArea notestextarea;
    public JLabel noteslabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
