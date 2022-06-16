import javax.swing    .*;
import java .awt      .*;
import java .awt.event.*;
import java .awt.font .*;
import java .awt.geom .*;

public class SlotMachine extends JFrame
{
	public SlotMachine()
	{
		int Row,Col;
		Toolkit MyKit = Toolkit.getDefaultToolkit();
		Dimension XY  = MyKit.getScreenSize      ();

		Row			  = XY.width ;
		Col			  = XY.height;

		setSize(4*Row/8,4*Col/8);
		setLocation(Row/16,Col/16);

		Image MyImage = MyKit.getImage("Weird.gif");
		setIconImage(MyImage);
		setTitle("One Armed Bandit");

		MyPanel Panel01          = new MyPanel   ();
		Container ContentPanelOne = getContentPane();
		ContentPanelOne.add(Panel01);





	}

	public double Credits()
	{
		Response = JOptionPane.showInputDialog("Insert Credits:");

		Money = Double.parseDouble(Response);

		return Money;

	}
	private class MyPanel extends JPanel
	{
		public MyPanel()
		{
			setLayout(new BorderLayout(10,10) );


			NorthTitle.setFont      (VeryBig      );
			NorthTitle.setForeground(Color.magenta);

			MyDollarOne.setIcon(DollarGif);
			MyDollarTwo.setIcon(DollarGif);
			MyDollarTre.setIcon(DollarGif);
			MyDollarFor.setIcon(DollarGif);

			FallingDollarOne.setIcon(FallingDollarGif);
			FallingDollarTwo.setIcon(FallingDollarGif);
			FallingDollarTre.setIcon(FallingDollarGif);
			FallingDollarFor.setIcon(FallingDollarGif);
			FallingDollarFiv.setIcon(FallingDollarGif);
			FallingDollarSix.setIcon(FallingDollarGif);

			DancingMoneyOne.setIcon(DancingMoneyGif);
			DancingMoneyTwo.setIcon(DancingMoneyGif);



			NorthPanel.add(MyDollarOne);
			NorthPanel.add(MyDollarTwo);
			NorthPanel.add(NorthTitle );
			NorthPanel.add(MyDollarTre);
			NorthPanel.add(MyDollarFor);

/*
			SouthTitle.setFont      (VeryBig      );
			SouthTitle.setForeground(Color.magenta);
			SouthPanel.add          (SouthTitle   );
*/

			CenterPanel .setLayout(new GridLayout(2,1));
			TCenterPanel.setLayout(new GridLayout(1,5));
			BCenterPanel.setLayout(new GridLayout(2,4));


			CenterPanel.setBackground(Color.black);
			TCenterPanel.setBackground(Color.black);
			BCenterPanel.setBackground(Color.black);
			TCenterPanel.add(DancingMoneyOne);
			EastPanel.setBackground(Color.black);
			WestPanel.setBackground(Color.black);

			NumberOne  .setFont               (Numbers          );
			NumberOne  .setBackground         (Color.yellow     );
			NumberOne  .setForeground         (Color.red        );
			NumberOne  .setHorizontalAlignment(JTextField.CENTER);
			TCenterPanel.add                   (NumberOne        );

			NumberTwo  .setFont               (Numbers          );
			NumberTwo  .setBackground         (Color.yellow     );
			NumberTwo  .setForeground         (Color.red        );
			NumberTwo  .setHorizontalAlignment(JTextField.CENTER);
			TCenterPanel.add                   (NumberTwo        );

			NumberTre  .setFont               (Numbers          );
			NumberTre  .setBackground         (Color.yellow     );
			NumberTre  .setForeground         (Color.red        );
			NumberTre  .setHorizontalAlignment(JTextField.CENTER);
			TCenterPanel.add                   (NumberTre       );

			TCenterPanel.add(DancingMoneyTwo);

			CenterPanel.add(TCenterPanel);


			TGamesPlayed.setFont(VeryBig);
			LGamesPlayed.setFont(SlightlyBig);
			TGamesPlayed.setBackground(Color.black);
			LGamesPlayed.setBackground(Color.black);
			TGamesPlayed.setForeground(Color.red);
			LGamesPlayed.setForeground(Color.red);
			TGamesPlayed.setHorizontalAlignment(JTextField.CENTER);
			LGamesPlayed.setHorizontalAlignment(JTextField.LEFT);
			BCenterPanel.add(TGamesPlayed);
			BCenterPanel.add(LGamesPlayed);

			TMoneySpent.setFont(VeryBig);
			LMoneySpent.setFont(SlightlyBig);
			TMoneySpent.setBackground(Color.black);
			LMoneySpent.setBackground(Color.black);
			TMoneySpent.setForeground(Color.red);
			LMoneySpent.setForeground(Color.red);
			TMoneySpent.setHorizontalAlignment(JTextField.CENTER);
			LMoneySpent.setHorizontalAlignment(JTextField.RIGHT);
			BCenterPanel.add(LMoneySpent);
			BCenterPanel.add(TMoneySpent);

			TCredits.setFont(VeryBig);
			LCredits.setFont(SlightlyBig);
			TCredits.setBackground(Color.black);
			LCredits.setBackground(Color.black);
			TCredits.setForeground(Color.red);
			LCredits.setForeground(Color.red);
			TCredits.setHorizontalAlignment(JTextField.CENTER);
			LCredits.setHorizontalAlignment(JTextField.LEFT);
			BCenterPanel.add(TCredits);
			BCenterPanel.add(LCredits);

			TNetGain.setFont(VeryBig);
			LNetGain.setFont(SlightlyBig);
			TNetGain.setBackground(Color.black);
			LNetGain.setBackground(Color.black);
			TNetGain.setForeground(Color.red);
			LNetGain.setForeground(Color.red);
			TNetGain.setHorizontalAlignment(JTextField.CENTER);
			LNetGain.setHorizontalAlignment(JTextField.RIGHT);
			BCenterPanel.add(LNetGain);
			BCenterPanel.add(TNetGain);

			CenterPanel.add(BCenterPanel);





			EastPanel.setLayout(new GridLayout(3,1));

			EastPanel.add(FallingDollarOne);
			EastPanel.add(FallingDollarTwo);
			EastPanel.add(FallingDollarTre);

			WestPanel.setLayout(new GridLayout(3,1));

			WestPanel.add(FallingDollarFor);
			WestPanel.add(FallingDollarFiv);
			WestPanel.add(FallingDollarSix);




			SPINButton.setFont      (VeryBig    );
			SPINButton.setBackground(Color.green);
			SPINButton.setForeground(Color.black);

			BETButton.setFont      (VeryBig    );
			BETButton.setBackground(Color.green);
			BETButton.setForeground(Color.black);

			CASHOUTButton.setFont      (VeryBig    );
			CASHOUTButton.setBackground(Color.green);
			CASHOUTButton.setForeground(Color.black);

			JBet       .setFont               (VeryBig          );
			JBet       .setBackground         (Color.yellow     );
			JBet       .setForeground         (Color.red        );
			JBet       .setHorizontalAlignment(JTextField.CENTER);
			SouthPanel .add                   (JBet             );

			SouthPanel.add(BETButton);
			SouthPanel.add(SPINButton);
			SouthPanel.add(CASHOUTButton);


			NorthPanel .setBackground(Color.green);
			SouthPanel .setBackground(new Color(0,51,0));

			add(NorthPanel ,BorderLayout.NORTH );
			add(SouthPanel ,BorderLayout.SOUTH );
			add(EastPanel  ,BorderLayout.EAST  );
			add(WestPanel  ,BorderLayout.WEST  );
			add(CenterPanel,BorderLayout.CENTER);


			ButtonClick Dummy = new ButtonClick();
			SPINButton.addActionListener(Dummy);
			BETButton.addActionListener(Dummy);
			CASHOUTButton.addActionListener(Dummy);

			Action = 0;
			BetNumber = 0;
			GamesPlayed = 0;
			Flag = 0;
			MoneySpent = 0;
			NetGain = 0;
			Winnings = 0;
			Money = Credits();

			NumberOne.setText("0");
			NumberTwo.setText("0");
			NumberTre.setText("0");

			TGamesPlayed.setText("" + GamesPlayed);
			TMoneySpent.setText("" + MoneySpent);
			TCredits.setText("" + Money);
			TNetGain.setText("" + NetGain);

			SPINButton.setEnabled(false);



		}
















