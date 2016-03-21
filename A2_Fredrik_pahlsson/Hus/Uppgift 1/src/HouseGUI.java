import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class HouseGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private House[] myHouse;
	private ArrayList<House> Houses = new ArrayList<House>();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(318, 0, 17, 462);
		contentPane.add(scrollBar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 340, 462);
		contentPane.add(textArea);
		
		
		
		
		//1.2
		
		textArea.append("Uppgift 1.2 \n");
		
		House myHouse1 = new House(1864,148);
		House myHouse2 = new House(1935,58);
		House myHouse3 = new House(2014,236);

		int HouseYearBuilt = myHouse1.getYearBuilt();
		int HouseSize = myHouse1.getSize();
		
		int HouseYearBuilt2 = myHouse2.getYearBuilt();
		int HouseSize2 = myHouse2.getSize();
		
		int HouseYearBuilt3 = myHouse3.getYearBuilt();
		int HouseSize3 = myHouse3.getSize();
		
		System.out.println("assigment 1.2");
		System.out.println(myHouse1.getYearBuilt() + "\t" + myHouse1.getSize());
		System.out.println(myHouse2.getYearBuilt() + "\t" + myHouse2.getSize());
		System.out.println(myHouse3.getYearBuilt() + "\t" + myHouse3.getSize());
		
		textArea.append("  Första huset byggdes år " + HouseYearBuilt + " och är " + HouseSize + " kvm stort \n" );
		textArea.append("  Andra huset byggdes år " + HouseYearBuilt2 + " och är " + HouseSize2 + " kvm stort \n");
		textArea.append("  Tredje huset byggdes år " + HouseYearBuilt3 + " och är " + HouseSize3 + " kvm stort \n"); 

	
textArea.append(" \n Uppgift 1.3 \n"); 
	
   /* myHouse = new House[10];
	
	myHouse[0] = new House(1989, 120);
	myHouse[1] = new House(2010, 134);
	myHouse[3] = new House(1890, 201);
	myHouse[4] = new House(1910, 233);
	myHouse[5] = new House(2004, 234);
	myHouse[6] = new House(2001, 145);
	myHouse[7] = new House(1994, 156);
	myHouse[8] = new House(1956, 167);
	myHouse[9] = new House(1967, 122);
	
	for(int i = 0; i < 100; i = i+1){
    }
	
	for(int i = 0; i < myHouse.length; i = i+1){
		
    textArea.append (" Huset byggdes år " + myHouse[i].getYearBuilt() + "och är" + myHouse[i].getSize() + "kvm");
	}*/
	
textArea.append(" \n Uppgift 1.4 \n"); 
	
	
	Random random = new Random();
	
	for (int i = 0; i<100; i++) {
		
		int size = random.nextInt((1000-10) + 1) +10;
		int year = random.nextInt((2015-1800) + 1) +1800;
		
		Houses.add(new House(year, size));
		
		textArea.append("  Hus nummer " + (i+1) + " byggdes år " + Houses.get(i).getYearBuilt() + " och är " + Houses.get(i).getSize() + " kvm stort" + "\n");
	}
	}
	
}








