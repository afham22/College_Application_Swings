import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

import mycolors.mycolors;

import javax.swing.ImageIcon; 
import java.awt.geom.Line2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
//import java.awt.event.*;
import java.awt.event.*;
import java.awt.print.*;
import java.awt.Font;

/*public class App {
   static String s;
   JFrame FH;

    public static void messagebox()
    {
        JPopupMenu  me =new JPopupMenu();
         me.setBounds(520, 20, 30, 60);
         me.setVisible(true);
        

 
    }*/
   /* public  void getdate(String n)
    {  

       
      int m =n.length();
      if(m>=25)
      {
          JOptionPane.showMessageDialog(FH, "nigga chill" );
      }
    }
   
     void programs(){

 
   
     FH=new JFrame("hey you");
      FH.setBounds(0, 0, 1100, 1100);
      FH.getContentPane().setBackground(Color.pink);
    FH.setLayout(null);
    
      FH.setDefaultCloseOperation(FH.EXIT_ON_CLOSE);
     
 
       JLabel me =new  JLabel("yo boi");//(SwingConstants.CENTER));

       me.setBounds(50, 50, 200, 40);
   me.setHorizontalTextPosition(SwingConstants.CENTER);
    //me.setText("me");
      // me.setBackground(Color.white);
       me.setBorder(BorderFactory.createLineBorder(Color.black, 1));
       me.setForeground(Color.black);
      
       FH.add(me);
      
       JPanel jj =new JPanel();
       jj.setBackground(Color.lightGray);
       jj.setBorder(BorderFactory.createLineBorder(Color.black, 2));
       jj.setBounds(50, 50, 100, 190);
       FH.add(jj);

     
 

    
         
        //Graphics2D m =(Graphics2D) g;
       //Color c1=new ColorUIResource(0, 15,248);
        //Color c2=new ColorUIResource(86, 180, 211);
        //GradientPaint gp=new GradientPaint(0,0,c1,180.0.c2);
        //m.setPaint(gp);*/
    
        

     
       /* ImageIcon image = new ImageIcon("sjec1.png");
        JLabel lbl=new JLabel();
        lbl.setBounds(100, 100, 100, 100);
        lbl.setIcon(image);
        //lbl.setVisible(true);
        FH.add(lbl);
       /String[] afham={"hahah","LOL","rofl"};
        JComboBox combo=new JComboBox(afham);
        combo.setBounds(50,250,200,30);
    FH.add(combo);*/

        
       
   

       // ImageIcon image = new ImageIcon(sjec.png);
        //FH.add(image);
        //JLabel label=new JLabel();
      //  label.setIcon(image);
       // label.setBounds(50, 50, 50, 50);
      //  FH.add(label);
        

       
       //ImageIcon topsjeclogo = new ImageIcon("6906534.png");
       //JLabel lblicon=new JLabel();
       //lblicon.setBounds(100, 100, 626, 626);
       //lblicon.setIcon(topsjeclogo);
      // FH.add(lblicon);
       //Image imgSmall = imgBig.getScaledInstance(
        //targetWidth, targetHeight, Image.SCALE_SMOOTH);
       
    
