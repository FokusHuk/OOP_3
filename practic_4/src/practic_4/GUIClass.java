package practic_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIClass extends JFrame implements ActionListener {

	int acmCount = 0;
	int rmCount = 0;
	
	JButton acm = new JButton("AC Milan");
	JButton rm = new JButton("Real Madrid");
	JLabel 	result = new JLabel("Result: 0 : 0");
	JLabel lastsc = new JLabel("Last Scorer: ");
	JLabel winner = new JLabel("Winner: ");
	
	Font font = new Font("Times new roman", Font.CENTER_BASELINE, 18);
	
	public GUIClass() {
			super("Application");
			setSize(430, 350);
			setLayout(null);
			result.setBounds(170, 30, 200, 50);
			result.setFont(font);
			add(result);
			lastsc.setBounds(170, 120, 200, 50);
			lastsc.setFont(font);
			add(lastsc);
			winner.setBounds(170, 200, 200, 50);
			winner.setFont(font);
			add(winner);
			
			acm.setBounds(10, 60, 110, 50);
			add(acm);
			rm.setBounds(10,  180, 110, 50);
			add(rm);
			
			acm.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae)
						{
							acmCount++;
							result.setText("Result: " + acmCount + " : " + rmCount);
							lastsc.setText("Last Scorer: AC Milan");
							if(acmCount >= rmCount)
								winner.setText("Winner: AC Milan");
							else
								winner.setText("Winner: Real Madrid");
						}
					});
			
			rm.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae)
						{
							rmCount++;
							result.setText("Result: " + acmCount + " : " + rmCount);
							lastsc.setText("Last Scorer: Real Madrid");
							if(acmCount >= rmCount)
								winner.setText("Winner: AC Milan");
							else
								winner.setText("Winner: Real Madrid");
						}
					});
			
			setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	
	public static void main(String[] args) {
		new GUIClass();
	}

}
