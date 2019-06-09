import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SignUpFrame extends JFrame {
    private SignUpPanel sign;

    public SignUpFrame() {


        setLayout(new BorderLayout());
        sign = new SignUpPanel();
        add(sign, BorderLayout.CENTER);
        setSize(400, 400);
        setVisible(true);
    }

    public static class SignUpPanel extends JPanel {

        private JLabel nameLabel, lastNameLabel, acNumbuerLabel, balancelabel, passwordLabel;
        private JTextField namefield, lastNfield, acNumberField, balanceField;
        private JPasswordField passwordField;
        private JButton signupButton, resetButton;

        public SignUpPanel() {


            nameLabel = new JLabel("Name ");
            lastNameLabel = new JLabel("Last Name");
            acNumbuerLabel = new JLabel("Account No:");
            balancelabel = new JLabel("Balance");
            passwordLabel = new JLabel("Password");


            namefield = new JTextField(10);
            lastNfield = new JTextField(10);
            acNumberField = new JTextField(10);
            balanceField = new JTextField(10);
            passwordField = new JPasswordField(10);

            signupButton = new JButton("Sign Up");
            resetButton = new JButton("Reset");

            Border innerBorer = BorderFactory.createTitledBorder("Sign Up");
            Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
            setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorer));

            Dimension dimension = new Dimension(300, 300);
            setPreferredSize(dimension);
            setLayout(new GridBagLayout());

            GridBagConstraints gc = new GridBagConstraints();


            //        gc.insets = new Insets(10,0,10,0);

            gc.gridx = 0;
            gc.gridy = 0;
            gc.weightx = 1;
            gc.weighty = 1;
            gc.fill = GridBagConstraints.NONE;
            gc.anchor = GridBagConstraints.LINE_END;

            gc.weightx = 1;
            gc.weighty = 0.00001;

            add(nameLabel, gc);

            //        gc.weightx = 1;
            //        gc.weighty = 0.00001;


            gc.gridx = 1;
            gc.gridy = 0;
            gc.insets = new Insets(0, 5, 0, 5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(namefield, gc);

            //        gc.insets = new Insets(10,0,10,0);

            ////// second row//////////
            //        gc.insets = new Insets(10,0,10,0);

            gc.weightx = 1;
            gc.weighty = 0.00002;

            gc.gridx = 0;
            gc.gridy = 1;
            gc.anchor = GridBagConstraints.LINE_END;
            add(lastNameLabel, gc);


            gc.gridx = 1;
            gc.gridy = 1;
            gc.insets = new Insets(0, 5, 0, 5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(lastNfield, gc);

            //        gc.insets = new Insets(10,0,10,0);

            /////////// third row////////////

            gc.weightx = 1;
            gc.weighty = 0.00003;


            gc.gridx = 0;
            gc.gridy = 2;
            gc.anchor = GridBagConstraints.LINE_END;
            add(acNumbuerLabel, gc);

            gc.gridx = 1;
            gc.gridy = 2;
            //        gc.insets = new Insets(0,5,0,5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(acNumberField, gc);

            //        gc.insets = new Insets(10,0,10,0);

            ///////// Fourth ////////

            gc.weightx = 1;
            gc.weighty = 0.00004;

            gc.gridx = 0;
            gc.gridy = 3;

            gc.anchor = GridBagConstraints.LINE_END;
            add(balancelabel, gc);

            gc.gridx = 1;
            gc.gridy = 3;
            //        gc.insets = new Insets(0,5,0,5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(balanceField, gc);

            //        gc.insets = new Insets(10,0,10,0);

            //////// fifith ////////
            gc.weightx = 1;
            gc.weighty = 0.00005;

            gc.gridx = 0;
            gc.gridy = 4;
            gc.anchor = GridBagConstraints.LINE_END;
            add(passwordLabel, gc);

            gc.gridx = 1;
            gc.gridy = 4;
            //        gc.insets = new Insets(0,5,0,5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(passwordField, gc);

            //        gc.insets = new Insets(10,0,10,0);

            ////////// sixth ///

            gc.weightx = 1;
            gc.weighty = 0.00007;

            gc.gridx = 0;
            gc.gridy = 5;
            gc.anchor = GridBagConstraints.LINE_END;
            add(signupButton, gc);

            gc.gridx = 1;
            gc.gridy = 5;
            //        gc.insets = new Insets(0,5,0,5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(resetButton, gc);


            signupButton.setActionCommand("SignUp");
            resetButton.setActionCommand("reset");

            signupButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    //                FileOutputStream fis;
                    //                try {
                    //                    fis = new FileOutputStream("UserList.ser");
                    //                } catch (FileNotFoundException ex) {
                    //                    ex.printStackTrace();
                    //                }
                    ObjectOutputStream outputStream = null;
                    try {
                        outputStream = new ObjectOutputStream(new FileOutputStream("CustomerList.ser"));

                    } catch (FileNotFoundException ex) {
                        System.out.println("File Not Found");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }


                }
            });

            resetButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    namefield.setText("");
                    lastNfield.setText("");
                    acNumberField.setText("");
                    passwordField.setText("");
                    balanceField.setText("");


                }
            });


        }
    }
}
