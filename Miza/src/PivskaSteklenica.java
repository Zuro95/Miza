/*
			Ime dototeke:    PivskaSteklenica.java
			Avtor:           Žiga Zurc			
*/

//Deklaliramo javi razred ki razsirja razred steklenica
// in implemetira vmesnik AlkoholnaPijaca
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {

		// Vse lasnosti od nadrazreda se prenesejo 
		//Deklaliramo nove lasnosti 
		private String znamka;
		private boolean jePovratna;
		private double temperatura;  // v stopinjah celzijah 
		private double stopnjaAlkohola;
		
			// Javni konstruktor
			// Vhodni parametri: z-znamka in k-kapaciteta, s - stopnja alkohola 
			// Potek opis: ustvari nov objekt tipa PivskaSteklenica (predvidevamo da ni povratna)
			// Vrne vrednost: nov objekt
			
		public PivskaSteklenica(String z, int k , double s) {
	
	// Tukaj so lahko samo komentari nic drugega
		// Poklicemo kontruktor nadrazreda
		super(k);	
		
		
		// Napolnimo steklenico - klicemo metodo deklalirano v nadrazredu 
		odpri();
		try {
		napolni(k, "Pivo");
		}
		catch(Exception e) {
				System.out.println("Napaka pri uvodnem polnjenju nove steklenice: " + e);
		}	
		zapri();
		
		// Inicializiramo se dodatne lasnosti         
		znamka = z ;
		jePovratna = false;
		temperatura = 22.0;
		stopnjaAlkohola = s; 
		
		
		
  }
  
						// Javna metoda ki ohladi pivo  na zeljeno temperaturo 
						// Vhodni parametri: t- temperatura
						// Potek opis: zniza temperaturo 
						// Vrne vrednost: -
						
					public void ohladi(double t) {
						
						System.out.println("Hladimo pivo " + znamka + " iz " + temperatura + " na " );
						
						
					// Znizamo temperaturo pive 
					temperatura = temperatura - t;
					
					System.out.println(temperatura + " st.c ");
					}
					
						// Javna getter metoda ki vrne znamko in kolicino 
						// Vhodni parametri: -  
						// Potek opis: vrne vrednosti  
						// Vrne vrednost: niz z znamko  in kolicino vsebine
						
					public String getZnamkaKolicina() {
						return znamka + ", "  + getKolicinaVsebine() + "ml";
					}

						// Implemetiramo metodo ki vrne stopnjo alkohola in jo predpisuje vmesnik AlkoholnaPijaca
						// Vhodni parametri: -
						// Potek opis: vrne stopnjo 
						// Vrne vrednost: double-stopnja alkohola
			
							public double getStopnjaAlkohola() {
								
								return stopnjaAlkohola;
							}

					
}