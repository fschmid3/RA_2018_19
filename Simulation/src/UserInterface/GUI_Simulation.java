package UserInterface;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
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
import javax.swing.JFileChooser;
import java.io.File;   

public class GUI_Simulation {

	private JFrame frame;
	private JTextField portBPin7_txt;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtPD;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField portBPin6_txt;
	private JTextField portBPin5_txt;
	private JTextField portBPin4_txt;
	private JTextField portBPin3_txt;
	private JTextField portBPin2_txt;
	private JTextField portBPin1_txt;
	private JTextField portBPin0_txt;
	private JTextField portAPin0_txt;
	private JTextField portAPin1_txt;
	private JTextField portAPin2_txt;
	private JTextField portAPin3_txt;
	private JTextField portAPin4_txt;
	private JTextField portAPin5_txt;
	private JTextField portAPin6_txt;
	private JTextField portAPin7_txt;
	private JTable table;
	private Control strg;
	private JTextField timer_txt;
	private JTextField intcon_txt;
	private JTextField optionReg_txt;
	private JTextField txtTO;
	private JTextField txtRP0;
	private JTextField txtRP1;
	private JTextField txtIRP;
	
	
	private boolean stopPressed = false; 

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

		portBPin7_txt = new JTextField();
		portBPin7_txt.setEditable(false);
		portBPin7_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portBPin7_txt);
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
		portBPin7_txt.setBounds(770, 211, 20, 22);
		frame.getContentPane().add(portBPin7_txt);
		portBPin7_txt.setColumns(10);

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

		portBPin6_txt = new JTextField();
		portBPin6_txt.setEditable(false);
		portBPin6_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portBPin6_txt);
			}
		});
		portBPin6_txt.setColumns(10);
		portBPin6_txt.setBounds(790, 211, 20, 22);
		frame.getContentPane().add(portBPin6_txt);

		portBPin5_txt = new JTextField();
		portBPin5_txt.setEditable(false);
		portBPin5_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portBPin5_txt);
			}
		});
		portBPin5_txt.setColumns(10);
		portBPin5_txt.setBounds(810, 211, 20, 22);
		frame.getContentPane().add(portBPin5_txt);

		portBPin4_txt = new JTextField();
		portBPin4_txt.setEditable(false);
		portBPin4_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switchBit(portBPin4_txt);
			}
		});
		portBPin4_txt.setColumns(10);
		portBPin4_txt.setBounds(830, 211, 20, 22);
		frame.getContentPane().add(portBPin4_txt);

		portBPin3_txt = new JTextField();
		portBPin3_txt.setEditable(false);
		portBPin3_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portBPin3_txt);
			}
		});
		portBPin3_txt.setColumns(10);
		portBPin3_txt.setBounds(850, 211, 20, 22);
		frame.getContentPane().add(portBPin3_txt);

		portBPin2_txt = new JTextField();
		portBPin2_txt.setEditable(false);
		portBPin2_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portBPin2_txt);
			}
		});
		portBPin2_txt.setColumns(10);
		portBPin2_txt.setBounds(870, 211, 20, 22);
		frame.getContentPane().add(portBPin2_txt);

		portBPin1_txt = new JTextField();
		portBPin1_txt.setEditable(false);
		portBPin1_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portBPin1_txt);
			}
		});
		portBPin1_txt.setColumns(10);
		portBPin1_txt.setBounds(890, 211, 20, 22);
		frame.getContentPane().add(portBPin1_txt);

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

		portBPin0_txt = new JTextField();
		portBPin0_txt.setEditable(false);
		portBPin0_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portBPin0_txt);
			}
		});
		portBPin0_txt.setColumns(10);
		portBPin0_txt.setBounds(910, 211, 20, 22);
		frame.getContentPane().add(portBPin0_txt);

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

		portAPin0_txt = new JTextField();
		portAPin0_txt.setEditable(false);
		portAPin0_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portAPin0_txt);
			}
		});
		portAPin0_txt.setColumns(10);
		portAPin0_txt.setBounds(910, 132, 20, 22);
		frame.getContentPane().add(portAPin0_txt);

		portAPin1_txt = new JTextField();
		portAPin1_txt.setEditable(false);
		portAPin1_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portAPin1_txt);
			}
		});
		portAPin1_txt.setColumns(10);
		portAPin1_txt.setBounds(890, 132, 20, 22);
		frame.getContentPane().add(portAPin1_txt);

		portAPin2_txt = new JTextField();
		portAPin2_txt.setEditable(false);
		portAPin2_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portAPin2_txt);
			}
		});
		portAPin2_txt.setColumns(10);
		portAPin2_txt.setBounds(870, 132, 20, 22);
		frame.getContentPane().add(portAPin2_txt);

		portAPin3_txt = new JTextField();
		portAPin3_txt.setEditable(false);
		portAPin3_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portAPin3_txt);
			}
		});
		portAPin3_txt.setColumns(10);
		portAPin3_txt.setBounds(850, 132, 20, 22);
		frame.getContentPane().add(portAPin3_txt);

		portAPin4_txt = new JTextField();
		portAPin4_txt.setEditable(false);
		portAPin4_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portAPin4_txt);
			}
		});
		portAPin4_txt.setColumns(10);
		portAPin4_txt.setBounds(830, 132, 20, 22);
		frame.getContentPane().add(portAPin4_txt);

		portAPin5_txt = new JTextField();
		portAPin5_txt.setEditable(false);
		portAPin5_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portAPin5_txt);
			}
		});
		portAPin5_txt.setColumns(10);
		portAPin5_txt.setBounds(810, 132, 20, 22);
		frame.getContentPane().add(portAPin5_txt);

		portAPin6_txt = new JTextField();
		portAPin6_txt.setEditable(false);
		portAPin6_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portAPin6_txt);
			}
		});
		portAPin6_txt.setColumns(10);
		portAPin6_txt.setBounds(790, 132, 20, 22);
		frame.getContentPane().add(portAPin6_txt);

		portAPin7_txt = new JTextField();
		portAPin7_txt.setEditable(false);
		portAPin7_txt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchBit(portAPin7_txt);
			}
		});
		portAPin7_txt.setColumns(10);
		portAPin7_txt.setBounds(770, 132, 20, 22);
		frame.getContentPane().add(portAPin7_txt);

		JButton btnRun = new JButton("Run all");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stopPressed = false;
				Thread t = new Thread(){
				    public void run(){
				    	boolean decode = true;
						// TODO Auto-generated method stub
						while(!stopPressed && decode) {
							try {
								decode = strg.decodeNextLine() ;
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
				      }
				    };
				t.start();
			}
		});
		btnRun.setBounds(616, 638, 108, 35);
		frame.getContentPane().add(btnRun);

		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stopPressed = true;
			}
		});
		btnStop.setBounds(637, 680, 70, 25);
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
		btnNext.setBounds(796, 680, 70, 25);
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
		
		JButton btn_stepByStep = new JButton("Step by Step");
		btn_stepByStep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					strg.decodeNextLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btn_stepByStep.setBounds(776, 638, 108, 35);
		frame.getContentPane().add(btn_stepByStep);
		
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

	public void setOption(int option) {
		optionReg_txt.setText(option+"");
	}
	public void setINTCON(int intcon) {
		intcon_txt.setText(intcon+"");
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
	
	
	
	
	//gets number from register and takes bits out of it and sets in Port A pins
	public void setPortA(int portA) {
		portAPin7_txt.setText(((portA & 0x80)/128)+"");
		portAPin6_txt.setText(((portA & 0x40)/64)+"");
		portAPin5_txt.setText(((portA & 0x20)/32)+"");
		portAPin4_txt.setText(((portA & 0x10)/16)+"");
		portAPin3_txt.setText(((portA & 0x08)/8)+"");
		portAPin2_txt.setText(((portA & 0x04)/4)+"");
		portAPin1_txt.setText(((portA & 0x02)/2)+"");
		portAPin0_txt.setText((portA & 0x01)+"");
	}
	
	
	//takes all Pins of Port A and merges in a Number that will be returned
	public int getPortA() {
		int portA = 0;

		portA += Integer.parseInt(portAPin7_txt.getText())*128;
		portA += Integer.parseInt(portAPin6_txt.getText())*64;
		portA += Integer.parseInt(portAPin5_txt.getText())*32;
		portA += Integer.parseInt(portAPin4_txt.getText())*16;
		portA += Integer.parseInt(portAPin3_txt.getText())*8;
		portA += Integer.parseInt(portAPin2_txt.getText())*4;
		portA += Integer.parseInt(portAPin1_txt.getText())*2;
		portA += Integer.parseInt(portAPin0_txt.getText());
		
		return portA;
	}
	

	//gets number from register and takes bits out of it and sets in Port B pins
	public void setPortB(int portB) {
		portBPin7_txt.setText(((portB & 0x80)/128)+"");
		portBPin6_txt.setText(((portB & 0x40)/64)+"");
		portBPin5_txt.setText(((portB & 0x20)/32)+"");
		portBPin4_txt.setText(((portB & 0x10)/16)+"");
		portBPin3_txt.setText(((portB & 0x08)/8)+"");
		portBPin2_txt.setText(((portB & 0x04)/4)+"");
		portBPin1_txt.setText(((portB & 0x02)/2)+"");
		portBPin0_txt.setText((portB & 0x01)+"");
	}
	
	

	//takes all Pins of Port B and merges in a Number that will be returned
	public int getPortB() {
		int portB = 0;
		
		portB += Integer.parseInt(portBPin7_txt.getText())*128;
		portB += Integer.parseInt(portBPin6_txt.getText())*64;
		portB += Integer.parseInt(portBPin5_txt.getText())*32;
		portB += Integer.parseInt(portBPin4_txt.getText())*16;
		portB += Integer.parseInt(portBPin3_txt.getText())*8;
		portB += Integer.parseInt(portBPin2_txt.getText())*4;
		portB += Integer.parseInt(portBPin1_txt.getText())*2;
		portB += Integer.parseInt(portBPin0_txt.getText());
		
		return portB;
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
