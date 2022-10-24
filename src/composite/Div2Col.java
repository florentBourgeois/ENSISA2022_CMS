package composite;

import Tags.Paragraph;
import Tags.Tag;
import Tags.Title;

import java.util.ArrayList;
import java.util.List;

public class Div2Col extends Tag {

    private List<Tag> colA = new ArrayList<>();
    private List<Tag> colB = new ArrayList<>();

    public void addToColA(Tag t){
        this.colA.add(t);
    }

    public void addToColB(Tag t){
        this.colB.add(t);
    }


    public String toHTML(){
        String HTML ="<div class='div2col'>\n";

        HTML += "<div class='colA'>";
        for (Tag tag : this.colA){
            HTML += "\n\t" + tag.toHTML();
        }
        HTML += "</div>";

        HTML += "<div class='colB'>";
        for (Tag tag : this.colB){
            HTML += "\n\t" + tag.toHTML();
        }
        HTML += "</div>";

        HTML += "</div>";
        return HTML;
    }


    public static void main(String[] args) {
        Div2Col d1 = new Div2Col();

        d1.colA.add(new Title("ColA"));
        d1.colB.add(new Title("ColB"));
        d1.colB.add(new Paragraph("p1"));
        d1.colB.add(new Paragraph("p2"));
        d1.colB.add(new Paragraph("p3"));
        d1.colB.add(new Paragraph("p4"));


        System.out.println(d1.toHTML());


        Div2Col d2 = new Div2Col();
        d2.colA.add(new Title("D2 col A"));
        d2.colB.add(new Title("D2 col B"));
        d2.colB.add(d1);

        System.out.println("\n\n" +d2.toHTML());



    }



}
