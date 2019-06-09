//package com.Bangash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.SANS_SERIF;

public class LoginFrame extends JFrame {



    Container container = getContentPane();



//    Label l1,l2;
//    TextField t1 ,t2 ;



    Label l1 = new Label("UserName ");
//    add(l1);

    TextField t1 = new TextField();
//    add(t1);

    Label l2 = new Label("Password");
//    add(l2);

    JPasswordField t2 = new JPasswordField();
//    add(t2);
    Label l3 = new Label("Note: UserName and Password are case sensitive");

    Button b = new Button("Login");
//    add(b);
    Button button = new Button("Admin Login");

    JCheckBox jCheckBox = new JCheckBox("Show Password",null);

    public LoginFrame() {
        container.setLayout(null);
        setSize(400,400);
        setVisible(true);
        addComponents();


        getContentPane().setBackground(Color.yellow);
//        getContentPane().setBackground();
//        File file = new File("/home/shahid/IdeaProjects/GuiQuiz/107679826-login-vector-icon-isolated-on-transparent-background-login-logo-concept.jpg");
//        setIconImage(Toolkit.getDefaultToolkit().getImage(LoginFrame.class.getResource("/home/shahid/IdeaProjects/GuiQuiz/107679826-login-vector-icon-isolated-on-transparent-background-login-logo-concept.jpg")));


        jCheckBox.setActionCommand("Selected");

        MyActionListener listener = new MyActionListener();

        jCheckBox.addActionListener(listener);

    }





    public void addComponents(){
        l1.setBounds(50,150,70,30);

        t1.setBounds(200,150,200,30);
        l1.setBackground(Color.lightGray);
        l2.setBounds(50,220,70,30);
        t2.setBounds(200,220,200,30);
        b.setBounds(50,320,100,30);
        b.setBackground(Color.black);
        b.setForeground(Color.WHITE);
        Font font = new Font(SANS_SERIF,Font.BOLD,11);
        b.setFont(font);

        jCheckBox.setBounds(50,250,200,30);
        jCheckBox.setBackground(Color.yellow);
        jCheckBox.setFont(font);


        l3.setBounds(50,280,355,20);
        l3.setBackground(Color.yellow);
        l3.setFont(font);

        container.add(l1);
        container.add(t1);
        container.add(l2);
        container.add(t2);
        container.add(b);
        container.add(button);
        container.add(l3);
        container.add(jCheckBox);

    }


    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Selected")){
                t2.getPassword().toString();
//                t2.getText();
//                    t2.setVisible(jCheckBox.isSelected());

            }
        }
    }
}
