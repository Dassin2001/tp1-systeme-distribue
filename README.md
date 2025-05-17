#  TP1 - Systèmes Distribués
##  Injection des dépendances avec Java & Spring

Ce projet a été réalisé dans le cadre du module **Systèmes Distribués**. Il porte sur la compréhension et la mise en œuvre de l’**injection des dépendances (IoC)** à travers différentes approches Java, dont l’utilisation du **framework Spring**, ainsi que le développement d’un **mini framework maison**.

---

## Objectifs du projet

- Appliquer le principe d’**Inversion de Contrôle** (IoC)
- Réduire le couplage entre les composants
- Comprendre plusieurs types d’injection : statique, dynamique, Spring XML et annotations
- Développer un mini framework qui simule Spring IoC

---

## Technologies utilisées

- Java 8+
- Spring Framework (IOC Container)
- JAX-B (pour XML Binding)
- IDE : IntelliJ IDEA
- Git & GitHub

---



### Partie 1 : Étude et expérimentation

| Méthode d’injection | Description |
|---------------------|-------------|
| Instanciation statique | Création manuelle des objets avec `new`, couplage fort |
| Instanciation dynamique | Réflexion Java (`Class.forName`) pour instanciation à l’exécution |
| Spring XML | Configuration via `applicationContext.xml` et injection par setter ou constructeur |
| Spring Annotations | Détection automatique via `@Component`, injection avec `@Autowired`, gestion des conflits avec `@Qualifier` |

 	

•	Injection des dépendances par Instanciation Statique : est la forme la plus simple d’injection des dépendances. Dans cette approche, les dépendances sont créées et injectées directement dans le code à l’aide de l’opérateur new. Le développeur instancie manuellement chaque classe dans la classe cliente. Cette méthode ne nécessite aucune configuration externe et permet un démarrage rapide du développement. Cependant, elle introduit un couplage fort entre les composants, ce qui rend difficile le remplacement d’une implémentation par une autre sans modifier le code. Cela limite la réutilisabilité et la testabilité de l'application. Ce type d’injection est donc à éviter dans des projets de grande envergure ou nécessitant une grande flexibilité.

![Fonctionnement de l'injection](image/1.png)


Le composant MetierImpl dépend ici directement de l’implémentation DaoImpl, ce qui signifie qu’un changement de DAO nécessiterait de modifier cette ligne de code.

•	Injection des dependances par Instanciation dynamique utilise les capacités de réflexion de Java pour créer les objets et injecter leurs dépendances à l’exécution, sans utiliser explicitement l’opérateur new. Elle repose sur la méthode Class.forName().newInstance() pour instancier les classes dynamiquement à partir de leur nom, généralement fourni dans un fichier de configuration. Cette technique permet de créer des applications faiblement couplées, où les composants peuvent être remplacés facilement sans modifier le code source principal. C’est une méthode intermédiaire entre l’injection statique et l’utilisation de frameworks comme Spring. Elle est aussi souvent utilisée dans le développement de mini frameworks personnalisés. En revanche, cette méthode peut introduire des erreurs à l’exécution si les noms de classe sont incorrects ou si les dépendances ne sont pas bien gérées.
 	# Fonctionnement :
String metierClassName = scanner.nextLine();
Class cMetier = Class.forName(metierClassName);
IMetier metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(d);


On charge la classe par son nom, puis on instancie dynamiquement l’objet associé. Ensuite, on l’injecte via un setter ou un constructeur dans une autre classe métier. 


### Partie 2 : Mini Framework personnalisé
    consultez le lien de partie 2 : https://github.com/Dassin2001/FrameWork.git
Création d’un mini framework Java pour faire de l’injection des dépendances, similaire à Spring. Le framework supporte :

-  **Configuration via XML** (utilisant JAXB)
-  **Annotations personnalisées** (`@MyComponent`, `@MyAutowired`, etc.)
-  Injection par :
    - Constructeur
    - Setter
    - Champ (Field access)

---



