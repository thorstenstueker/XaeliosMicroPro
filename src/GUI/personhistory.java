package GUI;/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

/**
 * @author unknown
 */
public class personhistory extends JPanel {
    public personhistory() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        helplabel = new JLabel();
        backbutton = new JButton();
        newautomatik = new JButton();
        newxaeliosone = new JButton();
        continueselected = new JButton();
        newnotebutton = new JButton();
        savenotebutton = new JButton();
        multiplicatorbutton = new JToggleButton();
        deleteselectedentry = new JButton();
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

            //---- newautomatik ----
            newautomatik.setText("New Automatik");

            //---- newxaeliosone ----
            newxaeliosone.setText("New XaeliosONE");

            //---- continueselected ----
            continueselected.setText("continue selected");

            //---- newnotebutton ----
            newnotebutton.setText("new Note");

            //---- savenotebutton ----
            savenotebutton.setText("save Note");

            //---- multiplicatorbutton ----
            multiplicatorbutton.setText("1X");

            //---- deleteselectedentry ----
            deleteselectedentry.setText("delete entry");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(deleteselectedentry)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplicatorbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(savenotebutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newnotebutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(continueselected)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newxaeliosone)
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
                        .addComponent(newxaeliosone)
                        .addComponent(continueselected)
                        .addComponent(newnotebutton)
                        .addComponent(savenotebutton)
                        .addComponent(multiplicatorbutton)
                        .addComponent(deleteselectedentry))
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
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)))
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
    public JLabel helplabel;
    public JButton backbutton;
    public JButton newautomatik;
    public JButton newxaeliosone;
    public JButton continueselected;
    public JButton newnotebutton;
    public JButton savenotebutton;
    public JToggleButton multiplicatorbutton;
    public JButton deleteselectedentry;
    public JPanel panel3;
    public JLabel labelfortable;
    public JScrollPane scrollPane1;
    public JTable historytable;
    public JScrollPane scrollPane2;
    public JTextArea notearea;
    public JLabel notelabel;
    public JTextField noteheadline;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
