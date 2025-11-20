package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {
    
    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        // La durée reste la même pour un cours en ligne
        return coursDecorated.getDuree();
    }
}