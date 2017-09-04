import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class seller extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int flag;
    public seller() {
        initComponents();
    }
    public void sellerlist()
    {   lab1.setText("Seller List");
        flag=1;
       ta1.setText(null);
       String n,q;
        try
        {
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
           pst = con.prepareStatement("select name,seller from selling;");
           rs = pst.executeQuery();
           while(rs.next())
           {
               n=rs.getString("name");
               q=rs.getString("seller");
               ta1.append("Item- "+n+"\nQuantity- "+q+"\n\n");
           }
            
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
    
    public void product()
    {
        ta1.setText(null);
        lab1.setText("Product Details");
         String n;
         int q;
       try
       {
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
           pst = con.prepareStatement("select name,quantity from selling;");
           rs = pst.executeQuery();
           while(rs.next())
           {
               n=rs.getString("name");
               q=rs.getInt("quantity");
               ta1.append("Item- "+n+"\nQuantity- "+q+"\n\n");
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
    
    public void userlist()
    {
        lab1.setText("User List");
        ta1.setText(null);
       String n,p,pass;        
       try
       {
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
           pst = con.prepareStatement("select * from shop;");
           rs = pst.executeQuery();
           while(rs.next())
           {
               n=rs.getString("name");
               p=rs.getString("phone");
               pass=rs.getString("password");
               ta1.append("Name- "+n+"\nPhone- "+p+"\nPassword- "+pass+"\n\n");
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        Back = new javax.swing.JButton();
        lab1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        lab1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab1.setText("  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lab1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lab1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(Back)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        adminMenu w = new adminMenu();
        w.setVisible(true);
        this.dispose();
        if(flag==1){
        try
        {
            FileWriter fw = new FileWriter("seller.txt");
            fw.write("");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
        
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab1;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
}
