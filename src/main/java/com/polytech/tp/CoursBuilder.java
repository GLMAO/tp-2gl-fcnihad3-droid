package com.polytech.tp;

public class CoursBuilder {
    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;

    // Constructeur par défaut
    public CoursBuilder() {
        // Initialisation des valeurs par défaut
        this.salle = "Non définie";
        this.estOptionnel = false;
        this.niveau = "Débutant";
        this.necessiteProjecteur = false;
    }

    // Méthodes de configuration (style fluent)
    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CoursBuilder setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
        return this;
    }

    public CoursBuilder setEstOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
        return this;
    }

    public Cours build() {
        // Validation des champs obligatoires pour le test
        if (matiere == null || matiere.trim().isEmpty()) {
            throw new IllegalArgumentException("La matière est obligatoire");
        }
        if (enseignant == null || enseignant.trim().isEmpty()) {
            throw new IllegalArgumentException("L'enseignant est obligatoire");
        }
        
        // Utilisation de valeurs par défaut pour les champs non définis
        if (salle == null) salle = "Non définie";
        if (date == null) date = "Non définie";
        if (heureDebut == null) heureDebut = "Non définie";
        if (niveau == null) niveau = "Débutant";

        return new Cours(matiere, enseignant, salle, date, heureDebut, 
                        estOptionnel, niveau, necessiteProjecteur);
    }
}