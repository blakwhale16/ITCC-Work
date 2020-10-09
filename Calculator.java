/**
  *Michael L. Tan ITCC11 A
  *October 5 2020
  */
  
  import javax.swing.*;
  import java.awt.*;
 
  class Calculator {
	
	  private JFrame frame;
	  private JTextField text;
	 
	  private JPanel mainPanel;
	  private JPanel buttonPanel;
	  
	  private JButton one;
	  private JButton two;
	  private JButton three;
	  private JButton four;
	  private JButton five;
	  private JButton six;
	  private JButton seven;
	  private JButton eight;
	  private JButton nine;
	  private JButton zero;
	  private JButton dot;
	  private JButton clear;
	  private JButton plus;	
	  private JButton minus;
	  private JButton multiply;
	  private JButton divide;
	  private JButton equals;
	  
	  private GridLayout grid;
	  private BorderLayout mainLayout;
	  
	  
	  
	  public Calculator(){
		  frame = new JFrame("THE BEST CALCULATOR");
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  mainLayout = new BorderLayout();
		  grid       = new GridLayout(4,4);
		 
		  text      = new JTextField(20);
		  text.setEditable(false);
		  
		  mainPanel   = new JPanel(mainLayout);
		  buttonPanel =	new JPanel(grid);	  
		  
		  one      = new JButton("1");
		  two      = new JButton("2");
		  three    = new JButton("3");
		  four     = new JButton("4");
		  five     = new JButton("5");
		  six      = new JButton("6");
		  seven    = new JButton("7");
		  eight    = new JButton("8");
		  nine     = new JButton("9");
		  zero     = new JButton("0");
		  dot      = new JButton(".");
		  
		  clear    = new JButton("AC");
		  clear.setBackground(Color.ORANGE);
		  clear.setOpaque(true);
		  
		  plus     = new JButton("+");
		  plus.setBackground(Color.RED);
		  plus.setOpaque(true);
		  
		  minus    = new JButton("-");
		  minus.setBackground(Color.RED);
		  minus.setOpaque(true);
		  
		  multiply = new JButton("*");
		  multiply.setBackground(Color.RED);
		  multiply.setOpaque(true);
		  
		  divide   = new JButton("/");
		  divide.setBackground(Color.RED);
		  divide.setOpaque(true);
		  
		  equals   = new JButton("=");
		  		  
		  buttonPanel.add(seven);
		  buttonPanel.add(eight);
		  buttonPanel.add(nine);
		  buttonPanel.add(plus);
		  
		  buttonPanel.add(four);
		  buttonPanel.add(five);
		  buttonPanel.add(six);
		  buttonPanel.add(minus);
		  
		  buttonPanel.add(one);
		  buttonPanel.add(two);
		  buttonPanel.add(three);
		  buttonPanel.add(multiply);
		  
		  buttonPanel.add(dot);
		  buttonPanel.add(zero);
		  buttonPanel.add(clear);
		  buttonPanel.add(divide);
		  
		  mainPanel.add(text, BorderLayout.PAGE_START);
		  mainPanel.add(buttonPanel, BorderLayout.CENTER);
		  frame.add(mainPanel);
		  
		  frame.pack();
		  
		  frame.setResizable(false);
		  frame.setVisible(true);
		 
	  }
	  
  }