import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.*;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JRadioButton;
import javax.swing.ScrollPaneConstants;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import java.sql.*;

public class test {

	private JFrame frmStudentCouncilVoting;
	private JButton buttonP1;
	private JButton buttonP2;
	private JButton buttonP3;
	private JButton buttonVP1;
	private JButton buttonVP2;
	private JButton buttonVP3;
	private JButton buttonS1;
	private JButton buttonS2;
	private JButton buttonS3;
	private JButton buttonT1;
	private JButton buttonT2;
	private JButton buttonT3;
	private JButton buttonSC1;
	private JButton buttonSC2;
	private JButton buttonSC3;
	private JButton buttonMA1;
	private JButton buttonMA2;
	private JButton buttonMA3;
	private JButton buttonFA1;
	private JButton buttonFA2;
	private JButton buttonFA3;
	private JButton buttonPR1;
	private JButton buttonPR2;
	private JButton buttonPR3;
	private JButton buttonRV1;
	private JButton buttonRV2;
	private JButton buttonRV3;
	private JButton buttonAR1;
	private JButton buttonAR2;
	private JButton buttonAR3;
	private JButton buttonIT1;
	private JButton buttonIT2;
	private JButton buttonIT3;
	private JLabel P1Name;
	private JLabel P2Name;
	private JLabel P3Name;
	private JLabel VP1Name;
	private JLabel VP2Name;
	private JLabel VP3Name;
	private JLabel S1Name;
	private JLabel S2Name;
	private JLabel S3Name;
	private JLabel T1Name;
	private JLabel T2Name;
	private JLabel T3Name;
	private JLabel SC1Name;
	private JLabel SC2Name;
	private JLabel SC3Name;
	private JLabel MA1Name;
	private JLabel MA2Name;
	private JLabel MA3Name;
	private JLabel FA1Name;
	private JLabel FA2Name;
	private JLabel FA3Name;
	private JLabel PR1Name;
	private JLabel PR2Name;
	private JLabel PR3Name;
	private JLabel RV1Name;
	private JLabel RV2Name;
	private JLabel RV3Name;
	private JLabel AR1Name;
	private JLabel AR2Name;
	private JLabel AR3Name;
	private JLabel IT1Name;
	private JLabel IT2Name;
	private JLabel IT3Name;
	private String pIs = "";
	private String vpIs = "";
	private String sIs = "";
	private String tIs = "";
	private String scIs = "";
	private String maIs = "";
	private String faIs = "";
	private String prIs = "";
	private String rvIs = "";
	private String arIs = "";
	private String itIs = "";
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private int grade = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frmStudentCouncilVoting.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentCouncilVoting = new JFrame();
		frmStudentCouncilVoting.setResizable(false);
		frmStudentCouncilVoting.getContentPane().setBackground(Color.WHITE);
		frmStudentCouncilVoting.setTitle("Student Council Voting System");
		frmStudentCouncilVoting.setBounds(150, 100, 1350, 700);
		frmStudentCouncilVoting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentCouncilVoting.getContentPane().setLayout(null);
		Connector connect = new Connector();
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBounds(0, 514, 1347, 158);
		frmStudentCouncilVoting.getContentPane().add(toolBar);
		
