

import javax.swing.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;

public class FootballApp extends JFrame {
	
	
	JLabel firstteamlable , firstteamscore ,secondteamlable ,secondteamscore ,timelable1 ,datalable1 , goalscorerfirstteam ,
	currentsitiationlable , goalscorersecondteam , referee , Bounds , border1 , border2 , border3 , thirdteamscore ,thirdteamlable, fourthteamlable ,fourthteamscore 
	,fifthteamlable , fifthteamscore , sixthteamlable , sixthteamscore, timelable2 , timelable3 , referee1, referee2 , referee3  , halftimelable , halftimelable1
	, goalscorerthirdteam , goalscorerforthteam , goalscorerfifthteam, goalscorersixthteam;
	
	
	
	
	
	public FootballApp(){
		
		super(" لیگ فوتبال ");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(550,850);
		
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
		
		
		JButton JamjahaniButton = new JButton("  World Cup ");
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
		firstteamlable.setBounds(93,330, 200, 45);
		firstteamlable.setFont(new Font ("Dialog", Font.BOLD , 28));
		add(firstteamlable);
		
		firstteamscore = new JLabel ("2");
		firstteamscore.setBounds(243,330,200, 45);
		firstteamscore.setFont(new Font ("Dialog", Font.BOLD , 26));
		add(firstteamscore);
		
		// second team 
		secondteamlable = new JLabel ("chelsea");
		secondteamlable.setBounds(328,330, 200, 45);
		secondteamlable.setFont(new Font ("Dialog", Font.BOLD , 29));
		add(secondteamlable);
		
		secondteamscore = new JLabel ("1");
		secondteamscore.setBounds(285,330,200, 45);
		secondteamscore.setFont(new Font ("Dialog", Font.BOLD , 26));
		add(secondteamscore);
		
		// time 1
		timelable1 = new JLabel ("23:00");
		timelable1.setBounds(248,295,200, 45);
		timelable1.setFont(new Font ("Dialog", Font.PLAIN , 16));
		add(timelable1);
		
	
		
		
		
		//Date1
		timelable1 = new JLabel ("2024-01-12");
		timelable1.setBounds(120,295,200, 45);
		timelable1.setFont(new Font ("Dialog", Font.PLAIN , 16));
		add(timelable1);
		
		//current situation 
		currentsitiationlable = new JLabel (" (During the game)");
		currentsitiationlable.setBounds(170,360,200, 45);
		currentsitiationlable.setFont(new Font ("Dialog", Font.PLAIN , 11));
		currentsitiationlable.setHorizontalAlignment(SwingConstants.CENTER);
		add(currentsitiationlable);
		
		//goal scorer for first team
		goalscorerfirstteam = new JLabel ("Mo Sallah");
		goalscorerfirstteam.setBounds(130,380,200, 45);
		goalscorerfirstteam.setFont(new Font ("Dialog", Font.PLAIN , 14));
		add(goalscorerfirstteam);
		
		//goal scorer for second team
		goalscorersecondteam = new JLabel ("Andrey Santos");
		goalscorersecondteam.setBounds(328,380,200, 45);
		goalscorersecondteam.setFont(new Font ("Dialog", Font.PLAIN , 14));
		add(goalscorersecondteam);
		
		// referee1
		referee1 = new JLabel ("Foghani");
		referee1.setBounds(355,295,200, 45);
		referee1.setFont(new Font ("Dialog", Font.PLAIN , 14));
		add(referee1);
		
		
		// border
		border1 =new JLabel ("     ");
		border1.setBounds(65,300,400, 130);
		border1.setHorizontalAlignment(SwingConstants.CENTER);
		border1.setBorder(BorderFactory.createLineBorder(Color.blue));
		add(border1);
		
		
		
		border2 =new JLabel ("     ");
		border2.setBounds(65 ,470,400, 130);
		border2.setHorizontalAlignment(SwingConstants.CENTER);
		border2.setBorder(BorderFactory.createLineBorder(Color.blue));
		add(border2);
		
		
		
		border3 =new JLabel ("     ");
		border3.setBounds(65,640,400, 130);
		border3.setHorizontalAlignment(SwingConstants.CENTER);
		border3.setBorder(BorderFactory.createLineBorder(Color.blue));
		add(border3);
		
		
		
		
		// 3rd team
		thirdteamlable = new JLabel ("Arsenal");
		thirdteamlable.setBounds(105, 495, 200, 45);
		thirdteamlable.setFont(new Font ("Dialog", Font.BOLD , 28));
		add(thirdteamlable);
		
		thirdteamscore = new JLabel ("3");
		thirdteamscore.setBounds(243,495,200, 45);
		thirdteamscore.setFont(new Font ("Dialog", Font.BOLD , 26));
		add(thirdteamscore);
		
		
		
		// fourth team 
		fourthteamlable = new JLabel ("chelsea");
		fourthteamlable.setBounds(328,495, 200, 45);
		fourthteamlable.setFont(new Font ("Dialog", Font.BOLD , 29));
				add(fourthteamlable);
				
				fourthteamscore = new JLabel ("0");
				fourthteamscore.setBounds(280,495,200, 45);
				fourthteamscore.setFont(new Font ("Dialog", Font.BOLD , 26));
				add(fourthteamscore);
				
				
			
			//time2
		timelable2 = new JLabel ("20:00");
		timelable2.setBounds(248,465,200, 45);
		timelable2.setFont(new Font ("Dialog", Font.PLAIN , 16));
		add(timelable2);		

		
		
		
		//Date2
				timelable2 = new JLabel ("2024-01-14");
				timelable2.setBounds(120,465,200, 45);
				timelable2.setFont(new Font ("Dialog", Font.PLAIN , 16));
				add(timelable2);
		
				
			
				
				// referee2
				referee2 = new JLabel (" Moeini ");
				referee2.setBounds(355,465,200, 45);
				referee2.setFont(new Font ("Dialog", Font.PLAIN , 14));
				add(referee2);
				
				
		
				
				
				
				//half time
				halftimelable = new JLabel (" (half-time)");
				halftimelable.setBounds(165,530,200, 45);
				halftimelable.setFont(new Font ("Dialog", Font.PLAIN , 11));
				halftimelable.setHorizontalAlignment(SwingConstants.CENTER);
				add(halftimelable);
				
				
				
				
				
				
				//goal scorer for 3rth team
				goalscorerthirdteam = new JLabel ("Ali");
				goalscorerthirdteam.setBounds(130,550,200, 45);
				goalscorerthirdteam.setFont(new Font ("Dialog", Font.PLAIN , 14));
				add(goalscorerthirdteam);
				
				
				
				
				
				
				
				
				//goal scorer for forth team
				goalscorerforthteam = new JLabel (" Hasan ");
				goalscorerforthteam.setBounds(355,550,200, 45);
				goalscorerforthteam.setFont(new Font ("Dialog", Font.PLAIN , 14));
				add(goalscorerforthteam);
				
				
				
				
				
				// 5th team
				fifthteamlable = new JLabel ("Leeds United");
				fifthteamlable.setBounds(90, 670 , 200, 45);
				fifthteamlable.setFont(new Font ("Dialog", Font.BOLD , 22));
				add(fifthteamlable);
				
				fifthteamscore = new JLabel ("3");
				fifthteamscore.setBounds(243,670,200, 45);
				fifthteamscore.setFont(new Font ("Dialog", Font.BOLD , 26));
				add(fifthteamscore);
				
				
				
				
				// 6th team 
				sixthteamlable = new JLabel ("chelsea");
				sixthteamlable.setBounds(327,670, 200, 45);
				sixthteamlable.setFont(new Font ("Dialog", Font.BOLD , 29));
						add(sixthteamlable);
						
						sixthteamscore = new JLabel ("3");
						sixthteamscore.setBounds(280,670,200, 45);
						sixthteamscore.setFont(new Font ("Dialog", Font.BOLD , 26));
						add(sixthteamscore);
				
						
						
						
						//time3
						timelable3 = new JLabel ("22:00");
						timelable3.setBounds(248,635,200, 45);
						timelable3.setFont(new Font ("Dialog", Font.PLAIN , 16));
						add(timelable3);
				
		
						
						
						//Date3
						timelable3 = new JLabel ("2024-01-15");
						timelable3.setBounds(120,635,200, 45);
						timelable3.setFont(new Font ("Dialog", Font.PLAIN , 16));
						add(timelable3);
						
						
						
						
						// referee3
						referee3 = new JLabel (" Zarei ");
						referee3.setBounds(355,635,200, 45);
						referee3.setFont(new Font ("Dialog", Font.PLAIN , 14));
						add(referee3);
						
						
						
						
						
						
						//half time
						halftimelable1 = new JLabel (" (half-time)");
						halftimelable1.setBounds(165,705,200, 45);
						halftimelable1.setFont(new Font ("Dialog", Font.PLAIN , 11));
						halftimelable1.setHorizontalAlignment(SwingConstants.CENTER);
						add(halftimelable1);
						
						
						
						
						
						
						
						//goal scorer for fifth team
						goalscorerfifthteam = new JLabel (" Reza ");
						goalscorerfifthteam.setBounds(130,720,200, 45);
						goalscorerfifthteam.setFont(new Font ("Dialog", Font.PLAIN , 14));
						add(goalscorerfifthteam);
						
						
						
						
						
						
						//goal scorer for sixth team
						goalscorersixthteam = new JLabel (" Kazem ");
						goalscorersixthteam.setBounds(355,720,200, 45);
						goalscorersixthteam.setFont(new Font ("Dialog", Font.PLAIN , 14));
						add(goalscorersixthteam);
						
						
						
						
						
						
						
						
						
	}
}