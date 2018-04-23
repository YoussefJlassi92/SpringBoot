package org.banque.metier;

import java.util.Optional;

import org.banque.entities.Compte;

public interface CompteMetier {
	
	public Compte saveCompte(Compte compte);
	public Optional<Compte> getCompte(String codeCompte);

}
