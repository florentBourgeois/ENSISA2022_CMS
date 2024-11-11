package visitor;


import Tags.*;
import Site.*;

public interface Visitor {
    void visitParagraph(Paragraph p);
    void visitTitle(Title t);
    void visitLink(Link l);
    void visitImage(Image i);
    void visitSite(Site s);
    void visitTag(Tag t); // for not yet implemented tags (like decorator or composite)
    void visitPage(Page p);
}
