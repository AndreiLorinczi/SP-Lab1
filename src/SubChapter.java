import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elements = new ArrayList<>();

    public SubChapter(String numesub)
    {
        this.name = numesub;

    }
    public void addElement(Element e)
    {
      elements.add(e);
    }
    public void createNewParagraph(String newParagraph)
    {
        elements.add(new Paragraph(newParagraph));
    }

    public void createNewImage(String newImage)
    {
        elements.add(new Image(newImage));
    }

    public void createNewTable(String newTable)
    {
        elements.add(new Table(newTable));
    }
    public void print()
    {
        System.out.println("Subchapter: " + this.name);
        for(Element e : elements)
        {
            e.print();
        }
    }
}
