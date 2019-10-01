package com.guiAttempt2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	public static ArrayList<String> abusiveWord1 = new ArrayList<String>();
	public static ArrayList<String> wordToBeChecked1 = new ArrayList<String>();
	public static ArrayList<String> checkedForShouting1 = new ArrayList<String>();

	private JPanel contentPane;

	

	public static void main(String[] args)
	{

		
		String fileName1 = "List1.txt";
		File file1 = new File(fileName1);
		Scanner in1;
		try
		{
			in1 = new Scanner(file1);
			String line1 = "";

			while (in1.hasNext())
			{

				line1 = in1.nextLine();
				String result1 = line1.toLowerCase().replaceAll("[^a-z]+", " ");
				String[] toBeSplit1 = result1.split("\\s"); 
															
															
				for (String newSplit1 : toBeSplit1)
				{
					String finalSplit1 = newSplit1;
					abusiveWord1.add(finalSplit1);
				}
			}
			JFileChooser chooser = new JFileChooser();

			int returnValue = chooser.showOpenDialog(null);

			File file = null;
			if (returnValue == JFileChooser.APPROVE_OPTION)
			{
				file = chooser.getSelectedFile();
			}
			if (file != null)
			{
				String fileName2 = file.getPath();

				File file2 = new File(fileName2);
				Scanner in2;
				{
					in2 = new Scanner(file2);
					String line2 = "";

					while (in2.hasNext())
					{

						line2 = in2.nextLine();
						String result2 = line2.toLowerCase().replaceAll("[^a-z]+", " ");
						String[] toBeSplit = result2.split("\\s");
						for (String newSplit : toBeSplit)
						{
							String finalSplit = newSplit;
							wordToBeChecked1.add(finalSplit);
						}
					}
				}
				
				File file3 = new File(fileName2);
				Scanner in3;
				{
					in3 = new Scanner(file3);
					String line3 = "";

					while (in3.hasNext())
					{
						line3 = in3.nextLine();
						String[] shoutToBeSplit = line3.split("\\s");
						for (String newShoutSplit : shoutToBeSplit)
						{
							String finalShoutSplit = newShoutSplit;
							checkedForShouting1.add(finalShoutSplit);
						}
					}
				}
				System.out.println("Potential instances of Shouting: ");

				// SHOUTING LOOP
				int x = 0;
				for (String b : checkedForShouting1)
				{
					if (b.matches("[A-Z]*"))
					{
						if (b.length() > 1)
							x++;
						b = b.trim();
						if (b.length() > 1)
							System.out.println(b);
					}
				}
				System.out.println("Amount of Potential Shouting instances found: " + (x));
				// SWEARING LOOP
				System.out.println("List of abusive content: ");
				int i = 0;
				for (String s : abusiveWord1)
				{
					for (String t : wordToBeChecked1)
					{

						if (t.contains(s))
						{
							i++;
							System.out.println(s); 
						}
					}
				}
				System.out.println("Amount of abusive words found: " + (i));

				if (i >= 1 && i <= 20)
				{
					System.out.println("Low level of Abusive content found!");
				}
				if (i >= 21 && i <= 50)
				{
					System.out.println("Medium level of Abusive content found!");
				}
				if (i >= 51 && i <= 100)
				{
					System.out.println("High level of Abusive content found!");
				}
				if (i >= 101)
				{
					System.out.println("Very High level of Abusive content found!");
				}

				System.out.print("Please enter your addition to the list: ");
				Scanner in4 = new Scanner(System.in);
				String abusiveText = in4.nextLine();
				FileWriter fWriter = null;
				BufferedWriter writer = null;
				try
				{
					fWriter = new FileWriter("List1.txt", true);
					writer = new BufferedWriter(fWriter);
					writer.write(abusiveText);
					writer.newLine();
					writer.close();
					System.err.println("Your addition to the list was saved ");
				} catch (Exception e)
				{
					System.out.println("Error!");
				}
				in1.close();
				in2.close();
				in3.close();
				in4.close();
			}
		} catch (FileNotFoundException e)
		{
			System.out.println("file not found");
			e.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GUI frame = new GUI();
					frame.setVisible(true);
					frame.setTitle("Profanity checker");
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	public GUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(43, 34, 360, 152);
		contentPane.add(textArea);

		JButton button1 = new JButton("click me");
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{

				
				textArea.setText();

			}
		});
		button1.setBounds(168, 212, 89, 23);
		contentPane.add(button1);
	}
}