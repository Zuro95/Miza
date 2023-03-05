/*
			Ime dototeke:    PivskaSteklenica.java
			Avtor:           Žiga Zurc			
*/
import javax.swing.table.*;

public class PivskaSteklenicaTableModel extends DefaultTableModel {
	
	// konstruktor
	public PivskaSteklenicaTableModel() {
		
		
		//klice konstrukor nadrazreda 
		super();

		// v tabelo dodamo stolpce
		addColumn("Znamka");
		addColumn("Stopnja alkohola");
		
		// Dodamo naslovno vstico
		
		// Ustvarimo staticen seznam  objektov
		Object[] vrstica = new Object[] {"Znamka test", "Stopnja test"};
		
		// dodamo vrstico  v tabelo 
		addRow(vrstica);

		
	}		
	//Vhodni parametri: ps-pivska steklenica
	//Opis: metoda ki doda pivsko steklenico na seznam in v tabelo
	// Vrne vrednost: - 
	
	public void addPivskaSteklenica(PivskaSteklenica ps) {
		
		// Ustvarimo staticen seznam  objektov
		Object[] vrstica = new Object[] {ps.getZnamkaKolicina(), ps.getStopnjaAlkohola()};
		
		// dodamo vrstico  v tabelo 
		addRow(vrstica);
	}
	
}