		JButton presC = new JButton("\r\n");
		presC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pIs = "";
				BufferedImage cI = connect.getNullPicture(2);
				presC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
			}
		});
		BufferedImage cI = connect.getNullPicture(2);
		presC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		toolBar.add(presC);
		
		JButton vpC = new JButton("");
		vpC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vpIs = "";
				BufferedImage cI = connect.getNullPicture(2);
				vpC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
			}
		});
		vpC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		toolBar.add(vpC);
		
		JButton secretaryC = new JButton("");
		secretaryC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sIs = "";
				BufferedImage cI = connect.getNullPicture(2);
				secretaryC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
			}
		});
		secretaryC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		toolBar.add(secretaryC);
		
		JButton treasurerC = new JButton("");
		treasurerC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tIs = "";
				BufferedImage cI = connect.getNullPicture(2);
				treasurerC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
			}
		});
		treasurerC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		toolBar.add(treasurerC);
		
		JButton sportsC = new JButton("");
		sportsC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scIs = "";
				BufferedImage cI = connect.getNullPicture(2);
				sportsC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
			}
		});
		sportsC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		toolBar.add(sportsC);
		
		JButton maleC = new JButton("");
		maleC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maIs = "";
				BufferedImage cI = connect.getNullPicture(2);
				maleC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
			}
		});
		maleC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		toolBar.add(maleC);
		
		JButton femaleC = new JButton("");
		femaleC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faIs = "";
				BufferedImage cI = connect.getNullPicture(2);
				femaleC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
			}
		});
		femaleC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		toolBar.add(femaleC);
		
		JButton prC = new JButton("");
		prC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prIs = "";
				BufferedImage cI = connect.getNullPicture(2);
				prC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
			}
		});
		prC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		toolBar.add(prC);
		
		JButton artistC = new JButton("");
		artistC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arIs = "";
				BufferedImage cI = connect.getNullPicture(2);
				artistC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
			}
		});
		artistC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		toolBar.add(artistC);
		
		JButton religiousC = new JButton("");
		religiousC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rvIs = "";
				BufferedImage cI = connect.getNullPicture(2);
				religiousC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
			}
		});
		religiousC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		toolBar.add(religiousC);
		
		JButton itC = new JButton("");
		itC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itIs = "";
				BufferedImage cI = connect.getNullPicture(2);
				itC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
			}
		});
		itC.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		toolBar.add(itC);
		
		JLabel lblNewLabel = new JLabel("President");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(32, 489, 74, 14);
		frmStudentCouncilVoting.getContentPane().add(lblNewLabel);
		
		JLabel lblVicePresident = new JLabel("Vice President");
		lblVicePresident.setHorizontalAlignment(SwingConstants.LEFT);
		lblVicePresident.setBounds(153, 489, 85, 14);
		frmStudentCouncilVoting.getContentPane().add(lblVicePresident);
		
		JLabel lblSecretary = new JLabel("Secretary");
		lblSecretary.setHorizontalAlignment(SwingConstants.LEFT);
		lblSecretary.setBounds(288, 489, 74, 14);
		frmStudentCouncilVoting.getContentPane().add(lblSecretary);
		
		JLabel lblTreasurer = new JLabel("Treasurer");
		lblTreasurer.setHorizontalAlignment(SwingConstants.LEFT);
		lblTreasurer.setBounds(411, 489, 63, 14);
		frmStudentCouncilVoting.getContentPane().add(lblTreasurer);
		
		JLabel lblSport = new JLabel("Sports Coordinator");
		lblSport.setHorizontalAlignment(SwingConstants.LEFT);
		lblSport.setBounds(502, 489, 115, 14);
		frmStudentCouncilVoting.getContentPane().add(lblSport);
		
		JLabel lblMaleAthelete = new JLabel("Male Athlete");
		lblMaleAthelete.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaleAthelete.setBounds(644, 489, 85, 14);
		frmStudentCouncilVoting.getContentPane().add(lblMaleAthelete);
		
		JLabel lblFamaleAthlete = new JLabel("Female Athlete");
		lblFamaleAthlete.setHorizontalAlignment(SwingConstants.LEFT);
		lblFamaleAthlete.setBounds(763, 489, 98, 14);
		frmStudentCouncilVoting.getContentPane().add(lblFamaleAthlete);
		
		JLabel lblArtist = new JLabel("Artist");
		lblArtist.setHorizontalAlignment(SwingConstants.LEFT);
		lblArtist.setBounds(1149, 489, 74, 14);
		frmStudentCouncilVoting.getContentPane().add(lblArtist);
		
		JLabel lblPublicRelations = new JLabel("Public Relations");
		lblPublicRelations.setHorizontalAlignment(SwingConstants.CENTER);
		lblPublicRelations.setBounds(870, 489, 115, 14);
		frmStudentCouncilVoting.getContentPane().add(lblPublicRelations);
		
		JLabel lblReligiousVice = new JLabel("Religious Vice");
		lblReligiousVice.setHorizontalAlignment(SwingConstants.CENTER);
		lblReligiousVice.setBounds(990, 489, 115, 14);
		frmStudentCouncilVoting.getContentPane().add(lblReligiousVice);
		
		JLabel lblItCoordinator = new JLabel("IT Coordinator");
		lblItCoordinator.setHorizontalAlignment(SwingConstants.LEFT);
		lblItCoordinator.setBounds(1244, 489, 90, 14);
		frmStudentCouncilVoting.getContentPane().add(lblItCoordinator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 43, 1347, 440);
		frmStudentCouncilVoting.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton testBtn = new JButton("TEST");
		testBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int personCounter = 0;
				/*JButton btnNewButton3 = new JButton("");
				GridBagConstraints gbc_btnNewButton3 = new GridBagConstraints();
				btnNewButton3.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/president.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
				btnNewButton3.setMargin(new Insets(0, 0, 0, 0));
				gbc_btnNewButton3.insets = new Insets(0, 0, 10, 10);
				gbc_btnNewButton3.gridx = 2;
				gbc_btnNewButton3.gridy = 0;
				panel.add(btnNewButton3, gbc_btnNewButton3);
				panel.repaint();
				panel.revalidate();*/
				
				while(personCounter <= connect.getAmount()) {
					
					if (connect.getPosition(personCounter).equals("President") && !buttonP1.isOpaque()) {
						buttonP1.setOpaque(true);
						try {
							BufferedImage cI = connect.getPicture(personCounter);
							buttonP1.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							P1Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}

						
					}
					else if (connect.getPosition(personCounter).equals("President") && !buttonP2.isOpaque()) {
						buttonP2.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonP2.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							P2Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}

					}
					else if (connect.getPosition(personCounter).equals("President") && !buttonP3.isOpaque()) {
						buttonP3.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonP3.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							P3Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Vice President") && !buttonVP1.isOpaque()) {
						buttonVP1.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonVP1.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							VP1Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Vice President") && !buttonVP2.isOpaque()) {
						buttonVP2.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonVP2.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							VP2Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Vice President") && !buttonVP3.isOpaque()) {
						buttonVP3.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonVP3.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							VP3Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Secretary") && !buttonS1.isOpaque()) {
						buttonS1.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonS1.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							S1Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Secretary") && !buttonS2.isOpaque()) {
						buttonS2.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonS2.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							S2Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Secretary") && !buttonS3.isOpaque()) {
						buttonS3.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonS3.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							S3Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Treasurer") && !buttonT1.isOpaque()) {
						buttonT1.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonT1.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							T1Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Treasurer") && !buttonT2.isOpaque()) {
						buttonT2.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonT2.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							T2Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Treasurer") && !buttonT3.isOpaque()) {
						buttonT3.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonT3.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							T3Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Sports Coordinator") && !buttonSC1.isOpaque()) {
						buttonSC1.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonSC1.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							SC1Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Sports Coordinator") && !buttonSC2.isOpaque()) {
						buttonSC2.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonSC2.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							SC2Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Sports Coordinator") && !buttonSC3.isOpaque()) {
						buttonSC3.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonSC3.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							SC3Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Male Athlete") && !buttonMA1.isOpaque()) {
						buttonMA1.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonMA1.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							MA1Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Male Athlete") && !buttonMA2.isOpaque()) {
						buttonMA2.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonMA2.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							MA2Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Male Athlete") && !buttonMA3.isOpaque()) {
						buttonMA3.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonMA3.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							MA3Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Female Athlete") && !buttonFA1.isOpaque()) {
						buttonFA1.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonFA1.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							FA1Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Female Athlete") && !buttonFA2.isOpaque()) {
						buttonFA2.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonFA2.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							FA2Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Female Athlete") && !buttonFA3.isOpaque()) {
						buttonFA3.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonFA3.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							FA3Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Public Relations") && !buttonPR1.isOpaque()) {
						buttonPR1.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonPR1.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							PR1Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Public Relations") && !buttonPR2.isOpaque()) {
						buttonPR2.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonPR2.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							PR2Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Public Relations") && !buttonPR3.isOpaque()) {
						buttonPR3.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonPR3.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							PR3Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Religious Vice") && !buttonRV1.isOpaque()) {
						buttonRV1.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonRV1.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							RV1Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Religious Vice") && !buttonRV2.isOpaque()) {
						buttonRV2.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonRV2.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							RV2Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Religious Vice") && !buttonRV3.isOpaque()) {
						buttonRV3.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonRV3.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							RV3Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Artist") && !buttonAR1.isOpaque()) {
						buttonAR1.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonAR1.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							AR1Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Artist") && !buttonAR2.isOpaque()) {
						buttonAR2.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonAR2.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							AR2Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("Artist") && !buttonAR3.isOpaque()) {
						buttonAR3.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonAR3.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							AR3Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("IT") && !buttonIT1.isOpaque()) {
						buttonIT1.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonIT1.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							IT1Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("IT") && !buttonIT2.isOpaque()) {
						buttonIT2.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonIT2.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							IT2Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else if (connect.getPosition(personCounter).equals("IT") && !buttonIT3.isOpaque()) {
						buttonIT3.setOpaque(true);
						try {
							BufferedImage cI= connect.getPicture(personCounter);
							buttonIT3.setIcon(new ImageIcon(cI.getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
							IT3Name.setText(connect.getName(personCounter));
						}
						catch (Exception ex) {
							System.out.println("Failed to retreive the picture for " + connect.getName(personCounter));
						}
					}
					else {
						
					}
					personCounter += 1;
				}
				

				
			}
		});
		testBtn.setFont(new Font("Segoe Print", Font.PLAIN, 11));
		testBtn.setBounds(45, 9, 192, 23);
		frmStudentCouncilVoting.getContentPane().add(testBtn);
		
		buttonP1 = new JButton("");
		buttonP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonP1.isOpaque()) {
					pIs = P1Name.getText();
					presC.setIcon(buttonP1.getIcon());
				}
				else {
					
				}
			}
		});
		GridBagConstraints gbc_buttonP1 = new GridBagConstraints();
		buttonP1.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonP1.setMargin(new Insets(0, 0, 0, 0));
		buttonP1.setOpaque(false);
		gbc_buttonP1.insets = new Insets(0, 0, 10, 10);
		gbc_buttonP1.gridx = 0;
		gbc_buttonP1.gridy = 0;
		panel.add(buttonP1, gbc_buttonP1);
		
		lblNewLabel_1 = new JLabel("President(s)");
		lblNewLabel_1.setFont(new Font("Ebrima", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Vice President(s)");
        lblNewLabel_2.setFont(new Font("Ebrima", Font.PLAIN, 11));
        GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
        gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2.gridx = 4;
        gbc_lblNewLabel_2.gridy = 2;
        panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
        lblNewLabel_3 = new JLabel("Secretary(s)");
        lblNewLabel_3.setFont(new Font("Ebrima", Font.PLAIN, 11));
        GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
        gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_3.gridx = 4;
        gbc_lblNewLabel_3.gridy = 4;
        panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
        lblNewLabel_4 = new JLabel("Treasurer(s)");
        lblNewLabel_4.setFont(new Font("Ebrima", Font.PLAIN, 11));
        GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
        gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_4.gridx = 4;
        gbc_lblNewLabel_4.gridy = 6;
        panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
        lblNewLabel_5 = new JLabel("Sport Cordinator(s)");
        lblNewLabel_5.setFont(new Font("Ebrima", Font.PLAIN, 11));
        GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
        gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_5.gridx = 4;
        gbc_lblNewLabel_5.gridy = 8;
        panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
        lblNewLabel_6 = new JLabel("Male Athete(s)");
        lblNewLabel_6.setFont(new Font("Ebrima", Font.PLAIN, 11));
        GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
        gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_6.gridx = 4;
        gbc_lblNewLabel_6.gridy = 10;
        panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
        lblNewLabel_7 = new JLabel("Female Athele(s)");
        lblNewLabel_7.setFont(new Font("Ebrima", Font.PLAIN, 11));
        GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
        gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_7.gridx = 4;
        gbc_lblNewLabel_7.gridy = 12;
        panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
        lblNewLabel_8 = new JLabel("Public Relation(s)");
        lblNewLabel_8.setFont(new Font("Ebrima", Font.PLAIN, 11));
        GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
        gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_8.gridx = 4;
        gbc_lblNewLabel_8.gridy = 14;
        panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
        lblNewLabel_9 = new JLabel("Religious Vice(s)");
        lblNewLabel_9.setFont(new Font("Ebrima", Font.PLAIN, 11));
        GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
        gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_9.gridx = 4;
        gbc_lblNewLabel_9.gridy = 16;
        panel.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		
        lblNewLabel_10 = new JLabel("Artist(s)");
        lblNewLabel_10.setFont(new Font("Ebrima", Font.PLAIN, 11));
        GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
        gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_10.gridx = 4;
        gbc_lblNewLabel_10.gridy = 18;
        panel.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		
        lblNewLabel_11 = new JLabel("IT(s)");
        lblNewLabel_11.setFont(new Font("Ebrima", Font.PLAIN, 11));
        GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
        gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_11.gridx = 4;
        gbc_lblNewLabel_11.gridy = 20;
        panel.add(lblNewLabel_11, gbc_lblNewLabel_11);
				
		
		P1Name = new JLabel("");
		GridBagConstraints gbc_P1Name = new GridBagConstraints();
		gbc_P1Name.insets = new Insets(0, 0, 10, 10);
		gbc_P1Name.gridx = 0;
		gbc_P1Name.gridy = 1;
		panel.add(P1Name, gbc_P1Name);
		
		buttonP2 = new JButton("");
		buttonP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonP2.isOpaque()) {
					pIs = P2Name.getText();
					presC.setIcon(buttonP2.getIcon());
				}
				else {
					
				}
			}
		});
		GridBagConstraints gbc_buttonP2 = new GridBagConstraints();
		buttonP2.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonP2.setMargin(new Insets(0, 0, 0, 0));
		buttonP2.setOpaque(false);
		gbc_buttonP2.insets = new Insets(0, 0, 10, 10);
		gbc_buttonP2.gridx = 1;
		gbc_buttonP2.gridy = 0;
		panel.add(buttonP2, gbc_buttonP2);
		
		P2Name = new JLabel("");
		GridBagConstraints gbc_P2Name = new GridBagConstraints();
		gbc_P2Name.insets = new Insets(0, 0, 10, 10);
		gbc_P2Name.gridx = 1;
		gbc_P2Name.gridy = 1;
		panel.add(P2Name, gbc_P2Name);
		
		buttonP3 = new JButton("");
		buttonP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonP3.isOpaque()) {
					pIs = P3Name.getText();
					presC.setIcon(buttonP3.getIcon());
				}
				else {
					
				}
			}
		});
		GridBagConstraints gbc_buttonP3 = new GridBagConstraints();
		buttonP3.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonP3.setMargin(new Insets(0, 0, 0, 0));
		buttonP3.setOpaque(false);
		gbc_buttonP3.insets = new Insets(0, 0, 10, 10);
		gbc_buttonP3.gridx = 2;
		gbc_buttonP3.gridy = 0;
		panel.add(buttonP3, gbc_buttonP3);
		
		P3Name = new JLabel("");
		GridBagConstraints gbc_P3Name = new GridBagConstraints();
		gbc_P3Name.insets = new Insets(0, 0, 10, 10);
		gbc_P3Name.gridx = 2;
		gbc_P3Name.gridy = 1;
		panel.add(P3Name, gbc_P3Name);
		
		buttonVP1 = new JButton("");
		buttonVP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonVP1.isOpaque()) {
					vpIs = VP1Name.getText();
					vpC.setIcon(buttonVP1.getIcon());
				}
				else {
					
				}
			}
		});
		buttonVP1.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonVP1.setMargin(new Insets(0, 0, 0, 0));
		buttonVP1.setOpaque(false);
		GridBagConstraints gbc_buttonVP1 = new GridBagConstraints();
		gbc_buttonVP1.insets = new Insets(0, 0, 10, 10);
		gbc_buttonVP1.gridx = 0;
		gbc_buttonVP1.gridy = 2;
		panel.add(buttonVP1, gbc_buttonVP1);
		
		VP1Name = new JLabel("");
		GridBagConstraints gbc_VP1Name = new GridBagConstraints();
		gbc_VP1Name.insets = new Insets(0, 0, 10, 10);
		gbc_VP1Name.gridx = 0;
		gbc_VP1Name.gridy = 3;
		panel.add(VP1Name, gbc_VP1Name);
		
		buttonVP2 = new JButton("");
		buttonVP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonVP2.isOpaque()) {
					vpIs = VP2Name.getText();
					vpC.setIcon(buttonVP2.getIcon());
				}
				else {
					
				}
			}
		});
		buttonVP2.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonVP2.setMargin(new Insets(0, 0, 0, 0));
		buttonVP2.setOpaque(false);
		GridBagConstraints gbc_buttonVP2 = new GridBagConstraints();
		gbc_buttonVP2.insets = new Insets(0, 0, 10, 10);
		gbc_buttonVP2.gridx = 1;
		gbc_buttonVP2.gridy = 2;
		panel.add(buttonVP2, gbc_buttonVP2);
		
		VP2Name = new JLabel("");
		GridBagConstraints gbc_VP2Name = new GridBagConstraints();
		gbc_VP2Name.insets = new Insets(0, 0, 10, 10);
		gbc_VP2Name.gridx = 1;
		gbc_VP2Name.gridy = 3;
		panel.add(VP2Name, gbc_VP2Name);
		
		buttonVP3 = new JButton("");
		buttonVP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonVP3.isOpaque()) {
					vpIs = VP3Name.getText();
					vpC.setIcon(buttonVP3.getIcon());
				}
				else {
					
				}
			}
		});
		buttonVP3.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonVP3.setMargin(new Insets(0, 0, 0, 0));
		buttonVP3.setOpaque(false);
		GridBagConstraints gbc_buttonVP3 = new GridBagConstraints();
		gbc_buttonVP3.insets = new Insets(0, 0, 10, 10);
		gbc_buttonVP3.gridx = 2;
		gbc_buttonVP3.gridy = 2;
		panel.add(buttonVP3, gbc_buttonVP3);
		
		VP3Name = new JLabel("");
		GridBagConstraints gbc_VP3Name = new GridBagConstraints();
		gbc_VP3Name.insets = new Insets(0, 0, 10, 10);
		gbc_VP3Name.gridx = 2;
		gbc_VP3Name.gridy = 3;
		panel.add(VP3Name, gbc_VP3Name);
		
		buttonS1 = new JButton("");
		buttonS1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonS1.isOpaque()) {
					sIs = S1Name.getText();
					secretaryC.setIcon(buttonS1.getIcon());
				}
				else {
					
				}
			}
		});
		buttonS1.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonS1.setMargin(new Insets(0, 0, 0, 0));
		buttonS1.setOpaque(false);
		GridBagConstraints gbc_buttonS1 = new GridBagConstraints();
		gbc_buttonS1.insets = new Insets(0, 0, 10, 10);
		gbc_buttonS1.gridx = 0;
		gbc_buttonS1.gridy = 4;
		panel.add(buttonS1, gbc_buttonS1);
		
		S1Name = new JLabel("");
		GridBagConstraints gbc_S1Name = new GridBagConstraints();
		gbc_S1Name.insets = new Insets(0, 0, 10, 10);
		gbc_S1Name.gridx = 0;
		gbc_S1Name.gridy = 5;
		panel.add(S1Name, gbc_S1Name);
		
		buttonS2 = new JButton("");
		buttonS2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonS2.isOpaque()) {
					sIs = S2Name.getText();
					secretaryC.setIcon(buttonS2.getIcon());
				}
				else {
					
				}
			}
		});
		buttonS2.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonS2.setMargin(new Insets(0, 0, 0, 0));
		buttonS2.setOpaque(false);
		GridBagConstraints gbc_buttonS2 = new GridBagConstraints();
		gbc_buttonS2.insets = new Insets(0, 0, 10, 10);
		gbc_buttonS2.gridx = 1;
		gbc_buttonS2.gridy = 4;
		panel.add(buttonS2, gbc_buttonS2);
		
		S2Name = new JLabel("");
		GridBagConstraints gbc_S2Name = new GridBagConstraints();
		gbc_S2Name.insets = new Insets(0, 0, 10, 10);
		gbc_S2Name.gridx = 1;
		gbc_S2Name.gridy = 5;
		panel.add(S2Name, gbc_S2Name);
		
		buttonS3 = new JButton("");
		buttonS3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonS3.isOpaque()) {
					sIs = S3Name.getText();
					secretaryC.setIcon(buttonS3.getIcon());
				}
				else {
					
				}
			}
		});
		buttonS3.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonS3.setMargin(new Insets(0, 0, 0, 0));
		buttonS3.setOpaque(false);
		GridBagConstraints gbc_buttonS3 = new GridBagConstraints();
		gbc_buttonS3.insets = new Insets(0, 0, 10, 10);
		gbc_buttonS3.gridx = 2;
		gbc_buttonS3.gridy = 4;
		panel.add(buttonS3, gbc_buttonS3);
		
		S3Name = new JLabel("");
		GridBagConstraints gbc_S3Name = new GridBagConstraints();
		gbc_S3Name.insets = new Insets(0, 0, 10, 10);
		gbc_S3Name.gridx = 0;
		gbc_S3Name.gridy = 5;
		panel.add(S3Name, gbc_S3Name);
		
		buttonT1 = new JButton("");
		buttonT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonT1.isOpaque()) {
					tIs = T1Name.getText();
					treasurerC.setIcon(buttonT1.getIcon());
				}
				else {
					
				}
			}
		});
		buttonT1.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonT1.setMargin(new Insets(0, 0, 0, 0));
		buttonT1.setOpaque(false);
		GridBagConstraints gbc_buttonT1 = new GridBagConstraints();
		gbc_buttonT1.insets = new Insets(0, 0, 10, 10);
		gbc_buttonT1.gridx = 0;
		gbc_buttonT1.gridy = 6;
		panel.add(buttonT1, gbc_buttonT1);
		
		T1Name = new JLabel("");
		GridBagConstraints gbc_T1Name = new GridBagConstraints();
		gbc_T1Name.insets = new Insets(0, 0, 10, 10);
		gbc_T1Name.gridx = 0;
		gbc_T1Name.gridy = 7;
		panel.add(T1Name, gbc_T1Name);
		
		buttonT2 = new JButton("");
		buttonT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonT2.isOpaque()) {
					tIs = T2Name.getText();
					treasurerC.setIcon(buttonT2.getIcon());
				}
				else {
					
				}
			}
		});
		buttonT2.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonT2.setMargin(new Insets(0, 0, 0, 0));
		buttonT2.setOpaque(false);
		GridBagConstraints gbc_buttonT2 = new GridBagConstraints();
		gbc_buttonT2.insets = new Insets(0, 0, 10, 10);
		gbc_buttonT2.gridx = 1;
		gbc_buttonT2.gridy = 6;
		panel.add(buttonT2, gbc_buttonT2);
		
		T2Name = new JLabel("");
		GridBagConstraints gbc_T2Name = new GridBagConstraints();
		gbc_T2Name.insets = new Insets(0, 0, 10, 10);
		gbc_T2Name.gridx = 1;
		gbc_T2Name.gridy = 7;
		panel.add(T2Name, gbc_T2Name);
		
		buttonT3 = new JButton("");
		buttonT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonT3.isOpaque()) {
					tIs = T3Name.getText();
					treasurerC.setIcon(buttonT3.getIcon());
				}
				else {
					
				}
			}
		});
		buttonT3.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonT3.setMargin(new Insets(0, 0, 0, 0));
		buttonT3.setOpaque(false);
		GridBagConstraints gbc_buttonT3 = new GridBagConstraints();
		gbc_buttonT3.insets = new Insets(0, 0, 10, 10);
		gbc_buttonT3.gridx = 2;
		gbc_buttonT3.gridy = 6;
		panel.add(buttonT3, gbc_buttonT3);
		
		T3Name = new JLabel("");
		GridBagConstraints gbc_T3Name = new GridBagConstraints();
		gbc_T3Name.insets = new Insets(0, 0, 10, 10);
		gbc_T3Name.gridx = 2;
		gbc_T3Name.gridy = 7;
		panel.add(T3Name, gbc_T3Name);
		
		buttonSC1 = new JButton("");
		buttonSC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonSC1.isOpaque()) {
					scIs = SC1Name.getText();
					sportsC.setIcon(buttonSC1.getIcon());
				}
				else {
					
				}
			}
		});
		buttonSC1.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonSC1.setMargin(new Insets(0, 0, 0, 0));
		buttonSC1.setOpaque(false);
		GridBagConstraints gbc_buttonSC1 = new GridBagConstraints();
		gbc_buttonSC1.insets = new Insets(0, 0, 10, 10);
		gbc_buttonSC1.gridx = 0;
		gbc_buttonSC1.gridy = 8;
		panel.add(buttonSC1, gbc_buttonSC1);
		
		SC1Name = new JLabel("");
		GridBagConstraints gbc_SC1Name = new GridBagConstraints();
		gbc_SC1Name.insets = new Insets(0, 0, 10, 10);
		gbc_SC1Name.gridx = 0;
		gbc_SC1Name.gridy = 9;
		panel.add(SC1Name, gbc_SC1Name);
		
		buttonSC2 = new JButton("");
		buttonSC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonSC2.isOpaque()) {
					scIs = SC2Name.getText();
					sportsC.setIcon(buttonSC2.getIcon());
				}
				else {
					
				}
			}
		});
		buttonSC2.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonSC2.setMargin(new Insets(0, 0, 0, 0));
		buttonSC2.setOpaque(false);
		GridBagConstraints gbc_buttonSC2 = new GridBagConstraints();
		gbc_buttonSC2.insets = new Insets(0, 0, 10, 10);
		gbc_buttonSC2.gridx = 1;
		gbc_buttonSC2.gridy = 8;
		panel.add(buttonSC2, gbc_buttonSC2);
		
		SC2Name = new JLabel("");
		GridBagConstraints gbc_SC2Name = new GridBagConstraints();
		gbc_SC2Name.insets = new Insets(0, 0, 10, 10);
		gbc_SC2Name.gridx = 1;
		gbc_SC2Name.gridy = 9;
		panel.add(SC2Name, gbc_SC2Name);
		
		buttonSC3 = new JButton("");
		buttonSC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonSC3.isOpaque()) {
					scIs = SC3Name.getText();
					sportsC.setIcon(buttonSC3.getIcon());
				}
				else {
					
				}
			}
		});
		buttonSC3.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonSC3.setMargin(new Insets(0, 0, 0, 0));
		buttonSC3.setOpaque(false);
		GridBagConstraints gbc_buttonSC3 = new GridBagConstraints();
		gbc_buttonSC3.insets = new Insets(0, 0, 10, 10);
		gbc_buttonSC3.gridx = 2;
		gbc_buttonSC3.gridy = 8;
		panel.add(buttonSC3, gbc_buttonSC3);
		
		SC3Name = new JLabel("");
		GridBagConstraints gbc_SC3Name = new GridBagConstraints();
		gbc_SC3Name.insets = new Insets(0, 0, 10, 10);
		gbc_SC3Name.gridx = 2;
		gbc_SC3Name.gridy = 9;
		panel.add(SC3Name, gbc_SC3Name);

		buttonMA1 = new JButton("");
		buttonMA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonMA1.isOpaque()) {
					maIs = MA1Name.getText();
					maleC.setIcon(buttonMA1.getIcon());
				}
				else {
					
				}
			}
		});
		buttonMA1.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonMA1.setMargin(new Insets(0, 0, 0, 0));
		buttonMA1.setOpaque(false);
		GridBagConstraints gbc_buttonMA1 = new GridBagConstraints();
		gbc_buttonMA1.insets = new Insets(0, 0, 10, 10);
		gbc_buttonMA1.gridx = 0;
		gbc_buttonMA1.gridy = 10;
		panel.add(buttonMA1, gbc_buttonMA1);
		
		MA1Name = new JLabel("");
		GridBagConstraints gbc_MA1Name = new GridBagConstraints();
		gbc_MA1Name.insets = new Insets(0, 0, 10, 10);
		gbc_MA1Name.gridx = 0;
		gbc_MA1Name.gridy = 11;
		panel.add(MA1Name, gbc_MA1Name);
		
		buttonMA2 = new JButton("");
		buttonMA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonMA2.isOpaque()) {
					maIs = MA2Name.getText();
					maleC.setIcon(buttonMA2.getIcon());
				}
				else {
					
				}
			}
		});
		buttonMA2.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonMA2.setMargin(new Insets(0, 0, 0, 0));
		buttonMA2.setOpaque(false);
		GridBagConstraints gbc_buttonMA2 = new GridBagConstraints();
		gbc_buttonMA2.insets = new Insets(0, 0, 10, 10);
		gbc_buttonMA2.gridx = 1;
		gbc_buttonMA2.gridy = 10;
		panel.add(buttonMA2, gbc_buttonMA2);
		
		MA2Name = new JLabel("");
		GridBagConstraints gbc_MA2Name = new GridBagConstraints();
		gbc_MA2Name.insets = new Insets(0, 0, 10, 10);
		gbc_MA2Name.gridx = 1;
		gbc_MA2Name.gridy = 11;
		panel.add(MA2Name, gbc_MA2Name);
		
		buttonMA3 = new JButton("");
		buttonMA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonMA3.isOpaque()) {
					maIs = MA3Name.getText();
					maleC.setIcon(buttonMA3.getIcon());
				}
				else {
					
				}
			}
		});
		buttonMA3.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonMA3.setMargin(new Insets(0, 0, 0, 0));
		buttonMA3.setOpaque(false);
		GridBagConstraints gbc_buttonMA3 = new GridBagConstraints();
		gbc_buttonMA3.insets = new Insets(0, 0, 10, 10);
		gbc_buttonMA3.gridx = 2;
		gbc_buttonMA3.gridy = 10;
		panel.add(buttonMA3, gbc_buttonMA3);
		
		MA3Name = new JLabel("gbc_MA1Name");
		GridBagConstraints gbc_MA3Name = new GridBagConstraints();
		gbc_MA3Name.insets = new Insets(0, 0, 10, 10);
		gbc_MA3Name.gridx = 2;
		gbc_MA3Name.gridy = 11;
		panel.add(MA3Name, gbc_MA3Name);
		
		buttonFA1 = new JButton("");
		buttonFA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonFA1.isOpaque()) {
					faIs = FA1Name.getText();
					femaleC.setIcon(buttonFA1.getIcon());
				}
				else {
					
				}
			}
		});
		buttonFA1.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonFA1.setMargin(new Insets(0, 0, 0, 0));
		buttonFA1.setOpaque(false);
		GridBagConstraints gbc_buttonFA1 = new GridBagConstraints();
		gbc_buttonFA1.insets = new Insets(0, 0, 10, 10);
		gbc_buttonFA1.gridx = 0;
		gbc_buttonFA1.gridy = 12;
		panel.add(buttonFA1, gbc_buttonFA1);
		
		FA1Name = new JLabel("");
		GridBagConstraints gbc_FA1Name = new GridBagConstraints();
		gbc_FA1Name.insets = new Insets(0, 0, 10, 10);
		gbc_FA1Name.gridx = 0;
		gbc_FA1Name.gridy = 13;
		panel.add(FA1Name, gbc_FA1Name);
		
		buttonFA2 = new JButton("");
		buttonFA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonFA2.isOpaque()) {
					faIs = FA2Name.getText();
					femaleC.setIcon(buttonFA2.getIcon());
				}
				else {
					
				}
			}
		});
		buttonFA2.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonFA2.setMargin(new Insets(0, 0, 0, 0));
		buttonFA2.setOpaque(false);
		GridBagConstraints gbc_buttonFA2 = new GridBagConstraints();
		gbc_buttonFA2.insets = new Insets(0, 0, 10, 10);
		gbc_buttonFA2.gridx = 1;
		gbc_buttonFA2.gridy = 12;
		panel.add(buttonFA2, gbc_buttonFA2);
		
		FA2Name = new JLabel("");
		GridBagConstraints gbc_FA2Name = new GridBagConstraints();
		gbc_FA2Name.insets = new Insets(0, 0, 10, 10);
		gbc_FA2Name.gridx = 1;
		gbc_FA2Name.gridy = 13;
		panel.add(FA2Name, gbc_FA2Name);
		
		buttonFA3 = new JButton("");
		buttonFA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonFA3.isOpaque()) {
					faIs = FA3Name.getText();
					femaleC.setIcon(buttonFA3.getIcon());
				}
				else {
					
				}
			}
		});
		buttonFA3.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonFA3.setMargin(new Insets(0, 0, 0, 0));
		buttonFA3.setOpaque(false);
		GridBagConstraints gbc_buttonFA3 = new GridBagConstraints();
		gbc_buttonFA3.insets = new Insets(0, 0, 10, 10);
		gbc_buttonFA3.gridx = 2;
		gbc_buttonFA3.gridy = 12;
		panel.add(buttonFA3, gbc_buttonFA3);
		
		FA3Name = new JLabel("");
		GridBagConstraints gbc_FA3Name = new GridBagConstraints();
		gbc_FA3Name.insets = new Insets(0, 0, 10, 10);
		gbc_FA3Name.gridx = 2;
		gbc_FA3Name.gridy = 13;
		panel.add(FA3Name, gbc_FA3Name);
		
		buttonPR1 = new JButton("");
		buttonPR1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonPR1.isOpaque()) {
					prIs = PR1Name.getText();
					prC.setIcon(buttonPR1.getIcon());
				}
				else {
					
				}
			}
		});
		buttonPR1.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonPR1.setMargin(new Insets(0, 0, 0, 0));
		buttonPR1.setOpaque(false);
		GridBagConstraints gbc_buttonPR1 = new GridBagConstraints();
		gbc_buttonPR1.insets = new Insets(0, 0, 10, 10);
		gbc_buttonPR1.gridx = 0;
		gbc_buttonPR1.gridy = 14;
		panel.add(buttonPR1, gbc_buttonPR1);
		
		PR1Name = new JLabel("");
		GridBagConstraints gbc_PR1Name = new GridBagConstraints();
		gbc_PR1Name.insets = new Insets(0, 0, 10, 10);
		gbc_PR1Name.gridx = 0;
		gbc_PR1Name.gridy = 15;
		panel.add(PR1Name, gbc_PR1Name);
		
		buttonPR2 = new JButton("");
        buttonPR2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
				if (buttonPR2.isOpaque()) {
					prIs = PR2Name.getText();
					prC.setIcon(buttonPR2.getIcon());
				}
				else {
					
				}
            }
        });
        buttonPR2.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
        buttonPR2.setMargin(new Insets(0, 0, 0, 0));
        buttonPR2.setOpaque(false);
        GridBagConstraints gbc_buttonPR2 = new GridBagConstraints();
        gbc_buttonPR2.insets = new Insets(0, 0, 10, 10);
        gbc_buttonPR2.gridx = 1;
        gbc_buttonPR2.gridy = 14;
        panel.add(buttonPR2, gbc_buttonPR2);
        
        PR2Name = new JLabel("");
        GridBagConstraints gbc_PR2Name = new GridBagConstraints();
        gbc_PR2Name.insets = new Insets(0, 0, 10, 10);
        gbc_PR2Name.gridx = 1;
        gbc_PR2Name.gridy = 15;
        panel.add(PR2Name, gbc_PR2Name);
		
		
		
        buttonPR3 = new JButton("");
        buttonPR3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
				if (buttonPR3.isOpaque()) {
					prIs = PR3Name.getText();
					prC.setIcon(buttonPR3.getIcon());
				}
				else {
					
				}
            }
        });
        buttonPR3.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
        buttonPR3.setMargin(new Insets(0, 0, 0, 0));
        buttonPR3.setOpaque(false);
        GridBagConstraints gbc_buttonPR3 = new GridBagConstraints();
        gbc_buttonPR3.insets = new Insets(0, 0, 10, 10);
        gbc_buttonPR3.gridx = 2;
        gbc_buttonPR3.gridy = 14;
        panel.add(buttonPR3, gbc_buttonPR3);
        
        PR3Name = new JLabel("");
        GridBagConstraints gbc_PR3Name = new GridBagConstraints();
        gbc_PR3Name.insets = new Insets(0, 0, 10, 10);
        gbc_PR3Name.gridx = 2;
        gbc_PR3Name.gridy = 15;
        panel.add(PR3Name, gbc_PR3Name);
		
		buttonRV1 = new JButton("");
		buttonRV1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonRV1.isOpaque()) {
					rvIs = RV1Name.getText();
					religiousC.setIcon(buttonRV1.getIcon());
				}
				else {
					
				}
			}
		});
		buttonRV1.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonRV1.setMargin(new Insets(0, 0, 0, 0));
		buttonRV1.setOpaque(false);
		GridBagConstraints gbc_buttonRV1 = new GridBagConstraints();
		gbc_buttonRV1.insets = new Insets(0, 0, 10, 10);
		gbc_buttonRV1.gridx = 0;
		gbc_buttonRV1.gridy = 16;
		panel.add(buttonRV1, gbc_buttonRV1);
		
		RV1Name = new JLabel("");
		GridBagConstraints gbc_RV1Name = new GridBagConstraints();
		gbc_RV1Name.insets = new Insets(0, 0, 10, 10);
		gbc_RV1Name.gridx = 0;
		gbc_RV1Name.gridy = 17;
		panel.add(RV1Name, gbc_RV1Name);
		
		buttonRV2 = new JButton("");
        buttonRV2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
				if (buttonRV2.isOpaque()) {
					rvIs = RV2Name.getText();
					religiousC.setIcon(buttonRV2.getIcon());
				}
				else {
					
				}
            }
        });
        buttonRV2.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
        buttonRV2.setMargin(new Insets(0, 0, 0, 0));
        buttonRV2.setOpaque(false);
        GridBagConstraints gbc_buttonRV2 = new GridBagConstraints();
        gbc_buttonRV2.insets = new Insets(0, 0, 10, 10);
        gbc_buttonRV2.gridx = 1;
        gbc_buttonRV2.gridy = 16;
        panel.add(buttonRV2, gbc_buttonRV2);
        
        RV2Name = new JLabel("");
        GridBagConstraints gbc_RV2Name = new GridBagConstraints();
        gbc_RV2Name.insets = new Insets(0, 0, 10, 10);
        gbc_RV2Name.gridx = 1;
        gbc_RV2Name.gridy = 17;
        panel.add(RV2Name, gbc_RV2Name);
		
        buttonRV3 = new JButton("");
        buttonRV3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
				if (buttonRV3.isOpaque()) {
					rvIs = RV3Name.getText();
					religiousC.setIcon(buttonRV3.getIcon());
				}
				else {
					
				}
            }
        });
        buttonRV3.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
        buttonRV3.setMargin(new Insets(0, 0, 0, 0));
        buttonRV3.setOpaque(false);
        GridBagConstraints gbc_buttonRV3 = new GridBagConstraints();
        gbc_buttonRV3.insets = new Insets(0, 0, 10, 10);
        gbc_buttonRV3.gridx = 2;
        gbc_buttonRV3.gridy = 16;
        panel.add(buttonRV3, gbc_buttonRV3);
        
        RV3Name = new JLabel("");
        GridBagConstraints gbc_RV3Name = new GridBagConstraints();
        gbc_RV3Name.insets = new Insets(0, 0, 10, 10);
        gbc_RV3Name.gridx = 2;
        gbc_RV3Name.gridy = 17;
        panel.add(RV3Name, gbc_RV3Name);
		
		buttonAR1 = new JButton("");
		buttonAR1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonAR1.isOpaque()) {
					arIs = AR1Name.getText();
					artistC.setIcon(buttonAR1.getIcon());
				}
				else {
					
				}
			}
		});
		buttonAR1.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonAR1.setMargin(new Insets(0, 0, 0, 0));
		buttonAR1.setOpaque(false);
		GridBagConstraints gbc_buttonAR1 = new GridBagConstraints();
		gbc_buttonAR1.insets = new Insets(0, 0, 10, 10);
		gbc_buttonAR1.gridx = 0;
		gbc_buttonAR1.gridy = 18;
		panel.add(buttonAR1, gbc_buttonAR1);
		
		AR1Name = new JLabel("");
		GridBagConstraints gbc_AR1Name = new GridBagConstraints();
		gbc_AR1Name.insets = new Insets(0, 0, 10, 10);
		gbc_AR1Name.gridx = 0;
		gbc_AR1Name.gridy = 19;
		panel.add(AR1Name, gbc_AR1Name);
		
		buttonAR2 = new JButton("");
        buttonAR2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
				if (buttonAR2.isOpaque()) {
					arIs = AR2Name.getText();
					artistC.setIcon(buttonAR2.getIcon());
				}
				else {
					
				}
            }
        });
        buttonAR2.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
        buttonAR2.setMargin(new Insets(0, 0, 0, 0));
        buttonAR2.setOpaque(false);
        GridBagConstraints gbc_buttonAR2 = new GridBagConstraints();
        gbc_buttonAR2.insets = new Insets(0, 0, 10, 10);
        gbc_buttonAR2.gridx = 1;
        gbc_buttonAR2.gridy = 18;
        panel.add(buttonAR2, gbc_buttonAR2);
        
        AR2Name = new JLabel("");
        GridBagConstraints gbc_AR2Name = new GridBagConstraints();
        gbc_AR2Name.insets = new Insets(0, 0, 10, 10);
        gbc_AR2Name.gridx = 1;
        gbc_AR2Name.gridy = 19;
        panel.add(AR2Name, gbc_AR2Name);
		
		
        buttonAR3 = new JButton("");
        buttonAR3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
				if (buttonAR3.isOpaque()) {
					arIs = AR3Name.getText();
					artistC.setIcon(buttonAR3.getIcon());
				}
				else {
					
				}
            }
        });
        buttonAR3.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
        buttonAR3.setMargin(new Insets(0, 0, 0, 0));
        buttonAR3.setOpaque(false);
        GridBagConstraints gbc_buttonAR3 = new GridBagConstraints();
        gbc_buttonAR3.insets = new Insets(0, 0, 10, 10);
        gbc_buttonAR3.gridx = 2;
        gbc_buttonAR3.gridy = 18;
        panel.add(buttonAR3, gbc_buttonAR3);
        
        AR3Name = new JLabel("");
        GridBagConstraints gbc_AR3Name = new GridBagConstraints();
        gbc_AR3Name.insets = new Insets(0, 0, 10, 10);
        gbc_AR3Name.gridx = 2;
        gbc_AR3Name.gridy = 19;
        panel.add(AR3Name, gbc_AR3Name);
		
		buttonIT1 = new JButton("");
		buttonIT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonIT1.isOpaque()) {
					itIs = IT1Name.getText();
					itC.setIcon(buttonIT1.getIcon());
				}
				else {
					
				}
			}
		});
		buttonIT1.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
		buttonIT1.setMargin(new Insets(0, 0, 0, 0));
		buttonIT1.setOpaque(false);
		GridBagConstraints gbc_buttonIT1 = new GridBagConstraints();
		gbc_buttonIT1.insets = new Insets(0, 0, 10, 10);
		gbc_buttonIT1.gridx = 0;
		gbc_buttonIT1.gridy = 20;
		panel.add(buttonIT1, gbc_buttonIT1);
		
		IT1Name = new JLabel("");
		GridBagConstraints gbc_IT1Name = new GridBagConstraints();
		gbc_IT1Name.insets = new Insets(0, 0, 10, 10);
		gbc_IT1Name.gridx = 0;
		gbc_IT1Name.gridy = 21;
		panel.add(IT1Name, gbc_IT1Name);
		
		buttonIT2 = new JButton("");
        buttonIT2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
				if (buttonIT2.isOpaque()) {
					itIs = IT2Name.getText();
					itC.setIcon(buttonIT2.getIcon());
				}
				else {
					
				}
            }
        });
        buttonIT2.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
        buttonIT2.setMargin(new Insets(0, 0, 0, 0));
        buttonIT2.setOpaque(false);
        GridBagConstraints gbc_buttonIT2 = new GridBagConstraints();
        gbc_buttonIT2.insets = new Insets(0, 0, 10, 10);
        gbc_buttonIT2.gridx = 1;
        gbc_buttonIT2.gridy = 20;
        panel.add(buttonIT2, gbc_buttonIT2);
        
        IT2Name = new JLabel("");
        GridBagConstraints gbc_IT2Name = new GridBagConstraints();
        gbc_IT2Name.insets = new Insets(0, 0, 10, 10);
        gbc_IT2Name.gridx = 1;
        gbc_IT2Name.gridy = 21;
        panel.add(IT2Name, gbc_IT2Name);
		
        buttonIT3 = new JButton("");
        buttonIT3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
				if (buttonIT3.isOpaque()) {
					itIs = IT3Name.getText();
					itC.setIcon(buttonIT3.getIcon());
				}
				else {
					
				}
            }
        });
        buttonIT3.setIcon(new ImageIcon(new ImageIcon(test.class.getResource("/pictues/noC.png")).getImage().getScaledInstance(110, 150, Image.SCALE_SMOOTH)));
        buttonIT3.setMargin(new Insets(0, 0, 0, 0));
        buttonIT3.setOpaque(false);
        GridBagConstraints gbc_buttonIT3 = new GridBagConstraints();
        gbc_buttonIT3.insets = new Insets(0, 0, 10, 10);
        gbc_buttonIT3.gridx = 2;
        gbc_buttonIT3.gridy = 20;
        panel.add(buttonIT3, gbc_buttonIT3);
        
        IT3Name = new JLabel("");
        GridBagConstraints gbc_IT3Name = new GridBagConstraints();
        gbc_IT3Name.insets = new Insets(0, 0, 10, 10);
        gbc_IT3Name.gridx = 2;
        gbc_IT3Name.gridy = 21;
        panel.add(IT3Name, gbc_IT3Name);
        
        JButton btnNewButton = new JButton("VOTE");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		connect.registerTotalVote(pIs);
        		connect.registerTotalVote(vpIs);
        		connect.registerTotalVote(sIs);
        		connect.registerTotalVote(tIs);
        		connect.registerTotalVote(scIs);
        		connect.registerTotalVote(maIs);
        		connect.registerTotalVote(faIs);
        		connect.registerTotalVote(prIs);
        		connect.registerTotalVote(rvIs);
        		connect.registerTotalVote(arIs);
        		connect.registerTotalVote(itIs);
        		if (grade <= 5) {
        			connect.registerEsVote(pIs);
            		connect.registerEsVote(vpIs);
            		connect.registerEsVote(sIs);
            		connect.registerEsVote(tIs);
            		connect.registerEsVote(scIs);
            		connect.registerEsVote(maIs);
            		connect.registerEsVote(faIs);
            		connect.registerEsVote(prIs);
            		connect.registerEsVote(rvIs);
            		connect.registerEsVote(arIs);
            		connect.registerEsVote(itIs);
            		if (grade == 1) {
            			connect.registerG1Vote(pIs);
                		connect.registerG1Vote(vpIs);
                		connect.registerG1Vote(sIs);
                		connect.registerG1Vote(tIs);
                		connect.registerG1Vote(scIs);
                		connect.registerG1Vote(maIs);
                		connect.registerG1Vote(faIs);
                		connect.registerG1Vote(prIs);
                		connect.registerG1Vote(rvIs);
                		connect.registerG1Vote(arIs);
                		connect.registerG1Vote(itIs);
            		}
            		else if (grade == 2) {
            			connect.registerG2Vote(pIs);
                		connect.registerG2Vote(vpIs);
                		connect.registerG2Vote(sIs);
                		connect.registerG2Vote(tIs);
                		connect.registerG2Vote(scIs);
                		connect.registerG2Vote(maIs);
                		connect.registerG2Vote(faIs);
                		connect.registerG2Vote(prIs);
                		connect.registerG2Vote(rvIs);
                		connect.registerG2Vote(arIs);
                		connect.registerG2Vote(itIs);
            		}
            		else if (grade == 3) {
            			connect.registerG3Vote(pIs);
                		connect.registerG3Vote(vpIs);
                		connect.registerG3Vote(sIs);
                		connect.registerG3Vote(tIs);
                		connect.registerG3Vote(scIs);
                		connect.registerG3Vote(maIs);
                		connect.registerG3Vote(faIs);
                		connect.registerG3Vote(prIs);
                		connect.registerG3Vote(rvIs);
                		connect.registerG3Vote(arIs);
                		connect.registerG3Vote(itIs);
            		}
            		else if (grade == 4) {
            			connect.registerG4Vote(pIs);
                		connect.registerG4Vote(vpIs);
                		connect.registerG4Vote(sIs);
                		connect.registerG4Vote(tIs);
                		connect.registerG4Vote(scIs);
                		connect.registerG4Vote(maIs);
                		connect.registerG4Vote(faIs);
                		connect.registerG4Vote(prIs);
                		connect.registerG4Vote(rvIs);
                		connect.registerG4Vote(arIs);
                		connect.registerG4Vote(itIs);
            		}
            		else if (grade == 5) {
            			connect.registerG5Vote(pIs);
                		connect.registerG5Vote(vpIs);
                		connect.registerG5Vote(sIs);
                		connect.registerG5Vote(tIs);
                		connect.registerG5Vote(scIs);
                		connect.registerG5Vote(maIs);
                		connect.registerG5Vote(faIs);
                		connect.registerG5Vote(prIs);
                		connect.registerG5Vote(rvIs);
                		connect.registerG5Vote(arIs);
                		connect.registerG5Vote(itIs);
            		}

        		}
        		else if (grade <= 9 && grade > 5) {
        			connect.registerMsVote(pIs);
            		connect.registerMsVote(vpIs);
            		connect.registerMsVote(sIs);
            		connect.registerMsVote(tIs);
            		connect.registerMsVote(scIs);
            		connect.registerMsVote(maIs);
            		connect.registerMsVote(faIs);
            		connect.registerMsVote(prIs);
            		connect.registerMsVote(rvIs);
            		connect.registerMsVote(arIs);
            		connect.registerMsVote(itIs);
            		
            		if (grade == 6) {
            			connect.registerG6Vote(pIs);
                		connect.registerG6Vote(vpIs);
                		connect.registerG6Vote(sIs);
                		connect.registerG6Vote(tIs);
                		connect.registerG6Vote(scIs);
                		connect.registerG6Vote(maIs);
                		connect.registerG6Vote(faIs);
                		connect.registerG6Vote(prIs);
                		connect.registerG6Vote(rvIs);
                		connect.registerG6Vote(arIs);
                		connect.registerG6Vote(itIs);
            		}
            		else if (grade == 7) {
            			connect.registerG7Vote(pIs);
                		connect.registerG7Vote(vpIs);
                		connect.registerG7Vote(sIs);
                		connect.registerG7Vote(tIs);
                		connect.registerG7Vote(scIs);
                		connect.registerG7Vote(maIs);
                		connect.registerG7Vote(faIs);
                		connect.registerG7Vote(prIs);
                		connect.registerG7Vote(rvIs);
                		connect.registerG7Vote(arIs);
                		connect.registerG7Vote(itIs);
            		}
            		else if (grade == 8) {
            			connect.registerG8Vote(pIs);
                		connect.registerG8Vote(vpIs);
                		connect.registerG8Vote(sIs);
                		connect.registerG8Vote(tIs);
                		connect.registerG8Vote(scIs);
                		connect.registerG8Vote(maIs);
                		connect.registerG8Vote(faIs);
                		connect.registerG8Vote(prIs);
                		connect.registerG8Vote(rvIs);
                		connect.registerG8Vote(arIs);
                		connect.registerG8Vote(itIs);
            		}
            		else if (grade == 9) {
            			connect.registerG9Vote(pIs);
                		connect.registerG9Vote(vpIs);
                		connect.registerG9Vote(sIs);
                		connect.registerG9Vote(tIs);
                		connect.registerG9Vote(scIs);
                		connect.registerG9Vote(maIs);
                		connect.registerG9Vote(faIs);
                		connect.registerG9Vote(prIs);
                		connect.registerG9Vote(rvIs);
                		connect.registerG9Vote(arIs);
                		connect.registerG9Vote(itIs);
            		}
        		}
        		else {
        			connect.registerHsVote(pIs);
            		connect.registerHsVote(vpIs);
            		connect.registerHsVote(sIs);
            		connect.registerHsVote(tIs);
            		connect.registerHsVote(scIs);
            		connect.registerHsVote(maIs);
            		connect.registerHsVote(faIs);
            		connect.registerHsVote(prIs);
            		connect.registerHsVote(rvIs);
            		connect.registerHsVote(arIs);
            		connect.registerHsVote(itIs);
        			if (grade == 10) {
            			connect.registerG10Vote(pIs);
                		connect.registerG10Vote(vpIs);
                		connect.registerG10Vote(sIs);
                		connect.registerG10Vote(tIs);
                		connect.registerG10Vote(scIs);
                		connect.registerG10Vote(maIs);
                		connect.registerG10Vote(faIs);
                		connect.registerG10Vote(prIs);
                		connect.registerG10Vote(rvIs);
                		connect.registerG10Vote(arIs);
                		connect.registerG10Vote(itIs);
        			}
        			else if (grade == 11) {
            			connect.registerG11Vote(pIs);
                		connect.registerG11Vote(vpIs);
                		connect.registerG11Vote(sIs);
                		connect.registerG11Vote(tIs);
                		connect.registerG11Vote(scIs);
                		connect.registerG11Vote(maIs);
                		connect.registerG11Vote(faIs);
                		connect.registerG11Vote(prIs);
                		connect.registerG11Vote(rvIs);
                		connect.registerG11Vote(arIs);
                		connect.registerG11Vote(itIs);
        			}
        			else if (grade == 12) {
            			connect.registerG12Vote(pIs);
                		connect.registerG12Vote(vpIs);
                		connect.registerG12Vote(sIs);
                		connect.registerG12Vote(tIs);
                		connect.registerG12Vote(scIs);
                		connect.registerG12Vote(maIs);
                		connect.registerG12Vote(faIs);
                		connect.registerG12Vote(prIs);
                		connect.registerG12Vote(rvIs);
                		connect.registerG12Vote(arIs);
                		connect.registerG12Vote(itIs);
        			}
        		}
        	}
        });
        btnNewButton.setFont(new Font("Bodoni MT Black", Font.PLAIN, 18));
        btnNewButton.setBounds(1124, 0, 223, 43);
        frmStudentCouncilVoting.getContentPane().add(btnNewButton);
		
		
		
	}
}	
