/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering.system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ROG
 */
public class receipt extends javax.swing.JFrame {

    /**
     * Creates new form generate_receipt
     */
    public receipt() {
        initComponents();
        // set the JFrame to center position
        this.setLocationRelativeTo(null);
        
        // define id as receive_payment customerID
        receive_payment rp= new receive_payment();
        String cusid = rp.customerID;
        String orderid = rp.orderID;

        // generate receipt
        try {
            String line;
            String line2;
            // read order.txt and receipt.txt
            BufferedReader br = new BufferedReader(new FileReader("order.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("receipt.txt"));

            // receipt design
            receipt_txtArea.setText(receipt_txtArea.getText() + "*                           Customer ID                         *\n");
            receipt_txtArea.setText(receipt_txtArea.getText() + "******************************************\n");
            receipt_txtArea.setText(receipt_txtArea.getText() + "*                               "+cusid+"                              *\n");
            receipt_txtArea.setText(receipt_txtArea.getText() + "******************************************\n");
            receipt_txtArea.setText(receipt_txtArea.getText() + "*                         Cafeteria Receipt                     *\n");
            receipt_txtArea.setText(receipt_txtArea.getText() + "******************************************\n");
            receipt_txtArea.setText(receipt_txtArea.getText() + "*                            Item Name                           *\n");
            receipt_txtArea.setText(receipt_txtArea.getText() + "******************************************\n");
            receipt_txtArea.setText(receipt_txtArea.getText() + "*                              Order ID                            *\n");
            receipt_txtArea.setText(receipt_txtArea.getText() + "******************************************\n");
            receipt_txtArea.setText(receipt_txtArea.getText() + "*                              "+orderid+"                             *\n");
            receipt_txtArea.setText(receipt_txtArea.getText() + "******************************************\n");
            while ((line = br.readLine()) != null) {
                String orderData [] = line.split(",");
                if (line.contains(orderid)) {

                    String a = orderData[0];
                    String b = orderData[1];
                    String c = orderData[2];
                    String d = orderData[3];

                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(d);

                    receipt_txtArea.setText(receipt_txtArea.getText() + ""+ c +" "+ a +"                                 \n");
                    receipt_txtArea.setText(receipt_txtArea.getText() + "                                                    Total : RM "+d+"      \n");
                }
            }
            while ((line2 = br2.readLine()) != null) {
                String receiptData [] = line2.split(",");
                if(line2.contains(orderid)) {
                    receipt_txtArea.setText(receipt_txtArea.getText() + "******************************************\n");
                    receipt_txtArea.setText(receipt_txtArea.getText() + "Total Amount:                                       "+receiptData[1]+"\n");
                    receipt_txtArea.setText(receipt_txtArea.getText() + "Service Charge:                                     "+receiptData[2]+"\n");
                    receipt_txtArea.setText(receipt_txtArea.getText() + "Total Payment:                                     "+receiptData[3]+"\n");
                    receipt_txtArea.setText(receipt_txtArea.getText() + "Total Paid:                                           RM "+receiptData[4]+"\n");
                    receipt_txtArea.setText(receipt_txtArea.getText() + "Balance:                                               "+receiptData[5]+"\n");
                    receipt_txtArea.setText(receipt_txtArea.getText() + "******************************************\n");
                    receipt_txtArea.setText(receipt_txtArea.getText() + "************   THANK YOU!!!!!    ***********\n");
                    receipt_txtArea.setText(receipt_txtArea.getText() + "*******   PLEASE COME AGAIN!!!   *********\n");
                    Date obj = new Date();
                    String date = obj.toString();
                    receipt_txtArea.setText(receipt_txtArea.getText() + "\n" + date +"\n");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(receipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt_txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back_button.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 550, -1, -1));

        receipt_txtArea.setColumns(20);
        receipt_txtArea.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        receipt_txtArea.setRows(5);
        jScrollPane1.setViewportView(receipt_txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 404, 533));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // back
    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        receive_payment rp = new receive_payment();
        rp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea receipt_txtArea;
    // End of variables declaration//GEN-END:variables
}
