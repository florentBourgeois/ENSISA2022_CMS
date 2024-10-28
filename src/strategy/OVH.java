package strategy;

import Site.Site;
import Site.Page;
import Tags.*;

import java.util.List;
import java.util.Map;

public class OVH implements Strategy {

    // Prices (€)
    private static final double PARAGRAPH_PRICE = 10;
    private static final double TITLE_PRICE = 5;
    private static final double LINK_PRICE = 2.5;
    private static final double IMAGE_PRICE = 15;
    private static final double DEFAULT_PRICE = 20;

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

        if(t.getClass().getName().equals(Paragraph.class.getName())) return PARAGRAPH_PRICE;
        if(t.getClass().getName().equals(Title.class.getName())) return TITLE_PRICE;
        if(t.getClass().getName().equals(Link.class.getName())) return LINK_PRICE;
        if(t.getClass().getName().equals(Image.class.getName())) return IMAGE_PRICE;

        return DEFAULT_PRICE;
    }
}
