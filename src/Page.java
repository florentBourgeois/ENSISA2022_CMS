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
        return "<head>\n" +
                "    <meta charset=\"UTF-8\" name=\"viewport\" content=\"width=device-width, initial-scale=1\">>\n" +
                "    <title>" + this.title + "</title>\n" +
                "<style>\n" +
                "* {\n" +
                "  box-sizing: border-box;\n" +
                "}\n" +
                "\n" +
                "/* Create two equal columns that floats next to each other */\n" +
                ".div2col {\n" +
                "  float: left;\n" +
                "  width: 50%;\n" +
                "  padding: 10px;\n" +
                "  height: 300px; /* Should be removed. Only for demonstration */\n" +
                "}\n" +
                "\n" +
                "/* Clear floats after the columns */\n" +
                ".col:after {\n" +
                "  content: \"\";\n" +
                "  display: table;\n" +
                "  clear: both;\n" +
                "}\n" +
                "</style>" +
                "</head>\n" ;
    }
}
