# Application Android - Calcul des Impôts Locaux

Cette application Android permet de calculer les impôts locaux en fonction de la surface d'habitation et du nombre de pièces. Elle inclut également une option pour prendre en compte la présence d'une piscine.

## Fonctionnalités

- **Calcul des Impôts** : L'utilisateur peut entrer sa surface habitable, le nombre de pièces, et spécifier s'il possède une piscine.
- **Affichage des Résultats** : Après le calcul, les résultats sont affichés, y compris l'impôt de base, l'impôt supplémentaire et l'impôt total.

## Interface Utilisateur

L'interface utilisateur se compose de :
- **Champs de texte** pour saisir le nom, l'adresse, la surface et le nombre de pièces.
- **Checkbox** pour indiquer si une piscine est présente.
- **Bouton** pour effectuer le calcul.
- **Texte** affichant les résultats du calcul.

## Structure du Projet

### MainActivity.java

La logique principale de l'application est contenue dans le fichier `MainActivity.java`. Les principales caractéristiques incluent :

- **Champs de saisie** : Pour le nom, l'adresse, la surface, et le nombre de pièces.
- **Checkbox** : Pour spécifier si une piscine est présente.
- **Button** : Pour effectuer le calcul des impôts.

Les résultats sont calculés à l'aide des formules suivantes :

- **Impôt de base** : 2 fois la surface habitable.
- **Impôt supplémentaire** : 50 par pièce, plus 100 si une piscine est présente.

### activity_main.xml

Le fichier `activity_main.xml` définit la disposition de l'application :

- Utilisation d'un `LinearLayout` pour organiser les éléments verticalement.
- Comprend des `TextView` pour les étiquettes, des `EditText` pour la saisie de texte, et un `CheckBox` pour l'option piscine.
- Le bouton "Calcul" pour déclencher le calcul des impôts.

## Instructions d'Installation

1. Clonez ce dépôt ou téléchargez le code source.
2. Ouvrez le projet dans Android Studio.
3. Compilez et exécutez l'application sur un appareil Android ou un émulateur.

## Technologies Utilisées

- **Langage** : Java
- **SDK Android** : Version 21 ou supérieure
- **Bibliothèques** : AndroidX

## Screen Video
[![Vidéo de démonstration]](https://github.com/user-attachments/assets/0184dd9f-3467-45c7-accc-5e1498e851a2)
