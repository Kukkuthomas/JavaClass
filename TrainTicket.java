import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class TrainTicket {

	private JFrame frame;
	private JTextField txtName1;
	private JTextField txtF;
	private JTextField txtT;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicket;
	private JTextField txtPrice;
	private JTextField txtRoute;
	private JTextField txtName;
	private JTextField txtTax;
	private JTextField txtSub;
	private JTextField txtTotal;
	private JTable table;
	private JTable table_1;
	private JTable tableN;
    
	String name,coach,from,to,no,tax,sub,total,fir,date,time,tot,acnon;
	
	float charge,taxx,totalc;
	
	int tno=1000;
	String tic=String.valueOf(tno);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrainTicket window = new TrainTicket();
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
	public TrainTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 832, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(410, 60, 396, 319);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblName.setBounds(21, 30, 81, 28);
		panel.add(lblName);
		
		txtName1 = new JTextField();
		txtName1.setBounds(104, 37, 107, 21);
		panel.add(txtName1);
		txtName1.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFrom.setBounds(21, 104, 46, 14);
		panel.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTo.setBounds(21, 146, 46, 14);
		panel.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDate.setBounds(21, 187, 46, 14);
		panel.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTime.setBounds(21, 240, 46, 14);
		panel.add(lblTime);
		
		txtF = new JTextField();
		txtF.setBounds(104, 101, 86, 20);
		panel.add(txtF);
		txtF.setColumns(10);
		
		txtT = new JTextField();
		txtT.setBounds(104, 143, 86, 20);
		panel.add(txtT);
		txtT.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setBounds(104, 187, 86, 20);
		panel.add(txtDate);
		txtDate.setColumns(10);
		
		txtTime = new JTextField();
		txtTime.setBounds(104, 237, 86, 20);
		panel.add(txtTime);
		txtTime.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTicketNo.setBounds(293, 104, 67, 14);
		panel.add(lblTicketNo);
		
		txtTicket = new JTextField();
		txtTicket.setBounds(274, 119, 86, 20);
		panel.add(txtTicket);
		txtTicket.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrice.setBounds(293, 167, 46, 14);
		panel.add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(274, 184, 86, 20);
		panel.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtRoute = new JTextField();
		txtRoute.setBounds(274, 247, 86, 20);
		panel.add(txtRoute);
		txtRoute.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRoute.setBounds(293, 226, 46, 14);
		panel.add(lblRoute);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String k=txtName1.getText();
				String k1=txtF.getText();
				String k2=txtT.getText();
				String k3=txtDate.getText();
				String k4=txtTime.getText();
				String k5=txtPrice.getText();
				String tic=String.valueOf(tno);
				
				
				String[] r= {k,tic,k1,k2,no,k3,k4,acnon,k5};
				DefaultTableModel model=(DefaultTableModel) tableN.getModel();
				model.addRow(r);
	
				tno++;
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConfirm.setBounds(157, 285, 89, 23);
		panel.add(btnConfirm);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 401, 796, 99);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		tableN = new JTable();
		tableN.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No of Seat", "Time", "Date", "AC/Non AC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		tableN.setBounds(10, 11, 776, 77);
		panel_1.add(tableN);
		
				
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTicketBooking.setBounds(285, 26, 229, 35);
		frame.getContentPane().add(lblTicketBooking);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblName_1.setBounds(27, 83, 88, 23);
		frame.getContentPane().add(lblName_1);
		
		txtName = new JTextField();
		txtName.setBounds(157, 88, 86, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 117, 375, 12);
		frame.getContentPane().add(separator);
		
		JRadioButton rbStandard = new JRadioButton("Standard");
		rbStandard.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbStandard.setBounds(6, 137, 109, 23);
		frame.getContentPane().add(rbStandard);
		
		JRadioButton rbSingle = new JRadioButton("Single Ticket");
		rbSingle.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbSingle.setBounds(134, 137, 109, 23);
		frame.getContentPane().add(rbSingle);
		
		JRadioButton rbAdult = new JRadioButton("Adult");
		rbAdult.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbAdult.setBounds(276, 137, 86, 23);
		frame.getContentPane().add(rbAdult);
		
		JRadioButton rbFirst = new JRadioButton("First Class");
		rbFirst.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbFirst.setBounds(10, 163, 100, 23);
		frame.getContentPane().add(rbFirst);
		
		JRadioButton rbAc = new JRadioButton("AC");
		rbAc.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbAc.setBounds(121, 163, 57, 23);
		frame.getContentPane().add(rbAc);
		
		JRadioButton rbSleep = new JRadioButton("Sleeper");
		rbSleep.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbSleep.setBounds(180, 163, 77, 23);
		frame.getContentPane().add(rbSleep);
		
		JRadioButton rbChild = new JRadioButton("Child");
		rbChild.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbChild.setBounds(285, 163, 88, 23);
		frame.getContentPane().add(rbChild);
		
		JComboBox cmbF = new JComboBox();
		cmbF.setModel(new DefaultComboBoxModel(new String[] {"----Select----", "Ekm", "Kottayam", "Kollam"}));
		cmbF.setBounds(15, 205, 100, 20);
		frame.getContentPane().add(cmbF);
		
		JComboBox cmbT = new JComboBox();
		cmbT.setModel(new DefaultComboBoxModel(new String[] {"----Select----", "Ekm", "Kottayam", "Kollam"}));
		cmbT.setBounds(134, 205, 109, 20);
		frame.getContentPane().add(cmbT);
		
		JComboBox cmbN = new JComboBox();
		cmbN.setModel(new DefaultComboBoxModel(new String[] {"----Select----", "1", "2", "3", "4", "5"}));
		cmbN.setBounds(253, 205, 102, 20);
		frame.getContentPane().add(cmbN);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 236, 375, 12);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTax.setBounds(27, 248, 46, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubTotal.setBounds(27, 283, 57, 14);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(27, 318, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setBounds(144, 245, 99, 20);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSub = new JTextField();
		txtSub.setBounds(144, 280, 99, 20);
		frame.getContentPane().add(txtSub);
		txtSub.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(144, 315, 99, 20);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(10, 343, 375, 12);
		frame.getContentPane().add(separator_2);
		
		ButtonGroup group=new ButtonGroup();
		group.add(rbStandard);
		group.add(rbSingle);
		group.add(rbAdult);
		group.add(rbChild);
		
		ButtonGroup group1=new ButtonGroup();
		group1.add(rbFirst);
		group1.add(rbAc);
		group1.add(rbSleep);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String firs;
				
				name=txtName.getText();	
	
				
				from=(String) cmbF.getSelectedItem();
				to=(String) cmbT.getSelectedItem();
				no=(String) cmbN.getSelectedItem();
				
				if(from.equals("Ekm") && to.equals("Kottayam")||from.equals("Kottayam") && to.equals("Ekm"))
				{
					charge=50;
				}
				if(from.equals("Ekm") && to.equals("Kollam")||from.equals("Kollam") && to.equals("Ekm"))
				{
					charge=90;
				}
				if(from.equals("Kottayam") && to.equals("Kollam")||from.equals("Kollam") && to.equals("Kottayam"))
				{
					charge=60;
				}
				if(from.equals("Kottayam") && to.equals("Kottayam")||from.equals("Kottayam") && to.equals("Kottayam"))
				{
					JOptionPane.showMessageDialog(null,"Enter valid destination","Ticket Details", JOptionPane.OK_OPTION);
					
					cmbT.setSelectedIndex(0);
					cmbN.setSelectedIndex(0);
					txtTax.setText("");
					txtSub.setText("");
					txtTotal.setText("");
					txtName1.setText("");
					txtF.setText("");
					txtT.setText("");
					txtDate.setText("");
					txtTime.setText("");
					txtTicket.setText("");
					txtPrice.setText("");
					txtRoute.setText("");
				}
				if(from.equals("Kollam") && to.equals("Kollam")||from.equals("Kollam") && to.equals("Kollam"))
				{
					JOptionPane.showMessageDialog(null,"Enter valid destination","Ticket Details", JOptionPane.OK_OPTION);
					cmbT.setSelectedIndex(0);
					cmbN.setSelectedIndex(0);
					txtTax.setText("");
					txtSub.setText("");
					txtTotal.setText("");
					txtName1.setText("");
					txtF.setText("");
					txtT.setText("");
					txtDate.setText("");
					txtTime.setText("");
					txtTicket.setText("");
					txtPrice.setText("");
					txtRoute.setText("");
				}
				if(from.equals("Ekm") && to.equals("Ekm")||from.equals("Ekm") && to.equals("Ekm"))
				{
					JOptionPane.showMessageDialog(null,"Enter valid destination","Ticket Details", JOptionPane.OK_OPTION);
					cmbT.setSelectedIndex(0);
					cmbN.setSelectedIndex(0);
					txtTax.setText("");
					txtSub.setText("");
					txtTotal.setText("");
					txtName1.setText("");
					txtF.setText("");
					txtT.setText("");
					txtDate.setText("");
					txtTime.setText("");
					txtTicket.setText("");
					txtPrice.setText("");
					txtRoute.setText("");
				}
				
				String num=(String) cmbN.getSelectedItem();
				int number=Integer.parseInt(num);
				if(rbFirst.isSelected())
				{
					charge=charge+((charge*20)/100);
					totalc=(number*charge);
					taxx=(totalc*10)/100;
					acnon="Non AC";
				}
				if(rbAc.isSelected())
				{
					charge=charge+((charge*30)/100);
					totalc=(number*charge);
					taxx=(totalc*20)/100;
					acnon="AC";
				}
				if(rbSleep.isSelected())
				{
					charge=charge+((charge*25)/100);
					totalc=(number*charge);
					taxx=(totalc*15)/100;
					acnon="Non AC";
				}
				
				
				String ta=String.valueOf(taxx);
				txtTax.setText(ta);
				
				String sb=String.valueOf(totalc);
				txtSub.setText(sb);
				//txtTo.setText(taxx);
				
				float ttt=totalc+taxx;
				tot=String.valueOf(ttt);
				txtTotal.setText(tot);
				
				txtName1.setText(txtName.getText());
				
				txtF.setText(from);
				txtT.setText(to);
				
				LocalDate m=java.time.LocalDate.now();
				date=String.valueOf(m);
				txtDate.setText(date);
				
				LocalTime t=java.time.LocalTime.now();
				time=String.valueOf(t);
				txtTime.setText(time);
				
				txtTicket.setText(String.valueOf(tno));
				
				txtPrice.setText(tot);
				txtRoute.setText("Any");
				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTotal.setBounds(26, 367, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				txtName.setText("");
				group.clearSelection();
				group1.clearSelection();
				cmbF.setSelectedIndex(0);
				cmbT.setSelectedIndex(0);
				cmbN.setSelectedIndex(0);
				txtTax.setText("");
				txtSub.setText("");
				txtTotal.setText("");
				txtName1.setText("");
				txtF.setText("");
				txtT.setText("");
				txtDate.setText("");
				txtTime.setText("");
				txtTicket.setText("");
				txtPrice.setText("");
				txtRoute.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(154, 367, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btExit = new JButton("Exit");
		btExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		btExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btExit.setBounds(273, 367, 89, 23);
		frame.getContentPane().add(btExit);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(386, 117, 14, 271);
		frame.getContentPane().add(separator_3);
		
		
	}
}
