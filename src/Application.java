
import java.awt.Color;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource; //Imports
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.util.regex.Pattern;
import java.awt.print.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import mycolors.mycolors;               // Package Import

public class Application {               // Class
    
     JFrame FH,finalform;            //Frame Declaration 
     JButton btnApplicationform,btnAbout,btncourse,btncontact, btnprint;
     Font fntsjec,fntAppliNO,fntform,fntabtusin,fntfct,crsoffrd;

      mycolors colors=new mycolors();           // Imported package colors assigned to class variables
      Color clrmain= colors.clrmain;
      Color clrsecond=colors.clrsecond;
      Color clraccent=colors.clraccent;
      Color clryll=colors.clryll;
    public  void frame()                     //Frame defination and calling of all the necessary function
    {
        FH=new JFrame("SJEC");      
        FH.setBounds(20, 20, 1030, 710);
        FH.getContentPane().setBackground(clrmain);
        FH.setLayout(null);
        FH.setResizable(false);
        toppanel(FH);
        sidepanel();
        applicationform();
        abtus();
        coursesoffered();
        contactus();
        listeners();
        FH.setDefaultCloseOperation(FH.EXIT_ON_CLOSE);
        FH.setVisible(true);  
    }     
     void toppanel(JFrame frm)                        //Top panel defination
    {
        JPanel pnltop =new JPanel();      
        pnltop.setLayout(null);
        pnltop.setBounds(0, 0, 1100, 120);
        pnltop.setBackground(clrmain);
        frm.add(pnltop);
        
        ImageIcon topsjeclogo = new ImageIcon("mainsjec.png");
        JLabel lblicon=new JLabel();
        lblicon.setBounds(50, 30, 80, 80);
        lblicon.setIcon(topsjeclogo);
        pnltop.add(lblicon);
    }
     void sidepnlbtnadder(JButton btn,JPanel side)      //Function takes the button to be added to 
     {                                                  //the side panel and sets its visual description 
        btn.setForeground(Color.white);         
        btn.setBackground(Color.black);
        btn.setFocusable(false);
        btn.setOpaque(false);
        btn.setBorderPainted(false);
        side.add(btn);
     }
     void sidepanel()                     //Side panel  Defination with defination of the buttons 
    {                                     // placed on it
        JPanel pnlside=new JPanel();    
        pnlside.setLayout(null);
        pnlside.setBounds(0, 100, 180, 560);
        pnlside.setBackground(clrmain);
        FH.add(pnlside);
        
        btnApplicationform =new JButton("Application Form");     
        btnApplicationform.setBounds(0, 50, 180, 40);
        btnApplicationform.setBackground(Color.white);
        btnApplicationform.setBorderPainted(false);
        btnApplicationform.setFocusable(false);
        btnApplicationform.setForeground(clrmain);
        pnlside.add(btnApplicationform);

        btnAbout =new JButton("About us");    
        btnAbout.setBounds(0, 140, 180, 40);
        sidepnlbtnadder(btnAbout,pnlside);

        btncourse =new JButton("Courses offered");  
        btncourse.setBounds(0, 95, 180, 40);
        sidepnlbtnadder(btncourse,pnlside);

        btncontact =new JButton("Contact us");
        btncontact.setBounds(0, 185, 180, 40);
        sidepnlbtnadder(btncontact,pnlside);
   } 
    public void buttonclicked(JButton btnclicked,JButton btnother1,JButton btnother2 ,JButton btnother3)
   {
    btnclicked.setBackground(Color.white);         //Function to change the color of the button clicked
    btnclicked.setForeground(clrmain);             //pn the side panel
    btnclicked.setOpaque(true);
    btnother1.setOpaque(false);
    btnother1.setForeground(Color.white);
    btnother2.setOpaque(false);
    btnother2.setForeground(Color.white);
    btnother3.setOpaque(false);
    btnother3.setForeground(Color.white);
   }

   void diabox(String m)                          //function to display a message box
   { 
    flag=true;
    JOptionPane warning=new JOptionPane();
    warning.showMessageDialog(FH, m);
 
   } 

      // Components declaration and string initialisation
    JPanel pnlForm,pnlForm2,pnlfinalform;
    JTextField txtname1,txtname2,txtname3,txtphno,txtemail,txtfathernme,txtaadharno,txtmothernme,txtnationality;
    JTextField txt10instituition,txt12instituition,txt10year,txt12year,txt10percent,txt12percent,txtexamrank,txtregNo,txtemxyear;
    JTextField txtaddress1,txtaddress2,txtpincode,txtcity,txtstate;
    JButton btnsubmit;
    JTabbedPane tbpnlapplicationform;
    JPanel  pnlcrsoffrd,pnlcontactus,pnlAbtus;
    String randomnumber;
    String gender;
    JCheckBox  chkhostel,chkmidday,chkBus;
    JRadioButton rbmale,rbfemale;
    JComboBox<String> cmbday,cmbmonth,cmbyear,cmb10board,cmb12board,cmbcmpexam,cmbcourseselected;
    int DOByear,DOBday,DOBmonth,tenboard,twelveboard,entrnceexam,courseselec;
    String[] day={"--","1","2","3","4","5","6","7","8","9","10",
    "11","12","13","14","15","16","17","18","19","20",
    "21","22","23","24","25","26","27","28","29","30","31" };
    String[] month={"--","January","February","March","April","May","June",
        "July","August","September","October","November","December"};
    String[] year={"--","1995","1996","1997","1998","1999","2000","2001","2002","2003",
        "2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014",
        "2015","2016","2017","2018","2019","2020","2021","2022",};
    String [] ten={"--","SSLC","CBSE","Other"};
    String [] twelve={"--","KPUC","CBSE","Other"};
    String[] exam={"--","Management","JEE","KCET","COMEDK"};
    String[] course={"--","Mechanical Engineering","Civil Engineering","Software Engineering","Electrical & Electronics Engineering"};
    String strngmission=("• Attract, nurture and retain the best faculty and technical manpower."
                         +"\n \n • Consolidate the state-of-art infrastructure and equipment for teaching and research activities.");
    String strngvision=("• To be a global premier Institution of professional education and research");
    String strngcse=("‎ The Department was started in the year 2002 to offer Bachelor of Engineering (BE) degree program in Computer" 
                     +"Science & Engineering (CSE). The undergraduate program is offered with a unique combination of courses and projects "
                      +"that help its students to cope up with the recent advancements in the computer industry.");
    String strngeee=("The Department of Electrical & Electronics Engineering (E&E) was established in the year 2002. This programme offers "
                     +"a unique mix of electrical, electronics and computer related courses enabling the students to take up a professional "
                     +"carrier/higher studies in any of these areas.");
    String strngmech=("The Department of Mechanical Engineering was established in the year 2002 with the vision of nurturing technically"
                     + "competent and socially responsible Engineering Professions. The Mechanical Engineering Department, SJEC, strives to "
                      +"prepare students for careers across a broad range of industries.");
    String strngciv=("A vibrant Department, established in 2012. The Civil Engineering department aims to produce graduate engineers equipped "
                      +"for careers in the public and have such as structural engineering, geotechnical engineering, water resources, transportation,"
                     + "environmental and construction industries.");
     
