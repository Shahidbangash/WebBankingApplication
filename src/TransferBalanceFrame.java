import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TransferBalanceFrame extends JFrame {


    private TransferBalancePanel transferBalancePanel;



    public TransferBalanceFrame() {
        transferBalancePanel = new TransferBalancePanel();
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(400,400);
        add(transferBalancePanel,BorderLayout.CENTER);

    }

    private class TransferBalancePanel extends JPanel {

        private JLabel acNoLabel;
        private JTextField acNoField;


        private JLabel amountLabel;
        private JTextField amountField;

        private JButton transferBtn;
        private JButton checkBalanceBtn;

        public TransferBalancePanel() {


            transferBtn = new JButton("Transfer");
            checkBalanceBtn = new JButton("Check Balance");
            acNoLabel = new JLabel("Account Number");
            acNoField = new JTextField(12);
            amountLabel = new JLabel("Enter Amount");
            amountField = new JTextField(12);

            Border innerBorer = BorderFactory.createTitledBorder("Transfer Balance");
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
            add(acNoLabel, gc);

            gc.insets = new Insets(0,10,0,10);

            gc.gridx = 1;
            gc.gridy = 1;
            gc.insets = new Insets(0,5,0,5);
            gc.anchor = GridBagConstraints.LINE_START;
            add(acNoField, gc);


            ////////// Third Row ///////////////

            gc.weightx = 1;
            gc.weighty = 0.000007;

            gc.gridx = 0;
            gc.gridy = 5;
            gc.anchor = GridBagConstraints.LINE_END;
            add(checkBalanceBtn, gc);


            gc.gridx = 1;
            gc.gridy = 5;
            gc.anchor = GridBagConstraints.LINE_START;
            add(transferBtn, gc);

            /////////////////

        }
    }





}
