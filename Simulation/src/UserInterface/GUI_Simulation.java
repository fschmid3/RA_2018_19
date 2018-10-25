package UserInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI_Simulation {

	private JFrame frame;
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
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;

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
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		frame.setBounds(100, 100, 960, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(35, 52, 277, 342);
		frame.getContentPane().add(textPane);
		
		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_1.setBounds(753, 186, 20, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPortB = new JLabel("Port B");
		lblPortB.setBounds(757, 153, 56, 16);
		frame.getContentPane().add(lblPortB);
		
		JLabel lblW = new JLabel("w");
		lblW.setBounds(347, 110, 56, 16);
		frame.getContentPane().add(lblW);
		
		JLabel lblPc = new JLabel("PC");
		lblPc.setBounds(347, 139, 56, 16);
		frame.getContentPane().add(lblPc);
		
		JLabel lblNewLabel = new JLabel("FSR");
		lblNewLabel.setBounds(347, 168, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPcl = new JLabel("PCL");
		lblPcl.setBounds(347, 197, 56, 16);
		frame.getContentPane().add(lblPcl);
		
		JLabel lblPclatch = new JLabel("PCLATCH");
		lblPclatch.setBounds(347, 226, 56, 16);
		frame.getContentPane().add(lblPclatch);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(347, 255, 56, 16);
		frame.getContentPane().add(lblStatus);
		
		JLabel lblZ = new JLabel("Z");
		lblZ.setBounds(521, 110, 20, 16);
		frame.getContentPane().add(lblZ);
		
		JLabel lblDc = new JLabel("DC");
		lblDc.setBounds(544, 110, 20, 16);
		frame.getContentPane().add(lblDc);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(567, 110, 20, 16);
		frame.getContentPane().add(lblC);
		
		textField_2 = new JTextField();
		textField_2.setBounds(415, 107, 63, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(415, 136, 63, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(415, 165, 63, 22);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(415, 194, 63, 22);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(415, 223, 63, 22);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(415, 252, 63, 22);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(521, 136, 20, 22);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(544, 136, 20, 22);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(567, 136, 20, 22);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(773, 186, 20, 22);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_12.setColumns(10);
		textField_12.setBounds(793, 186, 20, 22);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		textField_13.setColumns(10);
		textField_13.setBounds(813, 186, 20, 22);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_14.setColumns(10);
		textField_14.setBounds(833, 186, 20, 22);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_15.setColumns(10);
		textField_15.setBounds(853, 186, 20, 22);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_16.setColumns(10);
		textField_16.setBounds(873, 186, 20, 22);
		frame.getContentPane().add(textField_16);
		
		JLabel label = new JLabel("7");
		label.setBounds(757, 169, 20, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("6");
		label_1.setBounds(773, 169, 20, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("5");
		label_2.setBounds(793, 168, 20, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setBounds(813, 169, 20, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("3");
		label_4.setBounds(833, 169, 20, 16);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("2");
		label_5.setBounds(853, 170, 20, 16);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("1");
		label_6.setBounds(873, 170, 20, 16);
		frame.getContentPane().add(label_6);
		
		textField_17 = new JTextField();
		textField_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_17.setColumns(10);
		textField_17.setBounds(893, 186, 20, 22);
		frame.getContentPane().add(textField_17);
		
		JLabel label_7 = new JLabel("0");
		label_7.setBounds(893, 170, 20, 16);
		frame.getContentPane().add(label_7);
		
		JLabel lblPortA = new JLabel("Port A");
		lblPortA.setBounds(757, 74, 56, 16);
		frame.getContentPane().add(lblPortA);
		
		JLabel label_9 = new JLabel("7");
		label_9.setBounds(757, 90, 20, 16);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("6");
		label_10.setBounds(773, 90, 20, 16);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("5");
		label_11.setBounds(793, 90, 20, 16);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("4");
		label_12.setBounds(813, 90, 20, 16);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("3");
		label_13.setBounds(833, 90, 20, 16);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("2");
		label_14.setBounds(853, 91, 20, 16);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("1");
		label_15.setBounds(873, 91, 20, 16);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("0");
		label_16.setBounds(893, 91, 20, 16);
		frame.getContentPane().add(label_16);
		
		textField_18 = new JTextField();
		textField_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_18.setColumns(10);
		textField_18.setBounds(893, 107, 20, 22);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_19.setColumns(10);
		textField_19.setBounds(873, 107, 20, 22);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_20.setColumns(10);
		textField_20.setBounds(853, 107, 20, 22);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_21.setColumns(10);
		textField_21.setBounds(833, 107, 20, 22);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_22.setColumns(10);
		textField_22.setBounds(813, 107, 20, 22);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_23.setColumns(10);
		textField_23.setBounds(793, 107, 20, 22);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_24.setColumns(10);
		textField_24.setBounds(773, 107, 20, 22);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_25.setColumns(10);
		textField_25.setBounds(753, 107, 20, 22);
		frame.getContentPane().add(textField_25);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(617, 616, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
