import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Tag tag = new Paragraph("Paragraphe 1");
        System.out.println(tag.toHTML());

        tag = new Title("Titre 1");
        //tag.setLvl(4);
        System.out.println(tag.toHTML());

        Title t = new Title("lalalal");
        t.setLvl(4);
        System.out.println(tag.toHTML());


        tag = new Link("google");
        System.out.println(tag.toHTML());

        List<Tag> pageWeb = new ArrayList<>();

    }




}