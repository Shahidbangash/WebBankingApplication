//package com.Bangash;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class AfterLoginFrame extends JFrame {
    Container container = getContentPane();
    JLabel l3 = new JLabel();
    Font font = new Font(Font.SANS_SERIF, Font.BOLD, 10);
    private AfterLoginFramePanel afterLoginFramePanel;


    public AfterLoginFrame() {
        afterLoginFramePanel = new AfterLoginFramePanel();
        setLayout(new BorderLayout());
        setSize(500, 500);
        setVisible(true);

        add(afterLoginFramePanel, BorderLayout.CENTER);


    }


    private class AfterLoginFramePanel extends JPanel {

        private JButton showBalanceBtn;
        private JButton transferBalanceBtn;
//        private JButton manageBeneficiaryBtn;
        private JButton updateProfileBtn;
        private JButton changePasswordBtn;
        private JButton logOutBtn;
        private JButton payBillsBtn;
        private JButton payFeesBtn;

        public AfterLoginFramePanel() {

            showBalanceBtn = new JButton("View Balance");
            transferBalanceBtn = new JButton("Transfer Balance");
//            manageBeneficiaryBtn = new JButton("Manage Beneficiary");
            updateProfileBtn = new JButton("Update Profile");
            changePasswordBtn = new JButton("Change Password");
            logOutBtn = new JButton("Log out");
            payBillsBtn = new JButton("Pay Bills");
            payFeesBtn = new JButton("Pay Fees");


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
            gc.anchor = GridBagConstraints.LINE_START;

//            gc.weightx = 1;
//            gc.weighty = 0.00001;

            add(showBalanceBtn, gc);

            gc.insets = new Insets(0, 10, 0, 10);

            gc.gridx = 1;
            gc.gridy = 0;
            gc.insets = new Insets(0, 5, 0, 5);
            gc.anchor = GridBagConstraints.LINE_END;
            add(transferBalanceBtn, gc);


            //////////////////Second Row//////////////

//            gc.weightx = 1;
//            gc.weighty = 0.00002;

            gc.gridx = 0;
            gc.gridy = 1;
            gc.anchor = GridBagConstraints.LINE_START;
            add(payBillsBtn, gc);

            gc.insets = new Insets(0, 10, 0, 10);

            gc.gridx = 1;
            gc.gridy = 1;
            gc.insets = new Insets(0, 5, 0, 5);
            gc.anchor = GridBagConstraints.LINE_END;
//            add(, gc);


            ////////// Third Row ///////////////

//
            gc.gridx = 0;
            gc.gridy = 2;
            gc.anchor = GridBagConstraints.LINE_START;
            add(payFeesBtn, gc);

            gc.gridx = 1;
            gc.gridy = 2;
            gc.insets = new Insets(0, 5, 0, 5);
            gc.anchor = GridBagConstraints.LINE_END;
            add(updateProfileBtn, gc);



            //////// Fourth Row ////////////

            gc.gridx = 0;
            gc.gridy = 3;
            gc.anchor = GridBagConstraints.LINE_START;
            add(changePasswordBtn, gc);

            gc.gridx = 1;
            gc.gridy = 3;
            gc.insets = new Insets(0, 5, 0, 5);
            gc.anchor = GridBagConstraints.LINE_END;
            add(logOutBtn, gc);


            showBalanceBtn.addActionListener(e -> {
                System.out.println("your balance is ");
            });

            transferBalanceBtn.addActionListener(e -> {
                TransferBalanceFrame transferBalanceFrame = new TransferBalanceFrame();

            });


            logOutBtn.addActionListener(e -> {
                System.out.println(" Implenet appropriate method");
            });

            payFeesBtn.addActionListener(e -> {
                PayFeeFrame feeFrame = new PayFeeFrame();
            });

            payBillsBtn.addActionListener(e -> {
                PayBillsFrame billsFrame = new PayBillsFrame();
            });

//            manageBeneficiaryBtn.addActionListener(e -> {
//                BeneficiaryFrame beneficiaryFrame = new BeneficiaryFrame();
//            });

            changePasswordBtn.addActionListener(e -> {
                ChangePassword changePassword = new ChangePassword();
            });

        }
    }
}

