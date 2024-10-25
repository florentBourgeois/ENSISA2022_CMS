package Tags.styler_decorator.versionSimpleMarcheMal;


import Tags.Tag;
import Tags.Title;

public abstract class StylerSimpleMarcheMal extends Tag {

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
    public StylerSimpleMarcheMal(Tag styled) {
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
     * le styler ajoute son style à la fin.
     * @return le HTML (mal) stylisé de l'élément
     */
    @Override
    public String toHTML() {
        String htmlAStyliser = this.styled.toHTML();
        return htmlAStyliser + this.getStyle();
    }



    @Override
    public String toString() {
        return "stylise un Element : \n\t" + styled + "\n\tgenerated html : " + this.getStyle();
    }

    public static void main(String[] args) {
        System.out.println("----------\n démo des styler mal intégrés (le style st ajouté après le tag\n------");
        Tag e = new Title("Je suis mal stylisé ");
        StylerSimpleMarcheMal s = new ItalicMarcheMal(e);
        System.out.println(s.toHTML());

        StylerSimpleMarcheMal s2 = new ColoredMarcheMal(e, "red");
        System.out.println(s2.toHTML());

        StylerSimpleMarcheMal styleDeStyle = new ColoredMarcheMal(s, "blue");
        System.out.println(styleDeStyle.toHTML());

        StylerSimpleMarcheMal styleDeStyleDeStyle = new BoldMarcheMal(styleDeStyle);
        System.out.println(styleDeStyleDeStyle.toHTML());


    }

}
