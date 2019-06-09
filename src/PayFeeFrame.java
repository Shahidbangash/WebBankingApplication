import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayFeeFrame extends JFrame {




    private PayBillPanel billPanel;


    public PayFeeFrame() {
        setVisible(true);
        setSize(400,400);
        billPanel = new PayBillPanel();
        setLayout(new BorderLayout());
        add(billPanel,BorderLayout.CENTER);


    }




    private class PayBillPanel extends JPanel {

        private JLabel amountLabel, chalanNoLabel;
        private JTextField amountField, chalanNoField;
        private JButton submitButton ;

        public PayBillPanel() {

//            setLayout(new BorderLayout());
            chalanNoLabel = new JLabel("Chalan No:");
            amountLabel = new JLabel("Amount:");
            chalanNoField = new JTextField(10);
            amountField = new JTextField(10);
            submitButton = new JButton("Submit");


            Border innerBorer = BorderFactory.createTitledBorder("Pay Fees");
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

            gc.weightx = 1;
            gc.weighty = 0.00001;

            add(amountLabel, gc);

            gc.insets = new Insets(0,10,0,10);

            gc.gridx = 1;
            gc.gridy = 0;
            gc.insets = new Insets(0, 5, 0, 5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(amountField, gc);


            //////////////////Second Row//////////////

            gc.weightx = 1;
            gc.weighty = 0.00002;

            gc.gridx = 0;
            gc.gridy = 1;
            gc.anchor = GridBagConstraints.LINE_END;
            add(chalanNoLabel, gc);

            gc.insets = new Insets(0,10,0,10);

            gc.gridx = 1;
            gc.gridy = 1;
            gc.insets = new Insets(0,5,0,5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(chalanNoField, gc);


            ////////// Third Row ///////////////

            gc.weightx = 1;
            gc.weighty = 0.000007;

            gc.gridx = 0;
            gc.gridy = 5;
            gc.anchor = GridBagConstraints.LINE_END;
            add(submitButton, gc);

           /////////////////

            submitButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    int amount = Integer.parseInt(amountLabel.getText());
                    String chalanNo = chalanNoField.getText();


                }
            });


        }
    }
}

