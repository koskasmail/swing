package swing.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test_01 {


	public Test_01() {
	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("click me");
//		button.addActionListener(l);
		
		JLabel label = new JLabel("number of clicks: 0 ");
		
		
		//jpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		//jpanel.setBorder(BorderFactory.createEmptyBorder());
		
		//border
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		
		//layout manger
		panel.setLayout(new GridLayout(0, 1));
		
		
		//button add
		panel.add(button);
		panel.add(label);
		
		
		// frame <--- panel
		frame.add(panel, BorderLayout.CENTER);
		
		// close action
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //frame.EXIT_ON_CLOSE
		
		// title
		frame.setTitle("Test_01");
		
		// set the window to a match a preferred size.
		frame.pack();
	
		// visible + focus
		frame.setVisible(true);
		
	}
	
	


}