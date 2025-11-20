CS_11(FACI Nihad )

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rGfOobSC)


 EXERCICE 1 : PATTERN BUILDER
Problème Identifié
La classe Cours possédait un constructeur monolithique avec de nombreux paramètres, rendant l'instanciation complexe, error-prone et difficile à lire. La validation des données était absente et la création d'objets partiels impossible.

Solution Apportée
Implémentation du pattern Builder permettant une construction fluide et progressive des objets Cours. Cette approche offre une interface claire et intuitive pour créer des instances complexes étape par étape.

 EXERCICE 2 : PATTERN OBSERVER
Problème Identifié
Absence de mécanisme automatique de notification lors des modifications de l'emploi du temps. Les étudiants et responsables devaient être informés manuellement des changements, créant un couplage fort et des oublis potentiels.

Solution Apportée
Mise en place d'un système de publication/abonnement où le gestionnaire d'emploi du temps notifie automatiquement tous les observateurs inscrits lors de tout changement.


EXERCICE 3 : PATTERN DECORATOR
Problème Identifié
Besoin d'ajouter dynamiquement des caractéristiques spécifiques aux cours (en ligne, en anglais, magistral) sans alourdir la classe de base ni créer une hiérarchie de classes rigide.

Solution Apportée
Création d'un système de décorateurs permettant d'envelopper les objets Cours existants et d'étendre leurs fonctionnalités de manière transparente et composable.