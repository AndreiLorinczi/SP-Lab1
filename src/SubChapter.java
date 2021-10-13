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

    public void print()
    {
        System.out.println("Subchapter: " + this.name);
        for(Element e : elements)
        {
            e.print();
        }
    }
}
