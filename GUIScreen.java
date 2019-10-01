package com.guiversion;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class GUIScreen extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
   JButton button1;
   JButton button2;
   JTextField textfield1;
   JLabel label2;
   JCheckBox checkbox1;
   JOptionPane optionpane1;
      
   // constructor
   GUIScreen(String title)
   {
	   super(title);
	   setSize(300,300);
	   setLayout(new FlowLayout());
	   button1 = new JButton("Click me");
	   add(button1);
	   button1.addActionListener(this);
	   textfield1 = new JTextField("Here is some text");
	   label2 = new JLabel("Here is a label");
	   checkbox1 = new JCheckBox("Here is a check box");
	   add(button1);
	   add(textfield1);
	   add(label2);
	   add(checkbox1);
	   setVisible(true);
   }
  

   @Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
	    if 	(arg0.getSource() == button1)
	    {
	    	JOptionPane.showMessageDialog(this, "clicked button 1");
	     	
	    }
	     
	    }
	    	
	}
	
	
	