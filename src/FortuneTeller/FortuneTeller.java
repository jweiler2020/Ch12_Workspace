// This is the Fortune Teller applet

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.AudioClip;

public class FortuneTeller extends JApplet
		implements ActionListener
{
	// Declare an array of "fortunes" (strings):
	private String[] fortunes = {
			"You will die a year from now",
			"You will die a month from now",
			"You will die a week from now",
			"You will die tomorrow",
			"You will die today",
			"You should have died yesterday",
			"You shouldn't even exist",
			"A year from now will be the best day of your life",
			"A month from now will be the best day of your life",
			"A week from now will be the best day of your life",
			"Tomorrow will be the best day of your life",
			"Today will be the best day of your life",
			"Yesterday was the best day of your life",
			"Your entire life is the best day of your life"
	};
	
	private JTextField display;
	private AudioClip ding;
	
	public void init()
	{
		ding = getAudioClip(getDocumentBase(), "ding.wav");
		
		display = new JTextField("  Press \"Next\" to see your fortune...", 30);
		display.setBackground(Color.WHITE);
		display.setEditable(false);
		
		JButton go = new JButton("Next");
		go.addActionListener(this);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(display);
		c.add(go);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		ding.play();
		
		// Pick a random fortune:
		String fortune = fortunes[(int)(Math.random()*fortunes.length)];
		display.setText("  " + fortune);
	}
}
