/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ryanpack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class addFlight extends javax.swing.JFrame {
    
    Admin admin = new Admin();

    /**
     * Creates new form CreateFlightGUI
     */
    public addFlight() {
        initComponents();
        
        // add padding to text fields
        admin.addPaddingToJTextField(fromFld);
        admin.addPaddingToJTextField(toFld);
        admin.addPaddingToJTextField(departureFld);
        admin.addPaddingToJTextField(arrivalFld);
    }
    
    private String generateFlightID(){
        Random flightNumberGenerator = new Random();
        int flightID = flightNumberGenerator.nextInt(99999 - 00000 + 1) + 00000;
        return Integer.toString(flightID);
    }
    
    private String generatePilotID(){
        Random pilotNumberGenerator = new Random();
        int pilotID = pilotNumberGenerator.nextInt(999 - 000 + 1) + 000;
        return Integer.toString(pilotID);
    }
    
    private String calculateFlightDuration(){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        long difference = 0;
                
        try {
            Date departureTime = format.parse(departureFld.getText());
            Date arrivalTime = format.parse(arrivalFld.getText());
            
            difference = (arrivalTime.getTime() - departureTime.getTime()) / (60 * 60 * 1000) % 24;
        } catch (ParseException ex) {
            Logger.getLogger(addFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Long.toString(Math.abs(difference));
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
        departureFld = new javax.swing.JTextField();
        arrivalLbl = new javax.swing.JLabel();
        arrivalFld = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ryanair - Add Flight");
        setResizable(false);

        instructionsLbl.setText("Please enter the flight details below:");

        fromLbl.setText("From");

        toLbl.setText("To");

        departureLbl.setText("Departure time");

        arrivalLbl.setText("Arrival time");

        addBtn.setText("Add Flight");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromFld)
                    .addComponent(fromLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toFld)
                    .addComponent(departureFld)
                    .addComponent(arrivalFld)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructionsLbl)
                            .addComponent(departureLbl)
                            .addComponent(arrivalLbl))
                        .addGap(0, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instructionsLbl)
                .addGap(18, 18, 18)
                .addComponent(fromLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromFld, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(toLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(departureLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(departureFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arrivalFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel)admin.table.getModel();
        Object[] newFlight = { "F"+generateFlightID(), "P"+generatePilotID(), fromFld.getText(), toFld.getText(), departureFld.getText(), arrivalFld.getText(), calculateFlightDuration() };
        model.addRow(newFlight);
        this.dispose();
        admin.saveData();
    }//GEN-LAST:event_addBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField arrivalFld;
    private javax.swing.JLabel arrivalLbl;
    private javax.swing.JTextField departureFld;
    private javax.swing.JLabel departureLbl;
    private javax.swing.JTextField fromFld;
    private javax.swing.JLabel fromLbl;
    private javax.swing.JLabel instructionsLbl;
    private javax.swing.JTextField toFld;
    private javax.swing.JLabel toLbl;
    // End of variables declaration//GEN-END:variables
}