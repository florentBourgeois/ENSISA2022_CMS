package Tags;

import prototype.Clonable;
import visitor.Visitor;

public class Title extends Tag {

    private int lvl = 1;

    public Title() {
        text = "Titre par défaut";
    }

    public Title(String text) {
        this.text = text;
    }

    public Title(String text, int lvl) {
        this.text = text;
        this.lvl = lvl;
    }


    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String toHTML(){
        return  "<h"+ this.lvl +">" + text + "</h"+ this.lvl +">";
    }


    @Override
    public String toString() {
        return "Title{" +
                "text='" + text + '\'' +
                ", lvl=" + lvl +
                '}';
    }

    public Title getClone() {
        return new Title(this.text, this.lvl);
    }


    /// VISITOR ///
    public void accept(Visitor v) {
        v.visitTitle(this);
    }
}
