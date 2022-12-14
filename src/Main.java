import Site.Page;
import Site.Site;
import Tags.Image;
import Tags.Link;
import Tags.Paragraph;
import Tags.Title;
import composite.Div2Col;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------\nHello CMS!\n----------\n");

        System.out.println("\n----------Paragraphes!----------");

        Paragraph p = new Paragraph();

        Paragraph p2 = new Paragraph();
        p2.setText("Paragraphe 2");

        Paragraph p3 = new Paragraph("Le troisième");

        System.out.println("\n----------Titres!----------");

        Title t = new Title();
        t.setText("Hello world!");
        System.out.println(t.toHTML());

        t.setLvl(4);
        System.out.println(t.toHTML());

        Title t2 = new Title();
        t2.setText("Titre 2");
        System.out.println(t2.toHTML());

        System.out.println("\n----------Liens!----------");

        Link l = new Link();
        l.setHref("www.foo.com");
        System.out.println(l.toHTML());

        System.out.println("\n----------Images!----------");
        Image i = new Image();
        System.out.println(i.toHTML());

        i.setText("UHA");
        i.setSrc("https://e-formation.uha.fr/pluginfile.php/1/core_admin/logocompact/300x300/1663188003/UHA%20-%20Picto.png");
        System.out.println(i.toHTML());

        System.out.println("\n----------Pages!----------");
        Page page = new Page("Index", "Florent Bourgeois");
        page.addTag(t);
        page.addTag(p);
        page.addTag(p2);
        page.addTag(l);
        page.addTag(i);

        Div2Col d1 = new Div2Col();

        d1.addToColA(new Title("ColA"));
        d1.addToColB(new Title("ColB"));
        d1.addToColA(new Paragraph("p1"));
        d1.addToColA(new Paragraph("p2"));
        d1.addToColA(new Paragraph("p3"));
        d1.addToColA(new Paragraph("p4"));

        Div2Col d2 = new Div2Col();
        d2.addToColA(new Title("D2 col A"));
        d2.addToColB(new Title("D2 col B"));
        d2.addToColB(d1);

        page.addTag(new Title("Insersion de colones"));
        page.addTag(d1);
        page.addTag(new Title("Insersion de colones dans des colones"));
        page.addTag(d2);




        System.out.println(page.toHTML());

        System.out.println("----------Site.Site!----------");
        Site site = new Site("Mon site");
        site.addPage(page);
        site.addPage(new Page("Page2", "Florent Bourgeois"));
        site.addPage(new Page("Page3", "Florent Bourgeois"));

        site.render("Index");
    }

}