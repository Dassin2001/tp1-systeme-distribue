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

## Contenu du TP

### Partie 1 : Étude et expérimentation

| Méthode d’injection | Description |
|---------------------|-------------|
| Instanciation statique | Création manuelle des objets avec `new`, couplage fort |
| Instanciation dynamique | Réflexion Java (`Class.forName`) pour instanciation à l’exécution |
| Spring XML | Configuration via `applicationContext.xml` et injection par setter ou constructeur |
| Spring Annotations | Détection automatique via `@Component`, injection avec `@Autowired`, gestion des conflits avec `@Qualifier` |

[Télécharger le rapport détaillé (Word)](https://drive.google.com/file/d/1GRkfInQsxUTAQX9Lo02YNAL7FsdT-M0Y/view?usp=drive_link) ← **Remplace ce lien par le tien**

---

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



