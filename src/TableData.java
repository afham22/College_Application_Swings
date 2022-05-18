import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.*;

public class TableData {
    public static void main(String args[]){
        JFrame frame =new JFrame("table text");
        
        frame.setSize(500,500);
        frame.setLayout(null);

        String[] column={"eid","ename","salary"};
       // String[][] data={{"1","Mohan","10000"},{"2","Simpson","20000"},{"3","Suhas","30000"}};
       String[][] data= new String[10][3];
       try {
           Connection con=DriverManager.getConnection("jdbc:sqlite:Test.db");
           System.out.println("Database Opened");
           Statement stmt=con.createStatement();
           ResultSet rst=stmt.executeQuery("Select * from employee  ");
           int row=0;
           while(rst.next()) {
            data[row][0]=rst.getString(1);
            data[row][1]=rst.getString(1);
            data[row][2]=rst.getString(1);
            row++;
              }
              con.close();
            }
            catch(Exception ex) {
                System.out.println(ex);
            }
          
        JTable tbl =new JTable(data,column);

        JScrollPane scr =new JScrollPane(tbl);
        scr.setBounds(50,50,300,300);
        frame.add(scr);


        frame.setVisible(true);
    }
    
}
