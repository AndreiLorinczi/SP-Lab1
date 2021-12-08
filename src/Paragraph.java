public class Paragraph implements Element{
    static String para;
    String ptext;
    AlignStrategy ast;

    public Paragraph(String text)
    {
        this.para = text;
    }

    public Paragraph(Paragraph paragraph)
    {
        para = paragraph.para;
    }

    public void setAlignStrategy(AlignStrategy ast) {
        this.ast = ast;
    }

    public String getpText() {
        return ptext;
    }

    public static String getText() {
        return para;
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

    public AlignStrategy getTextAlignemnt() {
        return ast;
    }


    public void print()
    {
        if(ast == null) {
            System.out.println(this.toString());
            return;
        }
        ast.render(this, new Context());
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}