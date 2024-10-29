# Documentation de la Classe Ordinateur

## Français

**Package :** `com.javaIntellij`

La classe `Ordinateur` représente un ordinateur avec des attributs tels que le nom, la marque, le prix, une description et le stock disponible. Elle offre des méthodes pour obtenir les valeurs de chaque attribut.

### Attributs
- `id` (long) : Identifiant unique de l'ordinateur, généré automatiquement.
- `nom` (String) : Nom du modèle de l'ordinateur.
- `marque` (String) : Marque de l'ordinateur.
- `prix` (double) : Prix de l'ordinateur.
- `description` (String) : Description de l'ordinateur.
- `stock` (int) : Quantité disponible en stock.

### Constructeurs
- `Ordinateur()` : Constructeur par défaut.
- `Ordinateur(String nom, String marque, double prix, String description, int stock)` : Crée une nouvelle instance d'`Ordinateur` en initialisant les attributs avec les valeurs fournies et en générant un identifiant unique.

### Méthodes
- `long getId()` : Retourne l'identifiant de l'ordinateur.
- `String getNom()` : Retourne le nom du modèle de l'ordinateur.
- `String getMarque()` : Retourne la marque de l'ordinateur.
- `double getPrix()` : Retourne le prix de l'ordinateur.
- `String getDescription()` : Retourne la description de l'ordinateur.
- `int getStock()` : Retourne la quantité en stock de l'ordinateur.

---

## English

**Package:** `com.javaIntellij`

The `Ordinateur` class represents a computer with attributes such as name, brand, price, description, and available stock. It provides methods to retrieve each attribute's value.

### Attributes
- `id` (long): Unique identifier for the computer, automatically generated.
- `nom` (String): Model name of the computer.
- `marque` (String): Brand of the computer.
- `prix` (double): Price of the computer.
- `description` (String): Description of the computer.
- `stock` (int): Available stock quantity of the computer.

### Constructors
- `Ordinateur()`: Default constructor.
- `Ordinateur(String nom, String marque, double prix, String description, int stock)`: Creates a new `Ordinateur` instance, initializing the attributes with the provided values and generating a unique identifier.

### Methods
- `long getId()`: Returns the computer's unique identifier.
- `String getNom()`: Returns the computer model's name.
- `String getMarque()`: Returns the computer brand.
- `double getPrix()`: Returns the computer's price.
- `String getDescription()`: Returns the computer's description.
- `int getStock()`: Returns the available stock quantity of the computer.


# Documentation de la Classe Categorie

## Français

**Package :** `com.javaIntellij`

La classe `Categorie` représente une catégorie d'ordinateurs avec un identifiant unique, un nom, une description, et une liste d'ordinateurs appartenant à cette catégorie. Elle offre des méthodes pour gérer les ordinateurs associés.

### Attributs
- `id` (long) : Identifiant unique de la catégorie, généré automatiquement.
- `nom` (String) : Nom de la catégorie.
- `description` (String) : Description de la catégorie.
- `ordinateurList` (List\<Ordinateur\>) : Liste des ordinateurs associés à cette catégorie.

### Constructeurs
- `Categorie()` : Constructeur par défaut qui initialise une liste vide d'ordinateurs.
- `Categorie(String nom, String description, List<Ordinateur> ordinateurList)` : Crée une nouvelle instance de `Categorie` en initialisant les attributs avec les valeurs fournies, y compris une liste d'ordinateurs.

### Méthodes
- `void ajouterOrdinateur(Ordinateur ordinateur)` : Ajoute un ordinateur à la liste si celui-ci n'y est pas déjà présent.
- `void supprimerOrdinateur(Ordinateur ordinateur)` : Supprime un ordinateur de la liste s'il est présent.
- `List<Ordinateur> rechercherOrdinateur(double prix)` : Recherche et retourne une liste d'ordinateurs dont le prix correspond à la valeur spécifiée.

---

## English

**Package:** `com.javaIntellij`

The `Categorie` class represents a category of computers with a unique ID, a name, a description, and a list of computers associated with this category. It provides methods for managing the associated computers.

### Attributes
- `id` (long): Unique identifier for the category, automatically generated.
- `nom` (String): Name of the category.
- `description` (String): Description of the category.
- `ordinateurList` (List\<Ordinateur\>): List of computers associated with this category.

### Constructors
- `Categorie()`: Default constructor that initializes an empty list of computers.
- `Categorie(String nom, String description, List<Ordinateur> ordinateurList)`: Creates a new `Categorie` instance, initializing the attributes with the provided values, including a list of computers.

### Methods
- `void ajouterOrdinateur(Ordinateur ordinateur)`: Adds a computer to the list if it is not already present.
- `void supprimerOrdinateur(Ordinateur ordinateur)`: Removes a computer from the list if it is present.
- `List<Ordinateur> rechercherOrdinateur(double prix)`: Searches for and returns a list of computers whose price matches the specified value.