		private class ButtonClick implements ActionListener
		{
			public void actionPerformed(ActionEvent Punch)
			{
				Object ButtonPressed = Punch.getSource();

				ActionListener WakeUp = new TimeStamp();

				T = new Timer(100,WakeUp);

				if ( ButtonPressed == SPINButton )
				{
					GamesPlayed = GamesPlayed + 1;
					TGamesPlayed.setText("" + GamesPlayed);
					BETButton.setEnabled(false);
					SPINButton.setEnabled(false);
					CASHOUTButton.setEnabled(false);
					T.start();
				}

				if ( ButtonPressed == BETButton )
				{
					BetNumber += 1;
					JBet.setText("" + BetNumber );
					Money = Money - 1;
					TCredits.setText("" + Money);
					SPINButton.setEnabled(true);
				}
				if ( ButtonPressed == CASHOUTButton )
				{
					JOptionPane.showMessageDialog(null,"You now have " + Money + " Dollars!");
				}
			}
		}
		private class TimeStamp implements ActionListener
		{
			public void actionPerformed(ActionEvent Kick)
			{
				Action++;

				if ( Action == 25 )
				{
					Flag = 1;
				}
				if ( Action == 50 )
				{
					Flag = 2;
				}
				if ( Action == 75 )
				{
					Flag = 3;
				}

				if ( Flag == 3 && One == Two )
				{
					Winnings = BetNumber * 2;
					JOptionPane.showMessageDialog(null,"You have won " + Winnings + " dollars!");
					NetGain = NetGain + Winnings;
					TNetGain.setText("" + NetGain);
					Money = Money + Winnings;
					TCredits.setText("" + Money);

				}
				else if ( Flag == 3 && Two == Three )
				{
					Winnings = BetNumber * 2;
					JOptionPane.showMessageDialog(null,"You have won " + Winnings + " dollars!");
					NetGain = NetGain + Winnings;
					TNetGain.setText("" + NetGain);
					Money = Money + Winnings;
					TCredits.setText("" + Money);

				}
				else if ( Flag == 3 && One == Three )
				{
					Winnings = BetNumber * 2;
					JOptionPane.showMessageDialog(null,"You have won " + Winnings + " dollars!");
					NetGain = NetGain + Winnings;
					TNetGain.setText("" + NetGain);
					Money = Money + Winnings;
					TCredits.setText("" + Money);

				}
				else if ( Flag == 3 && One % 2 == 0 && Two % 2 == 0 && Three % 2 == 0 )
				{
					Winnings = BetNumber * 2;
					JOptionPane.showMessageDialog(null,"You have won " + Winnings + " dollars!");
					NetGain = NetGain + Winnings;
					TNetGain.setText("" + NetGain);
					Money = Money + Winnings;
					TCredits.setText("" + Money);

				}
				else if ( Flag == 3 && One % 2 != 0 && Two % 2 != 0 && Three % 2 != 0 )
				{
					Winnings = BetNumber * 2;
					JOptionPane.showMessageDialog(null,"You have won " + Winnings + " dollars!");
					NetGain = NetGain + Winnings;
					TNetGain.setText("" + NetGain);
					Money = Money + Winnings;
					TCredits.setText("" + Money);

				}
				else if ( Flag == 3 && One == 7 && Two == 7 && Three == 7 )
				{
					Winnings = BetNumber * 10;
					JOptionPane.showMessageDialog(null,"You have won " + Winnings + " dollars!");
					NetGain = NetGain + Winnings;
					TNetGain.setText("" + NetGain);
					Money = Money + Winnings;
					TCredits.setText("" + Money);

				}
				else if ( Flag == 3 )
				{
					JOptionPane.showMessageDialog(null,"You lose!");
					NetGain = NetGain - BetNumber;
					TNetGain.setText("" + NetGain);

				}



				if ( Flag == 0 )
				{
					One   = (int)(Math.random()*10);
					Two   = (int)(Math.random()*10);
					Three = (int)(Math.random()*10);
					NumberOne.setText("" + One  );
					NumberTwo.setText("" + Two  );
					NumberTre.setText("" + Three  );
				}
				else if ( Flag == 1 )
				{
					Two   = (int)(Math.random()*10);
					Three = (int)(Math.random()*10);
					NumberTwo.setText("" + Two    );
					NumberTre.setText("" + Three  );
				}
				else if ( Flag == 2 )
				{
					Three = (int)(Math.random()*10);
					NumberTre.setText("" + Three  );
				}
				else if ( Flag == 3 )
				{
					T.stop();
					BETButton.setEnabled(true);
					SPINButton.setEnabled(false);
					CASHOUTButton.setEnabled(true);
					MoneySpent = MoneySpent + BetNumber;
					TMoneySpent.setText("" + MoneySpent);
					JBet.setText("0");
					Flag = 0;
					Action = 0;
					BetNumber = 0;
				}

			}
		}

	}

