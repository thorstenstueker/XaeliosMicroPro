package GUI;/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class questionpanel extends JPanel {
    public questionpanel() {
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
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        radioButton4 = new JRadioButton();
        radioButton5 = new JRadioButton();
        radioButton6 = new JRadioButton();
        radioButton7 = new JRadioButton();
        radioButton8 = new JRadioButton();
        radioButton9 = new JRadioButton();
        radioButton10 = new JRadioButton();
        textArea2 = new JTextArea();
        radioButton11 = new JRadioButton();
        radioButton12 = new JRadioButton();
        radioButton13 = new JRadioButton();
        radioButton14 = new JRadioButton();
        radioButton15 = new JRadioButton();
        radioButton16 = new JRadioButton();
        radioButton17 = new JRadioButton();
        radioButton18 = new JRadioButton();
        radioButton19 = new JRadioButton();
        radioButton20 = new JRadioButton();
        textArea3 = new JTextArea();
        radioButton21 = new JRadioButton();
        radioButton22 = new JRadioButton();
        radioButton23 = new JRadioButton();
        radioButton24 = new JRadioButton();
        radioButton25 = new JRadioButton();
        radioButton26 = new JRadioButton();
        radioButton27 = new JRadioButton();
        radioButton28 = new JRadioButton();
        radioButton29 = new JRadioButton();
        radioButton30 = new JRadioButton();
        scrollPane2 = new JScrollPane();
        editorPane1 = new JEditorPane();
        label3 = new JLabel();

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

            //---- button1 ----
            button1.setText(">>>>");

            //---- button2 ----
            button2.setText("<<<<");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 776, Short.MAX_VALUE)
                        .addComponent(button1)
                        .addGap(18, 18, 18)
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

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textArea1);
            }

            //---- radioButton1 ----
            radioButton1.setText("1");

            //---- radioButton2 ----
            radioButton2.setText("2");

            //---- radioButton3 ----
            radioButton3.setText("3");

            //---- radioButton4 ----
            radioButton4.setText("4");

            //---- radioButton5 ----
            radioButton5.setText("5");

            //---- radioButton6 ----
            radioButton6.setText("6");

            //---- radioButton7 ----
            radioButton7.setText("7");

            //---- radioButton8 ----
            radioButton8.setText("8");

            //---- radioButton9 ----
            radioButton9.setText("9");

            //---- radioButton10 ----
            radioButton10.setText("10");

            //---- radioButton11 ----
            radioButton11.setText("5");

            //---- radioButton12 ----
            radioButton12.setText("4");

            //---- radioButton13 ----
            radioButton13.setText("3");

            //---- radioButton14 ----
            radioButton14.setText("2");

            //---- radioButton15 ----
            radioButton15.setText("1");

            //---- radioButton16 ----
            radioButton16.setText("6");

            //---- radioButton17 ----
            radioButton17.setText("7");

            //---- radioButton18 ----
            radioButton18.setText("8");

            //---- radioButton19 ----
            radioButton19.setText("9");

            //---- radioButton20 ----
            radioButton20.setText("10");

            //---- radioButton21 ----
            radioButton21.setText("5");

            //---- radioButton22 ----
            radioButton22.setText("4");

            //---- radioButton23 ----
            radioButton23.setText("3");

            //---- radioButton24 ----
            radioButton24.setText("2");

            //---- radioButton25 ----
            radioButton25.setText("1");

            //---- radioButton26 ----
            radioButton26.setText("6");

            //---- radioButton27 ----
            radioButton27.setText("7");

            //---- radioButton28 ----
            radioButton28.setText("8");

            //---- radioButton29 ----
            radioButton29.setText("9");

            //---- radioButton30 ----
            radioButton30.setText("10");

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(editorPane1);
            }

            //---- label3 ----
            label3.setText("Notes");

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton3)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton4)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton5)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton6)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton7)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton8)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton9)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton10))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(panel3Layout.createParallelGroup()
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioButton15)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton14)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton13)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton12)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton11)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton16)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton17)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton18)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton19)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton20))
                                    .addComponent(label3)
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addGroup(panel3Layout.createParallelGroup()
                                            .addComponent(textArea3, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radioButton25)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton24)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton23)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton22)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton21)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton26)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton27)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton28)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton29)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton30)))))
                        .addContainerGap(20, Short.MAX_VALUE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel3Layout.createParallelGroup()
                                        .addComponent(radioButton3)
                                        .addComponent(radioButton4)
                                        .addComponent(radioButton5)
                                        .addComponent(radioButton6)
                                        .addComponent(radioButton7)
                                        .addComponent(radioButton8)
                                        .addComponent(radioButton9)
                                        .addComponent(radioButton10))
                                    .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(radioButton1)
                                        .addComponent(radioButton2)))))
                        .addGroup(panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(panel3Layout.createParallelGroup()
                                    .addComponent(radioButton15)
                                    .addComponent(radioButton14)
                                    .addComponent(radioButton13)
                                    .addComponent(radioButton12)
                                    .addComponent(radioButton11)
                                    .addComponent(radioButton16)
                                    .addComponent(radioButton17)
                                    .addComponent(radioButton18)
                                    .addComponent(radioButton19)
                                    .addComponent(radioButton20)))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(textArea3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panel3Layout.createParallelGroup()
                                    .addComponent(radioButton25)
                                    .addComponent(radioButton24)
                                    .addComponent(radioButton23)
                                    .addComponent(radioButton22)
                                    .addComponent(radioButton21)
                                    .addComponent(radioButton26)
                                    .addComponent(radioButton27)
                                    .addComponent(radioButton28)
                                    .addComponent(radioButton29)
                                    .addComponent(radioButton30))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label3)
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
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

        //---- buttonGroup1 ----
        var buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        buttonGroup1.add(radioButton3);
        buttonGroup1.add(radioButton4);
        buttonGroup1.add(radioButton5);
        buttonGroup1.add(radioButton6);
        buttonGroup1.add(radioButton7);
        buttonGroup1.add(radioButton8);
        buttonGroup1.add(radioButton9);
        buttonGroup1.add(radioButton10);
        buttonGroup1.add(radioButton11);
        buttonGroup1.add(radioButton12);
        buttonGroup1.add(radioButton13);
        buttonGroup1.add(radioButton14);
        buttonGroup1.add(radioButton15);
        buttonGroup1.add(radioButton16);
        buttonGroup1.add(radioButton17);
        buttonGroup1.add(radioButton18);
        buttonGroup1.add(radioButton19);
        buttonGroup1.add(radioButton20);
        buttonGroup1.add(radioButton21);
        buttonGroup1.add(radioButton22);
        buttonGroup1.add(radioButton23);
        buttonGroup1.add(radioButton24);
        buttonGroup1.add(radioButton25);
        buttonGroup1.add(radioButton26);
        buttonGroup1.add(radioButton27);
        buttonGroup1.add(radioButton28);
        buttonGroup1.add(radioButton29);
        buttonGroup1.add(radioButton30);
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
    public JScrollPane scrollPane1;
    public JTextArea textArea1;
    public JRadioButton radioButton1;
    public JRadioButton radioButton2;
    public JRadioButton radioButton3;
    public JRadioButton radioButton4;
    public JRadioButton radioButton5;
    public JRadioButton radioButton6;
    public JRadioButton radioButton7;
    public JRadioButton radioButton8;
    public JRadioButton radioButton9;
    public JRadioButton radioButton10;
    public JTextArea textArea2;
    public JRadioButton radioButton11;
    public JRadioButton radioButton12;
    public JRadioButton radioButton13;
    public JRadioButton radioButton14;
    public JRadioButton radioButton15;
    public JRadioButton radioButton16;
    public JRadioButton radioButton17;
    public JRadioButton radioButton18;
    public JRadioButton radioButton19;
    public JRadioButton radioButton20;
    public JTextArea textArea3;
    public JRadioButton radioButton21;
    public JRadioButton radioButton22;
    public JRadioButton radioButton23;
    public JRadioButton radioButton24;
    public JRadioButton radioButton25;
    public JRadioButton radioButton26;
    public JRadioButton radioButton27;
    public JRadioButton radioButton28;
    public JRadioButton radioButton29;
    public JRadioButton radioButton30;
    public JScrollPane scrollPane2;
    public JEditorPane editorPane1;
    public JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