# Documentation de la Classe Commande

## Français

**Package :** `com.javaIntellij`

La classe `Commande` représente une commande effectuée par un client, incluant une référence unique, une date de commande, un état de la commande, et le client associé.

### Attributs
- `id` (long) : Identifiant unique de la commande, généré automatiquement.
- `reference` (String) : Référence unique de la commande.
- `date` (LocalDate) : Date de la commande.
- `etat` (Etat) : État actuel de la commande.
- `client` (Client) : Client qui a passé la commande.

### Constructeurs
- `Commande()` : Constructeur par défaut.
- `Commande(String reference, Client client, LocalDate date, Etat etat)` : Crée une nouvelle instance de `Commande` en initialisant les attributs avec les valeurs fournies et en générant un identifiant unique.

### Méthodes
- `long getId()` : Retourne l'identifiant de la commande.
- `String getReference()` : Retourne la référence unique de la commande.
- `LocalDate getDate()` : Retourne la date de la commande.
- `Etat getEtat()` : Retourne l'état actuel de la commande.
- `Client getClient()` : Retourne le client associé à la commande.

---

## English

**Package:** `com.javaIntellij`

The `Commande` class represents an order made by a client, including a unique reference, order date, order status, and the associated client.

### Attributes
- `id` (long): Unique identifier for the order, automatically generated.
- `reference` (String): Unique reference for the order.
- `date` (LocalDate): Date of the order.
- `etat` (Etat): Current status of the order.
- `client` (Client): Client who placed the order.

### Constructors
- `Commande()`: Default constructor.
- `Commande(String reference, Client client, LocalDate date, Etat etat)`: Creates a new `Commande` instance, initializing the attributes with the provided values and generating a unique identifier.

### Methods
- `long getId()`: Returns the order's unique identifier.
- `String getReference()`: Returns the unique reference of the order.
- `LocalDate getDate()`: Returns the order date.
- `Etat getEtat()`: Returns the current status of the order.
- `Client getClient()`: Returns the client associated with the order.


# Documentation de l'Enumération Etat

## Français

**Package :** `com.javaIntellij`

L'énumération `Etat` représente les différents états possibles pour un objet, comme une commande ou un produit. Elle propose trois niveaux d'état pour décrire la qualité ou le statut d'un élément.

### Valeurs
- `MAUVAISE` : Indique que l'état est mauvais.
- `MOYENNE` : Indique que l'état est moyen.
- `BONNE` : Indique que l'état est bon.

---

## English

**Package:** `com.javaIntellij`

The `Etat` enumeration represents different possible states for an object, such as an order or a product. It provides three levels of status to describe the quality or condition of an item.

### Values
- `MAUVAISE`: Indicates that the state is poor.
- `MOYENNE`: Indicates that the state is average.
- `BONNE`: Indicates that the state is good.


# Documentation de la Classe LigneCommande

## Français

**Package :** `com.javaIntellij`

La classe `LigneCommande` représente une ligne dans une commande, associant une quantité spécifique d'un produit (ordinateur) à une commande donnée.

### Attributs
- `id` (long) : Identifiant unique de la ligne de commande, généré automatiquement.
- `quantite` (int) : Quantité de l'ordinateur commandé.
- `commande` (Commande) : Référence à la commande associée.
- `ordinateur` (Ordinateur) : Référence à l'ordinateur commandé.

### Constructeurs
- `LigneCommande()` : Constructeur par défaut.
- `LigneCommande(int quantite, Commande commande, Ordinateur ordinateur)` : Crée une nouvelle instance de `LigneCommande`, en initialisant la quantité, la commande, et l'ordinateur associé, et en générant un identifiant unique.

---

## English

**Package:** `com.javaIntellij`

The `LigneCommande` class represents a line in an order, associating a specific quantity of a product (computer) with a given order.

### Attributes
- `id` (long): Unique identifier for the order line, automatically generated.
- `quantite` (int): Quantity of the ordered computer.
- `commande` (Commande): Reference to the associated order.
- `ordinateur` (Ordinateur): Reference to the ordered computer.

### Constructors
- `LigneCommande()`: Default constructor.
- `LigneCommande(int quantite, Commande commande, Ordinateur ordinateur)`: Creates a new `LigneCommande` instance, initializing the quantity, order, and associated computer, and generating a unique identifier.


# Documentation de la Classe Client

## Français

**Package :** `com.javaIntellij`

La classe `Client` représente un client dans le système, incluant ses informations personnelles, ses coordonnées, et la liste de ses commandes.

