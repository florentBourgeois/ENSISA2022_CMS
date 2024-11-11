package visitor;

import Site.*;
import Tags.*;
import composite.Div2Col;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------\nDemo Visitor!\n----------\n");
        Paragraph p = new Paragraph();

        Paragraph p2 = new Paragraph();
        p2.setText("Paragraphe 2");

        Paragraph p3 = new Paragraph("Le troisième");


        Title t = new Title();
        t.setText("Hello world!");
        t.setLvl(4);

        Title t2 = new Title();
        t2.setText("Titre 2");

        Link l = new Link();
        l.setHref("www.foo.com");

        Image i = new Image();

        i.setText("UHA");
        i.setSrc("https://e-formation.uha.fr/pluginfile.php/1/core_admin/logocompact/300x300/1663188003/UHA%20-%20Picto.png");

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

        Page page2 = new Page("Page2", "Florent Bourgeois");

        Div2Col d2 = new Div2Col();
        d2.addToColA(new Title("D2 col A"));
        d2.addToColB(new Title("D2 col B"));
        d2.addToColB(d1);

        page2.addTag(new Title("Insersion de colones"));
        page2.addTag(d1);
        page2.addTag(new Title("Insersion de colones dans des colones"));
        page2.addTag(d2);

        Site site = new Site("Mon site");
        site.addPage(page);
        site.addPage(page2);
        site.addPage(new Page("page3", "Florent Bourgeois"));
        site.addPage(new Page("Page4", "Florent Bourgeois"));


        System.out.println("----------TextExtractionVisitor!--------\n");
        TextExtractionVisitor visitor = new TextExtractionVisitor();
        site.accept(visitor);
        String extract = visitor.getExtractedText();
        System.out.println(extract);

        System.out.println("----------TagsCounterVisitor---------\n");
        TagsCounterVisitor visitor2 = new TagsCounterVisitor();
        site.accept(visitor2);
        int count = visitor2.getCount();
        System.out.println("number of tags in site : "+ count);

    }

}
