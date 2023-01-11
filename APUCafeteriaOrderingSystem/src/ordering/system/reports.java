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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ROG
 */
public class reports extends javax.swing.JFrame {

    /**
     * Creates new form reports
     */
    public reports() {
        initComponents();
        // set the JFrame to center position
        this.setLocationRelativeTo(null);
        
        // for gender report and user type report
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        
        // for age purpose
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count10 = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("user.txt"));
            BufferedReader br1 = new BufferedReader(new FileReader("item.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("order.txt"));
            
            String line;
            while ((line=br.readLine()) != null) {
                String userData [] = line.split(",");
                // Gender Report 
                // counting "Male"
                if (line.contains("Male")) {
                    count = count + 1;
                    String male_count = String.valueOf(count);
                    male_amount.setText(male_count); 
                } else {
                    // counting "Female"
                    count1 = count1 + 1;
                    String female_count = String.valueOf(count1);
                    female_amount.setText(female_count); 
                }
                // User Report
                // counting "Customer"
                if (line.contains("Customer")) {
                    count2 = count2 + 1;
                    String customer_count = String.valueOf(count2);
                    customer_amount.setText(customer_count); 
                } else {
                    // counting "Manager"
                    count3 = count3 + 1;
                    String manager_count = String.valueOf(count3);
                    manager_amount.setText(manager_count); 
                }
                // Age Report 
                int age = Integer.parseInt((String)userData[7]);
                if (age > 0 && age < 21) {
                    count6 = count6 + 1;
                    String age_count = String.valueOf(count6);
                    age1.setText(age_count);
                } else if (age > 20 && age < 41) {
                    count7 = count7 + 1;
                    String age_count = String.valueOf(count7);
                    age2.setText(age_count);
                } else if (age > 40 && age < 61) {
                    count8 = count8 + 1;
                    String age_count = String.valueOf(count8);
                    age3.setText(age_count);
                } else if (age > 60 && age < 81) {
                    count9 = count9 + 1;
                    String age_count = String.valueOf(count9);
                    age4.setText(age_count);
                } else if (age > 80 && age < 100) {
                    count10 = count10 + 1;
                    String age_count = String.valueOf(count10);
                    age5.setText(age_count);
                }
            }
            
            // Item Type Report
            String line1; 
            while ((line1 = br1.readLine()) != null) {
                // counting "Food"
                if (line1.contains("Food")) {
                    count4 = count4 + 1;
                    String food_count = String.valueOf(count4);
                    food_amount.setText(food_count);
                } else {
                    // counting "Beverage"
                    count5 = count5 + 1;
                    String beverage_count = String.valueOf(count5);
                    beverage_amount.setText(beverage_count);
                }
            }
            
            // Store Sales Report
            int sum = 0;
            int sum1 = 0;
            int sum2 = 0;
            String line2;
            while ((line2 = br2.readLine()) != null) {
                String orderData [] = line2.split(",");
                // calculating "Item Sold"
                if (line2.contains(orderData[2])) {
                    int item = Integer.parseInt((String)orderData[2]);
                    sum += item;
                    String total_item = String.valueOf(sum);
                    item_sold.setText(total_item);
                }
                
                // calculating "Item Sales"
                if (line2.contains(orderData[3])) {
                    int itemSales = Integer.parseInt((String)orderData[3]);
                    sum1 += itemSales;
                    String totalItemSales = String.valueOf(sum1);
                    item_sales.setText("RM "+totalItemSales);
                }
                // calculating "Total Sales"
                if (line2.contains(orderData[3])) {
                    int sales = Integer.parseInt((String)orderData[3]);
                    sum2 += sales;
                    double service_charge = sum2 * 0.06;
                    double totalPayment = sum2 + service_charge;
                    String totalSales = String.valueOf(totalPayment);
                    total_sales.setText("RM "+totalSales);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(reports.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(reports.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        male_amount = new javax.swing.JLabel();
        female_amount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        customer_amount = new javax.swing.JLabel();
        manager_amount = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        age1 = new javax.swing.JLabel();
        age2 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        age3 = new javax.swing.JLabel();
        age4 = new javax.swing.JLabel();
        age5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        food_amount = new javax.swing.JLabel();
        beverage_amount = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        item_sales = new javax.swing.JLabel();
        total_sales = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        item_sold = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel1.setText("Reports");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        back_button.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Male");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Female");

        male_amount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        male_amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        male_amount.setText("0");

        female_amount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        female_amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        female_amount.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(39, 39, 39))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(49, 49, 49)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(40, 40, 40)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(female_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(male_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(male_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(female_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Gender Report");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("User Report");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("User Type");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("Customer");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setText("Manager");

        customer_amount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        customer_amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        customer_amount.setText("0");

        manager_amount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        manager_amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        manager_amount.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(39, 39, 39))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(19, 19, 19)))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customer_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(manager_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customer_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(manager_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Age Report");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setText("Age Range");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setText("0 - 20");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel20.setText("21 - 40");

        age1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        age1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        age1.setText("0");

        age2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        age2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        age2.setText("0");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel38.setText("41 - 60");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel39.setText("61 - 80");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel40.setText("81 - 99");

        age3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        age3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        age3.setText("0");

        age4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        age4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        age4.setText("0");

        age5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        age5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        age5.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(53, 53, 53)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addGap(47, 47, 47)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(47, 47, 47)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel39)
                            .addGap(47, 47, 47)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(47, 47, 47)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(age5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(age5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("Item Type Report");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel25.setText("Item Type");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel26.setText("Food");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel27.setText("Beverage");

        food_amount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        food_amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        food_amount.setText("0");

        beverage_amount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        beverage_amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        beverage_amount.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(beverage_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(food_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(food_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beverage_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Store Sales Report");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel33.setText("Item Sales");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel34.setText("Total Sales");

        item_sales.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        item_sales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        item_sales.setText("RM 0");

        total_sales.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        total_sales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total_sales.setText("RM 0");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel36.setText("Item Sold");

        item_sold.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        item_sold.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        item_sold.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(item_sold, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(25, 25, 25)
                        .addComponent(item_sales, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(total_sales, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item_sold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item_sales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addComponent(total_sales, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel10))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(back_button)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel24))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel24)
                                .addGap(3, 3, 3)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel31)
                                .addGap(3, 3, 3)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back_button)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // back to manager home 
    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        manager_home mh = new manager_home();
        mh.setVisible(true);
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
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age1;
    private javax.swing.JLabel age2;
    private javax.swing.JLabel age3;
    private javax.swing.JLabel age4;
    private javax.swing.JLabel age5;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel beverage_amount;
    private javax.swing.JLabel customer_amount;
    private javax.swing.JLabel female_amount;
    private javax.swing.JLabel food_amount;
    private javax.swing.JLabel item_sales;
    private javax.swing.JLabel item_sold;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel male_amount;
    private javax.swing.JLabel manager_amount;
    private javax.swing.JLabel total_sales;
    // End of variables declaration//GEN-END:variables
}
