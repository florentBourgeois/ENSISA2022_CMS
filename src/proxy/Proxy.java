package proxy;

import Site.Page;
import Site.Site;

import java.util.ArrayList;
import java.util.Map;

public abstract class Proxy extends Site {
    protected Site site;

    public Proxy(Site monSite) {
        super();
        this.site = monSite;
    }

    public void addPage(Page page){
        // délègue au site de manière transparente - nécéssaire de surcharger au cas ou le "site" est un autre proxy
        site.addPage(page);
    }

    public void removePage(Page page){
        // délègue au site de manière transparente - nécéssaire de surcharger au cas ou le "site" est un autre proxy
        site.removePage(page);
    }

    public void render(String title){
        // délègue au site de manière transparente - nécéssaire de surcharger au cas ou le "site" est un autre proxy
        site.render(title);
    }

    public Map<String, Page> getPages() {
        // délègue au site de manière transparente - nécéssaire de surcharger au cas ou le "site" est un autre proxy
        return site.getPages();
    }

}