	JPanel NorthPanel  = new JPanel();
	JPanel SouthPanel  = new JPanel();
	JPanel EastPanel   = new JPanel();
	JPanel WestPanel   = new JPanel();
	JPanel CenterPanel = new JPanel();
	JPanel TCenterPanel = new JPanel();
	JPanel BCenterPanel = new JPanel();

	JLabel NorthTitle = new JLabel("ONE ARMED BANDIT");
	JLabel SouthTitle = new JLabel("LAS VEGAS BABY"  );



	ImageIcon DollarGif   = new ImageIcon("Dollars.gif");
	ImageIcon FallingDollarGif   = new ImageIcon("FallingDollar.gif");
	ImageIcon DancingMoneyGif   = new ImageIcon("MoneyFall.gif");

	JLabel MyDollarOne  = new JLabel();
	JLabel MyDollarTwo  = new JLabel();
	JLabel MyDollarTre  = new JLabel();
	JLabel MyDollarFor  = new JLabel();

	JLabel FallingDollarOne  = new JLabel();
	JLabel FallingDollarTwo  = new JLabel();
	JLabel FallingDollarTre  = new JLabel();
	JLabel FallingDollarFor  = new JLabel();
	JLabel FallingDollarFiv  = new JLabel();
	JLabel FallingDollarSix  = new JLabel();

