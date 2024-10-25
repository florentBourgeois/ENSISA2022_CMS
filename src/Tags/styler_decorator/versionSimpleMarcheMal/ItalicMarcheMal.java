package Tags.styler_decorator.versionSimpleMarcheMal;

import Tags.Tag;

public class ItalicMarcheMal extends StylerSimpleMarcheMal {

    public ItalicMarcheMal(Tag htmlable) {
        super(htmlable);
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
