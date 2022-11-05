package GUI;/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

/**
 * @author unknown
 */
public class Persons extends JPanel {
    public static datatypes.persons personhere = new datatypes.persons();
    public static JFrame frame = new JFrame("Persons");
    public Persons() {
        initComponents();
    }

    public static void back(ActionEvent e) {
        menu.main(null);
        frame.dispose();
        // TODO add your code here
    }

    public static void forward(ActionEvent e) {
        therapyvote.main(null);
        frame.dispose();
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        helplabel = new JLabel();
        backbutton = new JButton();
        forwardbutton = new JButton();
        newbutton = new JButton();
        deletebutton = new JButton();
        editbutton = new JButton();
        panel3 = new JPanel();
        searchstring = new JTextField();
        firstnamesearchbutton = new JButton();
        lastnamesearchbutton = new JButton();
        scrollPane1 = new JScrollPane();
        personsearchtable = new JTable();
        panel4 = new JPanel();
        personnumberlabel = new JLabel();
        personnumberfield = new JTextField();
        lastnamelabel = new JLabel();
        lastnamefield = new JTextField();
        firstnamelabel = new JLabel();
        firstnamefield = new JTextField();
        genderlabel = new JLabel();
        genderbox = new JComboBox<>();
        dateofbirthlabel = new JLabel();
        dateofbirthfield = new JTextField();
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
        noteslabel = new JLabel();
        scrollPane2 = new JScrollPane();
        notestextarea = new JTextArea();

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

            //---- backbutton ----
            backbutton.setText("<<<<");
            backbutton.addActionListener(e -> back(e));

            //---- forwardbutton ----
            forwardbutton.setText(">>>>");
            forwardbutton.addActionListener(e -> forward(e));

            //---- newbutton ----
            newbutton.setText("NEW");

            //---- deletebutton ----
            deletebutton.setText("Delete");

            //---- editbutton ----
            editbutton.setText("Edit");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 562, Short.MAX_VALUE)
                        .addComponent(editbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletebutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forwardbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(helplabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(helplabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbutton)
                        .addComponent(forwardbutton)
                        .addComponent(newbutton)
                        .addComponent(deletebutton)
                        .addComponent(editbutton))
            );
        }

        //======== panel3 ========
        {

            //---- firstnamesearchbutton ----
            firstnamesearchbutton.setText("First Name");

            //---- lastnamesearchbutton ----
            lastnamesearchbutton.setText("Last Name");

            //======== scrollPane1 ========
            {

                //---- personsearchtable ----
                personsearchtable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                    },
                    new String[] {
                        "Number", "Name", "Surname", "birthdate"
                    }
                ));
                scrollPane1.setViewportView(personsearchtable);
            }

            //======== panel4 ========
            {

                //---- personnumberlabel ----
                personnumberlabel.setText("Person Number");

                //---- personnumberfield ----
                personnumberfield.setEditable(false);

                //---- lastnamelabel ----
                lastnamelabel.setText("Last Name");

                //---- lastnamefield ----
                lastnamefield.setEditable(false);

                //---- firstnamelabel ----
                firstnamelabel.setText("First Name");

                //---- firstnamefield ----
                firstnamefield.setEditable(false);

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

                //---- dateofbirthlabel ----
                dateofbirthlabel.setText("Date of Birth");

                //---- dateofbirthfield ----
                dateofbirthfield.setEditable(false);

                //---- lastappointmentlabel ----
                lastappointmentlabel.setText("last Appointment");

                //---- lastappointmentfield ----
                lastappointmentfield.setEditable(false);

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

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(notestextarea);
                }

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel4Layout.createParallelGroup()
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(noteslabel, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(med7toggle, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                                .addComponent(med5toggle, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                                .addComponent(med9toggle, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                                            .addGap(12, 12, 12)
                                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(med8toggle, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                                .addComponent(med6toggle, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                                .addComponent(med10toggle, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(med3toggle, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                                .addComponent(med1toggle, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(med2toggle, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                                .addComponent(med4toggle, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                                        .addGroup(panel4Layout.createSequentialGroup()
                                            .addGroup(panel4Layout.createParallelGroup()
                                                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(genderbox, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                                    .addComponent(personnumberlabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                                    .addComponent(personnumberfield, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                                .addComponent(genderlabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(panel4Layout.createParallelGroup()
                                                .addGroup(panel4Layout.createSequentialGroup()
                                                    .addGroup(panel4Layout.createParallelGroup()
                                                        .addComponent(lastnamelabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lastnamefield, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(panel4Layout.createParallelGroup()
                                                        .addGroup(panel4Layout.createSequentialGroup()
                                                            .addComponent(firstnamelabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                            .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(firstnamefield)))
                                                .addGroup(panel4Layout.createSequentialGroup()
                                                    .addComponent(dateofbirthlabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(75, 75, 75)
                                                    .addComponent(lastappointmentlabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(panel4Layout.createSequentialGroup()
                                                    .addComponent(dateofbirthfield, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(6, 6, 6)
                                                    .addComponent(lastappointmentfield, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE)))))
                                    .addContainerGap())))
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                            .addContainerGap())
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(firstnamelabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(firstnamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(personnumberlabel)
                                        .addComponent(lastnamelabel))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(personnumberfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastnamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(genderlabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(genderbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addComponent(dateofbirthlabel)
                                        .addComponent(lastappointmentlabel))
                                    .addGap(6, 6, 6)
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addComponent(dateofbirthfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastappointmentfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(med1toggle)
                                .addComponent(med2toggle))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(med3toggle)
                                .addComponent(med4toggle))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(med5toggle)
                                .addComponent(med6toggle))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addComponent(med7toggle)
                                .addComponent(med8toggle))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(med9toggle)
                                .addComponent(med10toggle))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(noteslabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
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
                                .addComponent(searchstring, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstnamesearchbutton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastnamesearchbutton)
                                .addGap(0, 92, Short.MAX_VALUE))
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchstring, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstnamesearchbutton)
                                    .addComponent(lastnamesearchbutton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
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
        frame.setContentPane(new Persons());

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setVisible(true);
    }
    public void fillform(){
       lastnamefield.setText(personhere.lastname);
         firstnamefield.setText(personhere.firstname);
         String gender =null;
         gender= personhere.gender;


    }



    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public static JPanel panel1;
    public static JLabel label1;
    public static JPanel panel2;
    public static JLabel helplabel;
    public static JButton backbutton;
    public static JButton forwardbutton;
    public static JButton newbutton;
    public static JButton deletebutton;
    public static JButton editbutton;
    public static JPanel panel3;
    public static JTextField searchstring;
    public static JButton firstnamesearchbutton;
    public static JButton lastnamesearchbutton;
    public static JScrollPane scrollPane1;
    public static JTable personsearchtable;
    public static JPanel panel4;
    public static JLabel personnumberlabel;
    public static JTextField personnumberfield;
    public static JLabel lastnamelabel;
    public static JTextField lastnamefield;
    public static JLabel firstnamelabel;
    public static JTextField firstnamefield;
    public static JLabel genderlabel;
    public static JComboBox<String> genderbox;
    public static JLabel dateofbirthlabel;
    public static JTextField dateofbirthfield;
    public static JLabel lastappointmentlabel;
    public static JTextField lastappointmentfield;
    public static JToggleButton med1toggle;
    public static JToggleButton med2toggle;
    public static JToggleButton med3toggle;
    public static JToggleButton med4toggle;
    public static JToggleButton med5toggle;
    public static JToggleButton med6toggle;
    public static JToggleButton med7toggle;
    public static JToggleButton med8toggle;
    public static JToggleButton med9toggle;
    public static JToggleButton med10toggle;
    public static JLabel noteslabel;
    public static JScrollPane scrollPane2;
    public static JTextArea notestextarea;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
