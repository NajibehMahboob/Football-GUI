
import javax.swing.*;
import java.io.File;

public class FootballApp extends JFrame {
	
	public FootballApp(){
		
		super(" لیگ فوتبال ");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(550,650);
		
		setLocationRelativeTo(null);
		
		//set our components
		setLayout(null);
		
		setResizable(false);
		
		addGuiComponents();
				
	}

	private void addGuiComponents() {
		//Our Buttons
		JButton GermanyButton = new JButton("Germany");
		GermanyButton.setBounds(25, 15, 200, 45);
		add(GermanyButton);
		
		JButton ItalyButton = new JButton("Italy");
		ItalyButton.setBounds(300, 15, 200, 45);
		add(ItalyButton);
		
		
		
	}
}