	JLabel DancingMoneyOne = new JLabel();
	JLabel DancingMoneyTwo = new JLabel();

	JLabel LGamesPlayed = new JLabel("Games Played",Label.LEFT);
	JTextField TGamesPlayed = new JTextField(4);

	JLabel LCredits = new JLabel("Credits",Label.LEFT);
	JTextField TCredits = new JTextField(4);

	JLabel LMoneySpent = new JLabel("Money Spent",Label.RIGHT);
	JTextField TMoneySpent = new JTextField(4);

	JLabel LNetGain = new JLabel("Net Gain",Label.RIGHT);
	JTextField TNetGain = new JTextField(4);

	JTextField NumberOne = new JTextField(3);
	JTextField NumberTwo = new JTextField(3);
	JTextField NumberTre = new JTextField(3);
	JTextField JBet       = new JTextField(3);


	Font SlightlyBig = new Font("TimesRoman",Font.BOLD,20 );
	Font VeryBig = new Font("TimesRoman",Font.BOLD,30 );
	Font Numbers = new Font("Impact"    ,Font.BOLD,100);


	JButton SPINButton = new JButton("SPIN"   );
	JButton BETButton  = new JButton("BET"    );
	JButton CASHOUTButton    = new JButton("CASHOUT");
	Timer T;

	int Action,BetNumber,GamesPlayed,Flag,MoneySpent,Winnings;
	int One,Two,Three;
	private double Money,NetGain;
	private String Response;
}