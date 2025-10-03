package EX1;

public class Main {
    public static void main(String[] args) {
        // --- EX1 ET EX2---
        Filiere info = new Filiere("Informatique");
        Filiere genie = new Filiere("Génie Civil");

        Etudiant e1 = new Etudiant("El Idrissi", "Mohamed");
        Etudiant e2 = new Etudiant("Bentable", "Fatima");
        Etudiant e3 = new Etudiant("Chouaib", "Youssef");
        e3.ajouterNote(10);
        e3.ajouterNote(12.5);
        e3.ajouterNote(11);
        Etudiant e4 = new Etudiant("Lahlou", "Salma");
        Etudiant e5 = new Etudiant("Roussafi", "Hassan");
        Etudiant e6 = new Etudiant("Amrani", "Aïcha");

        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);
        info.ajouterEtudiant(e6);

        genie.ajouterEtudiant(new Etudiant("Belkahia", "Khadija"));
        genie.ajouterEtudiant(new Etudiant("Laaroussi", "Walid"));

        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();
        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();
        e1.afficherNotes();
        System.out.println("Détail e3 : " + e3);
        System.out.println("--------------------------------------------------");

        // --- TP3 Auteur/Livre/bibliotheque ---
        Auteur hugo = new Auteur("Victor Hugo");
        Auteur orwell = new Auteur("George Orwell");

        Livre l1 = new Livre("Les Misérables", hugo);
        Livre l2 = new Livre("Notre-Dame de Paris", hugo);
        Livre l3 = new Livre("1984", orwell);

        Bibliotheque centrale = new Bibliotheque("Centrale");
        Bibliotheque quartier = new Bibliotheque("Quartier");

        centrale.ajouterLivre(l1);
        centrale.ajouterLivre(l3);
        quartier.ajouterLivre(l1);
        quartier.ajouterLivre(l2);

        System.out.println(hugo);
        hugo.getLivres().forEach(l ->
            System.out.println(" - " + l.getTitre() + " (id=" + l.getId() + ")")
        );
        System.out.println();
        System.out.println(orwell);
        orwell.getLivres().forEach(l ->
            System.out.println(" - " + l.getTitre() + " (id=" + l.getId() + ")")
        );
        System.out.println();
        System.out.println(centrale);
        centrale.getCollection().forEach(l ->
            System.out.println(" - " + l.getTitre() + " (id=" + l.getId() + ")")
        );
        System.out.println();
        System.out.println(quartier);
        quartier.getCollection().forEach(l ->
            System.out.println(" - " + l.getTitre() + " (id=" + l.getId() + ")")
        );
    }
}
