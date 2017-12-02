package Ryanpack;

import javax.swing.JOptionPane;


public class AddFlight extends javax.swing.JFrame {
    
    Main func = new Main();
    Admin admin = new Admin();

    /**
     * Creates new form CreateFlightGUI
     */
    public AddFlight() {
        initComponents();
        
        // add padding to text fields
        func.addPaddingToJTextField(fromFld);
        func.addPaddingToJTextField(toFld);
        func.addPaddingToJTextField(departureDateFld);
        func.addPaddingToJTextField(departureTimeFld);
        func.addPaddingToJTextField(arrivalDateFld);
        func.addPaddingToJTextField(arrivalTimeFld);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instructionsLbl = new javax.swing.JLabel();
        fromLbl = new javax.swing.JLabel();
        fromFld = new javax.swing.JTextField();
        toLbl = new javax.swing.JLabel();
        toFld = new javax.swing.JTextField();
        departureLbl = new javax.swing.JLabel();
        departureDateFld = new javax.swing.JTextField();
        arrivalLbl = new javax.swing.JLabel();
        arrivalDateFld = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        departureFormatLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        departureTimeFld = new javax.swing.JTextField();
        departureFormatLbl1 = new javax.swing.JLabel();
        departureLbl1 = new javax.swing.JLabel();
        arrivalTimeFld = new javax.swing.JTextField();
        arrivalLbl1 = new javax.swing.JLabel();
        departureFormatLbl2 = new javax.swing.JLabel();
        departureFormatLbl3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Flight");
        setResizable(false);

        instructionsLbl.setText("Please enter the flight details below:");

        fromLbl.setText("From:");

        toLbl.setText("To:");

        departureLbl.setText("Departure Date:");

        departureDateFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                departureDateFldFocusLost(evt);
            }
        });

        arrivalLbl.setText("Arrival Date:");

        addBtn.setText("Add Flight");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        departureFormatLbl.setFont(new java.awt.Font("Lucida Grande", 2, 11)); // NOI18N
        departureFormatLbl.setForeground(java.awt.Color.gray);
        departureFormatLbl.setText("DD/MM/YYYY");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 2, 11)); // NOI18N
        jLabel2.setForeground(java.awt.Color.gray);
        jLabel2.setText("Example: City, Country");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 2, 11)); // NOI18N
        jLabel3.setForeground(java.awt.Color.gray);
        jLabel3.setText("Example: City, Country");

        departureTimeFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                departureTimeFldFocusLost(evt);
            }
        });

        departureFormatLbl1.setFont(new java.awt.Font("Lucida Grande", 2, 11)); // NOI18N
        departureFormatLbl1.setForeground(java.awt.Color.gray);
        departureFormatLbl1.setText("HH:MM");

        departureLbl1.setText("Departure Time:");

        arrivalTimeFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivalTimeFldActionPerformed(evt);
            }
        });

        arrivalLbl1.setText("Arrival Time:");

        departureFormatLbl2.setFont(new java.awt.Font("Lucida Grande", 2, 11)); // NOI18N
        departureFormatLbl2.setForeground(java.awt.Color.gray);
        departureFormatLbl2.setText("DD/MM/YYYY");

        departureFormatLbl3.setFont(new java.awt.Font("Lucida Grande", 2, 11)); // NOI18N
        departureFormatLbl3.setForeground(java.awt.Color.gray);
        departureFormatLbl3.setText("HH:MM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromFld)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fromLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(toFld)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(departureLbl)
                        .addGap(11, 11, 11)
                        .addComponent(departureFormatLbl)
                        .addGap(18, 18, 18)
                        .addComponent(departureLbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(departureFormatLbl1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(arrivalDateFld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departureDateFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(departureTimeFld, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(arrivalTimeFld)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(instructionsLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(arrivalLbl)
                        .addGap(32, 32, 32)
                        .addComponent(departureFormatLbl2)
                        .addGap(18, 18, 18)
                        .addComponent(arrivalLbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(departureFormatLbl3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instructionsLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromLbl)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLbl)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departureLbl)
                    .addComponent(departureFormatLbl)
                    .addComponent(departureFormatLbl1)
                    .addComponent(departureLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departureDateFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departureTimeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivalLbl)
                    .addComponent(arrivalLbl1)
                    .addComponent(departureFormatLbl2)
                    .addComponent(departureFormatLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivalDateFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalTimeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(fromFld.getText().isEmpty() || toFld.getText().isEmpty() || departureDateFld.getText().isEmpty() || departureTimeFld.getText().isEmpty() || arrivalDateFld.getText().isEmpty() || arrivalTimeFld.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "One or more fields are missing.\nPlease try again.", "Missing Field(s)", JOptionPane.ERROR_MESSAGE);
        }else{
            func.AddFlight(admin.filePath, admin.table, fromFld.getText(), toFld.getText(), departureDateFld.getText() + " " + departureTimeFld.getText(), arrivalDateFld.getText() + " " + arrivalTimeFld.getText());
            this.dispose();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void departureDateFldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_departureDateFldFocusLost
        arrivalDateFld.setText(departureDateFld.getText());
    }//GEN-LAST:event_departureDateFldFocusLost

    private void departureTimeFldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_departureTimeFldFocusLost
        arrivalTimeFld.setText(departureTimeFld.getText());
    }//GEN-LAST:event_departureTimeFldFocusLost

    private void arrivalTimeFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivalTimeFldActionPerformed
        addBtnActionPerformed(evt);
    }//GEN-LAST:event_arrivalTimeFldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    public javax.swing.JTextField arrivalDateFld;
    private javax.swing.JLabel arrivalLbl;
    private javax.swing.JLabel arrivalLbl1;
    public javax.swing.JTextField arrivalTimeFld;
    public javax.swing.JTextField departureDateFld;
    private javax.swing.JLabel departureFormatLbl;
    private javax.swing.JLabel departureFormatLbl1;
    private javax.swing.JLabel departureFormatLbl2;
    private javax.swing.JLabel departureFormatLbl3;
    private javax.swing.JLabel departureLbl;
    private javax.swing.JLabel departureLbl1;
    public javax.swing.JTextField departureTimeFld;
    public javax.swing.JTextField fromFld;
    private javax.swing.JLabel fromLbl;
    private javax.swing.JLabel instructionsLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JTextField toFld;
    private javax.swing.JLabel toLbl;
    // End of variables declaration//GEN-END:variables
}