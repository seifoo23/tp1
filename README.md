# TP 1 Corrections

Voici les corrections apportées aux erreurs commises dans les exercices donnés

## Exercice 1:

L'erreur dans ce code se situe dans la boucle while. Les variables i et j sont mises à jour de manière incorrecte.

## Exercice 2:

L'erreur dans ce code se trouve dans la boucle for. Le comptage des caractères devrait aller de 0 à la longueur de la chaîne la plus courte (s1 ou s2) afin de couvrir tous les caractères de la chaîne. Par conséquent, nous devons remplacer <= par < dans la condition de la boucle.

## Exercice 3:

L'erreur dans ce code se situe dans la condition de la boucle while. La condition low < high exclut la possibilité de vérifier l'élément dans la dernière case du tableau si low et high sont égaux.

## Exercice 5:

L'erreur dans ce code se trouve dans l'opérateur de comparaison de la boucle for, qui devrait être < au lieu de <=. Sinon, cela provoquerait une ArrayIndexOutOfBoundsException.
