
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class win extends javax.swing.JFrame {

    int totalquant=0;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public win() {
        initComponents();
    }
  
   public void set()
   {
      String n,tstr=null;     
      for(int i =0;i<3;i++){
          if(i==0)
              tstr="banana";
          if(i==1)
              tstr="apples";
          if(i==2)
              tstr="mangoes";
       try
       {
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
           pst = con.prepareStatement("select quantity from selling where name='"+tstr+"';");
           rs = pst.executeQuery();
           while(rs.next())
           {
               n=Integer.toString(rs.getInt("quantity"));
                 if(i==0)
                     l1.setText(n+"kg");
                 if(i==1)
                     l2.setText(n+"kg");
                 if(i==2)
                     l3.setText(n+"kg");
                 
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
      }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        a1 = new javax.swing.JButton();
        q1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        r2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        r3 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        q3 = new javax.swing.JTextField();
        p3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        q2 = new javax.swing.JTextField();
        p2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tot1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Shopping");

        r1.setText("Banana");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        a1.setText("ADD");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        r2.setText("Apple");

        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        r3.setText("Mango");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        p3.setText("0");

        jLabel7.setText("Rs.50/kg");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(r3)
                .addGap(48, 48, 48)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(l3)
                .addGap(36, 36, 36)
                .addComponent(p3)
                .addGap(72, 72, 72)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3)
                    .addComponent(jButton3)
                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3)
                    .addComponent(jLabel7)
                    .addComponent(l3))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        p2.setText("0");

        jLabel6.setText("Rs.20/kg");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(r2)
                .addGap(52, 52, 52)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l2)
                .addGap(35, 35, 35)
                .addComponent(p2)
                .addGap(72, 72, 72)
                .addComponent(jButton2)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r2)
                    .addComponent(jButton2)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2)
                    .addComponent(jLabel6)
                    .addComponent(l2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p1.setText("0");

        jLabel5.setText("Rs.10/kg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(r1)
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l1)
                .addGap(34, 34, 34)
                .addComponent(p1)
                .addGap(74, 74, 74)
                .addComponent(a1)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1)
                    .addComponent(a1)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1)
                    .addComponent(jLabel5)
                    .addComponent(l1))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jButton4.setText("Cart");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity");

        jLabel3.setText("Price");

        jLabel4.setText("Total");

        tot1.setText(" ");

        jButton8.setText("OK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel8.setText("Price(kg)");

        jLabel9.setText("Available");

        jButton1.setText("Check Availability");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)
                        .addGap(101, 101, 101)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(57, 57, 57)
                        .addComponent(tot1)
                        .addGap(37, 37, 37)
                        .addComponent(jButton8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tot1)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        success s = new success();
        s.pass(tot1.getText(),totalquant);
        cart c = new cart();
        c.ca(tot1.getText(),totalquant);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        main m = new main();
        m.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(null, "Thank You!");
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
      
    }//GEN-LAST:event_r1ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
      int qban=0;
        try
       {
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
           pst = con.prepareStatement("select quantity from selling where name='banana';");
           rs = pst.executeQuery();
           while(rs.next())
           {
               qban=rs.getInt("quantity");
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       
        int quant1 = Integer.parseInt(q1.getText());
        boolean ban = r1.isSelected();
        if(qban==0)
        {
           JOptionPane.showMessageDialog(null, "Sorry Product is unavailable");
           
        }
       
        if(ban==true&&qban>=quant1)
        {
            int pr1 = quant1*10;
            String st = String.valueOf(pr1);
            qban=qban-quant1;
            p1.setText(st);
            totalquant=totalquant+quant1;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Reduce the quantity. Quantity available = "+qban);
        }
        
        try
       {
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
           Statement stmt = con.createStatement();
           String sql ="update selling set quantity ="+qban+" where name='banana';";
         stmt.executeUpdate(sql);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
        
        
    }//GEN-LAST:event_a1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int p=Integer.parseInt(p1.getText());
        int q=Integer.parseInt(p2.getText());
        int r=Integer.parseInt(p3.getText());
        
        String st = String.valueOf(p+q+r);
        
        tot1.setText(st);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int qapp=0;
        try
       {
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
           pst = con.prepareStatement("select quantity from selling where name='apples';");
           rs = pst.executeQuery();
           while(rs.next())
           {
               qapp=rs.getInt("quantity");
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       
        int quant1 = Integer.parseInt(q1.getText());
        boolean ban = r1.isSelected();
       
        if(ban==true&&qapp>0)
        {
            int pr1 = quant1*20;
            String st = String.valueOf(pr1);
            qapp=qapp-quant1;
            p2.setText(st);
            totalquant=totalquant+quant1;
        }
        
        try
       {
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
           Statement stmt = con.createStatement();
           String sql ="update selling set quantity ="+qapp+" where name='apples';";
         stmt.executeUpdate(sql);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
        
        if(qapp==0)
        {
           JOptionPane.showMessageDialog(null, "Sorry Product is unavailable");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int qman=0;
        try
       {
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
           pst = con.prepareStatement("select quantity from selling where name='mangoes';");
           rs = pst.executeQuery();
           while(rs.next())
           {
               qman=rs.getInt("quantity");
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       
        int quant1 = Integer.parseInt(q1.getText());
        boolean ban = r1.isSelected();
       
        if(ban==true&&qman>0)
        {
            int pr1 = quant1*50;
            String st = String.valueOf(pr1);
            qman=qman-quant1;
            p3.setText(st);
            totalquant=totalquant+quant1;
        }
        
        try
       {
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
           Statement stmt = con.createStatement();
           String sql ="update selling set quantity ="+qman+" where name='mangoes';";
         stmt.executeUpdate(sql);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
        
        if(qman==0)
        {
           JOptionPane.showMessageDialog(null, "Sorry Product is unavailable");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        set();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new win().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JLabel tot1;
    // End of variables declaration//GEN-END:variables
}
