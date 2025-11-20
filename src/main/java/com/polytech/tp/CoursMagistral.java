package com.polytech.tp;

public class CoursMagistral extends CoursDecorator {
    
    public CoursMagistral(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (Magistral)";
    }

    @Override
    public double getDuree() {
        // Un cours magistral pourrait avoir une durée différente
        return coursDecorated.getDuree() + 0.5; // +30 minutes
    }
}