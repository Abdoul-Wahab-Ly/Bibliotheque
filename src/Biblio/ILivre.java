package Biblio;

public interface ILivre {
	
	public void afficherDoc();
    public Documents document(int i);

    public boolean ajouter(Livre Liv);
    public boolean supprimer(Livre Liv);
    
    public void afficherAuteur();

}
