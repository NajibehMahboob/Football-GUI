
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


	JButton EnglandButton = new JButton("England");
		EnglandButton.setBounds(25 , 75 , 200 , 45);
		add(EnglandButton);
		
		
		JButton SpainButton = new JButton("Spain");
		SpainButton.setBounds(309, 75 , 200, 45);
		add(SpainButton);
		
		
		JButton IranButton = new JButton("Iran");
		IranButton.setBounds(25 , 135 , 200 , 45);
		add(IranButton);
		
		
		JButton BrazilButton = new JButton("Brazil");
		BrazilButton.setBounds(309, 135 , 200, 45);
		add(BrazilButton);
		
		
		JButton JamjahaniButton = new JButton(" جهانی جام");
		JamjahaniButton.setBounds(167, 195 , 200, 45);
		add(JamjahaniButton);
		
		
		
		
	}
}