/*

       // JPanel side=new JPanel();
        //side.setBounds(0,50 , 150, 660);
        //side.setBackground(Color.blue);
        //FH.add(side);

  /*      JButton button1=new JButton("visible");
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.white);
        button1.setBounds(0, 240, 130, 40);
        FH.add(button1);
        JRadioButton rbfemale=new JRadioButton("g");
        rbfemale.setBounds(210, 110, 20, 20);
          
        JCheckBox check1=new JCheckBox("check1");
        check1.setBounds(100, 150, 250, 20);
        JCheckBox check3=new JCheckBox("check3");
        check3.setBounds(100, 200, 250, 20);
        //FH.add(check1);
        JCheckBoxMenuItem check2 =new JCheckBoxMenuItem();
        check2.add(check1);
        check2.add(check3);
        check2.setBounds(210, 300, 250, 100);
        FH.add(check2);
       
        FH.add(rbfemale);

        JTextField lblyou=new JTextField();
        lblyou.setBounds(00, 20, 150, 20);

        JTextField lblme=new JTextField();
        lblme.setBounds(00, 50, 150, 20);

*/


        //lblyou.setBackground(Color.MAGENTA);
        //FH.add(lblyou);
       // FH.add(lblme);

      /*  JPanel pnlafter=new JPanel();
        pnlafter.setBounds(200, 20, 150, 150);
        pnlafter.setBackground(Color.DARK_GRAY);
        FH.add(pnlafter);
        JPanel pnlafter=new JPanel();
        pnlafter.setBounds(200, 20, 150, 150);
        pnlafter.setBackground(Color.DARK_GRAY);
        
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
           JLabel jkr=new JLabel(s);
           jkr.setBounds(300, 300, 150, 40);

           FH.add(jkr);
           FH.add(pnlafter);
           pnlafter.setVisible(true);
            FH.repaint();
             //pnlafter.setVisible(false);
             
             
                
            }

            });


        JButton button2=new JButton("not visible");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.white);
        button2.setBounds(0, 280, 130, 40);
        FH.add(button2);
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
              pnlafter.setVisible(false);
              s=lblyou.getText();
              getdate(s);
              
              String l=lblme.getText();
              getdate(l);
             
              FH.repaint();

                     
                     
                        
                    }
        
                    });
                */
        
             //pnlafter.setVisible(false);
             
             
                
           

        
      /* button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
             { 
                JLabel hey=new JLabel("hello");
                hey.setBounds(220, 600, 100, 20);
                FH.add(hey);
             }
          });
          

        JButton button2=new JButton("trial 2");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.white);
        button2.setBounds(0, 80, 150, 40);
        FH.add(button2);
        JButton button3=new JButton("trial 3");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.white);
        button3.setBounds(0, 140, 150, 40);
        FH.add(button3);
        JButton button4=new JButton("trial 4");
        button4.setBackground(Color.BLACK);
        button4.setForeground(Color.white);
        button4.setBounds(0, 200, 150, 40);
        FH.add(button4);
        FH.setVisible(true);
        

        



       JPanel top=new JPanel();
        top.setBounds(0,0 , 1000, 70);
        top.setBackground(c1);
        FH.add(top);

        JLabel clgname=new JLabel("St.Joseph Engineering College");
        clgname.setBounds(10, 0, 300, 40);

        clgname.setForeground(Color.WHITE);
         top.add(clgname)


        JLabel clglogo=new JLabel();
        clglogo.setBounds(0, 300, 40, 40);
        ImageIcon iconLogo = new ImageIcon("C:/Users/Mohammed%20Afham/OneDrive/Desktop/sjec-logo.png");
        clglogo.setIcon(iconLogo);
        top.add(clglogo);

        
       JButton button=new JButton("trial 1");
        button.setBackground(c1);
        button.setForeground(Color.BLACK);
        button.setBounds(50, 30, 200, 20);
        FH.add(button);

        JButton button2=new JButton("trial 2");
        button2.setBounds(50, 60, 200, 20);
        FH.add(button2);

        JTextField txt1=new JTextField("hello");
        txt1.setBounds(50,100,200,30);
        txt1.setBackground(c1);
        txt1.setForeground(Color.ORANGE);
         FH.add(txt1);

        String[] afham={"hahah","LOL","rofl"};
        JComboBox combo=new JComboBox(afham);
        combo.setBounds(50,250,200,30);
        FH.add(combo);
        

       JLabel label=new JLabel("this label");
        label.setBounds(50, 150, 200, 20);
        label.setForeground(Color.ORANGE);
        FH.add(label);

        JRadioButton radio=new JRadioButton("g");
        radio.setBounds(50, 175, 20, 20);
        FH.add(radio);


        JCheckBox box =new JCheckBox();
        box.setForeground(Color.CYAN);
        box.setBounds(50, 200, 20, 20);
        FH.add(box); */
       
    
 

    //   FH.setVisible(true);





  //  }

   
//    public static void main(String[] args) { 
  //      App a =new App();
        //a.programs();
//}
//}
   
 /*class grad extends App
 {
     void paintcomp(Graphics g)
     {
       Graphics2D m =(Graphics2D) g;
       int width =getWidth();
       int height = getHeight();

       Color c1=new ColorUIResource(52, 143, 80);
       Color c2=new ColorUIResource(86, 180, 211);
       GradientPaint gp=new GradientPaint(0,0,c1,,180.0.c2);
       m.setPaint(gp);
       m.fillRect(0,0, width, height);
     }

 }*/


