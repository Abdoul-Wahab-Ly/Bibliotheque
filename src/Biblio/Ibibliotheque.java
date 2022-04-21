package Biblio;

public interface Ibibliotheque {
	
	public void afficherDoc();
    public Documents document(int i);

    public boolean ajouter(Documents Doc);
    public boolean supprimer(Documents Doc);
    
    public void afficherAuteur();
}
