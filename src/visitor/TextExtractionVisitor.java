package visitor;

import Tags.*;
import Site.*;

public class TextExtractionVisitor implements Visitor {
    private final StringBuilder extractedText;

    public TextExtractionVisitor() {
        this.extractedText = new StringBuilder();
    }

    @Override
    public void visitParagraph(Paragraph p) {
        extractedText.append("\t\tParagraph : ").append(p.getText()).append("\n");
    }

    @Override
    public void visitTitle(Title t) {
        extractedText.append("\t\tTitle : H").append(t.getLvl())
                .append(t.getText()).append("\n");
    }

    @Override
    public void visitLink(Link l) {
        extractedText.append("\t\tLink : ").append(l.getText())
                .append(" link : ").append(l.getHref()).append("\n");
    }

    @Override
    public void visitImage(Image i) {
        // For an image, we might want to extract its description or alt text.
        extractedText.append("\t\tImage: ").append(i.getText())
                .append(" link : ").append(i.getSrc()).append("]\n");
    }


    @Override
    public void visitSite(Site s) {
        this.extractedText.append("website name :").append(s.getTitle()).append(" contains : \n");
        for (Page page : s.getPages().values()) {
            page.accept(this); // Visit each page in the site
        }
    }

    public void visitPage(Page page) {
        this.extractedText.append("\tpage name : ").append(page.getTitle()).append(" contains : \n");
        for (Tag tag : page.getContent()) {
            tag.accept(this); // Visit each tag in the page
        }
    }

    public void visitTag(Tag tag) {
        extractedText.append("\t\t").append(tag.getClass().getSimpleName()).append(" <- this is a not managed yet tag : ").append("\n");
    }

    public String getExtractedText() {
        return extractedText.toString();
    }
}

