/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author KUNAL CHAWLA
 */
public class Details extends Applet implements ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Bill b;
    int sum=0;
    Details(Bill b)
    {
        this.b=b;
        
        
    }
    Label lname,lphoneno,laddress,ldisplay;
        TextField tname,tphoneno,taddress;
        Button b1;
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.setLayout(null);
        this.setSize(800,600);
        lname=new Label("NAme:");
        tname= new TextField("");
        lphoneno= new Label("Phone NO");
        tphoneno=new TextField("");
        laddress = new Label("Address");
        taddress= new TextField("");
        ldisplay=new Label("");
        b1=new Button("OK");
        lname.setBounds(10,10,100,30);
        tname.setBounds(130,10,100,30);
        lphoneno.setBounds(10,60,100,30);
        tphoneno.setBounds(130,60,100,30);
        laddress.setBounds(10,110,100,30);
        taddress.setBounds(130,110,250,30);
        b1.setBounds(100,160,100,30);
        ldisplay.setBounds(10,210,250,30);
        add(lname);
        add(tname);
        add(lphoneno);
        add(tphoneno);
        add(laddress);
        add(taddress);
        add(ldisplay);
        add(b1);
        b1.addActionListener(this);
        
        
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<3;i++)
        {
            if(b.item[i]==true)
                sum=sum+b.price[i]*b.qty[i];              
                
        }
        ldisplay.setText("Your Bill is "+sum);
    }
}
