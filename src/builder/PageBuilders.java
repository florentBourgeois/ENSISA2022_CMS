package builder;

import Site.Page;
import Tags.*;

import java.util.ArrayList;
import java.util.List; 

public class PageBuilders {
    private String title ="";
    private String author= "";
    private final List<Tag> tags = new ArrayList<>();

    public PageBuilders setTitle(String title){
        this.title = title;
        return this;
    }
    public PageBuilders setAuthor(String author){
        this.author = author;
        return this;
    }


    public PageBuilders addImageTag(String altText, String imageLink){
        this.tags.add(new Image(altText, imageLink));
        return this;
    }
    public PageBuilders addLinkTag(String text, String href){
        this.tags.add(new Link(text, href));
        return this;
    }
    public PageBuilders addParagraphTag(String text){
        this.tags.add(new Paragraph(text));
        return this;
    }
    public PageBuilders addTitleTag(String text, int size){
        this.tags.add(new Title(text, size));
        return this;
    }

    /**
     * Builds a page with the current title, author and tags and resets the builder
     * @return the built page
     */
    public Page build(){
        Page p  = new Page(this.title, this.author);
        for (Tag tag : tags) {
            p.addTag(tag);
        }
        this.title = "";
        this.author = "";
        this.tags.clear();
        return p;
    }
}