### Attributs
- `id` (long) : Identifiant unique du client, généré automatiquement.
- `nom` (String) : Nom du client.
- `prenom` (String) : Prénom du client.
- `adresse` (String) : Adresse postale du client.
- `email` (String) : Adresse e-mail du client.
- `ville` (String) : Ville de résidence du client.
- `telephone` (String) : Numéro de téléphone du client.
- `commandes` (List\<Commande\>) : Liste des commandes passées par le client.

### Constructeurs
- `Client()` : Constructeur par défaut.
- `Client(String nom, String prenom, String adresse, String email, String ville, String telephone)` : Crée une nouvelle instance de `Client` en initialisant les informations personnelles et de contact fournies, et en générant un identifiant unique.

### Méthodes
- `long getId()` : Retourne l'identifiant unique du client.
- `String getNom()` : Retourne le nom du client.
- `String getPrenom()` : Retourne le prénom du client.
- `String getAdresse()` : Retourne l'adresse du client.
- `String getEmail()` : Retourne l'adresse e-mail du client.
- `String getVille()` : Retourne la ville de résidence du client.
- `String getTelephone()` : Retourne le numéro de téléphone du client.
- `List<Commande> getCommandes()` : Retourne la liste des commandes du client.
- `void ajouterCommande(Commande commande)` : Ajoute une commande à la liste des commandes du client, si elle n'est pas déjà présente.
- `void supprimerCommande(Commande commande)` : Supprime une commande de la liste des commandes du client.

---

## English

**Package:** `com.javaIntellij`

The `Client` class represents a client in the system, including their personal information, contact details, and a list of their orders.

### Attributes
- `id` (long): Unique identifier for the client, automatically generated.
- `nom` (String): Client's last name.
- `prenom` (String): Client's first name.
- `adresse` (String): Client's postal address.
- `email` (String): Client's email address.
- `ville` (String): Client's city of residence.
- `telephone` (String): Client's phone number.
- `commandes` (List\<Commande\>): List of orders placed by the client.

### Constructors
- `Client()`: Default constructor.
- `Client(String nom, String prenom, String adresse, String email, String ville, String telephone)`: Creates a new `Client` instance by initializing the personal and contact information provided and generating a unique identifier.

### Methods
- `long getId()`: Returns the client's unique identifier.
- `String getNom()`: Returns the client's last name.
- `String getPrenom()`: Returns the client's first name.
- `String getAdresse()`: Returns the client's address.
- `String getEmail()`: Returns the client's email address.
- `String getVille()`: Returns the client's city of residence.
- `String getTelephone()`: Returns the client's phone number.
- `List<Commande> getCommandes()`: Returns the list of the client’s orders.
- `void ajouterCommande(Commande commande)`: Adds an order to the client’s list of orders if it's not already present.
- `void supprimerCommande(Commande commande)`: Removes an order from the client’s list of orders.



# Documentation de la Classe Main

## Français

**Package :** `com.javaIntellij`

La classe `Main` sert de point d'entrée pour le programme. Elle crée des instances de `Ordinateur`, `Categorie`, `Client`, `Commande`, et `LigneCommande` afin de simuler une commande de plusieurs ordinateurs pour un client donné. Elle affiche également des informations de base sur la commande créée.

### Fonctionnalité
1. **Création des Ordinateurs** : Trois instances de la classe `Ordinateur` sont créées avec des spécifications définies, puis ajoutées à une liste.
2. **Catégorie** : Une instance de `Categorie` est créée, regroupant les ordinateurs dans une catégorie de produits.
3. **Client** : Un client est créé avec ses informations personnelles.
4. **Commande** : Une commande est créée pour ce client, avec une date actuelle et un état moyen.
5. **Lignes de Commande** : Trois lignes de commande sont créées, chacune associant un ordinateur et une quantité spécifique, et ajoutées à une liste.
6. **Affichage des Informations** : Les informations de la commande (référence, date, état, et nom du client) sont affichées dans la console.

### Exécution du Programme
La classe `Main` exécute le programme en initialisant les objets et en affichant les détails de la commande dans la console.

---

## English

**Package:** `com.javaIntellij`

The `Main` class serves as the entry point for the program. It creates instances of `Ordinateur`, `Categorie`, `Client`, `Commande`, and `LigneCommande` to simulate an order of multiple computers for a given client. Basic information about the created order is then displayed.

### Functionality
1. **Creating Computers**: Three instances of the `Ordinateur` class are created with specific attributes, then added to a list.
2. **Category**: A `Categorie` instance is created, grouping the computers into a product category.
3. **Client**: A client is created with personal details.
4. **Order**: An order is created for this client, with the current date and a "MOYENNE" (medium) status.
5. **Order Lines**: Three order lines are created, each associating a computer with a specific quantity, and added to a list.
6. **Display Information**: The order details (reference, date, status, and client name) are displayed in the console.

### Running the Program
The `Main` class executes the program by initializing the objects and displaying the order details in the console.
