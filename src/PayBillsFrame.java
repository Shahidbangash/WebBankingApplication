import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayBillsFrame extends JFrame {

    private PayBillPanel billsFrame;

    public PayBillsFrame() {
        setLayout(new BorderLayout());
        setSize(600, 600);
        setVisible(true);
        billsFrame = new PayBillPanel();
        add(billsFrame, BorderLayout.CENTER);
    }


    private class PayBillPanel extends JPanel {
        private JCheckBox checkBox;
        private JButton electtricityBillBtn, gasBillBtn, mobileRechBtn;


        public PayBillPanel() {


            electtricityBillBtn = new JButton("Electricity");
            gasBillBtn = new JButton("Gas");
            mobileRechBtn = new JButton("Recharge Mobile");


            setLayout(new GridBagLayout());


            Border innerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
            Border titledBorder = BorderFactory.createTitledBorder("Pay Bill");
            setBorder(BorderFactory.createCompoundBorder(innerBorder, titledBorder));

            setPreferredSize(new Dimension(300, 300));


            GridBagConstraints gc = new GridBagConstraints();


            //CompoundBorder(innerBorder, titledBorder);

            gc.gridx = 0;
            gc.gridy = 0;
            gc.weighty = 1;
            gc.weightx = 1;
            gc.fill = GridBagConstraints.NONE;
            gc.anchor = GridBagConstraints.LINE_START;

            gc.weighty = 0.011;
            gc.weightx = 1;

            add(electtricityBillBtn, gc);

            /////// Second row //////////

            gc.gridx = 0;
            gc.gridy = 1;

            gc.weightx = 1;
            gc.weighty = 0.001;

//            gc.fill = GridBagConstraints.NONE;
            gc.anchor = GridBagConstraints.LINE_START;

            add(gasBillBtn, gc);


            //////// Third row //////////////

            gc.gridx = 0;
            gc.gridy = 2;

            gc.weightx = 1;
            gc.weighty = 0.0001;


            gc.anchor = GridBagConstraints.LINE_START;
            add(mobileRechBtn, gc);


            gasBillBtn.addActionListener(e -> {
                GasBillPaymentFrame paymentFrame = new GasBillPaymentFrame();
                gc.gridx = 2;
                gc.gridy = 1;
                add(paymentFrame, gc);
            });

            electtricityBillBtn.addActionListener(e -> {
                ELectricityBillPaymentFrame eLectricityBillPaymentFrame = new ELectricityBillPaymentFrame();
                gc.gridx = 2;
                gc.gridy = 1;
                add(eLectricityBillPaymentFrame, gc);
            });

            mobileRechBtn.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    MobilePaymentPanel paymentPanel = new MobilePaymentPanel();
                    gc.gridx = 2;
                    gc.gridy = 1;

                    add(paymentPanel, gc);


                }
            });


        }
    }


    private class GasBillPaymentFrame extends JPanel {
        private JLabel referenceNoLabel, amountLabel;
        private JTextField refrenceNoField, amountField;
        private JButton submitButton;

        public GasBillPaymentFrame() {

            referenceNoLabel = new JLabel("Reference No:");
            amountLabel = new JLabel("Amount:");
            refrenceNoField = new JTextField(10);
            amountField = new JTextField(10);
            submitButton = new JButton("Submit");


            Border innerBorer = BorderFactory.createTitledBorder("GAs Bill Payment");
            Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
            setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorer));

            Dimension dimension = new Dimension(400, 400);
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

            gc.insets = new Insets(0, 10, 0, 10);

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
            add(referenceNoLabel, gc);

            gc.insets = new Insets(0, 10, 0, 10);

            gc.gridx = 1;
            gc.gridy = 1;
            gc.insets = new Insets(0, 5, 0, 5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(refrenceNoField, gc);


            ////////// Third Row ///////////////

            gc.weightx = 1;
            gc.weighty = 0.000007;

            gc.gridx = 0;
            gc.gridy = 5;
            gc.anchor = GridBagConstraints.LINE_END;
            add(submitButton, gc);


        }
    }

    private class ELectricityBillPaymentFrame extends JPanel {

        private JLabel referenceNoLabel, amountLabel;
        private JTextField refrenceNoField, amountField;
        private JButton submitButton;

        public ELectricityBillPaymentFrame() {

            referenceNoLabel = new JLabel("Reference No:");
            amountLabel = new JLabel("Amount:");
            refrenceNoField = new JTextField(10);
            amountField = new JTextField(10);
            submitButton = new JButton("Submit");


            Border innerBorer = BorderFactory.createTitledBorder("GAs Bill Payment");
            Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
            setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorer));

            Dimension dimension = new Dimension(400, 400);
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

            gc.insets = new Insets(0, 10, 0, 10);

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
            add(referenceNoLabel, gc);

            gc.insets = new Insets(0, 10, 0, 10);

            gc.gridx = 1;
            gc.gridy = 1;
            gc.insets = new Insets(0, 5, 0, 5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(refrenceNoField, gc);


            ////////// Third Row ///////////////

            gc.weightx = 1;
            gc.weighty = 0.000007;

            gc.gridx = 0;
            gc.gridy = 5;
            gc.anchor = GridBagConstraints.LINE_END;
            add(submitButton, gc);

        }
    }

    private class MobilePaymentPanel extends JPanel {

        private JLabel mobileNoLabel, amountLabel;
        private JTextField mobileNoField, amountField;
        private JButton submitButton;

        public MobilePaymentPanel() {

            mobileNoLabel = new JLabel("Mobile No:");
            amountLabel = new JLabel("Amount:");
            mobileNoField = new JTextField(12);
            amountField = new JTextField(12);
            submitButton = new JButton("Submit");


            Border innerBorer = BorderFactory.createTitledBorder("Mobile Recharge");
            Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
            setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorer));

            Dimension dimension = new Dimension(400, 400);
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

            gc.insets = new Insets(0, 10, 0, 10);

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
            add(mobileNoLabel, gc);

            gc.insets = new Insets(0, 10, 0, 10);

            gc.gridx = 1;
            gc.gridy = 1;
            gc.insets = new Insets(0, 5, 0, 5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(mobileNoField, gc);


            ////////// Third Row ///////////////

            gc.weightx = 1;
            gc.weighty = 0.000007;

            gc.gridx = 0;
            gc.gridy = 5;
            gc.anchor = GridBagConstraints.LINE_END;
            add(submitButton, gc);
        }
    }
}
