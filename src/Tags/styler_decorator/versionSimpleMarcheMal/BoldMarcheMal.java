package Tags.styler_decorator.versionSimpleMarcheMal;


import Tags.Tag;

public class BoldMarcheMal extends StylerSimpleMarcheMal {

    public BoldMarcheMal(Tag htmlable) {
        super(htmlable);
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
