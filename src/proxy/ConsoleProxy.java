package proxy;

import Site.Page;
import Site.Site;

import java.util.ArrayList;
import java.util.Map;

public class ConsoleProxy extends Proxy {
    public ConsoleProxy(Site monSite) {
        super(monSite);
    }

    public void addPage(Page page){
        site.addPage(page);
        System.out.println("La page :" + page.getTitle() + " a été ajoutée");

    }
    public void removePage(Page page){
        site.removePage(page);
        System.out.println("La page : " + page.getTitle() + " a été suprimée");
    }

    // render et getPages sont déjà définis dans la classe Proxy

    @Override
    public String toString() {
        return "ConsoleProxy{" +
                "\tproxyed site : " + site + "\n" +
                '}';
    }
}

