package Tags;

public class Image extends Tag {

    private String src = "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";

    public Image() {
        text = "Image par défaut (google)";
    }

    public Image(String text, String src) {
        this.text = text;
        this.src = src;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String toHTML(){
        return  "<img src='"+ this.src +"' alt='"+ this.text +"'>";
    }

    @Override
    public String toString() {
        return "Image{" +
                "text='" + text + '\'' +
                ", src=" + src +
                '}';
    }

    public Image getClone() {
        return new Image(this.text, this.src);
    }
}
