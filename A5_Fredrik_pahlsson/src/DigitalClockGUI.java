import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private boolean alarmSet;
	private JLabel lblKlocka;
    private ClockLogic clockLogic;
    private ClockLogic.ClockThread ct;
    public static JLabel NoAlarm;
    
        private JTextField MyAlarmHour;
    private JTextField MyAlarmMinute;
	
	
	
 public void setTimeOnLabel(String time){ 
     lblKlocka.setText(time); 
     
 }
 
 public void activateAlarm(boolean activate){   
 activate = false;

 }
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final ClockLogic cl = new ClockLogic(this);
		
		lblKlocka = new JLabel("Klocka");
		lblKlocka.setFont(new Font("Viner Hand ITC", Font.PLAIN, 50));
		lblKlocka.setBounds(73, 58, 258, 60);
		contentPane.add(lblKlocka);
		
		JButton btnSetAlarm = new JButton("Set Alarm ");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	cl.setAlarm(12, 22);
				cl.setAlarm(Integer.parseInt(MyAlarmHour.getText()), (Integer.parseInt(MyAlarmMinute.getText())));
			alarmSet = true;
			}
		});
		btnSetAlarm.setBounds(242, 154, 121, 23);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClearAlarm.setBounds(242, 186, 121, 23);
		contentPane.add(btnClearAlarm);
		
		MyAlarmHour = new JTextField();
		MyAlarmHour.setBounds(116, 155, 86, 20);
		contentPane.add(MyAlarmHour);
		MyAlarmHour.setColumns(10);
		this.MyAlarmHour = MyAlarmHour;
		this.MyAlarmMinute = MyAlarmMinute;
		MyAlarmMinute = new JTextField();
		MyAlarmMinute.setBounds(116, 187, 86, 20);
		contentPane.add(MyAlarmMinute);
		MyAlarmMinute.setColumns(10);
		
		JLabel lblHour = new JLabel("Hour");
		lblHour.setBounds(60, 158, 46, 14);
		contentPane.add(lblHour);
		
		JLabel lblMinute = new JLabel("Minute");
		lblMinute.setBounds(60, 190, 46, 14);
		contentPane.add(lblMinute);
		
		NoAlarm = new JLabel("No Alarm");
		NoAlarm.setBounds(116, 218, 46, 14);
		contentPane.add(NoAlarm);
		clockLogic = new ClockLogic(this);
	}
public boolean isAlarmSet(){
	return alarmSet;
	
}
public void checkAlarm(int hour, int minute){
clockLogic.checkAlarmTime(hour, minute);
System.out.println(clockLogic.alarmHour);
if (clockLogic.alarmOn){ 
	NoAlarm.setText("Alarma");
}
}
}


