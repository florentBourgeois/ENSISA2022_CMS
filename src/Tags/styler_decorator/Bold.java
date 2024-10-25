package Tags.styler_decorator;

import Tags.Tag;

public class Bold extends StylerDecorator {

    public Bold(Tag styled) {
        super(styled);
    }

    @Override
    public String getStyle() {
        return "font-weight: bold;";
    }

    @Override
    public String toString() {
        return "Bold styler qui " + super.toString();
    }

}
