package Tags.styler_decorator.versionSimpleMarcheMal;


import Tags.Tag;
import Tags.styler_decorator.Colored;
import prototype.Clonable;

public class ColoredMarcheMal extends StylerSimpleMarcheMal {
    private String color;

    public ColoredMarcheMal(Tag styled, String color) {
        super(styled);
        this.color = color;
    }
    
    @Override
    public String getStyle() {
        return "color:" + this.color +";";
    }

    @Override
    public String toString() {
        return "Colored ("+this.color+")styler qui " + super.toString();
    }

    @Override
    public ColoredMarcheMal getClone() {
        return new ColoredMarcheMal((Tag) styled.getClone(), this.color);
    }
}
