package Tags;

import visitor.Visitor;

public class Paragraph extends Tag {

    public Paragraph() {
        text = "Paragraphe par défaut : lorem ipsum dolor sit amet ...";
    }

    public Paragraph(String text) {
        this.text = text;
    }

    public String toHTML(){
        return  "<p>" + text + "</p>";
    }


    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +   "   HTML='" + this.toHTML() + '\'' +
                '}';
    }

    public Paragraph getClone() {
        return new Paragraph(this.text);
    }

    /// VISITOR ///
    public void accept(Visitor v) {
        v.visitParagraph(this);
    }
}
