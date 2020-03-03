/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author KUNAL CHAWLA
 */
public class Register extends Applet implements ActionListener {
    Label lname,lemailid,lrollno,lcollege,lbranch,ldisplay;
    TextField tname,temailid,trollno,tcollege;
    CheckboxGroup gender;
    Checkbox c1,c2;
    Choice cbranch;
    Button b1;
    

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.setLayout(null);
        this.setSize(800, 600);
        lname=new Label("Name:");
        lemailid=new Label("Email id:");
        lrollno= new Label ("Roll no:");
        lcollege= new Label("College:");
        lbranch=new Label("Branch:");
        ldisplay=new Label("");
        tname=new TextField("");
        temailid=new TextField("");
        trollno=new TextField("");
        tcollege=new TextField("");
        gender=new CheckboxGroup();
        c1=new Checkbox("Male",null,false);
        c2=new Checkbox("Female",null,false);
        cbranch= new Choice();
        b1= new Button("Submit");
        lname.setBounds(10, 10, 100, 30);
        tname.setBounds(130, 10, 100, 30);
        c1.setBounds(10, 60, 100, 30);
        c2.setBounds(130,60,100,30);
        lemailid.setBounds(10, 110, 100, 30);
        temailid.setBounds(130, 110, 100, 30);
        lrollno.setBounds(10, 160, 100, 30);
        trollno.setBounds(130, 160, 100, 30);
        lcollege.setBounds(10, 210, 100, 30);
        tcollege.setBounds(130,210,100,30);
        lbranch.setBounds(10, 260, 100, 30);
        cbranch.setBounds(130, 260, 100, 30);
        b1.setBounds(100,310,100,50);
        ldisplay.setBounds(100, 360, 300, 30);
        cbranch.addItem("");
        cbranch.addItem("COMS");
        cbranch.addItem("IT");
        cbranch.addItem("EXTC");
        cbranch.addItem("ETRX");
        cbranch.addItem("INSTRU");
        cbranch.addItem("CIVIL");
        cbranch.addItem("MECHANICAL");
        cbranch.addItem("BIOTECH");
        add(lname);
        add(tname);
        add(c1);
        add(c2);
        
        add(lemailid);
        add(temailid);
        add(lrollno);
        add(trollno);
        add(lcollege);
        add(tcollege);
        add(lbranch);
        add(cbranch);
        add(b1);
        add(ldisplay);
        b1.addActionListener(this);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        ldisplay.setText("You have clicked submit button");
        
    }
}
