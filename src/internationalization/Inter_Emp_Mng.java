
package internationalization;

import java.util.ResourceBundle;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Inter_Emp_Mng extends javax.swing.JFrame {
    static String language;
    static String country;
    ResourceBundle resource;
   
    public Inter_Emp_Mng(String language,String country) {
        initComponents();
        this.setSize(300,350);
        setLocationRelativeTo(null);
        this.language=language;
        this.country=country;
        setUpGui();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbCode = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbSex = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbCode.setText("Code:");
        getContentPane().add(lbCode);
        lbCode.setBounds(10, 40, 78, 34);

        lbName.setText("Name:");
        getContentPane().add(lbName);
        lbName.setBounds(10, 83, 59, 44);

        lbSex.setText("Sex:");
        getContentPane().add(lbSex);
        lbSex.setBounds(10, 139, 59, 40);

        lbAge.setText("Age:");
        getContentPane().add(lbAge);
        lbAge.setBounds(10, 190, 59, 47);

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtCode);
        txtCode.setBounds(70, 40, 100, 30);
        getContentPane().add(txtName);
        txtName.setBounds(70, 90, 168, 30);
        getContentPane().add(txtAge);
        txtAge.setBounds(70, 190, 170, 30);

        rdMale.setText("Male");
        getContentPane().add(rdMale);
        rdMale.setBounds(87, 147, 70, 23);

        rdFemale.setText("Female");
        rdFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(rdFemale);
        rdFemale.setBounds(160, 147, 80, 23);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        getContentPane().add(btnOK);
        btnOK.setBounds(70, 250, 133, 34);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void rdFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdFemaleActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        int age= Integer.parseInt(txtAge.getText());
        if(age<18|| age>70){
            String title= resource.getString("msgTitle");
            String msg= resource.getString("Error");
            JOptionPane.showMessageDialog(this, msg,title,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        final String language;
        final String country;
        if (args.length != 2) {
            language = new String("en");
            country = new String("US");
        } else {
            language = new String("vi");
            country = new String("VN");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inter_Emp_Mng(language, country).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbCode;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbSex;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void setUpGui() {
         Locale currentLocale;
        currentLocale= new Locale(language,country);
        String base= "internationalization.ResourceFiles/Resources";
        resource= ResourceBundle.getBundle(base, currentLocale);
        this.setTitle(resource.getString("prgTitle"));
        lbCode.setText(resource.getString("lbCode"));
        lbName.setText(resource.getString("lbName"));
        lbSex.setText(resource.getString("lbSex"));
        rdMale.setText(resource.getString("rdMale"));
        rdFemale.setText(resource.getString("rdFemale"));
        lbAge.setText(resource.getString("lbAge"));
        btnOK.setText(resource.getString("btnOK"));
    }
}
