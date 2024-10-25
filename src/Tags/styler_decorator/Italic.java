package Tags.styler_decorator;

import Tags.Tag;

public class Italic extends StylerDecorator {

    public Italic(Tag styled) {
        super(styled);
    }

    @Override
    public String getStyle() {
        return "font-style: italic;";
    }

    @Override
    public String toString() {
        return "Italic styler qui " + super.toString();
    }

}
