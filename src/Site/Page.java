package Site;

import Tags.Tag;

import java.util.ArrayList;
import java.util.List;

public class Page {

    private String title;
    private String author;
    private List<Tag> content = new ArrayList<>();

    public Page(String title, String author){
        this.title = title;
        this.author = author;
    }

    public List<Tag> getContent() {
        return this.content;
    }

    public String getTitle() {
        return title;
    }

    public void addTag(Tag tag){
        this.content.add(tag);
    }

    public void removeTag(Tag tag){
        this.content.remove(tag);
    }

    public String toHTML() {
        StringBuffer htmlBuffer = new StringBuffer("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                this.headHTML() +
                "<body>\n");

        for (Tag tag : content) {
            htmlBuffer.append("    ").append(tag.toHTML()).append("\n");
        }
        htmlBuffer.append("</body>\n" +
                "</html>");

        return htmlBuffer.toString();
    }

    private String headHTML(){
        return
                //"<title>" + this.title + "</title>\n" +
                "<head>\n" +
                        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                        "<style>\n" +
                        "* {\n" +
                        "  box-sizing: border-box;\n" +
                        "}\n" +
                        "\n" +
                        "/* Create two equal columns that floats next to each other */\n" +
                        ".col {\n" +
                        "  float: left;\n" +
                        "  width: 50%;\n" +
                        "  padding: 10px;\n" +
                        "  height: 300px; /* Should be removed. Only for demonstration */\n" +
                        "}\n" +
                        "\n" +
                        ".div2col:after {\n" +
                        "  content: \"\";\n" +
                        "  display: table;\n" +
                        "  clear: both;\n" +
                        "}\n" +
                        "</style>\n" +
                        "</head>";
    }


    public class PageMemento {
        private String title;
        private String author;
        private List<Tag> content = new ArrayList<>();
    
        public PageMemento(Page p){
            //this.content = p.content; // cette approche n'est pas bonne. Java fonctionne par référence et non par valeur -> il faut donc copier les éléments de la liste et pas la liste elle-même autrement elle sera partagée par toutes les mementos
            content = new ArrayList<>(p.content);
            this.title = p.title;
            this.author = p.author;
        }

    }

    public PageMemento save(){
        PageMemento page_save = new PageMemento(this);
        return page_save;
    }

    public void restore (PageMemento m){
        this.content = m.content;
        this.title = m.title;
        this.author = m.author;
    }
}
