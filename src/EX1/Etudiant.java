package EX1;

public class Etudiant {
    private static int compteur = 0;
    private final int id;

    private String nom;
    private String prenom;

    private double[] notes;
    private int nbNotes;

    private Filiere filiere;

    public Etudiant(String nom, String prenom) {
        this.id = ++compteur;
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new double[5];
        this.nbNotes = 0;
    }

    public void ajouterNote(double note) {
        if (nbNotes == notes.length) {
            double[] tmp = new double[notes.length * 2];
            System.arraycopy(notes, 0, tmp, 0, notes.length);
            notes = tmp;
        }
        notes[nbNotes++] = note;
    }

    public double calculerMoyenne() {
        if (nbNotes == 0) return 0.0;
        double s = 0.0;
        for (int i = 0; i < nbNotes; i++) s += notes[i];
        return s / nbNotes;
    }

    public void afficherNotes() {
        System.out.print("Notes de " + nom + " " + prenom + " : ");
        for (int i = 0; i < nbNotes; i++) {
            System.out.print(notes[i]);
            if (i < nbNotes - 1) System.out.print(", ");
        }
        System.out.println();
    }

    void setFiliere(Filiere f) { this.filiere = f; }
    public Filiere getFiliere() { return filiere; }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getNbNotes() { return nbNotes; }

    @Override
    public String toString() {
        String fil = (filiere == null) ? "Aucune" : filiere.getNom();
        return "Etudiant{id=" + id +
               ", nom=" + nom +
               ", prenom=" + prenom +
               ", moyenne=" + String.format("%.2f", calculerMoyenne()) +
               ", filiere=" + fil +
               "}";
    }  

    }