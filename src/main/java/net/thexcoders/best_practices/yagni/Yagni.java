package net.thexcoders.best_practices.yagni;

import java.util.Date;

public class Yagni {
    // You Aren't Gonna need It
    // adding variables & methods that you will not use for the time being
    // don't anticipate the code.

    public static class Personne {
        int id;
        int age; // calculer age
        String nom;
        String prenom;
        String email;
        String CIN; // pour verification
        Date dateNaissance;
        String secretQuestion; // pour sécurité
        String tel; // pour validation


        public Personne(int id, String nom, String prenom, String email, Date dateNaissance) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.email = email;
            this.dateNaissance = dateNaissance;
        }
    }

}
