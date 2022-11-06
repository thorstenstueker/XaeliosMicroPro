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
public class personhistory extends JPanel {
    public static JFrame frame = new JFrame();
    public personhistory() {
        initComponents();
    }

    public static void back(ActionEvent e) {
        Persons.main(null);
        frame.dispose();
    }

    public static void newautomatik(ActionEvent e) {
        therapyvote.main(null);
        frame.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        helplabel = new JLabel();
        backbutton = new JButton();
        newautomatik = new JButton();
        continueselected = new JButton();
        newnotebutton = new JButton();
        savenotebutton = new JButton();
        deleteselectedentry = new JButton();
        button1 = new JButton();
        panel3 = new JPanel();
        labelfortable = new JLabel();
        scrollPane1 = new JScrollPane();
        historytable = new JTable();
        scrollPane2 = new JScrollPane();
        notearea = new JTextArea();
        notelabel = new JLabel();
        noteheadline = new JTextField();

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

            //---- newautomatik ----
            newautomatik.setText("New Application");
            newautomatik.addActionListener(e -> newautomatik(e));

            //---- continueselected ----
            continueselected.setText("continue selected");

            //---- newnotebutton ----
            newnotebutton.setText("new Note");

            //---- savenotebutton ----
            savenotebutton.setText("save Note");

            //---- deleteselectedentry ----
            deleteselectedentry.setText("delete entry");

            //---- button1 ----
            button1.setText("View selected");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(deleteselectedentry)
                        .addGap(57, 57, 57)
                        .addComponent(savenotebutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newnotebutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(continueselected)
                        .addGap(99, 99, 99)
                        .addComponent(button1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newautomatik)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(helplabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(helplabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbutton)
                        .addComponent(newautomatik)
                        .addComponent(continueselected)
                        .addComponent(newnotebutton)
                        .addComponent(savenotebutton)
                        .addComponent(deleteselectedentry)
                        .addComponent(button1))
            );
        }

        //======== panel3 ========
        {

            //---- labelfortable ----
            labelfortable.setText("Events in History");

            //======== scrollPane1 ========
            {

                //---- historytable ----
                historytable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                    },
                    new String[] {
                        "Number", "Type", "Reason", "Program", "Date"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, String.class, String.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                scrollPane1.setViewportView(historytable);
            }

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(notearea);
            }

            //---- notelabel ----
            notelabel.setText("Note");

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelfortable, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(notelabel)
                                .addGap(0, 451, Short.MAX_VALUE))
                            .addComponent(noteheadline, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                        .addContainerGap())
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(labelfortable)
                            .addComponent(notelabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(noteheadline, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)))
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
        frame.add(new personhistory());
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public static JPanel panel1;
    public static JLabel label1;
    public static JPanel panel2;
    public static JLabel helplabel;
    public static JButton backbutton;
    public static JButton newautomatik;
    public static JButton continueselected;
    public static JButton newnotebutton;
    public static JButton savenotebutton;
    public static JButton deleteselectedentry;
    public static JButton button1;
    public static JPanel panel3;
    public static JLabel labelfortable;
    public static JScrollPane scrollPane1;
    public static JTable historytable;
    public static JScrollPane scrollPane2;
    public static JTextArea notearea;
    public static JLabel notelabel;
    public static JTextField noteheadline;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
