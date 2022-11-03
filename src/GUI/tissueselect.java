package GUI;/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class tissueselect extends JPanel {
    public tissueselect() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        button10 = new JButton();
        button11 = new JButton();
        toggleButton1 = new JToggleButton();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel6 = new JPanel();
        label3 = new JLabel();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        panel7 = new JPanel();
        label4 = new JLabel();
        scrollPane2 = new JScrollPane();
        list2 = new JList();
        button6 = new JButton();
        panel8 = new JPanel();
        label5 = new JLabel();
        scrollPane3 = new JScrollPane();
        list3 = new JList();
        button7 = new JButton();
        panel9 = new JPanel();
        label6 = new JLabel();
        scrollPane4 = new JScrollPane();
        list4 = new JList();
        button8 = new JButton();
        panel10 = new JPanel();
        label7 = new JLabel();
        scrollPane5 = new JScrollPane();
        list5 = new JList();
        button9 = new JButton();

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

            //---- button10 ----
            button10.setText("<<<<");

            //---- button11 ----
            button11.setText(">>>>");

            //---- toggleButton1 ----
            toggleButton1.setText("25 min +scan");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button10)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 665, Short.MAX_VALUE)
                        .addComponent(toggleButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button11)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button10)
                        .addComponent(button11)
                        .addComponent(toggleButton1))
            );
        }

        //======== panel3 ========
        {

            //======== panel4 ========
            {

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
            }

            //======== panel6 ========
            {

                //---- label3 ----
                label3.setText("Selection List");

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(list1);
                }

                //---- button2 ----
                button2.setText("C+");

                //---- button3 ----
                button3.setText("D+");

                //---- button4 ----
                button4.setText("A+");

                //---- button5 ----
                button5.setText("B+");

                GroupLayout panel6Layout = new GroupLayout(panel6);
                panel6.setLayout(panel6Layout);
                panel6Layout.setHorizontalGroup(
                    panel6Layout.createParallelGroup()
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel6Layout.createParallelGroup()
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addGroup(panel6Layout.createParallelGroup()
                                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addGroup(panel6Layout.createSequentialGroup()
                                            .addComponent(button2)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                            .addComponent(button3))
                                        .addGroup(panel6Layout.createSequentialGroup()
                                            .addComponent(button4)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                            .addComponent(button5)))
                                    .addContainerGap())))
                );
                panel6Layout.setVerticalGroup(
                    panel6Layout.createParallelGroup()
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label3)
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button4)
                                .addComponent(button5))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button2)
                                .addComponent(button3))
                            .addContainerGap())
                );
            }

            //======== panel7 ========
            {

                //---- label4 ----
                label4.setText("A");

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(list2);
                }

                //---- button6 ----
                button6.setText("del selected");

                GroupLayout panel7Layout = new GroupLayout(panel7);
                panel7.setLayout(panel7Layout);
                panel7Layout.setHorizontalGroup(
                    panel7Layout.createParallelGroup()
                        .addGroup(panel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel7Layout.createParallelGroup()
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addGroup(panel7Layout.createParallelGroup()
                                        .addComponent(button6, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addGroup(panel7Layout.createSequentialGroup()
                                            .addComponent(label4)
                                            .addGap(0, 141, Short.MAX_VALUE)))
                                    .addContainerGap())))
                );
                panel7Layout.setVerticalGroup(
                    panel7Layout.createParallelGroup()
                        .addGroup(panel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label4)
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button6)
                            .addContainerGap())
                );
            }

            //======== panel8 ========
            {

                //---- label5 ----
                label5.setText("B");

                //======== scrollPane3 ========
                {
                    scrollPane3.setViewportView(list3);
                }

                //---- button7 ----
                button7.setText("del selected");

                GroupLayout panel8Layout = new GroupLayout(panel8);
                panel8.setLayout(panel8Layout);
                panel8Layout.setHorizontalGroup(
                    panel8Layout.createParallelGroup()
                        .addGroup(panel8Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel8Layout.createParallelGroup()
                                .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addGroup(panel8Layout.createSequentialGroup()
                                    .addGroup(panel8Layout.createParallelGroup()
                                        .addComponent(button7, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addGroup(panel8Layout.createSequentialGroup()
                                            .addComponent(label5)
                                            .addGap(0, 141, Short.MAX_VALUE)))
                                    .addContainerGap())))
                );
                panel8Layout.setVerticalGroup(
                    panel8Layout.createParallelGroup()
                        .addGroup(panel8Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label5)
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button7)
                            .addContainerGap())
                );
            }

            //======== panel9 ========
            {

                //---- label6 ----
                label6.setText("C");

                //======== scrollPane4 ========
                {
                    scrollPane4.setViewportView(list4);
                }

                //---- button8 ----
                button8.setText("del selected");

                GroupLayout panel9Layout = new GroupLayout(panel9);
                panel9.setLayout(panel9Layout);
                panel9Layout.setHorizontalGroup(
                    panel9Layout.createParallelGroup()
                        .addGroup(panel9Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel9Layout.createParallelGroup()
                                .addComponent(scrollPane4, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addGroup(panel9Layout.createParallelGroup()
                                        .addComponent(button8, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addGroup(panel9Layout.createSequentialGroup()
                                            .addComponent(label6)
                                            .addGap(0, 141, Short.MAX_VALUE)))
                                    .addContainerGap())))
                );
                panel9Layout.setVerticalGroup(
                    panel9Layout.createParallelGroup()
                        .addGroup(panel9Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label6)
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane4, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button8)
                            .addContainerGap())
                );
            }

            //======== panel10 ========
            {

                //---- label7 ----
                label7.setText("D");

                //======== scrollPane5 ========
                {
                    scrollPane5.setViewportView(list5);
                }

                //---- button9 ----
                button9.setText("del selected");

                GroupLayout panel10Layout = new GroupLayout(panel10);
                panel10.setLayout(panel10Layout);
                panel10Layout.setHorizontalGroup(
                    panel10Layout.createParallelGroup()
                        .addGroup(panel10Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel10Layout.createParallelGroup()
                                .addComponent(scrollPane5, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addGroup(panel10Layout.createSequentialGroup()
                                    .addGroup(panel10Layout.createParallelGroup()
                                        .addComponent(button9, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addGroup(panel10Layout.createSequentialGroup()
                                            .addComponent(label7)
                                            .addGap(0, 141, Short.MAX_VALUE)))
                                    .addContainerGap())))
                );
                panel10Layout.setVerticalGroup(
                    panel10Layout.createParallelGroup()
                        .addGroup(panel10Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label7)
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane5, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button9)
                            .addContainerGap())
                );
            }

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(panel10, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel9, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel6, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel7, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel8, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))
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
    public static JPanel panel1;
    public static JLabel label1;
    public static JPanel panel2;
    public static JLabel label2;
    public static JButton button10;
    public static JButton button11;
    public static JToggleButton toggleButton1;
    public static JPanel panel3;
    public static JPanel panel4;
    public static JPanel panel6;
    public static JLabel label3;
    public static JScrollPane scrollPane1;
    public static JList list1;
    public static JButton button2;
    public static JButton button3;
    public static JButton button4;
    public static JButton button5;
    public static JPanel panel7;
    public static JLabel label4;
    public static JScrollPane scrollPane2;
    public static JList list2;
    public static JButton button6;
    public static JPanel panel8;
    public static JLabel label5;
    public static JScrollPane scrollPane3;
    public static JList list3;
    public static JButton button7;
    public static JPanel panel9;
    public static JLabel label6;
    public static JScrollPane scrollPane4;
    public static JList list4;
    public static JButton button8;
    public static JPanel panel10;
    public static JLabel label7;
    public static JScrollPane scrollPane5;
    public static JList list5;
    public static JButton button9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
