package UserInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GUI_Simulation {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Simulation window = new GUI_Simulation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GUI_Simulation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 960, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(35, 52, 277, 342);
		frame.getContentPane().add(textPane);
		
		textField = new JTextField();
		textField.setBounds(369, 116, 20, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(552, 87, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPortA = new JLabel("Port A");
		lblPortA.setBounds(369, 52, 56, 16);
		frame.getContentPane().add(lblPortA);
		
		JLabel lblPortB = new JLabel("Port B");
		lblPortB.setBounds(481, 90, 56, 16);
		frame.getContentPane().add(lblPortB);
		
		JLabel lblW = new JLabel("w");
		lblW.setBounds(352, 178, 56, 16);
		frame.getContentPane().add(lblW);
		
		JLabel lblPc = new JLabel("PC");
		lblPc.setBounds(352, 207, 56, 16);
		frame.getContentPane().add(lblPc);
		
		JLabel lblNewLabel = new JLabel("FSR");
		lblNewLabel.setBounds(352, 236, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPcl = new JLabel("PCL");
		lblPcl.setBounds(352, 265, 56, 16);
		frame.getContentPane().add(lblPcl);
		
		JLabel lblPclatch = new JLabel("PCLATCH");
		lblPclatch.setBounds(352, 294, 56, 16);
		frame.getContentPane().add(lblPclatch);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(352, 323, 56, 16);
		frame.getContentPane().add(lblStatus);
		
		JLabel lblZ = new JLabel("Z");
		lblZ.setBounds(729, 178, 20, 16);
		frame.getContentPane().add(lblZ);
		
		JLabel lblDc = new JLabel("DC");
		lblDc.setBounds(761, 178, 20, 16);
		frame.getContentPane().add(lblDc);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(793, 178, 20, 16);
		frame.getContentPane().add(lblC);
		
		textField_2 = new JTextField();
		textField_2.setBounds(420, 175, 63, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(420, 204, 63, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(420, 233, 63, 22);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(420, 262, 63, 22);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(420, 291, 63, 22);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(420, 320, 63, 22);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(725, 204, 20, 22);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(761, 204, 20, 22);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(793, 204, 20, 22);
		frame.getContentPane().add(textField_10);
	}
}
