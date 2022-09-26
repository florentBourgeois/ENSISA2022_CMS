package Tags;

public abstract class Tag {

    protected String text = "Hello World";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public abstract String toHTML() ;


    @Override
    public String toString() {
        return "Tag{" +
                "text='" + text + '\'' +
                '}';
    }
}
