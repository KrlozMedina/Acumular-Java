
public class Acumular extends javax.swing.JFrame {

    String x,s1;
    int l,pe=0,ce=0,acu=0;
    char q;

    public Acumular() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caja1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(caja1);
        caja1.setBounds(10, 30, 390, 30);

        jButton1.setText("Acumular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 70, 110, 30);

        jLabel1.setText("Ingrese lo numeros que desea acumular separado con comas \",\"");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 390, 14);
        getContentPane().add(l1);
        l1.setBounds(170, 70, 230, 30);

        jLabel2.setText("Copiryng K-rloz Medina");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 110, 130, 14);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-415)/2, (screenSize.height-158)/2, 415, 158);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    x=caja1.getText();
    l=x.length();
    for(int i=0;i<l;i++)
    {
        q=x.charAt(i);
        if(q==',')
        {
            ce=ce+1;
        }
    }
    while(ce>0)
    {
        l=x.length();
        for(int i=0;i<l;i++)
        {
            q=x.charAt(i);
            if(q==',')
            {
                pe=i;
                break;
            }
        }
        s1=x.substring(0,pe);
        acu=acu+Integer.parseInt(s1);
        x=x.substring(pe+1);
        ce=ce-1;
    }
    acu=acu+Integer.parseInt(x);
    l1.setText("La acumulacion es "+String.valueOf(acu));

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acumular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caja1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables

}
