
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
        /*
        if(element instanceof Paragraph){
            Paragraph paragraphCopy = new Paragraph((Paragraph) element);
            this.elements.add(paragraphCopy);
        }
        else if(element instanceof Image){
            Image imageCopy = new Image((Image) element);
            this.elements.add(imageCopy);
        }
        else if(element instanceof Section){
            Section sectionCopy = new Section((Section) element);
            this.elements.add(sectionCopy);
        }
        else if(element instanceof Table){
            Table tableCopy = new Table((Table) element);
            this.elements.add(tableCopy);
        }
*/
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


}