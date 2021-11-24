
import java.util.List;
import java.util.ArrayList;

public class Book {
    private String bookName;
    private List<Author> AuthorList = new ArrayList<>();
    private ArrayList<Element> content= new ArrayList<>();

    public Book(String bookName)
    {
        this.bookName = bookName;
    }

    public void addContent(Element element)
    {
        this.content.add(element);
    }

    public void addAuthor(Author author)
    {
        this.AuthorList.add(author);
    }


    public void print()
    {
        System.out.println("Book: " + this.bookName);
        System.out.println("Authors: ");
        for(Author a : AuthorList)
            a.print();
        for(Element e:content)
            e.print();
    }


}
