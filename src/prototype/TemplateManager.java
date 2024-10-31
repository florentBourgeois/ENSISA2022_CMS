package prototype;

import Site.Page;
import Tags.Image;
import Tags.Link;
import Tags.Paragraph;
import Tags.Title;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplateManager {
    private Map<String, Page> templates = new HashMap<>();

    public Page getTemplate(String templateName) {
        return (Page)templates.get(templateName).getClone();
    }

    public void addTemplate(String templateName, Page template) {
        templates.put(templateName, template);
    }


    public static void main(String[] args) {
        TemplateManager templateManager = new TemplateManager();
        Page template = new Page("BigTitlePage", "Author");
        template.addTag(new Title("Title"));
        template.addTag(new Paragraph("Paragraph"));
        templateManager.addTemplate("BigTitlePage", template);

        template = new Page("PicturePage","Author");
        template.addTag(new Image("logo de 4.0", "https://ml0whhtxts6b.i.optimole.com/w:auto/h:auto/q:mauto/ig:avif/https://www.uha4point0.fr/wp-content/uploads/2021/06/cropped-uha40_fst-1.png"));
        template.addTag(new Title("Title", 2));
        templateManager.addTemplate("PicturePage", template);

        template = new Page("SourcesPage","Author");
        template.addTag(new Link("lien1", "www.google.com"));
        template.addTag(new Link("lien2", "www.google.com"));
        template.addTag(new Link("lien3", "www.google.com"));
        template.addTag(new Link("lien4", "www.google.com"));
        template.addTag(new Link("lien5", "www.google.com"));
        template.addTag(new Paragraph("Voici 5 liens qui permettent d'argumenter que ... blablabla"));
        templateManager.addTemplate("SourcesPage", template);


        Page page = templateManager.getTemplate("SourcesPage");
        System.out.println(page.toHTML());

        page = templateManager.getTemplate("PicturePage");
        System.out.println(page.toHTML());
    }
}
