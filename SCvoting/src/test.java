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

public class test {

	private JFrame frmStudentCouncilVoting;

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
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBounds(0, 514, 1347, 158);
		frmStudentCouncilVoting.getContentPane().add(toolBar);
		
		JButton presC = new JButton("\r\n");
		presC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		presC.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/president.png")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
		toolBar.add(presC);
		
		JButton vpC = new JButton("");
		vpC.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/vp.jpg")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
		toolBar.add(vpC);
		
		JButton secretaryC = new JButton("");
		secretaryC.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/secretary.jpg")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
		toolBar.add(secretaryC);
		
		JButton treasurerC = new JButton("");
		treasurerC.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/treasurer.jpg")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
		toolBar.add(treasurerC);
		
		JButton sportsC = new JButton("");
		sportsC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sportsC.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/sportC.jpg")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
		toolBar.add(sportsC);
		
		JButton maleC = new JButton("");
		maleC.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/maleA.jpg")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
		toolBar.add(maleC);
		
		JButton femaleC = new JButton("");
		femaleC.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/femaleA.jpg")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
		toolBar.add(femaleC);
		
		JButton prC = new JButton("");
		prC.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/pr.png")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
		toolBar.add(prC);
		
		JButton artistC = new JButton("");
		artistC.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/artist.jpg")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
		toolBar.add(artistC);
		
		JButton religiousC = new JButton("");
		religiousC.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/religious.jpg")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
		toolBar.add(religiousC);
		
		JButton itC = new JButton("");
		itC.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/it.jpg")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
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
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton = new JButton("");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setIcon(new ImageIcon (new ImageIcon(test.class.getResource("/pictues/religious.jpg")).getImage().getScaledInstance(110, 200, Image.SCALE_SMOOTH)));
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JButton button = new JButton("");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 0, 0);
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		panel.add(button, gbc_button);
		
		JButton button_1 = new JButton("");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 0, 0);
		gbc_button_1.gridx = 2;
		gbc_button_1.gridy = 0;
		panel.add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 0, 0);
		gbc_button_2.gridx = 3;
		gbc_button_2.gridy = 0;
		panel.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 0, 0);
		gbc_button_3.gridx = 4;
		gbc_button_3.gridy = 0;
		panel.add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 0, 0);
		gbc_button_4.gridx = 5;
		gbc_button_4.gridy = 0;
		panel.add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 0, 0);
		gbc_button_5.gridx = 6;
		gbc_button_5.gridy = 0;
		panel.add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 0, 0);
		gbc_button_6.gridx = 7;
		gbc_button_6.gridy = 0;
		panel.add(button_6, gbc_button_6);
		
		JButton button_7 = new JButton("");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 0, 0);
		gbc_button_7.gridx = 8;
		gbc_button_7.gridy = 0;
		panel.add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 0, 0);
		gbc_button_8.gridx = 9;
		gbc_button_8.gridy = 0;
		panel.add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 0, 0);
		gbc_button_9.gridx = 10;
		gbc_button_9.gridy = 0;
		panel.add(button_9, gbc_button_9);
		
		
		
	}
}	
