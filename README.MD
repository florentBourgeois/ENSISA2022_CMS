# CMS 2022 ENSISA

## Description 

L'objectif de ce projet est de servir de support à l'apprentissage de differents designs patterns dans un contexte réel

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


