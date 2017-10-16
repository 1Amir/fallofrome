package Romans;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main extends JPanel implements ActionListener,KeyListener{
	public int x = 200;
	public int y = 600;
	Timer am = new Timer(8,this);
	private Image character;
	private Image backround;
	public boolean village = false;
	public boolean done;
	public boolean journey;
	public static boolean end;
	private Image painting;
	private Image Rick;
	private Image Morty;
	
	
public static void main(String args[])throws IOException{
	Musicsounds sounded = new Musicsounds();
	sounded.playSound();
	Main open = new Main();
	JFrame frame = new JFrame();
	frame.setSize(1000,1000);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.getContentPane().add(open);
	frame.setVisible(true);
	frame.setResizable(true);
	
}
public Main(){
		addKeyListener(this);
	 	setFocusable(true);
    	setFocusTraversalKeysEnabled(false);
    	am.start();
	}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	int c = e.getKeyCode();
	if(c == KeyEvent.VK_J){
		ImageIcon ii = new ImageIcon(this.getClass().getResource("plains.jpg"));
		backround = ii.getImage();
	}
	if(c == KeyEvent.VK_A){
		x = x - 2;
		ImageIcon is = new ImageIcon(this.getClass().getResource("leftside.gif"));
		character = is.getImage();
		System.out.print(x);
		System.out.println(y);
		if(x > 190 && x < 230 && y < 50 && y > 5){
			JOptionPane.showMessageDialog(null,"Welcome to Modern rome.");
			JOptionPane.showMessageDialog(null, "Your mission right now is to fine the passage to ancient rome. I shall take you to the village.");
			ImageIcon ii = new ImageIcon(this.getClass().getResource("village.jpg"));
			backround = ii.getImage();
			village = true;
		}
	}
	if(c == KeyEvent.VK_W){
		y = y - 2;
		System.out.println(x);
		System.out.println(y);
		ImageIcon ii = new ImageIcon(this.getClass().getResource("frontsidemale.gif"));
		character = ii.getImage();
		
	}
	if(c == KeyEvent.VK_S){
		y = y  + 2;
		System.out.println(x);
		System.out.println(y);
	}
	if(c == KeyEvent.VK_D){
		x = x + 2;
		System.out.println(x);
		System.out.println(y);
	}
	if(village == true){
		if(x == 420 && y < 300 && y > 90){
			JOptionPane.showMessageDialog(null, "Apples!Apples!Get your apples.(dont.)");
		}
		if(x == 996){
			ImageIcon ii = new ImageIcon(this.getClass().getResource("wisdomroom.jpg"));
			backround = ii.getImage();
			ImageIcon is = new ImageIcon(this.getClass().getResource("romepainting.jpg"));
			painting = is.getImage();
			x = 234;
			y = 414;
			JOptionPane.showMessageDialog(null, "I am the wisdom man,Welcome to my domane.");
			JOptionPane.showMessageDialog(null, "You:Interesting place you got here wisdom man.");
			JOptionPane.showMessageDialog(null,"Wisdom man:Yes,I hope you are fond of this ancient rome painting.");
			JOptionPane.showMessageDialog(null,"Wisdom man:Hey,Since we have some time for this. How about I give you some history on roman art");
			JOptionPane.showMessageDialog(null,"The earliest Roman art is generally associated with the overthrow of the Etruscan kings and the establishment of the Republic in 509 BC");
			JOptionPane.showMessageDialog(null, " Roman art is traditionally divided into two main periods, art of the Republic and art of the Roman Empire (from 27 BC on), with subdivisions corresponding to the major emperors or imperial dynasties.");
			JOptionPane.showMessageDialog(null, "Roman art includes architecture, painting, sculpture and mosaic work. Luxury objects in metal-work, gem engraving, ivory carvings, and glass, are sometimes considered in modern terms to be minor forms of Roman art, although this would not necessarily have been the case for contemporaries.");
			JOptionPane.showMessageDialog(null, "the art and architecture of the Romans was always eclectic and is characterized by varying styles attributable to differing regional tastes and the diverse preferences of a wide range of patrons.");
			JOptionPane.showMessageDialog(null, "Wisdom man:Anyway,what do you seek?");
			JOptionPane.showMessageDialog(null, "You:A passage to ancient rome.");
			JOptionPane.showMessageDialog(null, "Oh just go to moon bucks,Brick and rorty can hook you up. You know what I will take you to moon bucks.");
			JOptionPane.showMessageDialog(null,"oh,um,thanks");
			ImageIcon ia = new ImageIcon(this.getClass().getResource("starbucks.jpg"));
			backround = ia.getImage();
			ImageIcon ib = new ImageIcon(this.getClass().getResource("Rick_Sanchez.png"));
			Rick = ib.getImage();
			ImageIcon ie = new ImageIcon(this.getClass().getResource("Morty.jpg"));
			painting = ie.getImage();
			JOptionPane.showMessageDialog(null, "Brick:Hello Stranger! *burp* what shall I do for you.");
			JOptionPane.showMessageDialog(null,"rorty:Oh jeez brick,I dont understand why your being so nice to this person.");
			JOptionPane.showMessageDialog(null, "Brick:Don't worry about it rorty,I just have a feeling about him rorty.A feeling~");
			JOptionPane.showMessageDialog(null, "rorty:Well okay then Brick.");
			JOptionPane.showMessageDialog(null, "Brick:Anyway,as I was saying. WHAT DO YOU WANT FROM ME!");
			JOptionPane.showMessageDialog(null, "You:I want a passage to acient rome.");
			JOptionPane.showMessageDialog(null, "Brick.Oh,I see. Okay Close your eyes.");
			JOptionPane.showMessageDialog(null,"Brick:Now RORTY");
			JOptionPane.showMessageDialog(null, "Oh jeez,HERE WE GO!");
			try {
				start starting = new start();
				starting.run();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}

@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	ImageIcon ii = new ImageIcon(this.getClass().getResource("male.gif"));
	character = ii.getImage();
}

@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
public void paintComponent(Graphics g){
	super.paintComponent(g);
	setBackground(Color.GREEN);
	Graphics2D g2g = (Graphics2D)g;
    g2g.drawImage(backround,0,0,this);
  
    Graphics2D g4g = (Graphics2D)g;
    g4g.drawImage(character,x,y,this);
    Graphics2D g5g = (Graphics2D)g;
    g4g.drawImage(painting,500,470,this);
    Graphics2D g6g = (Graphics2D)g;
    g6g.drawImage(Rick,600,400,this);
    Graphics2D g7g = (Graphics2D)g;
    g7g.drawImage(Morty,500,400,this);
}
}
