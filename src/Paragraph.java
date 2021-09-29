public class Paragraph {
    String para;

    public Paragraph(String text)
    {
        this.para = text;
    }

    @Override
    public String toString()
    {
        return "Paragraf : "  + para ;
    }
}