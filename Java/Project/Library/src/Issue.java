/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/**
 *
 * @author Naresh
 */
public class Issue extends Applet implements ActionListener
{
    Label lheading,lbookid,llcn,ldoi;
    Button badmin,bissue;
    TextField tbookid,tlcn;
    Choice cd,cm,cy;
    
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
        public void init() 
    {
        // TODO start asynchronous download of heavy resources
        this.setLayout(null);
        this.setSize(800,600);
        lheading=new Label("VES LIBRARY");
        lbookid=new Label("Enter Book ID:");
        llcn=new Label("Enter Library Card no:");
        ldoi=new Label("Date of issue:");
        badmin=new Button("Admin Login");
        bissue=new Button("Issue Book");
        tbookid=new TextField("");
        tlcn=new TextField("");
        cd=new Choice();
        cm=new Choice();
        cy=new Choice();
        
        cd.addItem("1");
        cd.addItem("2");
        cd.addItem("3");
        cd.addItem("4");
        cd.addItem("5");
        cd.addItem("6");
        cd.addItem("7");
        cd.addItem("8");
        cd.addItem("9");
        cd.addItem("10");
        cd.addItem("11");
        cd.addItem("12");
        cd.addItem("13");
        cd.addItem("14");
        cd.addItem("15");
        cd.addItem("16");
        cd.addItem("17");
        cd.addItem("18");
        cd.addItem("19");
        cd.addItem("20");
        cd.addItem("21");
        cd.addItem("22");
        cd.addItem("23");
        cd.addItem("24");
        cd.addItem("25");
        cd.addItem("26");
        cd.addItem("27");
        cd.addItem("28");
        cd.addItem("29");
        cd.addItem("30");
        cd.addItem("31");
        cm.addItem("January");
        cm.addItem("February");
        cm.addItem("March");
        cm.addItem("April");
        cm.addItem("May");
        cm.addItem("June");
        cm.addItem("July");
        cm.addItem("August");
        cm.addItem("September");
        cm.addItem("October");
        cm.addItem("November");
        cm.addItem("Decmber");
        cy.addItem("2018");
        cy.addItem("2017");
        cy.addItem("2016");
        cy.addItem("2015");
        lheading.setBounds(200,10,100,30);
        badmin.setBounds(500,10,100,30);
        lbookid.setBounds(20,60,100,30);
        tbookid.setBounds(150,60,100,30);
        llcn.setBounds(20,110,100,30);
        tlcn.setBounds(150,110,100,30);
        ldoi.setBounds(20,160,100,30);
        cd.setBounds(150,160,50,30);
        cm.setBounds(230,160,100,30);
        cy.setBounds(360,160,75,30);
        bissue.setBounds(125,210,100,30);
        add(lheading);
        add(badmin);
        add(lbookid);
        add(tbookid);
        add(llcn);
        add(tlcn);
        add(ldoi);
        add(cd);
        add(cm);
        add(cy);
        add(bissue);
        bissue.addActionListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }
     
    
}
