package memento;

import java.util.Stack;

import Site.Page;
import Site.Page.PageMemento;
import Tags.Paragraph;
import Tags.Title;

public class PageCaretaker {
    private Stack<PageMemento> mementos;
    private int ptr; // This pointer targets the last memento of the Stack, with 0 being the last element of the Stack 
                     // (as implemented in the methods undo and redo to avoid incrementing the pointer uselessly)

    public PageCaretaker(){
        ptr = 0;
        mementos = new Stack<>();
    }
    public void save (PageMemento m){
       // if (mementos.size()-ptr != mementos.size()){
        if (ptr != 0){
            //for (int i = ptr+1; i <= mementos.size(); i++){
            for (int i = 0; i < ptr; i++){
                mementos.pop();
            }
        }
        mementos.add(m);
        ptr=0;
    }

    public void undo (Page p){
        if (mementos.size() - ptr >= 0){
            ptr += 1;
            PageMemento page_backup = mementos.get(mementos.size() - ptr);
            p.restore(page_backup);
        }
    }

    public void redo (Page p){
        if (ptr > 0){
            ptr -= 1;
            PageMemento page_backup = mementos.get(mementos.size() - ptr);
            p.restore(page_backup);
        }
        else {
            System.out.println("impossible de faire un redo ; pas de changement depuis le dernier save");
        }
    }

    public static void main(String[] args) {
        PageCaretaker caretaker = new PageCaretaker();
        Page page = new Page("Title", "Author");
        caretaker.save(page.save());

        page.addTag(new Paragraph("save 2"));
        caretaker.save(page.save());
        page.addTag(new Paragraph("This is another paragraph"));
        page.addTag(new Title("save 3"));
        caretaker.save(page.save());
        for (int i = 0; i <10 ; i++) {
            page.addTag(new Paragraph("save " + i+3));
            caretaker.save(page.save());
        }
        // last save is a  big one
        for (int i = 0; i <10 ; i++) {
            page.addTag(new Title("title " ));
        }
        caretaker.save(page.save());
        displayStatus("page a été créée et etapes sauvegardées", page, caretaker);


        caretaker.undo(page);
        displayStatus("premier undo", page, caretaker);

        caretaker.undo(page);
        displayStatus("deuxieme undo", page, caretaker);

        caretaker.undo(page);
        displayStatus("troisieme undo", page, caretaker);

        caretaker.redo(page);
        displayStatus("premier redo", page, caretaker);

        page.addTag(new Paragraph("dernier paragraphe ajouté"));
        caretaker.save(page.save());
        displayStatus("ajout d'un paragraphe et sauvegarde", page, caretaker);

        System.out.println("\n");
        caretaker.redo(page);
        displayStatus("redo normalement impossible (pas de changement depuis save)", page, caretaker);
    }

    public static void displayStatus(String message, Page page, PageCaretaker caretaker){
        System.out.println("\n----" +  message + "----");
        System.out.println("il y a actuellement "+ page.getContent().size()+" elements dans la page");
        System.out.println("il y a actuellement "+caretaker.mementos.size()+" mementos");
        System.out.println("le pointeur est actuellement "+caretaker.ptr);
        // display a graphical array with the mementos and the pointer
        for (int i = 0; i < caretaker.mementos.size(); i++) {
            if (i == caretaker.mementos.size() - caretaker.ptr){
                System.out.print("| "+i + " (pointé) |");
            }
            else {
                System.out.print("| "+ i+ " |");
            }
        }
        System.out.println("\nfin de " + message );
    }
}