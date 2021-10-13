
import java.util.List;
import java.util.ArrayList;

public class Book {
    private String bookName;
    private List<Author> AuthorList = new ArrayList<>();
    private List<Chapter> ChapterList = new ArrayList<>();

    public Book(String bookName)
    {
        this.bookName = bookName;
    }

    public void addAuthor(Author author)
    {
        this.AuthorList.add(author);
    }
    public int createChapter(String chapterName)
    {
        Chapter chapter = new Chapter(chapterName);
        this.ChapterList.add(chapter);
        return this.ChapterList.indexOf(chapter);
    }
    public Chapter getChapter(int index)
    {
        return this.ChapterList.get(index);
    }

    public void print()
    {
        System.out.println("Title: " + this.bookName);
        System.out.print("Author/Authors: ");
        for(Author a : AuthorList)
        {
            a.print();
        }
        for (Chapter c : ChapterList)
        {
            c.print();
        }
    }


}
