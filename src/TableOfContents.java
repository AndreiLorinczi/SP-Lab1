
public class TableOfContents implements Element{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void print()
    {
        System.out.println("");
    }

    @Override
    public void add(Element element)
    {

    }

    @Override
    public void remove(Element element)
    {

    }

    @Override
    public Element get(int index)
    {
        return null;
    }
}