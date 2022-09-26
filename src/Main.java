import Tags.Link;
import Tags.Paragraph;
import Tags.Title;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------\nHello CMS!\n----------\n");

        System.out.println("----------Paragraphes!----------");

        Paragraph p = new Paragraph();

        Paragraph p2 = new Paragraph();
        p2.setText("Paragraphe 2");

        Paragraph p3 = new Paragraph("Le troisième");

        System.out.println("----------Titres!----------");

        Title t = new Title();
        t.setText("Hello world!");
        System.out.println(t.toHTML());

        t.setLvl(4);
        System.out.println(t.toHTML());

        Title t2 = new Title();
        t2.setText("Titre 2");
        System.out.println(t2.toHTML());

        System.out.println("----------Liens!----------");

        Link l = new Link();
        l.setHref("www.foo.com");
        System.out.println(l.toHTML());

    }

}