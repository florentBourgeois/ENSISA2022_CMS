package visitor;

import Tags.*;
import Site.*;

/**
 * Visitor that calculates the number of tags
 * NOTA : div2col is not implemented yet -> there would be no need to visit each tag, just counting the pages number of tags is enough
 */
public class TagsCounterVisitor implements Visitor {
    private int count;

    public TagsCounterVisitor() {
        this.count = 0;
    }

    @Override
    public void visitParagraph(Paragraph p) {
        count++;
    }

    @Override
    public void visitTitle(Title t) {
        count++;
    }

    @Override
    public void visitLink(Link l) {
        count++;
    }

    @Override
    public void visitImage(Image i) {
        count++;
    }

    @Override
    public void visitSite(Site s) {
        for (Page page : s.getPages().values()) {
            page.accept(this);
        }
    }

    @Override
    public void visitTag(Tag t) {
        count++;
    }

    @Override
    public void visitPage(Page p) {
        for (Tag tag : p.getContent()) {
            tag.accept(this);
        }
    }

    public int getCount() {
        return count;
    }
}

