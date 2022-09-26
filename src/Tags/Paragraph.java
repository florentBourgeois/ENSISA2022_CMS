public class Paragraph extends Tag{


    public Paragraph() {
        text = "non c'est lululu";
    }


    public Paragraph(String text) {
        this.text = text;
    }

    public Paragraph(Paragraph p) {
        this.text = p.text;
    }


    public String toHTML(){
        return  "<p>" + text + "</p>";
    }



    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Paragraph p = new Paragraph();
        System.out.println(p.toHTML());

        p.setText("Hello world!");
        System.out.println(p.toHTML());

        Paragraph p2 = new Paragraph();
        p2.setText("Paragraphe 2");
        System.out.println(p2.toHTML());

        Paragraph p3 = new Paragraph("Le troisième");
        System.out.println(p3.toHTML());

    }
}
