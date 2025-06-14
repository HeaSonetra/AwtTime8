
package Student;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class Register extends Frame implements ActionListener{
    Label lbTitle,lbID,lbName,lbGender,lbPrice,lbCourse,lbTime,lbPlace,lbTerm;
    TextField txtID,txtName,txtPrice;
    JRadioButton jrMale,jrFemale;
    JCheckBox chSat_Sun,chMon_Th;
    ButtonGroup btnGgender,btnGterm;
    JComboBox  cbCourse,cbTime,cbPlace;
    Panel panel;
    public Register(){
        lbTitle=new Label("Student Register");
        lbTitle.setBounds(100,40,220,40);
        lbTitle.setFont(new Font("Time New Roman", Font.BOLD, 26));
        lbTitle.setForeground(Color.red);
        add(lbTitle);
        
        panel=new Panel();
        panel.setBounds(400,40,920,380);
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        add(panel);
        
        //ID
        lbID=new Label("ID");
        lbID.setBounds(30,20,100,40);
        lbID.setFont(new Font("Time New Roman", Font.BOLD, 26));
        panel.add(lbID);
        
        txtID=new TextField();
        txtID.setBounds(150,20,220,35);
        txtID.setFont(new Font("Time New Roman", Font.PLAIN, 24));
        panel.add(txtID);
        
        //Name
        lbName=new Label("Name");
        lbName.setBounds(500,20,100,40);
        lbName.setFont(new Font("Time New Roman", Font.BOLD, 26));
        panel.add(lbName);
        
        txtName=new TextField();
        txtName.setBounds(620,20,220,35);
        txtName.setFont(new Font("Time New Roman", Font.PLAIN, 24));
        panel.add(txtName);
        
        //Gender
        lbGender=new Label("Gender");
        lbGender.setBounds(30,100,100,40);
        lbGender.setFont(new Font("Time New Roman", Font.BOLD, 26));
        panel.add(lbGender);
        
        
        jrMale=new JRadioButton("Male");
        jrMale.setBounds(150,100,120,40);
        jrMale.setFont(new Font("Time New Roman", Font.BOLD, 22));
        jrMale.setBackground(Color.GRAY);
        panel.add(jrMale);
        
        jrFemale=new JRadioButton("Female");
        jrFemale.setBounds(280,100,120,40);
        jrFemale.setFont(new Font("Time New Roman", Font.BOLD, 22));
        jrFemale.setBackground(Color.GRAY);
        panel.add(jrFemale);
        
        //GroupGender
        btnGgender=new ButtonGroup();
        btnGgender.add(jrMale);
        btnGgender.add(jrFemale);
       
        //Course
        lbCourse=new Label("Course");
        lbCourse.setBounds(500,100,100,40);
        lbCourse.setFont(new Font("Time New Roman", Font.BOLD, 26));
        panel.add(lbCourse);
        
        String []course={" ","Java/MySql","C#/MySql","Web FrontEnd","Web BackEnd","Java/Spring"};
        cbCourse=new JComboBox(course);
        cbCourse.setBounds(620,100,220,35);
        cbCourse.setFont(new Font("Time New Roman", Font.PLAIN, 24));
        panel.add(cbCourse);
        cbCourse.addActionListener(this);
        
        
        //Price
        lbPrice=new Label("Price");
        lbPrice.setBounds(30,180,100,40);
        lbPrice.setFont(new Font("Time New Roman", Font.BOLD, 26));
        panel.add(lbPrice);
        
        txtPrice=new TextField();
        txtPrice.setBounds(150,180,220,35);
        txtPrice.setFont(new Font("Time New Roman", Font.PLAIN, 24));
        panel.add(txtPrice);
        
        
        
        
        //Place
        lbPlace=new Label("Place");
        lbPlace.setBounds(500,180,100,40);
        lbPlace.setFont(new Font("Time New Roman", Font.BOLD, 26));
        panel.add(lbPlace);
        
        String []place={" ","ETEC1","ETEC2","ETEC3"};
        cbPlace=new JComboBox(place);
        cbPlace.setBounds(620,180,220,35);
        cbPlace.setFont(new Font("Time New Roman", Font.PLAIN, 24));
        panel.add(cbPlace);
        
        //Time
        lbTime=new Label("Time");
        lbTime.setBounds(30,270,100,40);
        lbTime.setFont(new Font("Time New Roman", Font.BOLD, 26));
        panel.add(lbTime);
        
        cbTime=new JComboBox();
        cbTime.setBounds(150,270,220,35);
        cbTime.setFont(new Font("Time New Roman", Font.PLAIN, 24));
        panel.add(cbTime);
        
       
        
        
        //Term
        lbTerm=new Label("Term");
        lbTerm.setBounds(500,270,100,40);
        lbTerm.setFont(new Font("Time New Roman", Font.BOLD, 26));
        panel.add(lbTerm);
        
        
        
        chMon_Th=new JCheckBox("Mon_Th");
        chMon_Th.setBounds(620,270,120,40);
        chMon_Th.setFont(new Font("Time New Roman", Font.PLAIN, 24));
        chMon_Th.setBackground(Color.GRAY);
        panel.add(chMon_Th);
        
        chSat_Sun=new JCheckBox("Sat_Sun");
        chSat_Sun.setBounds(745,270,120,40);
        chSat_Sun.setFont(new Font("Time New Roman", Font.PLAIN, 24));
        chSat_Sun.setBackground(Color.GRAY);
        panel.add(chSat_Sun);
        
        chMon_Th.addActionListener(this);
        chSat_Sun.addActionListener(this);
        
        btnGterm=new ButtonGroup();
        btnGterm.add(chMon_Th);
        btnGterm.add(chSat_Sun);
        
        
       
       
                
        setLayout(null);
        setSize(1400, 900);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Register();
    }
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==cbCourse){
        String course1=cbCourse.getSelectedItem().toString();
        if(course1.equalsIgnoreCase("Java/MySql")){
            txtPrice.setText("99");
        }else if(course1.equalsIgnoreCase("C#/MySql")){
            txtPrice.setText("89");
        }else if(course1.equalsIgnoreCase("Web FrontEnd")){
            txtPrice.setText("105");
        }else if(course1.equalsIgnoreCase("Web BackEnd")){
            txtPrice.setText("110");
        }else if(course1.equalsIgnoreCase("Java/Spring")){
            txtPrice.setText("120");
        }
        
       }
       
       if(e.getSource()==chMon_Th){
           if(chMon_Th.isSelected()){
               String []time={"09:00-10:30am","11:00-12:15am","12:30-01:45pm","02:00-05:00"};
               cbTime.removeAllItems();
               for(String t : time){
                   cbTime.addItem(t);
               }
           
           }
       }
       
       if(e.getSource()==chSat_Sun){
           if(chMon_Th.isSelected()){
               String []time={"08:00-11:00am","11:00-01:30pm","02:00-05:00"};
               cbTime.removeAllItems();
               for(String t : time){
                   cbTime.addItem(t);
               }
           }
       }
    }
}