     void mainpaneladder(JPanel pnlmain)        //descrption of the various main panels 
     {
        pnlmain.setBounds(180, 120, 850, 580);
        pnlmain.setLayout(null);
        pnlmain.setBackground(clrsecond);
     }

     void lbladder(JLabel lbl, JPanel pnl)   //function takes the label and the panel it has to added
     {                                       //and also sets the font of the given label
        lbl.setFont(fntform);
        pnl.add(lbl);
     }
     
     void txtfldadder(JTextField txt, JPanel pnl)   //function takes the textfield and the panel it has to added
     {
        txt.setFont(fntform);                      //and also sets the font of the given textfield
        pnl.add(txt);
     }

     void buttonwithbckgrndpnl(JPanel bckgrndpnl,JButton btnadded)
     {
        bckgrndpnl.setBackground(clrmain);         //function to add button to a panel and description
        bckgrndpnl.setLayout(null);                //of the background panel
         btnadded.setBounds(0, 0, 150, 40);
         btnadded.setBackground(Color.black);
         btnadded.setFocusable(false);
         btnadded.setBorderPainted(false);
         btnadded.setOpaque(false);
         btnadded.setForeground(Color.white);
         bckgrndpnl.add(btnadded);
     }
    void applicationform()             //function describes the componenets in the application form panels
     {
         pnlForm=new JPanel();             
         mainpaneladder(pnlForm);            
         pnlForm2=new JPanel();             
         mainpaneladder(pnlForm2);
        
        fntform= new Font("Courier", Font.BOLD,13);
        JLabel lblfname=new JLabel("First Name ");
        lblfname.setBounds(25, 60, 150, 40);
        lbladder(lblfname,pnlForm);
         txtname1=new JTextField();
        txtname1.setBounds(100, 65, 150, 30);
        txtfldadder(txtname1,pnlForm);
       
        JLabel lblMname=new JLabel("Middle Name ");
        lblMname.setBounds(275, 60, 150, 40);
         lbladder( lblMname, pnlForm);
         txtname2=new JTextField();
        txtname2.setBounds(365, 65, 150, 30);
        txtfldadder(txtname2,pnlForm);

        JLabel lblLname=new JLabel("Last Name ");
        lblLname.setBounds(545, 60, 150, 40);
        lbladder(lblLname,  pnlForm);
         txtname3=new JTextField();
        txtname3.setBounds(630, 65, 150, 30);
        txtfldadder(txtname3,pnlForm);
        
        fntAppliNO= new Font("Courier", Font.BOLD,16);
        JLabel lblappliNO=new JLabel("Application No:");
        lblappliNO.setBounds(20, 15, 150, 40);
        lblappliNO.setForeground(Color.red);
        lblappliNO.setFont(fntAppliNO);
        pnlForm.add(lblappliNO);
        
        Random No=new Random();
         randomnumber=String.valueOf(No.nextInt(10000));
        JLabel lblrandom=new JLabel(randomnumber);
        lblrandom.setBounds(146, 15, 100, 40);
        lblrandom.setForeground(Color.red);
        lblrandom.setFont(fntAppliNO);
        pnlForm.add(lblrandom);

        JLabel lblGender=new JLabel("Gender :");
        lblGender.setBounds(25, 100, 120, 40);
        lbladder(lblGender,pnlForm);

         rbmale=new JRadioButton("Male");
        rbmale.setBounds(100, 110, 100, 20);
        rbmale.setBackground(clrsecond);
        pnlForm.add(rbmale);

         rbfemale=new JRadioButton("Female");
        rbfemale.setBounds(200, 110, 200, 20);
        rbfemale.setBackground(clrsecond);
        pnlForm.add(rbfemale);

        ButtonGroup rbgrpgender = new ButtonGroup();
        rbgrpgender.add(rbmale);
        rbgrpgender.add(rbfemale);

        JLabel lblDOB=new JLabel("Date Of Birth :");
        lblDOB.setBounds(25, 140, 120, 40);
         lbladder(lblDOB, pnlForm);

        JLabel lblphno=new JLabel("Phone Number :");
        lblphno.setBounds(25, 180, 120, 40);
         lbladder( lblphno,  pnlForm);

         txtphno=new JTextField();
        txtphno.setBounds(140, 180, 200, 30);
        txtfldadder(txtphno,pnlForm);

        JLabel lblemail=new JLabel("Email :");
        lblemail.setBounds(25, 220, 120, 40);
         lbladder(lblemail, pnlForm);
         txtemail=new JTextField();
        txtemail.setBounds(140, 220, 200, 30);
       txtfldadder(txtemail,pnlForm);
       
        JLabel lblfathernme=new JLabel("Father’s name :");
        lblfathernme.setBounds(25, 255, 120, 40);
         lbladder(lblfathernme, pnlForm);
         txtfathernme=new JTextField();
        txtfathernme.setBounds(140, 260, 200, 30);
        txtfldadder(txtfathernme,pnlForm);

        JLabel lblmothernme=new JLabel("Mother’s name :");
        lblmothernme.setBounds(400, 255, 120, 40);
         lbladder(lblmothernme,pnlForm);
         txtmothernme=new JTextField();
        txtmothernme.setBounds(500, 260, 200, 30);
       txtfldadder(txtmothernme,pnlForm);
        
        JLabel lblaadharno=new JLabel("Aadhar No :");
        lblaadharno.setBounds(25, 340, 120, 40);
         lbladder(lblaadharno , pnlForm );
         txtaadharno=new JTextField();
        txtaadharno.setBounds(140, 340, 200, 30);
       txtfldadder(txtaadharno,pnlForm);

        JLabel lblnationality=new JLabel("Nationality :");
        lblnationality.setBounds(25, 300, 120, 40);
         lbladder(lblnationality,pnlForm);
        txtnationality=new JTextField();
        txtnationality.setBounds(140, 300, 200, 30);
       txtfldadder(txtnationality,pnlForm);

        JLabel lbladdress1=new JLabel("Address Line 1 :");
        lbladdress1.setBounds(25, 380, 120, 40);
         lbladder(lbladdress1,pnlForm );
         txtaddress1=new JTextField();
         txtaddress1.setBounds(140, 380, 500, 30);
        txtfldadder(txtaddress1,pnlForm);

         JLabel lbladdress2=new JLabel("Address Line 2 :");
         lbladdress2.setBounds(25, 420, 120, 40);
          lbladder(lbladdress2,pnlForm );
          txtaddress2=new JTextField();
          txtaddress2.setBounds(140, 420, 500, 30);
          txtfldadder(txtaddress2,pnlForm);

        JLabel lblcity=new JLabel("City :");
        lblcity.setBounds(95, 455, 105, 40);
         lbladder(lblcity,pnlForm );
         txtcity=new JTextField();
         txtcity.setBounds(140, 460, 140, 30);
        txtfldadder(txtcity,pnlForm);
        
         JLabel lblstate=new JLabel("State :");
         lblstate.setBounds(305, 455, 105, 40);
         lbladder(lblstate,pnlForm );
         txtstate=new JTextField();
         txtstate.setBounds(350, 460, 140, 30);
         txtfldadder(txtstate,pnlForm);

         JLabel lblpincode=new JLabel("Pincode :");
         lblpincode.setBounds(520, 455, 120, 40);
          lbladder(lblpincode,pnlForm );
          txtpincode=new JTextField();
          txtpincode.setBounds(590, 460, 140, 30);
         txtfldadder(txtpincode,pnlForm);
 
        cmbday =new JComboBox<>(day);
        cmbday.setBounds(140, 145, 60, 25);
        pnlForm.add(cmbday);
        
        cmbmonth =new JComboBox<>(month);
        cmbmonth.setBounds(230, 145, 150, 25);
        pnlForm.add(cmbmonth);

         cmbyear =new JComboBox<>(year);
        cmbyear.setBounds(410, 145, 80, 25);
        pnlForm.add(cmbyear);

         JPanel submitbckgrnd = new JPanel();
         submitbckgrnd.setBounds(640, 455, 150, 40);
         pnlForm2.add(submitbckgrnd);

        btnsubmit=new JButton("Submit");
        btnsubmit.setBounds(0, 0, 150, 40);
        buttonwithbckgrndpnl(submitbckgrnd,btnsubmit);

        JPanel pnltnltop=new JPanel();             
        pnltnltop.setBounds(40, 40, 600, 50);
        pnltnltop.setLayout(null);
        pnltnltop.setBackground(clrmain);
        pnlForm2.add(pnltnltop);
        
        JLabel lblexam=new JLabel("Examination");
        lblexam.setForeground(clryll);
        lblexam.setBounds(12, 12, 90, 40);
         lbladder(lblexam , pnltnltop );
        
        JLabel lblbrd=new JLabel("Board");
        lblbrd.setForeground(clryll);
        lblbrd.setBounds(140, 12, 90, 40);
         lbladder( lblbrd,  pnltnltop);
      
         cmb10board=new JComboBox<>(ten);
        cmb10board.setBounds(160, 100, 80, 25);
        pnlForm2.add(cmb10board);

         cmb12board=new JComboBox<>(twelve);
        cmb12board.setBounds(160, 140, 80, 25);
        pnlForm2.add(cmb12board);

        JLabel lblinstituition=new JLabel("Institution");
        lblinstituition.setForeground(clryll);
        lblinstituition.setBounds(258, 12, 90, 40);
         lbladder( lblinstituition,pnltnltop);
         txt10instituition=new JTextField();
        txt10instituition.setBounds(260, 100, 150, 25);
        txtfldadder(txt10instituition,pnlForm2);

         txt12instituition=new JTextField();
        txt12instituition.setBounds(260, 140, 150, 25);
       txtfldadder(txt12instituition,pnlForm2);

        JLabel lblyear=new JLabel("Year");
        lblyear.setForeground(clryll);
        lblyear.setBounds(400, 12, 90, 40);
         lbladder(lblyear,pnltnltop  );
         txt10year=new JTextField();
        txt10year.setBounds(420, 100, 80, 25);
       txtfldadder(txt10year,pnlForm2);

         txt12year=new JTextField();
        txt12year.setBounds(420, 140, 80, 25);
       txtfldadder(txt12year,pnlForm2);

        JLabel lblpercentage=new JLabel("Percentage");
        lblpercentage.setForeground(clryll);
        lblpercentage.setBounds(480, 12, 90, 40);
         lbladder(lblpercentage ,pnltnltop);
         txt10percent=new JTextField();
        txt10percent.setBounds(520, 100, 80, 25);
       txtfldadder(txt10percent,pnlForm2);

         txt12percent=new JTextField();
        txt12percent.setBounds(520, 140, 80, 25);
      txtfldadder(txt12percent,pnlForm2);

        JPanel pnltnlside=new JPanel();             
        pnltnlside.setBounds(40, 80, 105, 90);
        pnltnlside.setLayout(null);
        pnltnlside.setBackground(clrmain);
        pnlForm2.add(pnltnlside);
        JLabel lbl10=new JLabel("10th");
        lbl10.setForeground(clryll);
        lbl10.setBounds(35, 10, 60, 40);
         lbladder(lbl10 ,pnltnlside  );
        JLabel lbl12=new JLabel("12th");
        lbl12.setForeground(clryll);
        lbl12.setBounds(35, 50, 60, 40);
         lbladder(lbl12, pnltnlside);
        
        JLabel lblCmpexam=new JLabel("Mode Of Admission");
        lblCmpexam.setBounds(60, 265, 150, 20);
         lbladder(lblCmpexam ,  pnlForm2);

        cmbcmpexam =new JComboBox<>(exam);
        cmbcmpexam.setBounds(190, 265, 150, 25);
        pnlForm2.add(cmbcmpexam);

        JLabel lblexamrank=new JLabel("Entrance Exam Rank");
        lblexamrank.setBounds(390, 265, 150, 20);
         lbladder(lblexamrank,pnlForm2);
         txtexamrank = new JTextField();
        txtexamrank.setBounds(530, 265, 150, 25);
        txtfldadder(txtexamrank,pnlForm2);

        JLabel lblregNo=new JLabel("Registration No");
        lblregNo.setBounds(60, 315, 150, 20);
         lbladder(lblregNo, pnlForm2);
         txtregNo = new JTextField();
        txtregNo.setBounds(190, 315, 150, 25);
        txtfldadder(txtregNo,pnlForm2);
     
        JLabel lblexmyear=new JLabel("Year Of Exam");
        lblexmyear.setBounds(390, 315, 150, 20);
         lbladder(lblexmyear,pnlForm2);
         txtemxyear = new JTextField();
        txtemxyear.setBounds(530, 315, 150, 25);
       txtfldadder(txtemxyear,pnlForm2);
        
         cmbcourseselected =new JComboBox<>(course);
        cmbcourseselected.setBounds(140, 215, 200, 25);
        pnlForm2.add(cmbcourseselected);

        JLabel lblcrsselected=new JLabel("Course:");
        lblcrsselected.setBounds(60, 215, 200, 30);
         lbladder(lblcrsselected, pnlForm2);

        JLabel lbl =new JLabel("Facilities");
        lbl.setBounds(100, 370, 300, 40);
        fntfct =new Font("Courier", Font.BOLD,18 );
        lbl.setFont(fntfct);
        pnlForm2.add(lbl);
       
         chkmidday=new JCheckBox("Mid Day Meal");
        chkmidday.setBounds(100, 410, 130, 20);
        pnlForm2.add(chkmidday);      

         chkhostel=new JCheckBox("Hostel ");
        chkhostel.setBounds(280, 410, 130, 20);
        pnlForm2.add(chkhostel);

         chkBus=new JCheckBox("College Bus");
        chkBus.setBounds(460, 410, 130, 20);
        pnlForm2.add(chkBus);
            
        tbpnlapplicationform=new JTabbedPane();
        tbpnlapplicationform.setBounds(180, 120, 850, 580);
        tbpnlapplicationform.addTab("Personal Details",pnlForm );
        tbpnlapplicationform.addTab("Academic Details",pnlForm2 );
        FH.add(tbpnlapplicationform);
     }  
        void textareaadd(JTextArea area,JPanel pnl,String text,Font ping)
        {
        
            area.setWrapStyleWord(true);     //function to add text area to a panel and set the text on
            area.setLineWrap(true);          //it and sets its font
            area.setFont(ping);
            area.setText(text);
            area.setFocusable(false);
            area.setOpaque(false);
            area.setForeground(clrmain);
            area.setEditable(false);
            pnl.add(area);
        }
     void abtusadder(JPanel abtuspnl,String abtus)   //function to add various component of the about us
     {                                               //panel and their description
        Font fntabtusinside = new Font("Arial", Font.PLAIN,28);
        ImageIcon abtimg = new ImageIcon("sjec2.png");
        JLabel lblabtus=new JLabel();
        lblabtus.setBounds(50, 20, 60, 60);
        lblabtus.setIcon(abtimg);
        abtuspnl.add(lblabtus);

        JLabel lbltextabtus=new JLabel(abtus);
        lbltextabtus.setBounds(120, 13, 200, 60);
        lbltextabtus.setForeground(clryll);
        lbltextabtus.setFont(fntabtusinside);
        abtuspnl.add(lbltextabtus);

        JPanel pnlabtustp=new JPanel();             
        pnlabtustp.setBounds(0, 0, 330, 63);
        pnlabtustp.setBackground(clrmain);
        pnlabtustp.setLayout(null);
        abtuspnl.add(pnlabtustp);
        
        JPanel pnlabtusaccnt=new JPanel();             
        pnlabtusaccnt.setBounds(0, 63, 330, 7);
        pnlabtusaccnt.setBackground(clraccent);
        pnlabtusaccnt.setLayout(null);
        abtuspnl.add(pnlabtusaccnt);

        abtuspnl.setLayout(null);
        abtuspnl.setBackground(clryll);
        pnlAbtus.add(abtuspnl);
     }
        void abtus(){                    //about us panel description and function call to add various
        pnlAbtus=new JPanel();           //function and passes the information to be displayed
        mainpaneladder(pnlAbtus);
        crsoffrd= new Font("Courier", Font.BOLD,14);

        JPanel pnlmission=new JPanel();
        pnlmission.setBounds(50, 140, 330, 250);
        abtusadder(pnlmission," Mission");
        JTextArea txtmission =new JTextArea();
        txtmission.setBounds(05,90,325,160);
        textareaadd(txtmission, pnlmission,strngmission,fntAppliNO);

        JPanel pnlvision=new JPanel();
        abtusadder(pnlvision," Vision");
        pnlvision.setBounds(435, 140, 330, 250);
        JTextArea txtvision =new JTextArea();
        txtvision.setBounds(05,90,325,160);
        textareaadd(txtvision, pnlvision,strngvision,fntAppliNO);
       }
          
