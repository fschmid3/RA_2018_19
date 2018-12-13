package UserInterface;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Steuerung.Control;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JFileChooser;
import java.io.File;   

public class GUI_Simulation {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtPD;
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
	private JTextField timer_txt;
	private JTextField intcon_txt;
	private JTextField optionReg_txt;
	private JTextField txtTO;
	private JTextField txtRP0;
	private JTextField txtRP1;
	private JTextField txtIRP;

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
		frame.setResizable(false);
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
				
				timer_txt = new JTextField();
				timer_txt.setEditable(false);
				timer_txt.setColumns(10);
				timer_txt.setBounds(96, 569, 63, 22);
				frame.getContentPane().add(timer_txt);
				
				JLabel timer_lbl = new JLabel("Timer0");
				timer_lbl.setBounds(34, 572, 56, 16);
				frame.getContentPane().add(timer_lbl);
		
				JLabel lblC = new JLabel("C");
				lblC.setBounds(910, 543, 20, 16);
				frame.getContentPane().add(lblC);
		
		JLabel lblRp = new JLabel("RP0");
		lblRp.setBounds(796, 543, 30, 16);
		frame.getContentPane().add(lblRp);
		
				JLabel lblZ = new JLabel("Z");
				lblZ.setBounds(864, 543, 20, 16);
				frame.getContentPane().add(lblZ);
		
				textField_10 = new JTextField();
				textField_10.setEditable(false);
				textField_10.setColumns(10);
				textField_10.setBounds(906, 569, 20, 22);
				frame.getContentPane().add(textField_10);
		
		JLabel lblpd = new JLabel("!PD");
		lblpd.setBounds(840, 543, 20, 16);
		frame.getContentPane().add(lblpd);
		
		JLabel lblto = new JLabel("!TO");
		lblto.setBounds(818, 543, 30, 16);
		frame.getContentPane().add(lblto);
		
				txtPD = new JTextField();
				txtPD.setEditable(false);
				txtPD.setColumns(10);
				txtPD.setBounds(840, 569, 20, 22);
				frame.getContentPane().add(txtPD);
		
		txtTO = new JTextField();
		txtTO.setEditable(false);
		txtTO.setColumns(10);
		txtTO.setBounds(818, 569, 20, 22);
		frame.getContentPane().add(txtTO);
		
		JLabel lblIrp = new JLabel("IRP");
		lblIrp.setBounds(752, 543, 20, 16);
		frame.getContentPane().add(lblIrp);
		
				textField_9 = new JTextField();
				textField_9.setEditable(false);
				textField_9.setColumns(10);
				textField_9.setBounds(884, 569, 20, 22);
				frame.getContentPane().add(textField_9);
		
		txtIRP = new JTextField();
		txtIRP.setEditable(false);
		txtIRP.setColumns(10);
		txtIRP.setBounds(752, 569, 20, 22);
		frame.getContentPane().add(txtIRP);
		
				textField_8 = new JTextField();
				textField_8.setEditable(false);
				textField_8.setColumns(10);
				textField_8.setBounds(862, 569, 20, 22);
				frame.getContentPane().add(textField_8);
		
				JLabel lblStatus = new JLabel("Status");
				lblStatus.setBounds(694, 572, 56, 16);
				frame.getContentPane().add(lblStatus);
		
				JLabel lblDc = new JLabel("DC");
				lblDc.setBounds(887, 543, 20, 16);
				frame.getContentPane().add(lblDc);
		
		txtRP0 = new JTextField();
		txtRP0.setEditable(false);
		txtRP0.setColumns(10);
		txtRP0.setBounds(796, 569, 20, 22);
		frame.getContentPane().add(txtRP0);
		
		JLabel lblRp_1 = new JLabel("RP1");
		lblRp_1.setBounds(774, 543, 30, 16);
		frame.getContentPane().add(lblRp_1);
		
