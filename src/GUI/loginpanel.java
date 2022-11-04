/*
 * Created by JFormDesigner on Sun Oct 02 10:09:07 CEST 2022
 */

package GUI;

import GUI.userdata.applicationstatics;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.tools.Tool;

/**
 * @author unknown
 */
public class loginpanel extends JPanel {


    public static JFrame frame = new JFrame();
    public loginpanel() {
        initComponents();
    }

    public void exit_(ActionEvent e) {
        System.exit(0);
    }

    public void login_pressed(ActionEvent e) {JFrame eframe = new JFrame();
menu.main(null);
frame.dispose();

    }

    public static void main(String[] args) throws IOException {
        frame.setContentPane(new loginpanel());


        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.pack();
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setVisible(true);
        applicationstatics.userhome = System.getProperty("user.home");
        applicationstatics.applicationhome = applicationstatics.userhome + "/hdware/";
        applicationstatics.databasehome = applicationstatics.applicationhome + "hddata/";
        applicationstatics.structurehome = applicationstatics.applicationhome + "Structure";
        applicationstatics.programhome = applicationstatics.applicationhome + "mcprograms/";

        String cnlsstring = Files.readString(Path.of(applicationstatics.databasehome + "/cnls.set"));
        System.out.println(cnlsstring);
        applicationstatics.applicationssetting = cnlsstring.split(",");
for(int i=0;i<applicationstatics.applicationssetting.length;i++) {
    System.out.println(applicationstatics.applicationssetting[i]);
}





    }


    public void login(ActionEvent e) {
        // TODO add your code here
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        exit_button = new JButton();
        connectbutton = new JButton();
        comboBox1 = new JComboBox();
        panel3 = new JPanel();
        panel4 = new JPanel();
        usernamelabel = new JLabel();
        usernamefield = new JTextField();
        passwordlabel = new JLabel();
        passwordfield = new JPasswordField();
        loginbutton = new JButton();
        label4 = new JLabel();
        scrollPane1 = new JScrollPane();
        disclaimertext = new JTextArea();

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

            //---- exit_button ----
            exit_button.setText("<<<<");
            exit_button.addActionListener(e -> exit_(e));

            //---- connectbutton ----
            connectbutton.setText("Connect to Device");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit_button)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(connectbutton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 552, Short.MAX_VALUE)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit_button)
                        .addComponent(connectbutton)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
        }

        //======== panel3 ========
        {

            //======== panel4 ========
            {

                //---- usernamelabel ----
                usernamelabel.setText("Username");

                //---- passwordlabel ----
                passwordlabel.setText("Password");

                //---- loginbutton ----
                loginbutton.setText("Login");
                loginbutton.addActionListener(e -> {
			login_pressed(e);
			login(e);
		});

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel4Layout.createParallelGroup()
                                .addComponent(usernamefield, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addComponent(usernamelabel)
                                        .addComponent(passwordlabel))
                                    .addGap(0, 224, Short.MAX_VALUE))
                                .addComponent(passwordfield, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                .addComponent(loginbutton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                            .addContainerGap())
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(usernamelabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(usernamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passwordlabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passwordfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(loginbutton)
                            .addContainerGap(158, Short.MAX_VALUE))
                );
            }

            //---- label4 ----
            label4.setIcon(new ImageIcon(getClass().getResource("/pics/bedienungsanllesen.png")));

            //======== scrollPane1 ========
            {

                //---- disclaimertext ----
                disclaimertext.setText("Read manual before use. This Device is not a medical device nor has for this device the conformity  as a medical device according to the regulatory rules  be declared by the manufacturer. Use this device only for the scope of use described in manual.");
                disclaimertext.setLineWrap(true);
                disclaimertext.setWrapStyleWord(true);
                disclaimertext.setEditable(false);
                disclaimertext.setFocusable(false);
                disclaimertext.setBorder(null);
                scrollPane1.setViewportView(disclaimertext);
            }

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                        .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addContainerGap(829, Short.MAX_VALUE)
                        .addComponent(label4)
                        .addGap(119, 119, 119))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap(138, Short.MAX_VALUE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
    public JLabel label2;
    public JButton exit_button;
    public JButton connectbutton;
    public JComboBox comboBox1;
    public JPanel panel3;
    public JPanel panel4;
    public JLabel usernamelabel;
    public JTextField usernamefield;
    public JLabel passwordlabel;
    public JPasswordField passwordfield;
    public JButton loginbutton;
    public JLabel label4;
    public JScrollPane scrollPane1;
    public JTextArea disclaimertext;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
