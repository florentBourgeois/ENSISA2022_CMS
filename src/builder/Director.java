package builder;

import Site.Page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class Director {
    private JFrame frame;
    private JTextField titleField;
    private JTextField authorField;
    private PageBuilders pageBuilders; // Initialisé correctement

    public Director() {
        frame = new JFrame("Page Builder");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        JLabel authorLabel = new JLabel("Author:");
        authorField = new JTextField();
        JButton addParagraphTagButton = new JButton("Add Paragraph Tag");
        JButton addImg = new JButton("Add Image");
        JButton addHeaderTagButton = new JButton("Add Header Tag");
        JButton saveButton = new JButton("Save as HTML");

        // Initialiser le PageBuilders ici
        pageBuilders = new PageBuilders();

        addImg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = JOptionPane.showInputDialog("Enter IMG URL:");
                if (content != null) {
                    pageBuilders.addImageTag("alt text",content);
                }
            }
        });

        addParagraphTagButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = JOptionPane.showInputDialog("Enter paragraph content:");
                if (content != null) {
                    pageBuilders.addParagraphTag(content);
                }
            }
        });

        addHeaderTagButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = JOptionPane.showInputDialog("Enter header content:");
                if (content != null) {
                    pageBuilders.addTitleTag(content, 1);
                }
            }
        });

        // Ajout des composants au frame
        frame.add(titleLabel);
        frame.add(titleField);
        frame.add(authorLabel);
        frame.add(authorField);
        frame.add(addParagraphTagButton);
        frame.add(addHeaderTagButton);
        frame.add(addImg);
        frame.add(saveButton);

        // ActionListener pour le bouton "Save as HTML"
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Page page = pageBuilders.build(); // Construire la page actuelle
                savePageAsHtml(page); // Sauvegarder la page en tant que fichier HTML
            }
        });

        frame.setVisible(true);
    }

    // Méthode pour sauvegarder la page en HTML
    private void savePageAsHtml(Page page) {
        try (FileWriter writer = new FileWriter("src/builder/page.html")) {
            writer.write(page.toHTML());
            JOptionPane.showMessageDialog(frame, "Page saved as page.html (cf. src/builder/page.html)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Director();
    }
}
