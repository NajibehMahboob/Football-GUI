
import javax.swing.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.io.File;

public class FootballApp extends JFrame {
	JLabel firstteamlable , firstteamscore ,secondteamlable ,secondteamscore ,timelable ,datalable , goalscorerfirstteam ,
	currentsitiationlable , goalscorersecondteam , referee , Bounds;
	
	
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
		ItalyButton.setBounds(309, 15, 200, 45);
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
		
		
		JButton JamjahaniButton = new JButton("  World Cup");
		JamjahaniButton.setBounds(167, 195 , 200, 45);
		add(JamjahaniButton);
		
		GermanyButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ItalyButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		EnglandButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SpainButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		IranButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BrazilButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JamjahaniButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		// first team
		firstteamlable = new JLabel ("Liverpool");
		firstteamlable.setBounds(130,320, 200, 45);
		firstteamlable.setFont(new Font ("Dialog", Font.PLAIN , 24));
		add(firstteamlable);
		
		firstteamscore = new JLabel ("2");
		firstteamscore.setBounds(235,320,200, 45);
		firstteamscore.setFont(new Font ("Dialog", Font.PLAIN , 24));
		add(firstteamscore);
		
		// second team 
		secondteamlable = new JLabel ("chelsea");
		secondteamlable.setBounds(300,320, 200, 45);
		secondteamlable.setFont(new Font ("Dialog", Font.PLAIN , 24));
		add(secondteamlable);
		
		secondteamscore = new JLabel ("1");
		secondteamscore.setBounds(280,320,200, 45);
		secondteamscore.setFont(new Font ("Dialog", Font.PLAIN , 24));
		add(secondteamscore);
		
		// time
		timelable = new JLabel ("23:00");
		timelable.setBounds(260,295,200, 45);
		timelable.setFont(new Font ("Dialog", Font.PLAIN , 16));
		add(timelable);
		
		//Date
		timelable = new JLabel ("2024-01-12");
		timelable.setBounds(170,295,200, 45);
		timelable.setFont(new Font ("Dialog", Font.PLAIN , 16));
		add(timelable);
		
		//current situation 
		currentsitiationlable = new JLabel ("During the game");
		currentsitiationlable.setBounds(205,344,200, 45);
		currentsitiationlable.setFont(new Font ("Dialog", Font.PLAIN , 14));
		currentsitiationlable.setHorizontalAlignment(SwingConstants.CENTER);
		currentsitiationlable.setBorder(BorderFactory.createLineBorder(Color.pink));
		add(currentsitiationlable);
		
		//goal scorer for first team
		goalscorerfirstteam = new JLabel ("Mo Sallah");
		goalscorerfirstteam.setBounds(130,360,200, 45);
		goalscorerfirstteam.setFont(new Font ("Dialog", Font.PLAIN , 14));
		add(goalscorerfirstteam);
		
		//goal scorer for second team
		goalscorersecondteam = new JLabel ("Andrey Santos");
		goalscorersecondteam.setBounds(300,360,200, 45);
		goalscorersecondteam.setFont(new Font ("Dialog", Font.PLAIN , 14));
		add(goalscorersecondteam);
		
		// referee
		referee = new JLabel ("Foghani");
		referee.setBounds(310,295,200, 45);
		referee.setFont(new Font ("Dialog", Font.PLAIN , 14));
		add(referee);
		
		
		
		
		
		
		
		
		
		
		
	}
}