/*public class App {

    static String toBinary(int b)
    {
       String bin = "";
       for(int i=1; i<=32; i++)
       {
        bin = String.valueOf(b & 1) + bin;
        b = (b >> 1);
        if((i%8) == 0)
          bin = " " + bin;
        }
       return bin;
    }

    static void displayFrame()
    {
        JFrame frame = new JFrame("Bitwise Operator Demo App");
        frame.setSize(450,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField  txtOperand1 = new JTextField("0");
        txtOperand1.setBounds(50,50,100,30);
        frame.add(txtOperand1);

        JLabel lblOperand1 = new JLabel("00000000");
        lblOperand1.setBounds(160, 50, 250, 30 );
        frame.add(lblOperand1);

        String[] operators = {"~","&","|","^",">>",">>>","<<"};
        JComboBox cmbOperator = new JComboBox(operators);
        cmbOperator.setBounds(50,100,100,30);
        frame.add(cmbOperator);

        JTextField  txtOperand2 = new JTextField("0");
        txtOperand2.setBounds(50,150,100,30);
        frame.add(txtOperand2);

        JLabel lblOperand2 = new JLabel("00000000");
        lblOperand2.setBounds(160, 150, 250, 30 );
        frame.add(lblOperand2);

        JButton btnCalculate = new JButton("=");
        btnCalculate.setBounds(50,200,100,30);
        frame.add(btnCalculate);

        JTextField  txtResult = new JTextField("0");
        txtResult.setBounds(50,250,100,30);
        frame.add(txtResult);

        JLabel lblResult = new JLabel("00000000");
        lblResult.setBounds(160, 250, 250, 30 );
        frame.add(lblResult);

        frame.setVisible(true);


        btnCalculate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int operand1 = Integer.parseInt(txtOperand1.getText());
                int operand2 = Integer.parseInt(txtOperand2.getText());
                String operator = operators[cmbOperator.getSelectedIndex()];
                int result = 0;

                switch(operator){
                    case "~": result = ~operand1;break;
                    case "&": result = operand1 & operand2;break;
                    case "|": result = operand1 | operand2;break;
                    case "^": result = operand1 ^ operand2;break;
                    case ">>": result = operand1 >> operand2;break;
                    case ">>>": result = operand1 >>> operand2;break;
                    case "<<": result = operand1 << operand2;break;
                }
                
                
                lblOperand1.setText(toBinary(operand1));
                if(operator == "~")
                    lblOperand2.setText("");
                else
                    lblOperand2.setText(toBinary(operand2));
                
                txtResult.setText(String.valueOf(result));
                lblResult.setText(toBinary(result));

            }


        });
    }
    public static void main(String[] args){

        displayFrame();
        
            
    }
    
}*/







public class App {
    
    JFrame FH,finalform,kk;
    JButton btnPrint,btnAbout,btncourse,btncontact;
    JPanel pnlside;
    mycolors me =new mycolors();
    Color thiscolor = Color.white;
    JPanel pnltop;
     
 
   public  void frame()           //frame
   {
       FH=new JFrame("SJEC");      
     
       FH.setBounds(20, 20, 1030, 700);
       FH.getContentPane().setBackground(me.clrsecond);
       JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       FH.getContentPane().add(pane);
       FH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
       
       FH.setLayout(null);
       toppanel(FH);
       sidepanel();
       applicationform();
       FH.setVisible(true);  

   }     
   Font fntsjec;
    void toppanel(JFrame frm)                        //top panel
   {
        pnltop =new JPanel();      
       pnltop.setLayout(null);
       pnltop.setBounds(0, 0, 1100, 120);
       pnltop.setBackground(me.clraccent);
       frm.add(pnltop);

       ImageIcon topsjeclogo = new ImageIcon("mainsjec.png");
       JLabel lblicon=new JLabel();
       lblicon.setBounds(50, 30, 80, 80);
       lblicon.setIcon(topsjeclogo);
       pnltop.add(lblicon);
   }

