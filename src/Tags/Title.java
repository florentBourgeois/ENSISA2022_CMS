public class Title extends Tag{

    private int lvl = 1;

    public Title() {
        text = "non c'est lululu";
    }


    public Title(String text) {
        this.text = text;
    }

    public Title(Title p) {
        this.text = p.text;
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

    public static void main(String[] args) {
        Title t = new Title();
        t.setLvl(4);
        System.out.println(t.toHTML());

        t.setText("Hello world!");
        System.out.println(t.toHTML());

        Title t2 = new Title();
        t2.setText("Paragraphe 2");
        System.out.println(t2.toHTML());

        Title t3 = new Title("Le troisième");
        System.out.println(t3.toHTML());

    }
}
