package UserInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Steuerung.Control;
import javax.swing.JScrollPane;
import java.awt.SystemColor;

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
	private JTable table;
	private Control strg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the application.
	 */
	public GUI_Simulation() {
		initialize();
		strg = new Control(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		frame.setBounds(100, 100, 960, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_1);
			}
		});
		textField_1.setBounds(673, 211, 20, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPortB = new JLabel("Port B");
		lblPortB.setBounds(673, 178, 56, 16);
		frame.getContentPane().add(lblPortB);
		
		JLabel lblW = new JLabel("w");
		lblW.setBounds(673, 289, 56, 16);
		frame.getContentPane().add(lblW);
		
		JLabel lblPc = new JLabel("PC");
		lblPc.setBounds(673, 318, 56, 16);
		frame.getContentPane().add(lblPc);
		
		JLabel lblNewLabel = new JLabel("FSR");
		lblNewLabel.setBounds(673, 347, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPcl = new JLabel("PCL");
		lblPcl.setBounds(673, 376, 56, 16);
		frame.getContentPane().add(lblPcl);
		
		JLabel lblPclatch = new JLabel("PCLATCH");
		lblPclatch.setBounds(673, 405, 56, 16);
		frame.getContentPane().add(lblPclatch);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(673, 434, 56, 16);
		frame.getContentPane().add(lblStatus);
		
		JLabel lblZ = new JLabel("Z");
		lblZ.setBounds(847, 289, 20, 16);
		frame.getContentPane().add(lblZ);
		
		JLabel lblDc = new JLabel("DC");
		lblDc.setBounds(870, 289, 20, 16);
		frame.getContentPane().add(lblDc);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(893, 289, 20, 16);
		frame.getContentPane().add(lblC);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(741, 286, 63, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(741, 315, 63, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(741, 344, 63, 22);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(741, 373, 63, 22);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(741, 402, 63, 22);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(741, 431, 63, 22);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(847, 315, 20, 22);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(870, 315, 20, 22);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(893, 315, 20, 22);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_11);
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(693, 211, 20, 22);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_12);
			}
		});
		textField_12.setColumns(10);
		textField_12.setBounds(713, 211, 20, 22);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switchBit(textField_13);
			}
		});
		textField_13.setColumns(10);
		textField_13.setBounds(733, 211, 20, 22);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_14);
			}
		});
		textField_14.setColumns(10);
		textField_14.setBounds(753, 211, 20, 22);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_15);
			}
		});
		textField_15.setColumns(10);
		textField_15.setBounds(773, 211, 20, 22);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_16);
			}
		});
		textField_16.setColumns(10);
		textField_16.setBounds(793, 211, 20, 22);
		frame.getContentPane().add(textField_16);
		
		JLabel label = new JLabel("7");
		label.setBounds(677, 194, 20, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("6");
		label_1.setBounds(693, 194, 20, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("5");
		label_2.setBounds(713, 193, 20, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setBounds(733, 194, 20, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("3");
		label_4.setBounds(753, 194, 20, 16);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("2");
		label_5.setBounds(773, 195, 20, 16);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("1");
		label_6.setBounds(793, 195, 20, 16);
		frame.getContentPane().add(label_6);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_17);
			}
		});
		textField_17.setColumns(10);
		textField_17.setBounds(813, 211, 20, 22);
		frame.getContentPane().add(textField_17);
		
		JLabel label_7 = new JLabel("0");
		label_7.setBounds(813, 195, 20, 16);
		frame.getContentPane().add(label_7);
		
		JLabel lblPortA = new JLabel("Port A");
		lblPortA.setBounds(673, 99, 56, 16);
		frame.getContentPane().add(lblPortA);
		
		JLabel label_9 = new JLabel("7");
		label_9.setBounds(677, 115, 20, 16);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("6");
		label_10.setBounds(693, 115, 20, 16);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("5");
		label_11.setBounds(713, 115, 20, 16);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("4");
		label_12.setBounds(733, 115, 20, 16);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("3");
		label_13.setBounds(753, 115, 20, 16);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("2");
		label_14.setBounds(773, 116, 20, 16);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("1");
		label_15.setBounds(793, 116, 20, 16);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("0");
		label_16.setBounds(813, 116, 20, 16);
		frame.getContentPane().add(label_16);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_18);
			}
		});
		textField_18.setColumns(10);
		textField_18.setBounds(813, 132, 20, 22);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_19);
			}
		});
		textField_19.setColumns(10);
		textField_19.setBounds(793, 132, 20, 22);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_20);
			}
		});
		textField_20.setColumns(10);
		textField_20.setBounds(773, 132, 20, 22);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_21);
			}
		});
		textField_21.setColumns(10);
		textField_21.setBounds(753, 132, 20, 22);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_22);
			}
		});
		textField_22.setColumns(10);
		textField_22.setBounds(733, 132, 20, 22);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_23);
			}
		});
		textField_23.setColumns(10);
		textField_23.setBounds(713, 132, 20, 22);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_24);
			}
		});
		textField_24.setColumns(10);
		textField_24.setBounds(693, 132, 20, 22);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_25);
			}
		});
		textField_25.setColumns(10);
		textField_25.setBounds(673, 132, 20, 22);
		frame.getContentPane().add(textField_25);
		
		JButton btnRun = new JButton("Run");
		btnRun.setBounds(679, 680, 70, 25);
		frame.getContentPane().add(btnRun);
		
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnStop.setBounds(761, 680, 70, 25);
		frame.getContentPane().add(btnStop);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(843, 680, 70, 25);
		frame.getContentPane().add(btnNext);
		
		
			
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"M", "B", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(0).setMaxWidth(30);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setMinWidth(30);
		table.getColumnModel().getColumn(1).setMaxWidth(30);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.setBounds(33, 42, 437, 329);
		frame.getContentPane().add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(34, 99, 531, 351);
		frame.getContentPane().add(scrollPane);
		
		
		JButton btnLoadLstFile = new JButton("Load LST File...");
		btnLoadLstFile.setBounds(34, 52, 125, 25);
		frame.getContentPane().add(btnLoadLstFile);
	}
	
	private void switchBit(JTextField txtFieldToChange){
		if(txtFieldToChange.getText().equals("0")){
			txtFieldToChange.setText("1");
		}else{
			txtFieldToChange.setText("0");
		}
	}
	
	public void setW(int w) {
		textField_2.setText(w+"");
	}
	public void setPC(int pc) {
		textField_3.setText(pc+"");
	}
	public void setC(int c) {
		textField_10.setText(c+"");
	}
	public void setDC(int dc) {
		textField_9.setText(dc+"");
	}
	public void setZ(int z) {
		textField_8.setText(z+"");
	}
	public void setFSR(int fsr) {
		textField_4.setText(fsr+"");
	}
	public void setPCLATCH(int pcla) {
		textField_6.setText(pcla+"");
	}
	public void setPCL(int pcl) {
		textField_5.setText(pcl+"");
	}
	public void setStatus(int status) {
		textField_7.setText(status+"");
	}
}