    void sidepanel()                     //side panel
   {  


      
       //Color i=me.clrmain;
    //Color i= me.clrmain;
        pnlside=new JPanel();    
       pnlside.setLayout(null);
       pnlside.setBounds(0, 100, 180, 560);
       pnlside.setBackground(me.clrmain);
     FH.add(pnlside);
     JToggleButton uff =new JToggleButton();
        uff.setBounds(0, 200, 140, 40);
        uff.setBackground(Color.black);
        uff.setOpaque(false);
        uff.setBorderPainted(false);
        uff.setFocusable(false);
        pnlside.add(uff);
       
       //  if (uff.isSelected()
        
        uff.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){
          if( uff.isSelected())
          {
              thiscolor = Color.cyan;
            pnlForm.setBackground(Color.black);
            pnltop.setBackground(Color.cyan);
            pnlside.setBackground(Color.MAGENTA);
            uff.setBackground(Color.red);
          //  FH.repaint();
          }
           else
           {
           pnlForm.setBackground(Color.DARK_GRAY);
           pnlForm.setBackground(Color.yellow);
            pnltop.setBackground(me.clraccent);
            pnlside.setBackground(me.clrsecond);
           }


         
          }
        });

       ImageIcon printer = new ImageIcon("32.png");
       fntsjec = new Font("Courier", Font.PLAIN,18 );
       //validation me =new validation();
     // Color i= me.clrmain;
   
       
       btnPrint =new JButton("    Print ");    
       btnPrint.setBounds(0, 50, 180, 40);
       btnPrint.setFont(fntsjec);
       btnPrint.setIcon(printer);
       btnPrint.setForeground(Color.white);
       btnPrint.setBackground(Color.black);
       pnlside.add(btnPrint);
      

  } 
  JTextField txtname1,txtname2,txtname3,txtphno,txtemail,txtfathernme,txtaadharno,txtmothernme,txtnationality;
  JRadioButton rbmale,rbfemale;
  JPanel pnlForm;
    
  void kk()
  {
    JFrame kk =new JFrame();
 kk.setBounds(200, 20, 300, 90);
      
 kk.setBounds(20, 20, 200, 260);
 kk.getContentPane().setBackground(thiscolor);
 kk.setLayout(null);
 
 kk.setVisible(true);
  }
  void applicationform()
  {
     int X,Y;
   
    pnlForm=new JPanel(); 
    pnlForm.setLayout(null);
   // pnlForm.setBounds(180, 120, 850, 850);
   pnlForm.setPreferredSize(new DimensionUIResource(850, 850));
   pnlForm.setBackground(thiscolor);
    //FH.add(pnlForm);
    JTextArea textboss=new JTextArea();
    textboss.setBounds(200, 300, 630, 650);
    textboss.setBackground(Color.pink);
    pnlForm.add(textboss);
    JScrollPane meatball =new JScrollPane(pnlForm, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    meatball.setBounds(180, 120, 620, 400);
    FH.add(meatball);
  //  pnlForm.add(meatball);



    JToggleButton a = new JToggleButton("my colrs ");
    a.setBackground(Color.red);
    //a.actionl

    a.setBounds(200, 100, 100, 20);
    pnlForm.add(a);

      
    


 
  JLabel lblfathernme=new JLabel("Father’s name :");
  lblfathernme.setBounds(25, 255, 120, 40);
  pnlForm.add(lblfathernme);
   txtfathernme=new JTextField();
  txtfathernme.setBounds(140, 260, 200, 30);
  
  pnlForm.add(txtfathernme);

  JLabel lblmothernme=new JLabel("Mother’s name :");
  lblmothernme.setBounds(400, 255, 120, 40);
  pnlForm.add(lblmothernme);
   txtmothernme=new JTextField();
  txtmothernme.setBounds(500, 260, 200, 30);

  pnlForm.add(txtmothernme);

String m=" +Design and deliver curricula to meet the national and global"+" changing needs through student-centric learning methodologies.\n+Attract, nurture and retain the best faculty and technical manpower.";

fntsjec= new Font("Courier", Font.BOLD,14);

JComboBox<String> box;
String [ ] subjects = {"Math", "Science","English","History","Genetics"};
box = new JComboBox<>(subjects);
box.setBounds(50,80,90,30);
pnlForm.add(box);
 

  
 



  //JLabel test =new JLabel("PLEASE WORK");
  //test.setBounds(250,180,140,30);
  //test.setForeground(Color.RED);
  //pnlForm.add(test);


  btnPrint.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
 
      
    String m= txtmothernme.getText();
    kk();
    JLabel okay =new JLabel(m);
    okay.setBounds(0, 0, 120, 50);
    okay.setForeground(Color.red);
    kk.add(okay);
    kk.repaint();
    }
   
  } );
}



void redlbladder(JLabel ok )
{
 float b=ok.getAlignmentX();
 float a=ok.getAlignmentY();
  JLabel test =new JLabel("PLEASE WORK");

  test.setAlignmentX(b+100);
 test.setAlignmentY(a+100);
  test.setForeground(Color.RED);
  pnlForm.add(test);
  FH.repaint();

}


public static void main(String[] args){
    App a =new App();
    a.frame();          
}
}
