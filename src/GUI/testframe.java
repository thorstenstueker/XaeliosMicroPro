/*
 * Created by JFormDesigner on Thu Dec 15 23:40:24 CET 2022
 */

package GUI;

import com.formdev.flatlaf.FlatLightLaf;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class testframe extends JPanel {
    public testframe() {
        initComponents();
    }

    public void button1(ActionEvent e) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            throw new RuntimeException(ex);
        }
        String filename;

        JFileChooser chooser = new JFileChooser();
        chooser.showDialog(null,"Yo do it");

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        button1 = new JButton();

        //======== this ========

        //---- button1 ----
        button1.setText("open Filechooser");
        button1.addActionListener(e -> button1(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(322, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(272, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public static JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
