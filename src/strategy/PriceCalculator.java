package strategy;

import Site.Site;
import Site.Page;
import Tags.Image;
import Tags.Link;
import Tags.Paragraph;
import Tags.Title;

public class PriceCalculator {

    private Strategy strategy;

    public PriceCalculator() {

    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(Site site) {
        return this.strategy.calculate(site);
    }

    public static void main(String[] args) {
        Site site = new Site("facebook2");

        Page loginPage = new Page("login", "zuckerberg");
        loginPage.addTag(new Title("login title plage"));
        loginPage.addTag(new Paragraph("username:\npassword:"));
        loginPage.addTag(new Link());

        Page friendsPage = new Page("friends", "zuckerberg");
        friendsPage.addTag(new Title("friends title page"));
        friendsPage.addTag(new Image());

        site.addPage(loginPage);
        site.addPage(friendsPage);

        /*
                x2 Title
                x1 Paragraph
                x1 Link
                x1 Image
         */

        PriceCalculator self = new PriceCalculator();

        // Amazon (estimated : 75€)
        self.setStrategy(new Amazon());
        double amazonPrice = self.calculatePrice(site);
        System.out.println("amazon price (estimated : 75€) = " + amazonPrice + "€");

        // OVH (estimated : 37.5€)
        self.setStrategy(new OVH());
        double OVHPrice = self.calculatePrice(site);
        System.out.println("OVH price (estimated : 37.5€) = " + OVHPrice + "€");

    }
}
