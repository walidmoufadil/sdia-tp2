# Classe Personne

## Français


La classe `Personne` représente un individu avec des attributs tels que l'identifiant, le nom, le prénom, l'email, le téléphone et l'âge. Elle offre une méthode pour afficher les informations de la personne.

### Attributs
- `id` (long) : Identifiant unique généré automatiquement.
- `nom` (String) : Nom de la personne.
- `prenom` (String) : Prénom de la personne.
- `email` (String) : Adresse email de la personne.
- `tel` (String) : Numéro de téléphone de la personne.
- `age` (int) : Âge de la personne.

### Constructeurs
- `Personne()` : Constructeur par défaut.
- `Personne(String nom, String prenom, String email, String tel, int age)` : Crée une nouvelle instance de `Personne` avec un identifiant aléatoire et initialise les attributs avec les valeurs fournies.

### Méthodes
- `void afficher()` : Affiche les informations de la personne (nom, prénom, email, téléphone, âge) dans la console.

---

## English


The `Personne` class represents an individual with attributes such as ID, name, surname, email, phone, and age. It includes a method to display the person's information.

### Attributes
- `id` (long): A unique identifier automatically generated.
- `nom` (String): The person's last name.
- `prenom` (String): The person's first name.
- `email` (String): The person's email address.
- `tel` (String): The person's phone number.
- `age` (int): The person's age.

### Constructors
- `Personne()`: Default constructor.
- `Personne(String nom, String prenom, String email, String tel, int age)`: Creates a new `Personne` instance with a random ID and initializes the attributes with the given values.

### Methods
- `void afficher()`: Displays the person's information (name, surname, email, phone, age) in the console.



# Classe Adherent

## Français


La classe `Adherent` est une sous-classe de `Personne`. Elle représente un adhérent avec des attributs supplémentaires, comme un numéro d'adhérent, en plus des informations de base héritées de la classe `Personne`.

### Attributs
- `id` (long) : Identifiant unique de l'adhérent.
- `numAdherent` (int) : Numéro d'adhérent unique.

### Constructeurs
- `Adherent()` : Constructeur par défaut.
- `Adherent(String nom, String prenom, String email, String tel, int age, int numAdherent)` : Crée une nouvelle instance de `Adherent` en initialisant les informations de base de la `Personne` et le numéro d'adhérent avec les valeurs fournies.

### Méthodes
- `void afficher()` : Affiche les informations de la personne (nom, prénom, email, téléphone, âge) ainsi que le numéro d'adhérent dans la console.

---

## English


The `Adherent` class is a subclass of `Personne`. It represents a member with additional attributes, such as a membership number, along with the basic information inherited from the `Personne` class.

### Attributes
- `id` (long): Unique identifier for the member.
- `numAdherent` (int): Unique membership number.

### Constructors
- `Adherent()`: Default constructor.
- `Adherent(String nom, String prenom, String email, String tel, int age, int numAdherent)`: Creates a new `Adherent` instance, initializing the basic `Personne` information and the membership number with the given values.

### Methods
- `void afficher()`: Displays the person's information (name, surname, email, phone, age) along with the membership number in the console.



# Classe Livre

## Français


La classe `Livre` représente un livre avec un identifiant unique, un numéro ISBN, et un auteur associé. Elle inclut une méthode pour afficher les informations du livre et de l'auteur.

### Attributs
- `id` (long) : Identifiant unique généré automatiquement pour le livre.
- `ISBN` (long) : Numéro ISBN unique du livre.
- `auteur` (Auteur) : Objet `Auteur` représentant l'auteur du livre.

### Constructeurs
- `Livre()` : Constructeur par défaut.
- `Livre(long ISBN, Auteur auteur)` : Crée une nouvelle instance de `Livre` avec un identifiant unique généré aléatoirement, un ISBN et un auteur spécifié.

### Méthodes
- `void afficher()` : Affiche le numéro ISBN du livre et les informations de l'auteur (par appel à la méthode `afficher()` de la classe `Auteur`).

---

## English


The `Livre` class represents a book with a unique ID, an ISBN number, and an associated author. It includes a method to display the book and author information.

### Attributes
- `id` (long): Automatically generated unique identifier for the book.
- `ISBN` (long): Unique ISBN number of the book.
- `auteur` (Auteur): `Auteur` object representing the book's author.

### Constructors
- `Livre()`: Default constructor.
- `Livre(long ISBN, Auteur auteur)`: Creates a new `Livre` instance with a randomly generated unique ID, an ISBN, and a specified author.

### Methods
- `void afficher()`: Displays the book's ISBN number and the author's information (by calling the `afficher()` method in the `Auteur` class).



