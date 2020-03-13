/**
 * @(#)Kenya.java
 *
 *
 * @author 
 * @version 1.00 2019/11/26
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Kenya extends JFrame implements ActionListener
{
	 public static void main(String[]args)
  {
  	Kenya k=new Kenya();
  	k.setVisible(true);
  }
	public static final int WIDTH=400;
	public static final int HEIGHT=600;
	
	private JPanel red;
	private JPanel white;
	private JPanel white1;
	private JPanel green;
	private JPanel black;


    public Kenya() 
    {
    	super("I LOVE KENYA");
    	setSize(WIDTH,HEIGHT);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(new BorderLayout());
    	
    	JPanel nel=new JPanel();
    	nel.setLayout(new GridLayout(1,4));
    	
    	red=new JPanel();
    	red.setBackground(Color.WHITE);
    	nel.add(red);
    	
    	white=new JPanel();
    	white.setBackground(Color.WHITE);
    	white.setSize(600,100);
    	nel.add(white);
    	
    	green=new JPanel();
    	green.setBackground(Color.WHITE);
    	nel.add(green);
    	
    	white1=new JPanel();
    	white1.setBackground(Color.WHITE);
    	white1.setSize(600,100);
    	nel.add(white1);
    	
    	black=new JPanel();
    	black.setBackground(Color.WHITE);
    	nel.add(black);
    	
    	add(nel,BorderLayout.CENTER);
    	
    	JPanel ne =new JPanel();
    	ne.setBackground(Color.WHITE);
    	ne.setLayout(new FlowLayout());
    	
    	JButton redButton=new JButton("Red");
    	redButton.setBackground(Color.RED);
    	redButton.addActionListener(this);
    	ne.add(redButton);
    	
    	JButton whiteButton=new JButton("White");
    	whiteButton.setBackground(Color.WHITE);
    	whiteButton.addActionListener(this);
    	ne.add(whiteButton);
    	
    	JButton greenButton=new JButton("Green");
    	greenButton.setBackground(Color.GREEN);
    	greenButton.addActionListener(this);
    	ne.add(greenButton);
    	
    	JButton whiteButton1=new JButton("White1");
    	whiteButton1.setBackground(Color.WHITE);
    	whiteButton1.addActionListener(this);
    	ne.add(whiteButton1);
    	
    	JButton blackButton=new JButton("Black");
    	blackButton.setBackground(Color.BLACK);
    	blackButton.addActionListener(this);
    	ne.add(blackButton);
    	
    	JButton re=new JButton("Reset");
    	re.setBackground(Color.BLUE);
    	blackButton.addActionListener(this);
    	ne.add(re);
    	
    	add(ne,BorderLayout.SOUTH);		
    	
    }
    public void actionPerformed(ActionEvent e)
    {
    	String button=e.getActionCommand();
    	if(button.equals("Red"))
    	{
    		red.setBackground(Color.RED);
    	}
    	else if(button.equals("White"))
    	{
    		white.setBackground(Color.WHITE);
    	}
    	else if(button.equals("Green"))
    	{
    		green.setBackground(Color.GREEN);
    	}
    	else if(button.equals("White1"))
    	{
    		white1.setBackground(Color.WHITE);
    	}
    	else if(button.equals("Black"))
    	{
    		black.setBackground(Color.BLACK);
    	}
    	else
    		System.out.println("unexpected error");
   }
    }
    
    
