				
/**
 * Razred za delo z steklenicami 
 * @author Ziga Zurc
 *
 */
		public class Steklenica {
	
	// Deklaliramo in inicializiramo  staticno konstanto lasnost materiala
		public static final String material = "Steklo";
	
	
	
			// Deklaliramo zasebne lastnosti razreda Steklenica
			private int kolicinaVsebine; // V ml
			private String vrstaVsebine;
			private boolean jeOdprta;
			private int kapaciteta; // V  ml
			
			
			/**
			 * Javni konstruktor
			 * ustvari nov objekt tipa Steklenica
			 */
			
			public Steklenica () {
	
	
				// Inicializiramo lasnosti objekta
				kolicinaVsebine = 0; 
				vrstaVsebine = "";
				jeOdprta = false;
				kapaciteta = 0 ;
				
				System.out.println("Ustvarjam nov objekt tipa Steklenica");
				
			}
			
			
			
			/**
			 * Javni konstrukto
			 * @param k Kapaciteta steklenice
			 */
			//Definiramo javni konstruktor,ki ustvari nov objekt tipa Steklenica
			public Steklenica (int k) {
	
	
				// Inicializiramo lasnosti objekta
				kolicinaVsebine = 0; 
				vrstaVsebine = "";
				jeOdprta = false;
				kapaciteta = k ;
			
			System.out.println("Ustvarjam nov objekt tipa Steklenica s kapaciteto " + k);
			
			
			}	
		
		/**
		 * 	Javna metoda za polnjenje steklenice
		 * Prištetje natočeno količino in doda vrsto vsebine
		 * @param k kolicina vsebine
		 * @param v vrsta vsebine 
		 * @return kolicina vsebine po polnjenu
		 * @throws Exception ki vrze izjemo  ce je steklenica zaprta
		 */
			
		public int napolni(int k, String v) throws Exception { 
		
		System.out.println("Steklenico polnim z " + v );
		System.out.println("Količina vsebine pred polnjenjem : " + kolicinaVsebine);
	
	
		if(jeOdprta) {
			
			
			
			
		//Prištejemo količino vsebine
		kolicinaVsebine = kolicinaVsebine + k ; 
		
		//dodamo vrsto vsebine
		vrstaVsebine = vrstaVsebine + v;
		
		System.out.println("Količina vsebine po polnjenju : " + kolicinaVsebine);
	
		
		}
	
			else {
		
				System.out.println("Steklenica je zaprta!");
				
				// vrzemo izjemo za neuspesno polnjenje 
				throw new Exception("Steklenica je zaprta!");
				}
		// Vrnemo kolicino vsebine
		return kolicinaVsebine;	
	}
		
		
		//
		//Vhodni parametri:-
		//Potek/opis: 
		//Vrne vrednost:  
		
		/**
		 * Javna metoda za odpiranje steklenice
		 * spremeni vrednost je Odprta na true		 
		 * @returntrue odpiranje uspešno, false - odpiranje neuspesno
		 */
		
		public boolean odpri () { 
		
		System.out.println("Odpiram steklenico...");
		// Ce je steklenica ze odprta 
		if(jeOdprta) {
			
			// Vrnemo false 
			return false;
			
		}
		// Ce je zaprta
		else {
			//Odpremo steklenico 
			jeOdprta = true; 
			// vrnemo true 
			return true;
			
		}
		
		
	}

		
		/**
		 * Javna metoda za zapiranje steklenice
		 * spremeni vrednost jeOdprta na false
		 * @returntrue  odpiranje uspešno, false - zapiranje neuspesno
		 */
		
		public boolean zapri () { 
		
		System.out.println("Zapiram steklenico...");
		// Ce je steklenica ze odprta 
		if(!jeOdprta) {
			
			// Vrnemo false 
			return false;
			
		}
		// Ce je zaprta
		else {
			//Odpremo steklenico 
			jeOdprta = false; 
			// vrnemo true 
			return true;
			
		}
		
		
	}
		
		
		/**
		 * Javna metoda vrne kolicino vsebine
		 * Vrne vrednost
		 * @return kolicina vsebine 
		 */
		
		public int getKolicinaVsebine() {
			
			return kolicinaVsebine;
		}




}