# Classe Auteur

## Français


La classe `Auteur` est une sous-classe de `Personne`. Elle représente un auteur avec des informations supplémentaires, telles qu'un numéro d'auteur unique, en plus des attributs hérités de la classe `Personne`.

### Attributs
- `id` (long) : Identifiant unique de l'auteur.
- `numAuteur` (int) : Numéro unique de l'auteur.

### Constructeurs
- `Auteur()` : Constructeur par défaut.
- `Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur)` : Crée une nouvelle instance de `Auteur` en initialisant les informations de la `Personne` de base et en ajoutant le numéro unique de l'auteur.

### Méthodes
- `void afficher()` : Affiche les informations de l'auteur, y compris le nom, le prénom, l'email, le téléphone, l'âge et le numéro unique de l'auteur (numAuteur), dans la console.

---

## English


The `Auteur` class is a subclass of `Personne`. It represents an author with additional information, such as a unique author number, along with the inherited attributes from the `Personne` class.

### Attributes
- `id` (long): Unique identifier for the author.
- `numAuteur` (int): Unique author number.

### Constructors
- `Auteur()`: Default constructor.
- `Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur)`: Creates a new `Auteur` instance, initializing the basic `Personne` information and adding the unique author number.

### Methods
- `void afficher()`: Displays the author’s information, including name, surname, email, phone, age, and the unique author number (numAuteur), in the console.



# Programme Principal - Classe Main

## Français


La classe `Main` contient la méthode principale pour exécuter un exemple de l'application. Elle crée des instances des classes `Adherent`, `Auteur`, et `Livre`, puis affiche leurs informations en appelant les méthodes `afficher()`.

### Fonctionnalités
- Crée un `Adherent` avec un nom, prénom, email, numéro de téléphone, âge, et un numéro d'adhérent aléatoire.
- Crée un `Auteur` avec un nom, prénom, email, numéro de téléphone, âge, et un numéro d'auteur aléatoire.
- Crée un `Livre` avec un ISBN aléatoire et un objet `Auteur`.
- Affiche les informations des objets `Adherent` et `Livre` (y compris l'auteur) dans la console.

### Utilisation
La méthode `main` génère les objets suivants et les affiche :
1. **Adherent**
    - Nom: Doe
    - Prénom: John
    - Email: johnDoe@gmail.com
    - Téléphone: 001234567890
    - Âge: 20
    - Numéro d'adhérent: Généré aléatoirement
2. **Auteur**
    - Nom: Cartner
    - Prénom: Maria
    - Email: mariaCartner@gmail.com
    - Téléphone: 001234567890
    - Âge: 20
    - Numéro d'auteur: Généré aléatoirement
3. **Livre**
    - ISBN: Généré aléatoirement
    - Auteur: Cartner Maria (affiche également ses informations personnelles)

### Exemple de Sortie Console

![screenshot execution](/captures/Ex1-exe1.png)
![screenshot execution](/captures/Ex1-exe2.png)
![screenshot execution](/captures/Ex1-exe3.png)
![screenshot execution](/captures/Ex1-exe4.png)
![screenshot execution](/captures/Ex1-exe5.png)



---

## English

**Package:** `com.javaIntellij`

The `Main` class contains the main method to run an example of the application. It creates instances of `Adherent`, `Auteur`, and `Livre` and displays their information by calling the `afficher()` methods.

### Features
- Creates an `Adherent` with a name, surname, email, phone number, age, and a randomly generated membership number.
- Creates an `Auteur` with a name, surname, email, phone number, age, and a randomly generated author number.
- Creates a `Livre` with a random ISBN and an `Auteur` object.
- Displays the information of `Adherent` and `Livre` (including author) in the console.

### Usage
The `main` method generates the following objects and displays them:
1. **Adherent**
    - Name: Doe
    - Surname: John
    - Email: johnDoe@gmail.com
    - Phone: 001234567890
    - Age: 20
    - Membership number: Randomly generated
2. **Auteur**
    - Name: Cartner
    - Surname: Maria
    - Email: mariaCartner@gmail.com
    - Phone: 001234567890
    - Age: 20
    - Author number: Randomly generated
3. **Livre**
    - ISBN: Randomly generated
    - Author: Cartner Maria (also displays their personal information)

### Console Output Example

![screenshot execution](/captures/Ex1-exe1.png)
![screenshot execution](/captures/Ex1-exe2.png)
![screenshot execution](/captures/Ex1-exe3.png)
![screenshot execution](/captures/Ex1-exe4.png)
![screenshot execution](/captures/Ex1-exe5.png)