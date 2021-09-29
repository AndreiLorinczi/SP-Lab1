
import java.util.List;
import java.util.ArrayList;

public class Book {
    private String bookName;
    private List<Paragraph> para = new ArrayList<Paragraph>();
    private List<Table> tabel = new ArrayList<Table>();
    private List<Image> img = new ArrayList<Image>();


    public Book(String numeCarte)
    {
        this.bookName = numeCarte;

    }

    public Book()
    {

    }

    public void createNewParagraph(String newParagraph)
    {
        para.add(new Paragraph(newParagraph));
    }
    public void createNewImage(String newImage)
    {
        img.add(new Image(newImage));
    }
    public void createNewTable(String newTable)
    {
        tabel.add(new Table(newTable));
    }

    @Override
    public String toString()
    {
        return "Book{" + "nume='" + bookName + '\'' + '}';
    }

    public void print()
    {
        System.out.println("Nume carte: " + this.bookName);
        for(Paragraph p : this.para) {
            System.out.println(p);
        }
        for(Image i : this.img) {
            System.out.println(i);
        }
        for(Table t : this.tabel) {
            System.out.println(t);
        }
    }


}
