package twitterKlonu;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Anasayfa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField twitGir;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anasayfa frame = new Anasayfa();
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
	public Anasayfa() {
		setTitle("Twitter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 537);
		contentPane = new JPanel();
		contentPane.setToolTipText("\u0130lginizi \u00E7ekebilecek g\u00FCndemler\r\n\r\n#\r\n\r\n#\r\n\r\n#\r\n\r\n#\r\n\r\n#");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAnasayfa = new JButton("Anasayfa");
		btnAnasayfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anasayfa anasayfa = new Anasayfa();
				dispose();
				anasayfa.setVisible(true);
			}
		});
		btnAnasayfa.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\home.png"));
		btnAnasayfa.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAnasayfa.setBounds(0, 84, 165, 33);
		contentPane.add(btnAnasayfa);
		
		JButton btnKesfet = new JButton("   Ke\u015Ffet");
		btnKesfet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kesfet kesfet = new Kesfet();
				dispose();
				kesfet.setVisible(true);
			}
		});
		btnKesfet.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_hashtag_large_32.png"));
		btnKesfet.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnKesfet.setBounds(-2, 132, 166, 33);
		contentPane.add(btnKesfet);
		
		JButton btnBildirimler = new JButton("Bildirimler");
		btnBildirimler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bildirimler bildirimler = new Bildirimler();
				dispose();
				bildirimler.setVisible(true);
				
			}
		});
		btnBildirimler.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\bell.png"));
		btnBildirimler.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBildirimler.setBounds(-5, 177, 170, 33);
		contentPane.add(btnBildirimler);
		
		JButton btnMesajlar = new JButton("Mesajlar");
		btnMesajlar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mesajlar mesajlar = new Mesajlar();
				dispose();
				mesajlar.setVisible(true);
			}
		});
		btnMesajlar.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_secured_letter_32.png"));
		btnMesajlar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMesajlar.setBounds(-4, 225, 173, 33);
		contentPane.add(btnMesajlar);
		
		JButton btnYerIsaretleri = new JButton("Yer \u0130\u015Faretleri");
		btnYerIsaretleri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YerIsaretleri yerIsaretleri = new YerIsaretleri();
				dispose();
				yerIsaretleri.setVisible(true);
			}
		});
		btnYerIsaretleri.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_bookmark_32.png"));
		btnYerIsaretleri.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnYerIsaretleri.setBounds(-5, 269, 176, 33);
		contentPane.add(btnYerIsaretleri);
		
		JButton btnListeler = new JButton("Listeler");
		btnListeler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listeler listeler = new Listeler();
				dispose();
				listeler.setVisible(true);
			}
		});
		btnListeler.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_playlist_32.png"));
		btnListeler.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnListeler.setBounds(-8, 311, 177, 33);
		contentPane.add(btnListeler);
		
		JButton btnProfil = new JButton("Profil");
		btnProfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profil profil = new Profil();
				dispose();
				profil.setVisible(true);
			}
		});
		btnProfil.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_user_32.png"));
		btnProfil.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnProfil.setBounds(-5, 356, 177, 33);
		contentPane.add(btnProfil);
		
		JButton btnDahaFazla = new JButton("Daha Fazla");
		btnDahaFazla.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_menu_vertical_32.png"));
		btnDahaFazla.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDahaFazla.setBounds(-7, 399, 177, 33);
		contentPane.add(btnDahaFazla);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_twitter_64.png"));
		lblNewLabel.setBounds(11, 30, 76, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Anasayfa");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(201, 12, 118, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel profilPhoto = new JLabel("");
		profilPhoto.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_male_user_64.png"));
		profilPhoto.setBounds(201, 67, 73, 61);
		contentPane.add(profilPhoto);
		
		twitGir = new JTextField();
		twitGir.setToolTipText("Neleer Oluyor?");
		twitGir.setBounds(284, 67, 273, 51);
		contentPane.add(twitGir);
		twitGir.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_gif_32.png"));
		lblNewLabel_3.setBounds(284, 126, 32, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_happy_32.png"));
		lblNewLabel_4.setBounds(314, 132, 45, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_planner_32.png"));
		lblNewLabel_4_1.setBounds(348, 132, 38, 33);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel twitOku = new JLabel("");
		twitOku.setFont(new Font("Tahoma", Font.BOLD, 15));
		twitOku.setBackground(new Color(245, 255, 250));
		twitOku.setBounds(284, 189, 273, 130);
		contentPane.add(twitOku);
		
		JButton btnTwit = new JButton("Tweetle");
		btnTwit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alinanDeger = twitGir.getText();
				twitOku.setText(alinanDeger);
			}
		});
		btnTwit.setForeground(new Color(245, 255, 250));
		btnTwit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTwit.setBackground(new Color(78, 181, 245));
		btnTwit.setBounds(451, 132, 106, 21);
		contentPane.add(btnTwit);
		
		JButton btnTw = new JButton("Tweetle");
		btnTw.setForeground(new Color(245, 255, 250));
		btnTw.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTw.setBackground(new Color(78, 181, 245));
		btnTw.setBounds(-8, 442, 177, 33);
		contentPane.add(btnTw);
		
		textField = new JTextField();
		textField.setBounds(604, 16, 170, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\twitterKlonu\\twitterKlonu\\img\\icons8_search_32.png"));
		lblNewLabel_5.setBounds(567, 12, 45, 27);
		contentPane.add(lblNewLabel_5);
		
		JTextArea txtrIlginiekebilecekGndemler = new JTextArea();
		txtrIlginiekebilecekGndemler.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtrIlginiekebilecekGndemler.setText("\u0130lgini \u00E7ekebilecek g\u00FCndemler\r\n\r\nPolitika \u00B7 G\u00FCndemdekiler\r\n#\r\n#\r\n\r\nT\u00FCrkiye konumunda g\u00FCndemde\r\n#\r\n#\r\n\r\nFutbol \u00B7 G\u00FCndemdekiler\r\n#\r\n#");
		txtrIlginiekebilecekGndemler.setBounds(567, 53, 207, 236);
		contentPane.add(txtrIlginiekebilecekGndemler);
	}
}
