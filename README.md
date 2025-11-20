CS_11(FACI Nihad )

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rGfOobSC)


ANALYSE DES PRINCIPES SOLID
1. SRP (Single Responsibility Principle) - RESPECTÉ 
Cours : Représente un cours (données)

CoursBuilder : Construit des cours (construction)

CoursDecorator : Étend les fonctionnalités (extension)

GestionnaireEmploiDuTemps : Gère les cours et notifications (gestion)

Etudiant/Responsable : Réagissent aux notifications (réaction)


2. OCP (Open/Closed Principle) - RESPECTÉ 
Decorator Pattern : On peut ajouter de nouveaux décorateurs sans modifier le code existant

Observer Pattern : On peut ajouter de nouveaux observateurs sans modifier le sujet

3. LSP (Liskov Substitution Principle) - RESPECTÉ 
Tous les décorateurs peuvent remplacer ICours

Tous les observateurs peuvent remplacer Observer

Tous les sujets peuvent remplacer Subject

4. ISP (Interface Segregation Principle) - RESPECTÉ 
ICours : Interface minimale pour un cours

Subject/Observer : Interfaces séparées et ciblées

Pas d'interfaces "grosses" avec des méthodes inutiles

5. DIP (Dependency Inversion Principle) - RESPECTÉ 
Dépendances sur des abstractions (ICours, Subject, Observer)

Pas de dépendances directes entre classes concrètes

Injection des dépendances via constructeurs



