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
class Bill
{
    boolean item[];
    int price[];
    int qty[];
    
    
    Bill()
    {
        item = new boolean[3];
        price= new int[3];
        price[0]=250;
        price[1]=350;
        price[2]=400;
        qty= new int[3];
        
    }
    
}
public class Order extends Applet implements ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Label ldisplay;
    Checkbox c1,c2,c3;
    Choice q1,q2,q3;
    Button b1;
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.setLayout(null);
        this.setSize(800, 600);
        ldisplay = new Label("DOMINOS PIZZA");
        c1= new Checkbox("PAV BHAJI PIZZA (Rs. 250) ",null,false);
        c2= new Checkbox("PANIPURI PIZZA (Rs. 350) ",null,false);
        c3= new Checkbox("CHEESE PIZZA (Rs. 400) ",null,false);
        q1= new Choice ();
        q2= new Choice ();
        q3= new Choice ();
        b1= new Button("OK");
        ldisplay.setBounds(200,20,250,50);
        c1.setBounds(10, 110, 250, 30);
        q1.setBounds(280,110,50,30);
        c2.setBounds(10, 160, 250, 30);
        q2.setBounds(280,160,50,30);
        c3.setBounds(10, 210, 250, 30);
        q3.setBounds(280,210,50,30);
        b1.setBounds(100, 260, 50, 30);
        for(int i=1;i<=5;i++)
        { 
            q1.add(String.valueOf(i));
            q2.add(String.valueOf(i));
            q3.add(String.valueOf(i));
        }
        
        add(ldisplay);
        add(c1);
        add(q1);
        add(c2);
        add(q2);
        add(c3);
        add(q3);
        add(b1);
        b1.addActionListener(this);
        
        
                
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            ldisplay.setVisible(false);
            c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            q1.setVisible(false);
            q2.setVisible(false);
            q3.setVisible(false);
            b1.setVisible(false);
            
            
            Bill b= new Bill();
            
            if(c1.getState())
            {
                b.item[0]=true;
                b.qty[0]=Integer.parseInt(q1.getSelectedItem());
                
                
            }      
            if(c2.getState())
            {
                b.item[1]=true;
                b.qty[1]=Integer.parseInt(q2.getSelectedItem());
                
                
            }      
            if(c3.getState())
            {
                b.item[2]=true;
                b.qty[2]=Integer.parseInt(q3.getSelectedItem());
                
                
            }      
            
            Details d1= new Details(b);
            
            d1.init();
            
            add(d1);
            
        }
    }
}
