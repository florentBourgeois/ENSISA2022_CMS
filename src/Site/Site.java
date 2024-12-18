package Site;

import visitor.Visitor;

import java.util.HashMap;
import java.util.Map;

public class Site {
    private String title = "";
    private Map<String, Page> pages = new HashMap<>();

    public Site() {
    }

    public Site(String title){
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void addPage(Page page){
        this.pages.put(page.getTitle(), page);
    }

    public void removePage(Page page){
        this.pages.remove(page.getTitle());
    }

    public void render(String title){
        System.out.println(this.pages.get(title).toHTML());
    }

    public Map<String, Page> getPages() {
        return this.pages;
    }

    /// VISITOR ///
    public void accept(Visitor v) {
        v.visitSite(this);
    }

}
