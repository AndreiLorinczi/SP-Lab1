import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Paragraph> para = new ArrayList<Paragraph>();
    private List<Table> tabel = new ArrayList<Table>();
    private List<Image> img = new ArrayList<Image>();

    public SubChapter(String numesub)
    {
        this.name = numesub;

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

    public void print()
    {
        System.out.println("Subchapter: " + this.name);
        for(Paragraph p : this.para) {
            System.out.print("Paragraph: ");
            p.print();
        }
        for(Image i : this.img) {
            System.out.print("Image with name: ");
            i.print();
        }
        for(Table t : this.tabel) {
            System.out.print("Table with Title: ");
            t.print();
        }
    }
}
