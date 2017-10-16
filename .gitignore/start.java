package Romans;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class start extends JPanel implements ActionListener,KeyListener{
	Timer am = new Timer(8,this);
	public int x = 0;
	public int statuelook = 0;
	public int y = 0;
	public boolean stop = false;
	public boolean talking = true;
	public int dialog = 1;
	public boolean done = false;
	public boolean dialog1 = true;
	public boolean dialog2 = false;
	public boolean dialog3 = false;
	public boolean dialog4 = false;
	public boolean dialog5 = false;
	//to check if the character select is female or male.sadw
	public int check = 0;
	public int characterx = 540;
	public int charactery = 330;
	public boolean gender;
	public boolean startmusic = true;
	public boolean gamestart;
	private Image backround;
	private Image character;
	private Image cursor;
	private Image characterselect;
	private Image characterselect2;
	public boolean started = false;
	public boolean characterselectchoice = false;
	public boolean extra;
	


	public void dialog1(){
		String start = "";
		JOptionPane.showMessageDialog(null, "Old man:Welcome young traveler,I shall show you the art and great buildings of ancient rome.");
		JOptionPane.showMessageDialog(null, "Old main:I shall show you the works of Roman architecture and art.");
		JOptionPane.showMessageDialog(null, "Old man:Then show you it's  affect on the modern world.");
		JOptionPane.showMessageDialog(null,"Press enter to countinue");	
		start startttt = new start();
		startttt.dialog2();
		
		if(start.equals("no")){
			JOptionPane.showMessageDialog(null, "Old man:Oh okay then.");
		}
		}
	public void dialog2(){
		String walkorcountinue = "";
		JOptionPane.showMessageDialog(null, "Press Y to begin");
		
	
	}
	public void dialog3(){
		JOptionPane.showMessageDialog(null, "These are some amazing statues. Just look at that beauty");
		JOptionPane.showMessageDialog(null, "Rome, while took a lot of inspiration from other countries. Still had a fine knack of statue making");
	}
	public void dialog4(){
		
	}
	public void run() throws IOException{
		start open = new start();
		JFrame frame = new JFrame();
		frame.setSize(1000,1000);
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.getContentPane().add(open);
		frame.setVisible(true);
		frame.setResizable(true);
	
	}
	public start(){
		addKeyListener(this);
	 	setFocusable(true);
    	setFocusTraversalKeysEnabled(false);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int c = e.getKeyCode();
		if(started == false){
		if(c == KeyEvent.VK_ENTER){
			stop = true;
	    	
			ImageIcon is = new ImageIcon(this.getClass().getResource("Characterselect.png"));
			backround = is.getImage();
			ImageIcon ia = new ImageIcon(this.getClass().getResource("male.gif"));
			characterselect = ia.getImage();
			characterselectchoice = true;
		}
		if(characterselectchoice == true){
			
			if(c == KeyEvent.VK_ENTER){
				ImageIcon ia = new ImageIcon(this.getClass().getResource("frontsidemale.gif"));
				character = ia.getImage();
				ImageIcon ii = new ImageIcon(this.getClass().getResource("oldmanstart.png"));
				backround = ii.getImage();
				character = characterselect;
				characterselect2 = null;
				started = true;
			
		}
			if(c == KeyEvent.VK_BACK_SPACE){
				ImageIcon ia = new ImageIcon(this.getClass().getResource("startup.gif"));
				backround = ia.getImage();
				characterselect = null;
				characterselect2 = null;
			}
		}
		if(c == KeyEvent.VK_S){
		
			ImageIcon ii = new ImageIcon(this.getClass().getResource("startup.gif"));
			backround = ii.getImage();
		}

		}
		if(started == true){
		if(done == false){
			if(c == KeyEvent.VK_X){
			 if(dialog == 1){
				start startedd = new start();
				startedd.dialog1();
				done = true;
			 }
			}
			}
			if(c == KeyEvent.VK_D){
				characterx = characterx + 2;
			}
			if(c == KeyEvent.VK_S){
				charactery = charactery + 2;
				ImageIcon ii = new ImageIcon(this.getClass().getResource("male.gif"));
			    characterselect = ii.getImage();
			}
			if(c == KeyEvent.VK_A){
				characterx = characterx - 2;
				ImageIcon ii = new ImageIcon(this.getClass().getResource("leftside.gif"));
			    characterselect = ii.getImage();
			}
			if(c == KeyEvent.VK_W){
				charactery = charactery - 2;
			}
			if(c == KeyEvent.VK_Y){
				if(talking == true){
				ImageIcon ii = new ImageIcon(this.getClass().getResource("Collisum.png"));
				backround = ii.getImage();
				JOptionPane.showMessageDialog(null, "Old Man:This is the collusium");
				JOptionPane.showMessageDialog(null, "Built in 70 AD.It is an amazing work of art and archtecture");
				JOptionPane.showMessageDialog(null, "first of all there is the travertino, a limestone, then tuff for the other pillars and radial walls, tiles for the floors of the upper storeys and the walls; finally, concrete (a.k.a. cement) for the vaults.");
				JOptionPane.showMessageDialog(null, "The romans were amazing builders and while they use it for...not the best of things(putting people to death there and having people watch)");
				JOptionPane.showMessageDialog(null, "It still is an amazing building");
				JOptionPane.showMessageDialog(null,"Now for the statues,these are amazing fine works of art..Press Y to look through them");
				talking = false;
				}
				if(talking == false){
					if(c == KeyEvent.VK_Y){
						statuelook = 1 + statuelook;
						if(statuelook == 1){
							ImageIcon ii = new ImageIcon(this.getClass().getResource("statue1.png"));
							backround = ii.getImage();
							JOptionPane.showMessageDialog(null,"");
						}
						if(statuelook == 2){
							ImageIcon ii = new ImageIcon(this.getClass().getResource("statue2.png"));
							backround = ii.getImage();
						}
						if(statuelook == 3){
							ImageIcon ii = new ImageIcon(this.getClass().getResource("statue3.png"));
							backround = ii.getImage();
						}
						if(statuelook == 4){
							ImageIcon ii = new ImageIcon(this.getClass().getResource("statue4.png"));
							backround = ii.getImage();
						}
						if(statuelook == 5){
							ImageIcon ii = new ImageIcon(this.getClass().getResource("statue5.jpg"));
							backround = ii.getImage();
							JOptionPane.showMessageDialog(null, "Now for the aqueducts. Press enter and the Y");

						}
						if(statuelook == 6){
							ImageIcon ii = new ImageIcon(this.getClass().getResource("aqueducts.jpg"));
							backround = ii.getImage();
							JOptionPane.showMessageDialog(null, "An aqueduct is a water supply or navigable channel constructed to convey water. ");
							JOptionPane.showMessageDialog(null,"In modern engineering, the term is used for any system of pipes, ditches, canals, tunnels, and other structures used for this purpose");
							JOptionPane.showMessageDialog(null, "The Romans constructed aqueducts to bring a constant flow of water from distant sources into cities and towns, supplying public baths, latrines, fountains and private households");
							JOptionPane.showMessageDialog(null, "Aqueducts worked on gravity alone back then.");
							JOptionPane.showMessageDialog(null, "Press enter and you can look at the Image for a while. After Press Y and the credits and counclusion will being.");
						}
					
						
						if(statuelook == 7){
							ImageIcon ii = new ImageIcon(this.getClass().getResource("Wyatt.jpg"));
							backround = ii.getImage();
							JOptionPane.showMessageDialog(null, "Design and music by Wyatt. Press enter and then Y");

							
						}
						if(statuelook == 8){
							ImageIcon ii = new ImageIcon(this.getClass().getResource("Amir.jpg"));
							backround = ii.getImage();
							JOptionPane.showMessageDialog(null,"Programmed and Dialog by Amir.Press enter and Y to countinue.");						
						}
						if(statuelook == 9){
							ImageIcon ii = new ImageIcon(this.getClass().getResource("red.jpg"));
							backround = ii.getImage();
							JOptionPane.showMessageDialog(null, "Roman statues a big part of Roman art.");
							JOptionPane.showMessageDialog(null,"The statues in rome were inspired a lot by other places even including the greek’s. Most of these statues were made in stone.");
							JOptionPane.showMessageDialog(null, "Including Greek art,though the romans still put their tastes in the staues as well");
							JOptionPane.showMessageDialog(null,"The effect on roman art is clear when seeing the architecture in our world");
							JOptionPane.showMessageDialog(null, "Such as the aqueducts the things that we use build our own aqueducts is inspired greatly from the Romans");
							JOptionPane.showMessageDialog(null,"Or the fact that we make a lot of our building out of stone when it comes to building like the collisum");
							JOptionPane.showMessageDialog(null,"Not to mention the statues of the romans,the way they are made,those tatics are defentially used in modern statue making");
							JOptionPane.showMessageDialog(null, "That is our Presentaion.");		
						}
						}
				}
				}
		}
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.BLACK);
		Graphics2D g2g = (Graphics2D)g;
	    g2g.drawImage(backround,x,y,this);
		Graphics2D g3g = (Graphics2D)g;
	    g3g.drawImage(characterselect,characterx,charactery,this);
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(started == true){
			ImageIcon ia = new ImageIcon(this.getClass().getResource("frontsidemale.gif"));
			characterselect = ia.getImage();
		}
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}