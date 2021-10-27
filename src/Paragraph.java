public class Paragraph implements Element{
    String para;

    public Paragraph(String text)
    {
        this.para = text;
    }

    public Paragraph(Paragraph paragraph)
    {
        para = paragraph.para;
    }

    public String toString()
    {
        return "Paragraph: " + this.para;
    }
    public void add(Element element)
    {

    }

    public void remove(Element element)
    {

    }

    public Element get(int index)
    {
        return null;
    }

    public void print()
    {
        System.out.println(this.toString());
    }

}