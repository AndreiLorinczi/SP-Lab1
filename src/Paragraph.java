public class Paragraph implements Element{
    String para;

    public Paragraph(String text)
    {
        this.para = text;
    }

    public String toString()
    {
        return "Paragraph: " + this.para;
    }

    public void print()
    {
        System.out.println(this.toString());
    }

}