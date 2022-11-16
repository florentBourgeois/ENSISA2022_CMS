package strategy;

import Site.Site;
import Site.Page;
import Tags.*;

import java.util.List;
import java.util.Map;

public class Amazon implements Strategy {

    // Prices (€)
    private static final double PARAGRAPH_PRICE = 20;
    private static final double TITLE_PRICE = 10;
    private static final double LINK_PRICE = 5;
    private static final double IMAGE_PRICE = 30;
    private static final double DEFAULT_PRICE = 40;

    @Override
    public double calculate(Site site) {
        double price = 0;
        Map<String, Page> pages = site.getPages();
        List<Tag> content;

        for(Page page : pages.values()) {
            content = page.getContent();
            for(Tag tag : content)
                price += getTagPrice(tag);
        }

        return price;
    }

    private double getTagPrice(Tag t) {
        Paragraph paragraph = new Paragraph();
        Title title = new Title();
        Link link = new Link();
        Image image = new Image();

        if(t.getClass().getName().equals(paragraph.getClass().getName())) return PARAGRAPH_PRICE;
        if(t.getClass().getName().equals(title.getClass().getName())) return TITLE_PRICE;
        if(t.getClass().getName().equals(link.getClass().getName())) return LINK_PRICE;
        if(t.getClass().getName().equals(image.getClass().getName())) return IMAGE_PRICE;

        return DEFAULT_PRICE;
    }
}
