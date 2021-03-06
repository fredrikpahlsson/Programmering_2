import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AnimalArrayList_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalArrayList_GUI frame = new AnimalArrayList_GUI();
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
	public AnimalArrayList_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 675, 284);
		contentPane.add(scrollPane);
		
		JTextArea AnimalList = new JTextArea();
		AnimalList.setEditable(false);
		scrollPane.setViewportView(AnimalList);
		
		ArrayList<Animal> myAnimals  = new ArrayList<Animal>();
		
		myAnimals.add(new Dog ("vovvimas taxis", 1, false, "Astrid"));
		myAnimals.add(new Dog ("nimbus 2000", 5, true));
		myAnimals.add(new Snake ("mulle meckis", true));
		myAnimals.add(new Dog ("Cumelus luddis", 2, false, "Buffel"));
		myAnimals.add(new Cat ("kattimus lenticularis", 5, 7));
		myAnimals.add(new Dog ("labradoris maxius", 2, false));
		
		myAnimals.add(new Cat ("kattius", 1, 3));
		
		for (int i = 0; i < myAnimals.size(); i++){
			AnimalList.append(myAnimals.get(i).getInfo()+ "\n");
		}
	}
}