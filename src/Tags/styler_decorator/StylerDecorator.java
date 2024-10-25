package Tags.styler_decorator;

import Tags.Tag;
import Tags.Title;

public abstract class StylerDecorator extends Tag {

    /**
     * styled est l'élément HTML qui va être "décoré"
     * le styler a pour role d'y ajouter du style
     */
    protected Tag styled;

    /**
     * constructeur valué qui prend l'élément à stylisé en parametre
     * sans setters ; le decorateur est dédié à un élément en particulier
     * @param styled
     */
    public StylerDecorator(Tag styled) {
        this.styled = styled;
    }

    /**
     * méthode écrite par les enfants. Elle permet de récupérer le style à appliquer
     * les enfants se distinguent justement par cette méthode.
     * @return
     */
    public abstract String getStyle();

    /**
     * quand toHTML est appelé ; le html de l'élément contenu est demandé puis
     * le styler ajoute son style à celui ci.
     * @return le HTML stylisé de l'élément
     */
    @Override
    public String toHTML() {
        String htmlWithDefaultStyle = this.appendDefaultChainInTag(); // ajoute la chaine "style=" dans le tag si elle n'y est pas
        return this.addThisStyleInHtml(htmlWithDefaultStyle);
    }

    /**
     * ajoute le style du styler (this.getStyle) au bon endroit dans le html de l'élément à styliser
     * @param htmlToStyle : Un HTML à styliser
     * @return
     */
    private String addThisStyleInHtml(String htmlToStyle) {
        int startOfStylePosition = htmlToStyle.indexOf("style=\"");  // chercher ou est le mot "style=" dans le tag
        String startHtml = htmlToStyle.substring(0,startOfStylePosition + "style=\"".length());   // startHTML devient le texte du début du tag jusqua style=
        String endHtml = htmlToStyle.substring(startOfStylePosition + "style=\"".length()); // endHTML devient le texte du reste du tag
        String styledHTML = startHtml + " " + this.getStyle() + " " +endHtml;  // styledHTML contient le tag stylisé
        return styledHTML;
    }


    /**
     * Ajoute la chaine defaultStyleChaine dans le HTML de l'élément à styliser si elle n'y est pas
     * exemple : un paragraphe donnera <p></p>   et en lui ajoutant " style=\"\""   il deviendra  <p style=""></p>
     * @return
     */
    private String appendDefaultChainInTag() {
        String defaultStyleChain = " style=\"\"";
        String html = styled.toHTML();
        if (html.contains("style=")){
            return html;
        }
        int positionEndTag = findEndTag(html);
        String startHtml = html.substring(0,positionEndTag);
        String endHtml = html.substring(positionEndTag);
        return startHtml + defaultStyleChain +endHtml;
    }

    /**
     * trouve dans le html la position du premier chevron fermant du tag.
     * @param html : le html dans lequel on cherche la position
     * @return la position du 1er chevron fermant
     */
    private int findEndTag(String html) {
        return html.indexOf(">");
    }




    @Override
    public String toString() {
        return "stylise un Element : \n\t" + styled + "\n\tstyle ajouté  : " + this.getStyle() + "\n\thtml généré : " + this.toHTML();
    }

    public static void main(String[] args) {
        Tag e = new Title("Je suis un titre");
        System.out.println("---- un simple tag ----");
        System.out.println(e);

        StylerDecorator s = new Italic(e);
        System.out.println("\n---- le tag en italic ----");
        System.out.println(s);

        StylerDecorator s2 = new Colored(e, "red");
        System.out.println("\n---- le tag en italic en rouge ----");
        System.out.println(s2);

        StylerDecorator styleDeStyle = new Colored(s, "blue");
        System.out.println("\n---- le tag en italic en bleu ----");
        System.out.println(styleDeStyle);

        StylerDecorator styleDeStyleDeStyle = new Bold(styleDeStyle);
        System.out.println("\n---- le tag en italic en rouge en bleu en gras----");
        System.out.println(styleDeStyleDeStyle);

    }
}
