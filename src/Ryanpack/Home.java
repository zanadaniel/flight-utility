package Ryanpack;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    
    Main func = new Main();
    
    public Home() {
        func.setTheme();
        initComponents();
        func.addPaddingToJTextField(searchFld);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLbl = new javax.swing.JLabel();
        instructionsLbl = new javax.swing.JLabel();
        searchFld = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        adminLbl = new javax.swing.JLabel();
        exampleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ryanair Flight Utility");
        setResizable(false);

        welcomeLbl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        welcomeLbl.setText("Welcome to the Ryanair flight utility! ");

        instructionsLbl.setText("Please enter your flight ID:");

        searchFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFldFocusGained(evt);
            }
        });
        searchFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFldActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.setFocusable(false);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        adminLbl.setForeground(java.awt.Color.blue);
        adminLbl.setText("Click here to access admin tools");
        adminLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                adminLblMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminLblMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminLblMouseEntered(evt);
            }
        });

        exampleLbl.setFont(new java.awt.Font("Lucida Grande", 2, 11)); // NOI18N
        exampleLbl.setForeground(java.awt.Color.gray);
        exampleLbl.setText("Example: F12345");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchFld)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(adminLbl))
                    .addComponent(welcomeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(instructionsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exampleLbl)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructionsLbl)
                    .addComponent(exampleLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchFld, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(adminLbl)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("StringConcatenationInsideStringBufferAppend")
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // check if the input has 6 characters such as 'F12345'
        if(searchFld.getText().length() == 6){
            try {
                // scanner file object
                Scanner file = new Scanner(new File("data.txt"));

                // while file is not empty...
                while(file.hasNextLine()){
                    // a string to store the current line it's reading
                    String line = file.nextLine();

                    // check if the current line contains the flight ID entered...
                    if(line.contains(searchFld.getText().toUpperCase())){

                        // the string is split by '//' into an array
                        String[] flightInfo = line.split("//");

                        // a template for the final output message
                        String[] flightInfoTemplate = {
                            "Flight ID: ",
                            "Pilot ID: ",
                            "Departing From: ",
                            "Arriving To: ",
                            "Departure Time: ",
                            "Arrival Time: ",
                            "Duration (hours): "
                        };

                        // a stringbuilder to store our output message
                        StringBuilder output = new StringBuilder();

                        // for each element in flightInfo, append an element in the template array, followed by the corresponding data
                        for(int i = 0; i < flightInfo.length; i++){
                            output.append(flightInfoTemplate[i] + "\n" + flightInfo[i] + "\n\n");
                        }

                        // finally, show the output, and stop the loop by break
                        JOptionPane.showMessageDialog(null, output, flightInfo[0], JOptionPane.PLAIN_MESSAGE);
                        break;

                    // if the flight ID was not found...
                    }else{
                        // makes sure if it has reached the end of the file, shows message, and breaks
                        if(!file.hasNextLine()){
                            JOptionPane.showMessageDialog(null, "Sorry, the flight ID you have entered does not exist." , "Invalid Flight ID", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }
                
                // closing the scanner file object
                file.close();
                
            // standard error handling
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        // if the input was not 6 characters...
        }else{
            JOptionPane.showMessageDialog(null, "Please ensure that you enter your flight ID in the format of 'F12345'.", "Invalid Search Format", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void adminLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLblMouseEntered
        // @https://stackoverflow.com/questions/15892844/underlined-jlabel
        Font font = adminLbl.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        adminLbl.setFont(font.deriveFont(attributes));
        adminLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_adminLblMouseEntered

    private void adminLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLblMouseExited
        // @https://stackoverflow.com/questions/15892844/underlined-jlabel
        Font font = adminLbl.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, -1);
        adminLbl.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_adminLblMouseExited

    private void adminLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLblMouseReleased
        this.dispose();
        Admin adminUI = new Admin();
        adminUI.setVisible(true);
    }//GEN-LAST:event_adminLblMouseReleased

    private void searchFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFldFocusGained
        searchFld.selectAll();
    }//GEN-LAST:event_searchFldFocusGained

    private void searchFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFldActionPerformed
        // if the enter key is pressed, it'll fire the button event
        searchBtnActionPerformed(evt);
    }//GEN-LAST:event_searchFldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLbl;
    private javax.swing.JLabel exampleLbl;
    private javax.swing.JLabel instructionsLbl;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchFld;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}