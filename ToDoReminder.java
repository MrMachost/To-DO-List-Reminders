package com.jobInventions;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ToDoReminder extends JFrame implements FocusListener {
	JButton check, smallRed, bigGreen, BigRed;
	JTextField reminder;
	

	public ToDoReminder() {
		super ("This is my List");
		setSize(500, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		setVisible(true);
	}
	
	public void focusGained(FocusEvent event){

	}
	
	public void focusLost(FocusEvent event){
		focusGained(event);
	}

	
	private void setLookAndFeel()
	{
		try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
				SwingUtilities.updateComponentTreeUI(this);
			}
		catch(Exception e)
		{
			System.err.println("Couldn't use the system look and Feel: " + e);
		}
	}

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ToDoReminder frame = new ToDoReminder();
	}

}
