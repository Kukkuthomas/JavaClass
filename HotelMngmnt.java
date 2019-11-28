import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class HotelMngmnt {

	private JFrame frame;
	private JTextField txtCburg;
	private JTextField txtCburmeal;
	private JTextField txtCheesebur;
	private JTextField txtQty;
	private JTextField txtCur;
	private JTextField txtDrink;
	private JTextField txtMeal;
	private JTextField txtDeli;
	private JTextField txtTax;
	private JTextField txtSub;
	private JTextField txtTotal;
	private JTextField txtOut;
	
	String cbur,cburmeal,cheese,qty,cdrink,costd,cmeal,deli,crncy,sub,total;
	float tax,total1;
	float dtot,input=0;
	int tea=10,coffee=15,juice=25;
	
	int c=0,cc=0;
	private String str,str1,str2;
	float chicken=50,meals=60,ches=45;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelMngmnt window = new HotelMngmnt();
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
	public HotelMngmnt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.setBounds(100, 100, 930, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 59, 339, 220);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChickenBurger.setBounds(10, 11, 95, 14);
		panel.add(lblChickenBurger);
		
		txtCburg = new JTextField();
		txtCburg.setText("0");
		txtCburg.setBounds(148, 8, 86, 20);
		panel.add(txtCburg);
		txtCburg.setColumns(10);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChickenBurgerMeal.setBounds(10, 50, 123, 14);
		panel.add(lblChickenBurgerMeal);
		
		txtCburmeal = new JTextField();
		txtCburmeal.setText("0");
		txtCburmeal.setBounds(148, 47, 86, 20);
		panel.add(txtCburmeal);
		txtCburmeal.setColumns(10);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCheeseBurger.setBounds(10, 90, 106, 14);
		panel.add(lblCheeseBurger);
		
		txtCheesebur = new JTextField();
		txtCheesebur.setText("0");
		txtCheesebur.setBounds(148, 87, 86, 20);
		panel.add(txtCheesebur);
		txtCheesebur.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(147, 112, 219));
		separator.setBounds(20, 120, 268, 2);
		panel.add(separator);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDrink.setBounds(10, 133, 46, 14);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQty.setBounds(183, 133, 46, 14);
		panel.add(lblQty);
		
		txtQty = new JTextField();
		txtQty.setText("0");
		txtQty.setBounds(148, 158, 86, 20);
		panel.add(txtQty);
		txtQty.setColumns(10);
		
		JComboBox cmbDrink = new JComboBox();
		cmbDrink.setModel(new DefaultComboBoxModel(new String[] {"-----Select-----", "Tea", "Coffee", "Juice"}));
		cmbDrink.setBounds(10, 158, 95, 20);
		panel.add(cmbDrink);
		
