package Tags;

import visitor.Visitor;

public class Link extends Tag {

    private String href = "www.google.com";

    public Link() {
        text = "Lie par défaut (google)";
    }


    public Link(String text, String href) {
        this.text = text;
        this.href = href;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String toHTML(){
        return  "<a href='"+ this.href +"'>" + text + "</a>";
    }


    @Override
    public String toString() {
        return "Title{" +
                "text='" + text + '\'' +
                ", lvl=" + href +
                '}';
    }

    public Link getClone() {
        return new Link(this.text, this.href);
    }

    /// VISITOR ///
    public void accept(Visitor v) {
        v.visitLink(this);
    }
}