        void cntctusadder(JPanel pnlcnt,String name,String desg,String phno,String email )
        { 
        pnlcnt.setLayout(null);                      //function to add various component of the contact us
        pnlcnt.setBackground(clryll);                 //panel and their description
        pnlcontactus.add(pnlcnt);
         
         JPanel pnlcntusaccnt=new JPanel();
        pnlcntusaccnt.setLayout(null);
        pnlcntusaccnt.setBounds(0, 20, 850, 04);
        pnlcntusaccnt.setBackground(clraccent);
        pnlcnt.add(pnlcntusaccnt);
        fntsjec= new Font("Courier", Font.BOLD,22);
        JLabel lblnme =new JLabel(name);
        lblnme.setBounds(12, 25, 400, 50);
        lblnme.setForeground(Color.darkGray);
        lblnme.setFont(fntsjec);
        pnlcnt.add(lblnme);
        JLabel lbldesg =new JLabel(desg);
        lbldesg.setBounds(12, 50, 400, 50);
        lbldesg.setForeground(Color.darkGray);
        lbldesg.setFont(fntAppliNO);
        pnlcnt.add(lbldesg);
        JLabel lblphno1 =new JLabel(phno);
        lblphno1.setBounds(12, 75, 400, 50);
        lblphno1.setForeground(Color.darkGray);
        lblphno1.setFont(fntform);
        pnlcnt.add(lblphno1);
        JLabel lblemail =new JLabel(email);
        lblemail.setBounds(12, 95, 400, 50);
        lblemail.setForeground(Color.darkGray);
        lblemail.setFont(fntform);
        pnlcnt.add(lblemail);
        }

