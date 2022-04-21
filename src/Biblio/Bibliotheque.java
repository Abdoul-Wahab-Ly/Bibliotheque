package Biblio;


public class Bibliotheque {
	    public int Capacite;
	    public static int Nb=0;
	    public Documents[] doc;
	    public Bibliotheque(int Capacite) {
	        this.Capacite = Capacite;
	        doc=new Documents[5];
	        Bibliotheque.Nb=0;
	    }
	  
	

}
