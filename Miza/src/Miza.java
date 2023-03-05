/*
			Ime dototeke:    Miza.java
			Avtor:           Žiga Zurc
			Vhodni podatki:  -
			Opis:            Aplikacija z graficnim uporabniskim vmesnikom za delo z steklenicami  
			Izhodni podatki: Okno graficnega uporabniskega vmesnika
		*/
		// Uvozimo paket za delo z GUI 
		import javax.swing.*;
		
		import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
		
		// Deklaliramo javni razred 
		public class Miza extends JFrame implements ActionListener {
			
				//Deklaliramo zasebne lasnosti
				private JPanel povrsina;
				private JButton dodajJButton;
				private JTextField znamkaPolje, alkoholPolje;
				private JTable tabela;
				private PivskaSteklenicaTableModel modelTabele;
				private JTabbedPane tabbedPane;
				
			// Deklaliramo javo staticno metodo,ki se izvede ob zagonu programa			
			// Vhodni parametri: so iz konzole
			// Potek opis: ustvari  novo okno 
			// Vrne vrednost: - 
			public static void main(String[] args) {
		
			Miza m = new Miza("Miza z pivskimi steklenicami"); 
		
		}
		// Javni konstriktor			
		// Vhodni parametri: n-naslov okna
		// Potek opis: vrne objekt tipa miza  
		// Vrne vrednost: vrne objekt tipa miza
			
				public Miza(String n) {
					// Klicemo  konstruktor nadrazreda
					super();
					// Inicializiramo zasebne lastnosti
					povrsina = new JPanel();
					povrsina.setToolTipText("");
					dodajJButton = new JButton("Dodaj steklenico");
					dodajJButton.setBackground(new Color(0, 0, 255));
					znamkaPolje = new JTextField(32);
					znamkaPolje.setFont(new Font("Tahoma", Font.BOLD, 12));
					znamkaPolje.setToolTipText("Sem vnesete znamko piva");
					alkoholPolje = new JTextField(8);
					modelTabele = new PivskaSteklenicaTableModel();
					tabela = new JTable(modelTabele); 
					
					
					//povrsino dodamo na mizo 
					getContentPane().add(povrsina, BorderLayout.WEST);
					
					dodajJButton.addActionListener(this);
					
					//dodamo gumb na povrsino in vnosna polja ter tabelo 
					JLabel label = new JLabel("Znamka:");
					label.setLabelFor(znamkaPolje);
					povrsina.add(label);
					
					tabbedPane = new JTabbedPane(JTabbedPane.TOP);
					povrsina.add(tabbedPane);
					povrsina.add(znamkaPolje);
					JLabel label_1 = new JLabel("Stopnja alkohola:");
					label_1.setLabelFor(alkoholPolje);
					povrsina.add(label_1);					
					povrsina.add(alkoholPolje);
					povrsina.add(dodajJButton);
					povrsina.add(tabela);
					
					// Pokazemo okno 
					setVisible(true);
					
					// Nastavimo velikost
					setSize(800,600);
					
					// Nastavimo obnasanje krizca X- da konca app
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
					System.out.println("Ustvarjam objekt miza");
				}

		// Metoda ki jo predpisuje vmesnik Action Listener 			
		// Vhodni parametri:dogodek
		// Potek opis: doda steklenico v tabelo   
		// Vrne vrednost: -
		
		public void actionPerformed(ActionEvent ae) {
			
			System.out.println("Dodajam steklenico ...");
			System.out.println("Znamka je " + znamkaPolje.getText());
			System.out.println("Stopnja alkohola je " + alkoholPolje.getText());
			
	//		double d = Double.parseDouble(alkoholPolje.getText());
	//		PivskaSteklenica flasa = new PivskaSteklenica(znamkaPolje.getText(),500, d );
			
			//dodamo objekt v seznam 
			modelTabele.addPivskaSteklenica(new PivskaSteklenica(znamkaPolje.getText(),500, Double.parseDouble(alkoholPolje.getText()) ));
		
		}

			
}