        void contactus()              
       {                               //contact us  panel description and function call to add various
        pnlcontactus=new JPanel();     //function and passes the information to be displayed      
        mainpaneladder(pnlcontactus);
        JPanel pnlpricipal=new JPanel();
        pnlpricipal.setBounds(0, 300, 850, 160);
        cntctusadder(pnlpricipal,"Dr. Rio D'Souza","Principal - SJEC","Tel : +91 824 2263732 (Off.)","Email: principal@sjec.ac.in");
        JPanel pnldirector=new JPanel();
        pnldirector.setBounds(0, 40, 850, 160);
        cntctusadder(pnldirector,"Rev. Fr Wilfred Prakash D'Souza","Director - SJEC","Tel : +91 824 2263758 (Off.)","Email : sjec@sjec.ac.in");
       }

      void addercrsoffrd(String course,JPanel w,Color fntColor,Color top )
      { 
        Font fntcsr = new Font("Courier", Font.BOLD,16);
        JPanel pnlaccnt=new JPanel();
        pnlaccnt.setBackground(clraccent);
        pnlaccnt.setBounds(0, 45, 320, 06);   //function to add various component of the courses offered
         w.add(pnlaccnt);                     //panel on button click to be config

        JLabel lblcoursenme=new JLabel(course);
        lblcoursenme.setFont(fntcsr);
        lblcoursenme.setForeground(fntColor);
        lblcoursenme.setBounds(5, 5, 310, 40);
        w.setBackground(clryll);
        w.add(lblcoursenme);
        w.setLayout(null);
        pnlcrsoffrd.add(w);
        JPanel coursetop =new JPanel();
        coursetop.setBackground(top);
        coursetop.setBounds(0, 0, 320, 45);
        w.add(coursetop);
      }
     void coursesoffered()              
        {                                     
        pnlcrsoffrd=new JPanel();          //courses offered panel description and function call to add various
        mainpaneladder(pnlcrsoffrd);       //function and passes the information to be displayed

        JPanel pnlCSE=new JPanel();
        pnlCSE.setBounds(80, 30, 320, 230);
        addercrsoffrd("Software Engineering",pnlCSE,clryll,clrmain);
        JTextArea txtcse =new JTextArea();
        txtcse.setBounds(05, 60, 310, 160);
        textareaadd(txtcse, pnlCSE,strngcse,crsoffrd);

        JPanel pnlmech=new JPanel();
        pnlmech.setBounds(80, 275, 320, 230);
        addercrsoffrd("Mechanical Engineering",pnlmech,clryll,clrmain);
        JTextArea txtmech =new JTextArea();
        txtmech.setBounds(05, 60, 310, 160);
        textareaadd(txtmech, pnlmech,strngmech,crsoffrd);

        JPanel pnlEEE=new JPanel();
        pnlEEE.setBounds(430, 30, 320, 230);
        addercrsoffrd("Electrical & Electronics Engineering",pnlEEE,clryll,clrmain);
        JTextArea txteee =new JTextArea();
        txteee.setBounds(05, 60, 310, 160);
        textareaadd(txteee, pnlEEE,strngeee,crsoffrd);

        JPanel pnlcivil=new JPanel();
        pnlcivil.setBounds(430, 275, 320, 230);
       addercrsoffrd("Civil Engineering",pnlcivil,clryll,clrmain);
       JTextArea txtcivil =new JTextArea();
       txtcivil.setBounds(05, 60, 310, 160);
       textareaadd(txtcivil, pnlcivil,strngciv,crsoffrd);
        }
  //input validation
  boolean flag;
  public void alphaonly(String n,String item,int len)
    {    Boolean a;
        getdata(n,item,len);
        if (flag==false)
        {
           if(Pattern.matches("[a-zA-Z, ]+", n))
            a=true;
            else 
           { 
           a=false;
           }
       if(a==false)
          diabox("Invalid "+item);
        }
    }

