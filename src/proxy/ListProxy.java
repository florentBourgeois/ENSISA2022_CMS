package proxy;

import Site.Page;
import Site.Site;

import java.util.ArrayList;
import java.util.Map;

public class ListProxy extends Proxy {
    public ArrayList<String> logs = new ArrayList<>();
    public ListProxy(Site monSite) {
        super(monSite);
    }

    public void addPage(Page page){
        site.addPage(page);
        logs.add("La page :" + page.getTitle() + " a été ajoutée");

    }
    public void removePage(Page page){
        site.removePage(page);
        logs.add("La page : " + page.getTitle() + " a été suprimée");
    }

    // render et getPages sont déjà définis dans la classe Proxy

    @Override
    public String toString() {
        return "ListProxy{" +
                "\tproxyed site : " + site + "\n" +
                "\tlogs=" + logs +
                '}';
    }
}