// ===============Radio Button===============
		
		JRadioButton rbHome = new JRadioButton("Home Delivery");
		rbHome.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbHome.setBounds(24, 185, 109, 23);
		panel.add(rbHome);
		
		JRadioButton rbTax = new JRadioButton("Tax");
		rbTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbTax.setBounds(171, 185, 74, 23);
		panel.add(rbTax);
		
		
		JLabel lblHotelManagementSystem = new JLabel("Hotel Management System");
		lblHotelManagementSystem.setForeground(new Color(51, 153, 51));
		lblHotelManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblHotelManagementSystem.setBounds(294, 11, 441, 37);
		frame.getContentPane().add(lblHotelManagementSystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(359, 59, 244, 217);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setForeground(new Color(0, 0, 205));
		lblCurrencyConverter.setBackground(new Color(255, 69, 0));
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCurrencyConverter.setBounds(32, 11, 190, 22);
		panel_1.add(lblCurrencyConverter);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-----Select-----", "INR", "US DOLLAR"}));
		comboBox.setBounds(62, 58, 95, 20);
		panel_1.add(comboBox);
		
		txtCur = new JTextField();
		txtCur.setBounds(48, 115, 120, 20);
		panel_1.add(txtCur);
		txtCur.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setForeground(Color.BLUE);
		btnConvert.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				total = txtTotal.getText();
				float cur=Float.parseFloat(total);
					 if(comboBox.getSelectedItem()=="US DOLLAR")
				        {
				            total1 =(cur * 0.014f);
				            txtCur.setText("$ "+total1);
				        }
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConvert.setBounds(10, 166, 89, 23);
		panel_1.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.setForeground(Color.BLUE);
		btnClose.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClose.setBounds(120, 166, 89, 23);
		panel_1.add(btnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(10, 290, 339, 123);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrink = new JLabel("Cost of Drinks");
		lblCostOfDrink.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfDrink.setBounds(10, 22, 106, 14);
		panel_2.add(lblCostOfDrink);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfMeal.setBounds(10, 47, 88, 19);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfDelivery.setBounds(10, 77, 106, 14);
		panel_2.add(lblCostOfDelivery);
		
		txtDrink = new JTextField();
		txtDrink.setBounds(147, 19, 86, 20);
		panel_2.add(txtDrink);
		txtDrink.setColumns(10);
		
		txtMeal = new JTextField();
		txtMeal.setBounds(147, 46, 86, 20);
		panel_2.add(txtMeal);
		txtMeal.setColumns(10);
		
		txtDeli = new JTextField();
		txtDeli.setBounds(147, 74, 86, 20);
		panel_2.add(txtDeli);
		txtDeli.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(175, 238, 238));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(359, 290, 244, 123);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTax.setBounds(10, 11, 46, 14);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubTotal.setBounds(10, 41, 63, 14);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(10, 74, 46, 14);
		panel_3.add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setBounds(120, 8, 86, 20);
		panel_3.add(txtTax);
		txtTax.setColumns(10);
		
		txtSub = new JTextField();
		txtSub.setBounds(120, 38, 86, 20);
		panel_3.add(txtSub);
		txtSub.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(120, 71, 86, 20);
		panel_3.add(txtTotal);
		txtTotal.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(175, 238, 238));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(613, 59, 286, 357);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 39, 263, 307);
		panel_4.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_7, null);
		panel_7.setLayout(null);
		
		JTextArea txtRec = new JTextArea();
		txtRec.setBackground(new Color(255, 235, 205));
		txtRec.setBounds(10, 0, 238, 279);
		panel_7.add(txtRec);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(175, 238, 238));
		panel_6.setForeground(new Color(106, 90, 205));
		tabbedPane.addTab("Calculator", null, panel_6, null);
		panel_6.setLayout(null);
		
		txtOut = new JTextField();
		txtOut.setBounds(10, 11, 214, 25);
		panel_6.add(txtOut);
		txtOut.setColumns(10);
		
		JButton bb = new JButton("B");
		bb.setBounds(10, 46, 49, 36);
		panel_6.add(bb);
		
		JButton bc = new JButton("C");
		bc.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txtOut.setText("");
			}
		});
		bc.setBounds(69, 46, 49, 36);
		panel_6.add(bc);
		
		JButton button = new JButton("....");
		button.setBounds(128, 46, 49, 36);
		panel_6.add(button);
		
		JButton badd = new JButton("+");
		badd.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				str=txtOut.getText();
				txtOut.setText("");
				str2="add";
			}
		});
		badd.setBounds(183, 46, 49, 36);
		panel_6.add(badd);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					txtOut.setText("");
					c=0;
				}
				txtOut.setText(txtOut.getText().concat(b7.getText()));
			}
		});
		b7.setBounds(10, 92, 49, 36);
		panel_6.add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					txtOut.setText("");
					c=0;
				}
				txtOut.setText(txtOut.getText().concat(b8.getText()));
			}
		});
		b8.setBounds(69, 92, 49, 36);
		panel_6.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					txtOut.setText("");
					c=0;
				}
				txtOut.setText(txtOut.getText().concat(b9.getText()));
			}
		});
		b9.setBounds(128, 92, 49, 36);
		panel_6.add(b9);
		
		JButton bmin = new JButton("-");
		bmin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				str=txtOut.getText();
				txtOut.setText("");
				str2="sub";
			}
		});
		bmin.setBounds(183, 92, 49, 36);
		panel_6.add(bmin);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					txtOut.setText("");
					c=0;
				}
				txtOut.setText(txtOut.getText().concat(b4.getText()));
			}
		});
		b4.setBounds(10, 139, 49, 36);
		panel_6.add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					txtOut.setText("");
					c=0;
				}
				txtOut.setText(txtOut.getText().concat(b5.getText()));
			}
		});
		b5.setBounds(69, 139, 49, 36);
		panel_6.add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					txtOut.setText("");
					c=0;
				}
				txtOut.setText(txtOut.getText().concat(b6.getText()));
			}
		});
		b6.setBounds(128, 139, 49, 36);
		panel_6.add(b6);
		
		JButton bstr = new JButton("*");
		bstr.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				str=txtOut.getText();
				txtOut.setText("");
				str2="mul";
			}
		});
		bstr.setBounds(183, 139, 49, 36);
		panel_6.add(bstr);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					txtOut.setText("");
					c=0;
				}
				txtOut.setText(txtOut.getText().concat(b1.getText()));
			}
		});
		b1.setBounds(10, 186, 49, 36);
		panel_6.add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					txtOut.setText("");
					c=0;
				}
				txtOut.setText(txtOut.getText().concat(b2.getText()));
			}
		});
		b2.setBounds(69, 186, 49, 36);
		panel_6.add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					txtOut.setText("");
					c=0;
				}
				txtOut.setText(txtOut.getText().concat(b3.getText()));
			}
		});
		b3.setBounds(128, 186, 49, 36);
		panel_6.add(b3);
		
		JButton bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				str=txtOut.getText();
				txtOut.setText("");
				str2="div";
			}
		});
		bdiv.setBounds(183, 186, 49, 36);
		panel_6.add(bdiv);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					txtOut.setText("");
					c=0;
				}
				txtOut.setText(txtOut.getText().concat(b0.getText()));
			}
		});
		b0.setBounds(10, 233, 49, 36);
		panel_6.add(b0);
		
		JButton bdot = new JButton(".");
		bdot.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					txtOut.setText("");
					c=0;
					cc=0;
					
				}
				if(cc==0)
				{
					txtOut.setText(txtOut.getText().concat(bdot.getText()));
					cc=1;
				}
			}
		});
		bdot.setBounds(69, 233, 49, 36);
		panel_6.add(bdot);
		
		JButton button_16 = new JButton("...");
		button_16.setBounds(128, 233, 49, 36);
		panel_6.add(button_16);
		
		JButton beq = new JButton("=");
		beq.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				c=1;
				str1=txtOut.getText();
				txtOut.setText("");
				float f=Float.parseFloat(str);
				float s=Float.parseFloat(str1);
								
				if(str2.equals("add"))
				{
					float  result=f+s;
					String Res=String.valueOf(result);
					txtOut.setText(Res);
				}
				if(str2.equals("sub"))
				{
					float  result=f-s;
					String Res=String.valueOf(result);
					txtOut.setText(Res);
				}
				if(str2.equals("mul"))
				{
					float  result=f*s;
					String Res=String.valueOf(result);
					txtOut.setText(Res);
				}
				if(str2.equals("div"))
				{
					float  result=f/s;
					String Res=String.valueOf(result);
					txtOut.setText(Res);
				}
			}
		});
		beq.setBounds(183, 233, 49, 36);
		panel_6.add(beq);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(175, 238, 238));
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(10, 424, 888, 46);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setForeground(new Color(51, 153, 51));
		btnTotal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
	
				float homed=30;
				
				cbur=txtCburg.getText();
				float cb=Float.parseFloat(cbur);
				float chp=chicken*cb;
				
				cburmeal=txtCburmeal.getText();
				float meal=Float.parseFloat(cburmeal);
				float ml=meals*meal;
				
				cheese=txtCheesebur.getText();
				float chs=Float.parseFloat(cheese);
				float cs=ches*chs;
				
				cdrink=(String) cmbDrink.getSelectedItem();
				
				
				qty=txtQty.getText();	
				float q=Float.parseFloat(qty);
				
				costd=txtDrink.getText();
				cmeal=txtMeal.getText();
				deli=txtDeli.getText();	
				String hd=String.valueOf(homed);
				txtDeli.setText(hd);
				
				crncy=txtCur.getText();
				
				
				if(cdrink.equals("Tea"))
				{
					 dtot=q*10;
				}
				if(cdrink.equals("Coffee"))
				{
					 dtot=q*15;
				}
				if(cdrink.equals("Juice"))
				{
					 dtot=q*25;
				}
				String ss=String.valueOf(dtot);
				txtDrink.setText(ss);
				
				float mealcost=chp+ml+cs;
				String ms=String.valueOf(mealcost);
				txtMeal.setText(ms);
				
				if(rbTax.isSelected())
					tax=(float) ((float)(dtot+mealcost)*.02);
				else
					tax=0;
				String tt=String.valueOf(tax);
				txtTax.setText(tt);
				
				float subt=dtot+mealcost;
				String st=String.valueOf(subt);
				txtSub.setText(st);
				
				float grandtot=subt+tax;
				String gt=String.valueOf(grandtot);
				txtTotal.setText(gt);
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTotal.setBounds(65, 11, 89, 23);
		panel_5.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.setForeground(new Color(51, 153, 51));
		btnReceipt.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String s1=txtCburg.getText();
				float s11=Float.parseFloat(s1);
				float s12=s11*50;
				String str1=String.valueOf(s12);
				
				String k1=txtCburmeal.getText();
				float k11=Float.parseFloat(k1);
				float k12=k11*60;
				String str2=String.valueOf(k12);
				
				String h1=txtCheesebur.getText();
				float h11=Float.parseFloat(h1);
				float h12=h11*45;
				String str3=String.valueOf(h12);
				
				qty=txtQty.getText();
				int qt=Integer.parseInt(qty);
				
				cdrink=(String) cmbDrink.getSelectedItem();
				if(cdrink.equals("Tea"))
				{
					 dtot=qt*10;
				}
				if(cdrink.equals("Coffee"))
				{
					 dtot=qt*15;
				}
				if(cdrink.equals("Juice"))
				{
					 dtot=qt*25;
				}
				String ss1=String.valueOf(dtot);
				
				int bno=101;
				txtRec.append("\tHotel Bill\n\n"
						+ "Bill No : "+bno+"\n"
						+ "Item\tQty\tPrice\n"
						+ " ================================\n"
						+ "Chicken Burger\t"+txtCburg.getText() +"\t"+ str1
						+ "\nC B Meals\t" +txtCburmeal.getText()+"\t"+ str2
						+ "\nCheese\t" +txtCheesebur.getText()+"\t"+ str3
						+ "\n"+cdrink+"\t" +qty+"\t"+ ss1
						+"\n ================================"
						+ "\n Sub Total:\t\t" + txtSub.getText()
						+ "\n Tax:\t\t" + txtTax.getText()
						+ "\n Grand Total:\t\t" + txtTotal.getText() + "\n\n"
						+ "\t**Thank you** \n"
						); 
				bno++;
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReceipt.setBounds(287, 11, 89, 23);
		panel_5.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(51, 153, 51));
		btnReset.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txtCburg.setText("0");
				txtCburmeal.setText("0");
				txtCheesebur.setText("0");
				cmbDrink.setSelectedIndex(0);
				txtQty.setText("0");
				rbHome.setSelected(false);
				rbTax.setSelected(false);
				txtDrink.setText("");
				txtMeal.setText("");
				txtDeli.setText("");
				comboBox.setSelectedIndex(0);
				txtCur.setText("");
				txtTax.setText("");
				txtSub.setText("");
				txtTotal.setText("");
				txtRec.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(511, 11, 89, 23);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(51, 153, 51));
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBounds(732, 11, 89, 23);
		panel_5.add(btnExit);
	}
}