    public void numberonly(String no,String item,int len)
    {   
        Boolean a;
        getdata(no,item,len);
        if (flag==false)
        {
        if(Pattern.matches("[0-9, ]+", no))
            a=true;
            else 
           { 
           a=false;
           }
           if(a==false)
           diabox("Invalid "+item);
         }
     }
        
     void email(String e,String item,int len)
    {    
        Boolean a;
        getdata(e,item,len);
        if (flag==false)
        {
         if(Pattern.matches("^[A-Za-z0-9._]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", e))
            a=true;
         else 
           { 
           a=false;
           }
           if(a==false)
           diabox("Invalid "+item);
         }
        }

       void longerchckdata(String m,String item,int len)
       {
        if(m.length()>len&&flag==false) //cmb
        {
           diabox(item+" exceeds limit("+len+")");  
        }    
       }
       void getdata(String n,String item,int len)
        {         
          if(n.length()==0&&flag==false) //cmb
            {
               diabox(item+" not entered");
            }
            longerchckdata(n,item,len);     
        }
         void cmbgetdata(String[] cmb,int i,String item)
        {  
             if(cmb[i]=="--"&&flag==false)  //cmb
             {
              diabox(item+"is not selected");
             }
        }
   String strngfname,strngmname,strngLname,strngphno,strngemail,strngfathername,strngaadharno,strngmothername,strngnation,strngaddressgender;
   String strng10instituition,strng12instituition,strng10year,strng12year,strng10percent,strng12percent,strngDOBday,strngDOBmonth,strngDOByear;
   String  strngexamrnk,strngregno,strngexmyear,strngaddress1,strngaddress2,strngpincode,strngcity,strngstate,strngfacilty;
       void listeners(){ // action listener description 

        btnAbout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             
                tbpnlapplicationform.setVisible(false);
                pnlcrsoffrd.setVisible(false);
                pnlAbtus.setVisible(true);
                pnlcontactus.setVisible(false);
                FH.add(pnlAbtus);

                buttonclicked( btnAbout, btnApplicationform, btncontact, btncourse);
        
                FH.repaint();    
            }
            });

        btnApplicationform.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                 
                    tbpnlapplicationform.setVisible(true);
                    pnlcrsoffrd.setVisible(false);
                    pnlcontactus.setVisible(false);
                    pnlAbtus.setVisible(false); 
                    
                    buttonclicked( btnApplicationform, btncourse, btnAbout, btncontact);
                    FH.repaint();    
                }
                });

                btncontact.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                     
                        tbpnlapplicationform.setVisible(false);
                        pnlcrsoffrd.setVisible(false);
                        pnlcontactus.setVisible(true);
                        pnlAbtus.setVisible(false);
                        FH.add(pnlcontactus);
                        buttonclicked( btncontact, btnApplicationform, btnAbout, btncourse);
                        FH.repaint();   
                    }
                    });

                    btncourse.addActionListener(new  ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                         
                            tbpnlapplicationform.setVisible(false);
                            pnlcontactus.setVisible(false);
                            pnlAbtus.setVisible(false);
                            pnlcrsoffrd.setVisible(true);
                            FH.add(pnlcrsoffrd);
                            buttonclicked( btncourse, btnApplicationform, btnAbout, btncontact);
                            FH.repaint();
                            
                        }
                        });
                        
                    btnsubmit.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                         
                             flag=false;
                              strngfacilty=" ";
                            strngfname=txtname1.getText();
                            strngmname=txtname2.getText();
                            strngLname=txtname3.getText();
                            alphaonly(strngfname+strngmname+strngLname,"Name",30);
                            strngphno=txtphno.getText();
                            numberonly(strngphno ,"Phone Number", 10);
                            strngemail=txtemail.getText();
                            email( strngemail,"Email", 30);
                            strngfathername=txtfathernme.getText();
                            alphaonly(strngfathername,"Father's Name",30);
                            strngaadharno=txtaadharno.getText();
                            numberonly(strngaadharno ,"Adhaar Number", 12);
                            strngmothername=txtmothernme.getText();
                            alphaonly(strngmothername,"Mother's Name",30);
                            strngnation=txtnationality.getText();
                            alphaonly(strngnation,"Nationality",30);
                            strngaddress1=txtaddress1.getText();
                            strngaddress2=txtaddress2.getText();
                            getdata(strngaddress2+strngaddress1,"Address",75);
                            strngpincode=txtpincode.getText();
                            numberonly(strngpincode ,"Pincode", 6);
                            strngcity=txtcity.getText();
                            alphaonly(strngcity,"City",30);
                            strngstate=txtstate.getText();
                            alphaonly(strngstate,"State",30);
                            strng12instituition=txt12instituition.getText();
                            alphaonly(strng12instituition,"12th Institution",35);
                            strng10instituition=txt10instituition.getText();
                            alphaonly(strng10instituition,"10th Institution",35);
                            strng10year=txt10year.getText();
                            numberonly(strng10year ,"10th Year", 4);
                            strng12year=txt12year.getText();
                            numberonly(strng12year ,"12th Year", 4);
                            strng10percent=txt10percent.getText();
                            numberonly(strng10percent ,"10th Percentage", 3);
                            strng12percent=txt12percent.getText();
                            numberonly(strng12percent ,"12th Percentage", 3);
                            DOBday=cmbday.getSelectedIndex();
                            cmbgetdata(day,DOBday,"Date of birth (Day)");
                            DOBmonth=cmbmonth.getSelectedIndex();
                            cmbgetdata(month,DOBmonth,"Date of birth (Month)");
                            DOByear=cmbyear.getSelectedIndex();
                            cmbgetdata(year,DOByear,"Date of birth (Year)");
                            tenboard =cmb10board.getSelectedIndex();
                            cmbgetdata(ten,tenboard,"10th Board");
                            twelveboard=cmb12board.getSelectedIndex();
                            cmbgetdata(twelve,twelveboard,"12th Board");
                            entrnceexam=cmbcmpexam.getSelectedIndex();
                            cmbgetdata(exam,entrnceexam,"Mode of Admission");
                            courseselec=cmbcourseselected.getSelectedIndex();
                            cmbgetdata(course,courseselec,"Course selected");

                            if(chkmidday.isSelected())
                            {
                                strngfacilty=chkmidday.getText();
                            }
                            if(chkhostel.isSelected())
                            {
                                strngfacilty=strngfacilty+"      "+chkhostel.getText();
                            }
                            if(chkBus.isSelected())
                            {
                                strngfacilty=strngfacilty+"       "+chkBus.getText();
                            }
                            if(strngfacilty==null)
                            {
                                strngfacilty="--";
                            }
                           if(exam[entrnceexam]=="Management")
                            {
                                txtexamrank.setText(null);
                                txtregNo.setText(null);
                                txtemxyear.setText(null);
                                strngexmyear="-";
                                strngregno="-";
                                strngexamrnk="-";
                            }
                            else{
                                strngexamrnk=txtexamrank.getText();
                                strngregno=txtregNo.getText();
                                strngexmyear=txtemxyear.getText();
                                   numberonly(strngexmyear,"Exam year",4);
                                   numberonly(strngexamrnk,"Exam Rank",15);
                                   getdata(strngregno,"Exam Registration Number",15);
                             }
                            if(rbfemale.isSelected())
                            {
                                strngaddressgender=rbfemale.getText();
                            }
                            else 
                            if(rbmale.isSelected())
                            {
                            
                                strngaddressgender=rbmale.getText();
                            }
                            else{
                                if( flag==false){
                                    diabox("Gender not entered");
                                   flag=true; 
                                }
                        }     
                            FH.repaint();
                          // if (flag==false)
                            {
                                finalformdisplay();
                            }    
                        }
                        });
                    }
    
        void finalfrmlbladder(JLabel lbl,JPanel pnl)
        {
                    
            lbl.setFont(fntform);
            lbl.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
            pnl.add(lbl);

        }

        void finalfrmpnladder(JPanel pnlwithbrder)
        {
            pnlwithbrder.setBorder(BorderFactory.createLineBorder(Color.black, 2));
            pnlwithbrder.setBackground(Color.white);
            pnlwithbrder.setLayout(null);
            pnlfinalform.add(pnlwithbrder);
        }
        void finalformdisplay()
       {
        finalform =new JFrame("Application Form");
        finalform.setBounds(20, 20, 1030, 710);
        finalform.setLayout(null);
        finalform.setResizable(false);
        finalform.getContentPane().setBackground(clrsecond);
        toppanel(finalform);

       JPanel pnlfinalformbackfrnd =new JPanel();
       pnlfinalformbackfrnd.setPreferredSize(new DimensionUIResource(1030, 750));
       pnlfinalformbackfrnd.setLayout(null);
       pnlfinalformbackfrnd.setBackground(clrsecond);
       JScrollPane scroll =new JScrollPane(pnlfinalformbackfrnd, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       scroll.setBounds(0, 120, 1013, 550);
       finalform.add(scroll);

        pnlfinalform=new JPanel();
        pnlfinalform.setBounds(90, 80, 710, 550);
        pnlfinalform.setBackground(Color.white);
        pnlfinalform.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        pnlfinalform.setLayout(null);
        pnlfinalformbackfrnd.add(pnlfinalform);
       
        JLabel lblappliNO=new JLabel(" Application No:"+randomnumber);
        lblappliNO.setBounds(05, 25, 600, 40);
        lblappliNO.setForeground(Color.red);
        finalfrmlbladder(lblappliNO , pnlfinalform );
        
        ImageIcon imglogo = new ImageIcon("mainsjec.png");
        JLabel lbllogo=new JLabel();
        lbllogo.setBounds(613, 18, 80, 80);
        lbllogo.setIcon(imglogo);
        pnlfinalform.add(lbllogo);

        JPanel pnladdress =new JPanel();
        pnladdress.setBounds(05, 245, 345, 105);
         finalfrmpnladder(pnladdress );

        JPanel pnlentrnceexm =new JPanel();
        pnlentrnceexm.setBounds(360, 245, 345, 105);
        finalfrmpnladder(pnlentrnceexm );

        JPanel pnl10 =new JPanel();
        pnl10.setBounds(05, 355, 345, 90);
        finalfrmpnladder(pnl10 );

        JPanel pnl12 =new JPanel();
        pnl12.setBounds(360, 355, 345, 90);
        finalfrmpnladder(pnl12 );

        JPanel pnlfacilities =new JPanel();
        pnlfacilities.setBounds(05, 450, 700, 30);
        finalfrmpnladder(pnlfacilities );

        JLabel lblfacility=new JLabel("Facilities Availed: "+strngfacilty);
        lblfacility.setBounds(05, 01, 600, 30);
        lbladder(lblfacility , pnlfacilities );

        JLabel lblfname=new JLabel(" Name:"+  strngfname+" "+strngmname+" "+strngLname);
        lblfname.setBounds(05, 70, 600, 30);
        finalfrmlbladder(lblfname , pnlfinalform );
        
        JLabel lblGender=new JLabel(" Gender :"+strngaddressgender);
        lblGender.setBounds(5, 105, 345, 30);
        finalfrmlbladder(lblGender , pnlfinalform );
        
        JLabel lblDOB=new JLabel(" Date Of Birth :"+day[DOBday]+" " +month[DOBmonth] + " "+year[DOByear]);
        lblDOB.setBounds(360, 105, 345, 30);
        finalfrmlbladder( lblDOB, pnlfinalform );
        
        JLabel lblphno=new JLabel(" Phone Number :"+strngphno);
        lblphno.setBounds(05, 175, 345, 30);
        finalfrmlbladder( lblphno, pnlfinalform );
    
        JLabel lblemail=new JLabel(" Email :"+strngemail);
        lblemail.setBounds(360, 175, 345, 30);
        finalfrmlbladder( lblemail, pnlfinalform );
        
        JLabel lblfathernme=new JLabel(" Father’s name :"+strngfathername);
        lblfathernme.setBounds(05, 140, 345, 30);
        finalfrmlbladder( lblfathernme, pnlfinalform );

        JLabel lblmothernme=new JLabel(" Mother’s name :"+strngmothername);
        lblmothernme.setBounds(360, 140, 345, 30);
        finalfrmlbladder( lblmothernme, pnlfinalform );

        JLabel lblaadharno=new JLabel(" Aadhar No :"+strngaadharno);
        lblaadharno.setBounds(360, 210, 345, 30);
        finalfrmlbladder( lblaadharno, pnlfinalform );
       
        JLabel lblnationality=new JLabel(" Nationality :"+strngnation);
        lblnationality.setBounds(05, 210, 345, 30);
        finalfrmlbladder( lblnationality, pnlfinalform );
       
        JLabel lbladdress1=new JLabel(" Address :"+strngaddress1);
        lbladdress1.setBounds(05, 0, 400, 40);
        lbladder(lbladdress1 ,pnladdress);
        JLabel lbladdress2=new JLabel(strngaddress2);
        lbladdress2.setBounds(70, 17, 400, 40);
        lbladder(lbladdress2 ,pnladdress);
        JLabel lblcity=new JLabel(strngcity);
        lblcity.setBounds(70, 34, 400, 40);
        lbladder(lblcity ,pnladdress);
        JLabel lblstate=new JLabel(strngstate);
        lblstate.setBounds(70, 51, 400, 40);
        lbladder(lblstate ,pnladdress);
        JLabel lblpincode=new JLabel(strngpincode);
        lblpincode.setBounds(70, 68, 400, 40);
        lbladder(lblpincode ,pnladdress);

        JLabel lbltenboard=new JLabel(ten[tenboard]);
        lbltenboard.setBounds(50, 51, 600, 40);
        lbladder( lbltenboard,pnl10);

        JLabel lbltwelveboard=new JLabel(twelve[twelveboard]);
        lbltwelveboard.setBounds(50, 51, 600, 40);
        lbladder( lbltwelveboard,pnl12);

        JLabel lbltwelveinsti=new JLabel("12th:    "+strng12instituition);
        lbltwelveinsti.setBounds(05, 0, 340, 40);
        lbladder(lbltwelveinsti ,pnl12);
       
        JLabel lblteninsti=new JLabel("10th:    "+strng10instituition);
        lblteninsti.setBounds(05, 0, 600, 40);
        lbladder( lblteninsti,pnl10);
        
        JLabel lbltwelveyear=new JLabel(strng12year);
        lbltwelveyear.setBounds(50, 34, 600, 40);
        lbladder(lbltwelveyear ,pnl12);
        
        JLabel lbltenyear=new JLabel(strng10year);
        lbltenyear.setBounds(50, 34, 600, 40);
        lbladder( lbltenyear,pnl10);
       
        JLabel lbltenperc=new JLabel(strng10percent+"%");
        lbltenperc.setBounds(50, 17, 600, 40);
        lbladder( lbltenperc,pnl10);
        
        JLabel lbltwelveperc=new JLabel(strng12percent+"%");
        lbltwelveperc.setBounds(50, 17, 600, 40);
        lbladder(lbltwelveperc,pnl12);

        JLabel lblcmpexam=new JLabel("Mode Of Admission:"+exam[entrnceexam]);
        lblcmpexam.setBounds(05, 17, 340, 40);
        lbladder( lblcmpexam,pnlentrnceexm);

        JLabel lblcourseselec=new JLabel("Course:"+course[courseselec]);
        lblcourseselec.setBounds(05, 0, 340, 40);
        lbladder( lblcourseselec,pnlentrnceexm);
  
        JLabel lblexmrnk=new JLabel(" Exam Rank :"+strngexamrnk);
        lblexmrnk.setBounds(03, 51, 340, 40);
        lbladder( lblexmrnk,pnlentrnceexm);

        JLabel lblregno=new JLabel("Registration No :"+strngregno);
        lblregno.setBounds(05, 34, 340, 40);
        lbladder( lblregno,pnlentrnceexm);

        JLabel lblexmyear=new JLabel("Year Of Exam :"+strngexmyear);
        lblexmyear.setBounds(05, 68, 340, 40);
        lbladder( lblexmyear,pnlentrnceexm);

        JLabel lbldate=new JLabel(" Date:");
        lbldate.setBounds(05, 485, 340, 40);
        lbladder( lbldate,pnlfinalform);
        JLabel lblplace=new JLabel(" Place:");
        lblplace.setBounds(05, 510, 340, 40);
        lbladder( lblplace,pnlfinalform);

        JLabel lblsign=new JLabel("Signature");
        lblsign.setBounds(570, 510, 340, 40);
        lbladder( lblsign,pnlfinalform);
        
        JPanel printbckgrnd = new JPanel();
        printbckgrnd.setBounds(835, 590, 150, 40);
        pnlfinalformbackfrnd.add(printbckgrnd);

        ImageIcon printer = new ImageIcon("printer.png");
         btnprint=new JButton("  Print");
        btnprint.setBounds(0, 0, 150, 40);
        btnprint.setIcon(printer);
        buttonwithbckgrndpnl(printbckgrnd , btnprint);
        
        finalform.setLayout(null);
        finalform.setVisible(true);
       
       btnprint.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
      PrinterJob job = PrinterJob.getPrinterJob();
                job.setJobName("Print Data");
                job.setPrintable(new Printable(){
                public int print(Graphics pg,PageFormat pf, int pageNum){
                        pf.setOrientation(PageFormat.LANDSCAPE);
                     if(pageNum>0){
                        return Printable.NO_SUCH_PAGE;
                    }  
                    Graphics2D g2 = (Graphics2D)pg;
                    g2.translate(pf.getImageableX(), pf.getImageableY());
                    g2.scale(0.835,0.835);
                    pnlfinalform.paint(g2);  
                    return Printable.PAGE_EXISTS;    
                }
        });  
            boolean ok = job.printDialog();
            if(ok){
            try{    
            job.print();
            }
            catch (PrinterException ex){}
            }
          }  
      });
    }
        public static void main(String[] args){
            Application a =new Application();
            a.frame();             
}
}

