# Hotel
# Projet "Sunset Paradise Hotel"

Ce projet consiste à créer une application web pour le "Sunset Paradise Hotel", permettant aux utilisateurs de rechercher des chambres d'hôtel disponibles, d'effectuer des réservations et de consulter leurs réservations précédentes.

## Fonctionnalités

1. **Liste des Chambres d'Hôtel :**
    - Afficher une liste des chambres d'hôtel disponibles avec des détails tels que le type de chambre, le prix, les équipements, la disponibilité, etc.

2. **Gestion des Réservations :**
    - Permettre à l'utilisateur de rechercher des chambres en fonction des dates d'arrivée/départ, du nombre de personnes, des préférences de type de chambre, etc.
    - Permettre à l'utilisateur de faire des réservations en sélectionnant des chambres disponibles et en fournissant les détails nécessaires.

3. **Consultation des Réservations :**
    - Permettre à l'utilisateur de consulter ses réservations précédentes, y compris les détails tels que les dates de séjour, le type de chambre, etc.

## Conception

### Diagramme de classes UML :

Proposer un diagramme de classes en représentant les deux classes principales de votre application, Room et Reservation.

## Côté Technique

### Classes Backend (Java EE) :

- Servlet(s) pour :
    - Gérer la recherche de chambres d'hôtel.
    - Gérer la création de réservations.
    - La consultation des réservations précédentes de l'utilisateur.

### JavaBeans :

- Classe Room pour représenter les informations sur une chambre d'hôtel (type, prix, équipements, disponibilité, etc.).
- Classe Reservation pour représenter les réservations effectuées par les utilisateurs (identifiant, chambre réservée, dates, etc.).

### DAO (Data Access Object) :

- Interface RoomDAO pour définir les opérations de manipulation des données des chambres (recherche, réservation, etc.).
- Interface ReservationDAO pour définir les opérations de manipulation des données des réservations.

### Base de Données :

- Utilisation d'une base de données relationnelle (par exemple, MySQL, PostgreSQL) pour stocker les informations sur les chambres et les réservations.
- Utilisation de JDBC (Java Database Connectivity) pour la communication entre l'application Java et la base de données.

## Frontend :

- HTML pour la structure de la page.
- CSS pour le design et la mise en page.
- JavaScript pour les fonctionnalités interactives et la validation des données côté client.

## Bonus :

- Ajoutez une fonctionnalité qui génère un graphique illustrant les types de chambres les plus réservés sur une période spécifique. Ce graphique fournira des insights sur les préférences des utilisateurs en matière de types de chambres, permettant ainsi aux gestionnaires d'hôtels de prendre des décisions éclairées concernant la gestion de leur inventaire de chambres et l'ajustement des stratégies de tarification.
- Utilisation de bibliothèques de graphiques JavaScript telles que Chart.js pour la création du graphique.
- Intégration avec les données de réservation existantes dans la base de données de l'application.
Technologies

Java EE (Servlets)
Java EE (JSP)
HTML/CSS
MySQL
Installation et exécution

Clonez le dépôt GitHub: (https://github.com/manbarmohamed/Hotel.git)
Installez un serveur Java EE compatible, comme Apache Tomcat.
Déployez l'application web sur le serveur.
Démarrez le serveur.
Accédez à l'application web dans votre navigateur web à l'adresse http://localhost:3308/hotel/.
Contributeurs

*Manbar Mohamed

Liens utiles

Java EE: https://javaee.github.io/
Apache Tomcat: https://tomcat.apache.org/
HTML: https://developer.mozilla.org/fr/docs/Web/HTML
CSS: https://developer.mozilla.org/fr/docs/Web/CSS
MySQL: https://dev.mysql.com/doc/# 
