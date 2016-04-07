import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;

public class SokGUI extends JFrame {

	private JPanel contentPane;
	private JTextField fromField;
	private JTextField toField;
	private JTextField searchTravel;
	private JTextArea searchResults;
	private JTextArea searchResults2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SokGUI frame = new SokGUI();
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
	public SokGUI() {
		setTitle("S\u00E5netrafikens Nya Reseplanerare");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 380);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		searchTravel = new JTextField();
		searchTravel.setBounds(77, 18, 196, 26);
		contentPane.add(searchTravel);
		searchTravel.setColumns(10);

		fromField = new JTextField();
		fromField.setBounds(44, 182, 86, 26);
		contentPane.add(fromField);
		fromField.setColumns(10);

		toField = new JTextField();
		toField.setBounds(178, 182, 86, 26);
		contentPane.add(toField);
		toField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 57, 372, 96);
		contentPane.add(scrollPane);

		searchResults = new JTextArea();
		searchResults.setEditable(false);
		scrollPane.setViewportView(searchResults);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 229, 372, 102);
		contentPane.add(scrollPane_1);

		JButton searchButton2 = new JButton("S\u00F6k ");
		searchButton2.setFont(new Font("Tahoma", Font.BOLD, 15));
		searchButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				searchResults2.setText("Söker resor...");
				new TripThread().start();
			}
		});
		searchButton2.setBounds(281, 179, 97, 29);
		contentPane.add(searchButton2);

		JButton searchButton = new JButton("S\u00F6k ");
		searchButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				searchResults.setText("Söker avgångar...");
				new StationThread().start();

				
			}
		});
		searchButton.setBounds(281, 15, 97, 29);
		contentPane.add(searchButton);

		JLabel lblTo = new JLabel("Till:");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTo.setForeground(Color.WHITE);
		lblTo.setBounds(147, 187, 61, 16);
		contentPane.add(lblTo);

		JLabel lblFrom = new JLabel("Från:");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setBounds(6, 187, 61, 16);
		contentPane.add(lblFrom);

		JLabel lblID = new JLabel("H\u00E5llplats:");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblID.setForeground(Color.WHITE);
		lblID.setBounds(6, 22, 86, 16);
		contentPane.add(lblID);
		
				searchResults2 = new JTextArea();
				searchResults2.setBounds(6, 231, 345, 100);
				contentPane.add(searchResults2);
				searchResults2.setEditable(false);
	}

	private class StationThread extends Thread {
		@Override
		public void run() {
			String findStation = searchTravel.getText();
			System.out.println("Searching..");
			ArrayList<Station> searchStations = new ArrayList<Station>(); 
			searchStations.addAll(Parser.getStationsFromURL(findStation));
			searchResults.setText("");										
			for (Station s : searchStations) {
				searchResults.append(s.getStationName() + " nummer:" + s.getStationNbr() + "\n");
			}

		}
	}

	private class TripThread extends Thread {
		@Override
		public void run() {

			String from = fromField.getText();
			String to = toField.getText();
			String searchURL = Constants.getURL(from, to, 5);
			Journeys journeys = Parser.getJourneys(searchURL);
			searchResults2.setText("");

			for (Journey journey : journeys.getJourneys()) {
				System.out.print(journey.getStartStation() + " - ");
				System.out.print(journey.getEndStation());
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);
				searchResults2.append(" Avgående " + time + " Tiden som är kvar: " + journey.getTimeToDeparture()
						+ " minuter. Den blir " + journey.getDepTimeDeviation() + " minuter sen" + "\n");

			}
		}
	}
}

