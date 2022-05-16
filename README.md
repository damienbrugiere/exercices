# Exercices

### Les variables 

- les variables sont comme des boites qui continent des informations. Ces informations vont avoir un type et une valeur et la boite aura un nom.

Par Exemple: 

```java
int nombre = 3;
```

Cette ligne de code veut dire j'associe la valeur 3 de type int (nombre décimal négatif ou possitif) dans la boite (variable) que je nomme "nombre".
  
### Les types

| Type    | Primitif  |Valeur                                                                             |
|---------|-----------|------------------------------------------------------------------------------------|
| int     |           | nombre entier compris entre 2147483647 et -2147483648                              |
| long    |           | nombre entier compris entre 9 223 372 036 854 775 807 et -9 223 372 036 854 775 807|
| char    |           | un charatère c'est à dire par exemple 'A' ou 'b' etc                               |
| float   |           | nombre décimal compris entre 3.40282347E38 et -1.40239846E-45                      |
| double  |           | nombre décimal compris entre 4.9406564584124654E-324 et 1.797693134862316E308      |
| boolean |           | valeur soit true soit false                                                        |
| void    |           | type rien (utilisé dans les procédures)                                            |

## Excercice 1 : 
Remplir une variable number avec la valeur 3 et l'afficher dans la console.

## Excercice 2 :
Remplir une variable toto qui contient la phrase "hello world" et qui l'affiche dans la console.

Pré-requis : 

Il existe un type en java qui est le type String. Ce type est ce qu'on appelle une chaine de charactère c'est à dire un mot ou une phrase.
En java pour faire un type string vous avez les guillemets. Voici comment on initialise une variable de type String : 
````java
String phrase = "Bonjour à tous";
```` 

## Exercice 3 : 
Ecrire un algorithme qui permet à l'utilisateur de saisir un chiffre.
 - Si ce chiffre est égale à 10 afficher "Bravo".
 - Si ce chiffre est plus petit que 10 afficher "Ce chiffre est plus petit que 10".
 - Si ce chiffre est plus grand que 10 afficher "Ce chiffre est plus grand que 10".

Pré-requis : 

Il existe des conditions en java comme dans tout langage de programmation. Pour faire une condition il suffit de faire comme ceci : 

```java
if(condition){
 // éxécution
}
```
vous pouvez faire un si - sinon de cette manière :
```java
if(condition){
    //exécution
}else{
    // éxécution
}
```

Mais également rajouter des si - sinon si - sinon de cette manière :

```java
if(condition){
    //exécution
}else if(){
    
}else{
    // éxécution
}
```

## Excercice 4 : 
Ecrire un algo qui va générer un chiffre aléatoire secret et ou le but est de faire un jeu de plus haut ou plus bas pour que le joueur puisse trouver le chiffre secret et vous afficherez le nombre de tentatives.


Pré-requis : 

Comment générer un nombre aléatoire en java : 

```
  int min = 0;
        int max = 10;
        int tentative = 0;
        Random random = new Random();

        int secretValue = random.nextInt(max + min) + min;
``` 


Comment faire des boucles en java : 

### do while :

```
        do {
           // ce que je dois éxécuter
        } while (la condition pour continuer la boucle);
```

Cette boucle permet de faire une action avant de boucler.

### while :

````java
    while(condition){
     // exécution
    }
````
la boucle la plus utilisé.

### for : 

````
for(int i = 0; condition; i++){
      // éxécution
}
````

boucle d'incrément. Partique quand on sait combien de tour on doit faire.



### concaténation


il est possible de concaténer des string en java en ajoutant le signe +. Par exemple :

```
String prefix="hello";
String fullPhrase = prefix + " Alexis!" 
```

fullPhrase sera égale à "hello Alexis!"