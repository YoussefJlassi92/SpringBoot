package org.banque.services;

import java.util.Optional;

import org.banque.entities.Compte;
import org.banque.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CompteRestService {
	
	@Autowired
	private CompteMetier compteMetier;

	@RequestMapping(value = "/comptes", method = RequestMethod.POST)
	public Compte saveCompte(@RequestBody Compte compte) {
		return compteMetier.saveCompte(compte);
	}

	@RequestMapping(value = "/comptes/{codeCompte}", method = RequestMethod.GET)
	public Optional<Compte> getCompte(@PathVariable("codeCompte") String codeCompte) {
		return compteMetier.getCompte(codeCompte);
	}
	
	

}
