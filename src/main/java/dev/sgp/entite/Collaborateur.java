package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	String matricule;
	String nom;
	String prenom;
	LocalDate dateDeNaissance;
	String adresse;
	String numeroDeSecuriteSocial;
	String emailPro;
	String photo;
	ZonedDateTime dateHeureCreation;
	Boolean actif;
}
