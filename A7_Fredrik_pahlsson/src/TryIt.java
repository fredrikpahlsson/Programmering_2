import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class TryIt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryIt frame = new TryIt();
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
	public TryIt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PixelController px = PixelController.getInstance(Screen.FLOOR_5);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		px.setPixel(33, 52, Color.RED);
		px.setPixel(33, 53, Color.RED);
		px.setPixel(33, 55, Color.RED);
		px.setPixel(33, 56, Color.RED);
		
		px.setPixel(34, 51, Color.RED);
		px.setPixel(34, 54, Color.RED);
		px.setPixel(34, 57, Color.RED);
		px.setPixel(34, 52, Color.RED);
		px.setPixel(34, 53, Color.RED);
		px.setPixel(34, 55, Color.RED);
		px.setPixel(34, 56, Color.RED);
		
		
		px.setPixel(35, 51, Color.RED);
		px.setPixel(35, 57, Color.RED);
     	px.setPixel(35, 52, Color.RED);
		px.setPixel(35, 53, Color.RED);
		px.setPixel(35, 54, Color.RED);
		px.setPixel(35, 55, Color.RED);
		px.setPixel(35, 56, Color.RED);
		
    	px.setPixel(36, 52, Color.RED);
		px.setPixel(36, 56, Color.RED);
		px.setPixel(36, 53, Color.RED);
		px.setPixel(36, 54, Color.RED);
		px.setPixel(36, 55, Color.RED);
		
		
		px.setPixel(37, 53, Color.RED);
		px.setPixel(37, 55, Color.RED);
		px.setPixel(37, 54, Color.RED);
		
		px.setPixel(38, 54, Color.RED);
		
		
		
		
		
		
		
		
	}

}
