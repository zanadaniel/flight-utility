package Ryanpack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zanadaniel
 This class is inherited by the Main class, which is already instantiated in all classes.
 Thus, all functions here will be readily available throughout the program.
 *
 */

public class Functions {
    
    /* add padding to a given textfield */
    public void addPaddingToJTextField(JTextField textfield){
        textfield.setBorder(BorderFactory.createCompoundBorder(
        textfield.getBorder(),
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }
    
    /* load table data from file */
    public void loadData(String dataFile, JTable table){
        File file = new File(dataFile);

        // gets the table tableModel
        DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
                
        // clear table
        tableModel.setRowCount(0);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            // an object to store each line of the data.txt file, we convert it to array so it can be iterated through
            Object[] lines = br.lines().toArray();
            
            
            // iterate through each line using an enhanced for-loop
            // @https://www.cis.upenn.edu/~matuszek/General/JavaSyntax/enhanced-for-loops.html
            for (Object line : lines) {
                // split the data using '//' into columns
                String[] row = line.toString().split("//");
                
                // finally, add the row
                tableModel.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* save table data to file */
    public void saveData(String dataFile, JTable table){
        // file object using the passed in argument as the destination
        File file = new File(dataFile);
        
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            // rows
            for(int r = 0; r < table.getRowCount(); r++){
                // columns
                for(int c = 0; c < table.getColumnCount(); c++){
                    bw.flush();
                    bw.write(table.getValueAt(r, c).toString() + "//");
                }
                bw.newLine();
            }
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* Add flight */
    public void AddFlight(String dataFile, JTable table, String from, String to, String dep, String arr){
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        Object[] newFlight = { "F"+generateFlightID(), "P"+generatePilotID(), from, to, dep, arr, calculateFlightDuration(dep, arr) };
        model.addRow(newFlight);
        saveData(dataFile, table);
    }
        
    /*Delete flight */
    public void DeleteFlight(String dataFile, DefaultTableModel model, JTable table, JTextField srch){
        int decision = JOptionPane.showConfirmDialog (null, "Are you certain in deleting this flight record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        
        if(decision == JOptionPane.YES_OPTION){
            srch.setText("");
            model.removeRow(table.getSelectedRow());
            saveData(dataFile, table);
        }
    }
    
    /* generates a number between the range of 10000 to 99999 */
    public String generateFlightID(){
        Random flightNumberGenerator = new Random();
        int flightID = flightNumberGenerator.nextInt(99999 - 10000 + 1) + 10000;
        return Integer.toString(flightID);
    }
    
    /* generates a number between the range of 100 to 999 */
    public String generatePilotID(){
        Random pilotNumberGenerator = new Random();
        int pilotID = pilotNumberGenerator.nextInt(999 - 100 + 1) + 100;
        return Integer.toString(pilotID);
    }
    
    /* calculates the flight duration in hours between the departure date and arrival date */
    public String calculateFlightDuration(String dep, String arr){
        // @http://www.java2s.com/Tutorial/Java/0040__Data-Type/SimpleDateFormat.htm
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        Date departure;
        Date arrival;
        long duration = 0;

        // @https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        try {
            departure = format.parse(dep);
            arrival = format.parse(arr);

            long difference = arrival.getTime() - departure.getTime();
            long durationInHours = difference / (60 * 60 * 1000) % 24;
            long durationInDays = difference / (24 * 60 * 60 * 1000);

            duration = (durationInDays * 24) + durationInHours;
            
        } catch (ParseException ex) {
            Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Long.toString(duration);
    }
    
    /* setting the look and feel to Nimbus */
    // @https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/nimbus.html
    public void setTheme(){
        try{
            for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e){
            System.out.println(e);
        }
    }
}