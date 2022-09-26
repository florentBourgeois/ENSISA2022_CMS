public class Link extends Tag{

    private String href = "www.google.com";

    public Link() {
        text = "non c'est lululu";
    }


    public Link(String text) {
        this.text = text;
    }

    public Link(Link p) {
        this.text = p.text;
    }




    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String toHTML(){
        return  "<a href='"+ this.href +"'>" + text + "</a>";
    }


    @Override
    public String toString() {
        return "Title{" +
                "text='" + text + '\'' +
                ", lvl=" + href +
                '}';
    }

    public static void main(String[] args) {
        Link t = new Link();
        t.setHref("www.foo.com");
        System.out.println(t.toHTML());

        t.setText("Hello world!");
        System.out.println(t.toHTML());

        Link t2 = new Link();
        t2.setText("Paragraphe 2");
        System.out.println(t2.toHTML());

        Link t3 = new Link("Le troisième");
        System.out.println(t3.toHTML());

    }
}
