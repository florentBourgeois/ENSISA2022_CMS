package Tags.styler_decorator;

import Tags.Tag;
import prototype.Clonable;

public class Colored extends StylerDecorator {
    private String color;

    public Colored(Tag styled, String color) {
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
    public Clonable getClone() {
        return new Colored((Tag) styled.getClone(), this.color);
    }
}
