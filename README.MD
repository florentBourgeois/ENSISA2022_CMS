# CMS 2022 ENSISA

## Description 

L'objectif de ce projet est de servir de support à l'apprentissage de differents designs patterns dans un contexte réel

Pages UHA 4.0 associées : 
- https://confluence.uha4point0.fr/pages/viewpage.action?pageId=119473126
- 

## Base existante 

Le projet est composé d'un ensemble de tag HTML simples ainsi que d'une Page et d'une classe Main qui les mobilises

## Demandes du client 

Le client attend de notre entreprise la création d'un CMS maison qu'il pourra mobiliser pour ses développements futurs. La solution devra être maintenu sur une longue période et supporter des ajouts de fonctionnalités fréquents. Ses attentes immédiates sont :
<ol>
    <li><s>Créer des sites composés de plusieurs pages ; sans styles particulier</s></li>
	<li>Créer des sections à plusieurs colonnes. Une section doit pouvoir être divisée en deux colonnes. Une colonne doit pouvoir être divisée en deux colonnes (Div2Col)</li>
	<li>Ajouter de la couleur, du gras et (ou) de l'italique sur n'importe quel tag existant (StyleCSS).</li>
	<li>Créer très facilement des pages à partir de templates prédéfinis pour facilement alimenter le site. Trois templates de base existent : Page "BigTitlePage" constituée d'un titre principal et d'un paragraphe, la page "PicturePage" qui comprend une image suivi d'un titre en taille 2 et la page "SourcesPage" qui contient cinq liens suivis d'une brève description</li>
	<li>Ajouter aisément de nouveaux templates à ceux existant à l'aide d'un outil permettant de construire rapidement une page personalisée. L'outil propose à l'utilisateur de pouvoir ajouter autant d'éléments qu'il le souhaite à la page avant de la créer et de l'ajouter aux templates (TemplateGenerator)
	<li>Créer des pages au style cohérent sur l'ensemble de la page. L'outil doit donc permettre de selectionner un style appliqué sur l'ensemble des éléments qui seront créés sur la page (CoherentStyler)</li>
	<li>L'ajout ou la suppression de page dans le site web est loggué ; soit dans la console, soit dans un fichier en fonction des paramettres de l'utilisateur (logger)</li>
	<li>L'ensemble des actions d'édition d'une page doit pouvoir être annulé (Canceler)</li>
	<li>Le site web doit pouvoir être exporté sous format LaTex ou JSON (Rewriter)</li>
	<li>Le cout d'hébergement doit pouvoir être calculé en fonction du prix appliqué par divers Hébergeurs. Les hébergeurs appliquent en effet des tarifs différents pour chaque tag (hostCost)</li>
</ol>


## Exercice (1) : Analyse du problème et proposition de solutions
<details>
  <summary>Détails</summary>
  Assignez à chaque demande du client un (ou des ?) design pattern(s) et expliquez pourquoi vous avez choisi ce(s) pattern(s).
  
  Pour répondre à l'exercice : éditez le fichier ./Exercices/Exercice1.md puis déposez le dans l'activité associée sur e-formation
  
  Veuillez trouver la réponse à l'exercice 1 dans le fichier ./Exercices/Correction1.md
</details>


## Exercice (2) : Modélisation des solutions
<details>
  <summary>Détails</summary>
  Maintenant que les différents patterns sont spécifiés ; il est temps de débuter leur intégration dans le projet. 
  L'objectif de cet exercice est de créer l'UML pour les différentes requetes du client.  

  Pour répondre à l'exercice : Créez un fichier image nommé Exercice2 que vous déposerez dans l'activité associée sur e-formation.

  N'hésitez pas à déposer un fichier par pattern si vous n'êtes pas à l'aise avec les diagrammes UML.
  
  Si vous le souhaitez, vous pouvez utiliser le fichier ./Documentation/CMS_UML.puml comme base plantUML créer vos diagrammes sur https://plantuml-editor.kkeisuke.com.

</details>

## Exercice (3) : Implémentation

<details>
  <summary>Détails</summary>
  Le plan de l'application est défini. A vos clavier pour coder la solution ! 
  L'objectif de cet exercice est d'implémenter l'un (ou plusieurs) des différents patterns dans le projet.
  Proposez une execution du code qui mobilise le pattern déployé. 

  Pensez à completer le document ./Exercices/Exercice3.md pour suivre votre avancement. 

  Pour répondre à l'exercice : Déposez le code du projet  produit sous la forme d'une archive dans l'activité associée sur e-formation.

</details>