		txtRP1 = new JTextField();
		txtRP1.setEditable(false);
		txtRP1.setColumns(10);
		txtRP1.setBounds(774, 569, 20, 22);
		frame.getContentPane().add(txtRP1);
		textField_1.setBounds(770, 211, 20, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblPortB = new JLabel("Port B");
		lblPortB.setBounds(770, 178, 56, 16);
		frame.getContentPane().add(lblPortB);

		JLabel lblW = new JLabel("w");
		lblW.setBounds(770, 289, 56, 16);
		frame.getContentPane().add(lblW);

		JLabel lblPc = new JLabel("PC");
		lblPc.setBounds(770, 318, 56, 16);
		frame.getContentPane().add(lblPc);

		JLabel lblNewLabel = new JLabel("FSR");
		lblNewLabel.setBounds(770, 347, 56, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblPcl = new JLabel("PCL");
		lblPcl.setBounds(770, 376, 56, 16);
		frame.getContentPane().add(lblPcl);

		JLabel lblPclatch = new JLabel("PCLATCH");
		lblPclatch.setBounds(770, 405, 56, 16);
		frame.getContentPane().add(lblPclatch);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(838, 286, 63, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(838, 315, 63, 22);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(838, 344, 63, 22);
		frame.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(838, 373, 63, 22);
		frame.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(838, 402, 63, 22);
		frame.getContentPane().add(textField_6);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(textField_11);
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(790, 211, 20, 22);
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
		textField_12.setBounds(810, 211, 20, 22);
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
		textField_13.setBounds(830, 211, 20, 22);
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
		textField_14.setBounds(850, 211, 20, 22);
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
		textField_15.setBounds(870, 211, 20, 22);
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
		textField_16.setBounds(890, 211, 20, 22);
		frame.getContentPane().add(textField_16);

		JLabel label = new JLabel("7");
		label.setBounds(774, 194, 20, 16);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("6");
		label_1.setBounds(790, 194, 20, 16);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("5");
		label_2.setBounds(810, 193, 20, 16);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("4");
		label_3.setBounds(830, 194, 20, 16);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("3");
		label_4.setBounds(850, 194, 20, 16);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("2");
		label_5.setBounds(870, 195, 20, 16);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("1");
		label_6.setBounds(890, 195, 20, 16);
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
		textField_17.setBounds(910, 211, 20, 22);
		frame.getContentPane().add(textField_17);

		JLabel label_7 = new JLabel("0");
		label_7.setBounds(910, 195, 20, 16);
		frame.getContentPane().add(label_7);

		JLabel lblPortA = new JLabel("Port A");
		lblPortA.setBounds(770, 99, 56, 16);
		frame.getContentPane().add(lblPortA);

		JLabel label_9 = new JLabel("7");
		label_9.setBounds(774, 115, 20, 16);
		frame.getContentPane().add(label_9);

		JLabel label_10 = new JLabel("6");
		label_10.setBounds(790, 115, 20, 16);
		frame.getContentPane().add(label_10);

		JLabel label_11 = new JLabel("5");
		label_11.setBounds(810, 115, 20, 16);
		frame.getContentPane().add(label_11);

		JLabel label_12 = new JLabel("4");
		label_12.setBounds(830, 115, 20, 16);
		frame.getContentPane().add(label_12);

		JLabel label_13 = new JLabel("3");
		label_13.setBounds(850, 115, 20, 16);
		frame.getContentPane().add(label_13);

		JLabel label_14 = new JLabel("2");
		label_14.setBounds(870, 116, 20, 16);
		frame.getContentPane().add(label_14);

		JLabel label_15 = new JLabel("1");
		label_15.setBounds(890, 116, 20, 16);
		frame.getContentPane().add(label_15);

		JLabel label_16 = new JLabel("0");
		label_16.setBounds(910, 116, 20, 16);
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
		textField_18.setBounds(910, 132, 20, 22);
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
		textField_19.setBounds(890, 132, 20, 22);
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
		textField_20.setBounds(870, 132, 20, 22);
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
		textField_21.setBounds(850, 132, 20, 22);
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
		textField_22.setBounds(830, 132, 20, 22);
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
		textField_23.setBounds(810, 132, 20, 22);
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
		textField_24.setBounds(790, 132, 20, 22);
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
		textField_25.setBounds(770, 132, 20, 22);
		frame.getContentPane().add(textField_25);

		JButton btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					strg.decodeNextLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
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
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					strg.decodeNextLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNext.setBounds(843, 680, 70, 25);
		frame.getContentPane().add(btnNext);

		table = new JTable();
		
		
		table.setFont(table.getFont().deriveFont(12f));
		table.setModel(new DefaultTableModel(new Object[350][3], new String[] {"M", "B", "New column"}) {
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
		table.setBounds(117, 70, 337, 5414);
		
		frame.getContentPane().add(table);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(34, 99, 715, 457);
		frame.getContentPane().add(scrollPane);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
		        int col = table.columnAtPoint(e.getPoint());
		        if (row >= 0 && col >= 0) {
		            table.setCellSelectionEnabled(true);
		            table.setSelectionBackground(new Color(0xe81e21));;
		            table.changeSelection(row, col, true, false);
		        }
			}
		});
		
		JFileChooser fileChooser = new JFileChooser();

		JButton btnLoadLstFile = new JButton("Load File...");
		btnLoadLstFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fileChooser.setCurrentDirectory(new File("./testfiles"));
				JFrame openFrame = new JFrame("open...");
				int result = fileChooser.showOpenDialog(openFrame);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					try {
						strg.fileOpened(selectedFile.getAbsolutePath());
						// delete content of old array in parser
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		btnLoadLstFile.setBounds(34, 52, 125, 25);
		frame.getContentPane().add(btnLoadLstFile);
		
		JLabel intcon_lbl = new JLabel("INTCON");
		intcon_lbl.setBounds(770, 463, 56, 16);
		frame.getContentPane().add(intcon_lbl);
		
		intcon_txt = new JTextField();
		intcon_txt.setEditable(false);
		intcon_txt.setColumns(10);
		intcon_txt.setBounds(838, 460, 63, 22);
		frame.getContentPane().add(intcon_txt);
		
		JLabel optionReg_lbl = new JLabel("option");
		optionReg_lbl.setBounds(770, 492, 56, 16);
		frame.getContentPane().add(optionReg_lbl);
		
		optionReg_txt = new JTextField();
		optionReg_txt.setEditable(false);
		optionReg_txt.setColumns(10);
		optionReg_txt.setBounds(838, 489, 63, 22);
		frame.getContentPane().add(optionReg_txt);
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
	
	
	public void setPD(int pd) {
		txtPD.setText(pd+"");
	}
	public void setTO(int to) {
		txtTO.setText(to+"");
	}
	public void setRP0(int rp0) {
		txtRP0.setText(rp0+"");
	}
	public void setRP1(int rp1) {
		txtRP1.setText(rp1+"");
	}
	public void setIRP(int irp) {
		txtIRP.setText(irp+"");
	}

	public void setTimer0(int timer0) {
		timer_txt.setText(timer0+"");
	}
	
	
	
	public void setTableRow(String text, int row) {
		table.setValueAt(text, row, 2);
		
	}
	
	public void setSelection(int startRow, int endRow, int pc) {
		
		int value = 0;
		int index = startRow ;
		String sub;// = table.getModel().getValueAt(startRow, 2).toString().substring(0, 4);
		
		while ((value != pc) && (index < endRow) ) {
			
			sub = table.getModel().getValueAt(index, 2).toString().substring(0, 4);
			if (!sub.contains(" ")) {
				value = Integer.parseInt(sub, 16);
			}
			else {
				value = 0;
			}
			
			index++;
			
		}
		table.setCellSelectionEnabled(true);
		table.changeSelection(index - 1, 2, false, false);
	}
}
