package proxy;

import Site.Site;
import Site.Page;

public class Main {

    public static void main(String[] args) {
        Site site = new Site("Mon site");
        Proxy proxy = new ListProxy((site));
        proxy.addPage(new Page("page1", "Florent B"));
        System.out.println(proxy);
        proxy.addPage(new Page("Page2", "Florent Bourgeois"));
        proxy.addPage(new Page("Page3", "Florent Bourgeois"));
        System.out.println(proxy);

        Proxy proxy2 = new ConsoleProxy(proxy); // proxy2 est un proxy de proxy
        Page page = new Page("Page4", "Florent Bourgeois");
        proxy2.addPage(page);
        proxy2.removePage(page);
        site.render("Page2");
        System.out.println(proxy2);
        System.out.println(proxy);
    }
}
