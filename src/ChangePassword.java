import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ChangePassword extends JFrame {

    private ChangePasswordPanel changePasswordPanel;

    public ChangePassword() {
        changePasswordPanel = new ChangePasswordPanel();
        setLayout(new BorderLayout());
        setSize(500,500);
        setVisible(true);

        add(changePasswordPanel,BorderLayout.CENTER);
    }

    private class ChangePasswordPanel extends JPanel {

        private JPasswordField oldPassField , newPassField ,repeatPassfield;
        private JLabel oldPassLabel , newPassLabel ,repeatPassLabel;
        private JButton changePassBtn , resetProgBtn;

        public ChangePasswordPanel() {

            oldPassLabel = new JLabel("Old Password");
            newPassLabel = new JLabel("New Password");
            repeatPassLabel = new JLabel("Repeat Password");

            oldPassField = new JPasswordField(12);
            newPassField = new JPasswordField(12);
            repeatPassfield = new JPasswordField(12);

            changePassBtn = new JButton("Change");
            resetProgBtn = new JButton("Clear Everything");


            Border innerBorer = BorderFactory.createTitledBorder("Change Password");
            Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
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


            add(oldPassLabel, gc);


            gc.insets = new Insets(0,10,0,10);
            gc.gridx = 1;
            gc.gridy = 0;
            gc.insets = new Insets(0, 5, 0, 5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(oldPassField, gc);

//            gc.weightx = 1;
//            gc.weighty = 0.00001;


            //////////////////Second Row//////////////

//            gc.weightx = 1;
//            gc.weighty = 0.00002;

            gc.gridx = 0;
            gc.gridy = 1;
            gc.anchor = GridBagConstraints.LINE_END;
            add(newPassLabel, gc);

            gc.insets = new Insets(0,10,0,10);

            gc.gridx = 1;
            gc.gridy = 1;
            gc.insets = new Insets(0,5,0,5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(newPassField, gc);


            ////////// Third Row ///////////////

//            gc.weightx = 1;
//            gc.weighty = 2;

            gc.gridx = 0;
            gc.gridy = 2;
            gc.anchor = GridBagConstraints.LINE_END;
            add(repeatPassLabel, gc);


            gc.gridx = 1;
            gc.gridy = 2;
            gc.anchor = GridBagConstraints.LINE_START;
            add(repeatPassfield, gc);

            /////////// 4th Row //////////////


//            gc.weightx = 1;
//            gc.weighty = 2;

            gc.gridx = 0;
            gc.gridy = 3;
            gc.anchor = GridBagConstraints.LINE_END;
            add(changePassBtn, gc);


            gc.gridx = 1;
            gc.gridy = 3;
            gc.anchor = GridBagConstraints.LINE_START;
            add(resetProgBtn, gc);

            resetProgBtn.addActionListener(e -> {
                oldPassField.setText("");
                newPassField.setText("");
                repeatPassfield.setText("");
            });

            changePassBtn.addActionListener(e -> {
                if (newPassField.getPassword().toString().equals(repeatPassfield.getPassword().toString())){
                    System.out.println("Password change method will be implemented later");
                }
                else {
                    JOptionPane.showInputDialog("Password Does not Match");
                }
            });


        }
    }
}
