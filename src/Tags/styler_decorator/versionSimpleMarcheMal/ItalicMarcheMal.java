package Tags.styler_decorator.versionSimpleMarcheMal;

import Tags.Tag;
import prototype.Clonable;

public class ItalicMarcheMal extends StylerSimpleMarcheMal {

    public ItalicMarcheMal(Tag styled) {
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


    @Override
    public Clonable getClone() {
        return new ItalicMarcheMal((Tag) styled.getClone());
    }
}
