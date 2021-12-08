
import java.util.ArrayList;
public class Section implements Element{
    private String name;
    private ArrayList<Element> elements=new ArrayList<>();
    public Section(String name)
    {
        this.name = name;
    }

    public Section (Section section)
    {
        name = section.name;
    }

    public void print()
    {
        System.out.println(name);
        for(Element e:elements)
            e.print();
    }

    public void add(Element element)
    {
        this.elements.add(element);
    }

    public void remove(Element element)
    {
        this.elements.remove(element);
    }

    public Element get(int index) {
        if(index < 0 || index >=elements.size())
        {
            return null;
        }
        return elements.get(index);
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public String getTitle() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}