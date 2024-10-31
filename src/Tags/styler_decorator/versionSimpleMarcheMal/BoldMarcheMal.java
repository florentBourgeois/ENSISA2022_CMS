package Tags.styler_decorator.versionSimpleMarcheMal;


import Tags.Tag;
import prototype.Clonable;

public class BoldMarcheMal extends StylerSimpleMarcheMal {

    public BoldMarcheMal(Tag styled) {
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

    @Override
    public BoldMarcheMal getClone() {
        return new BoldMarcheMal((Tag) styled.getClone());
    }
}
