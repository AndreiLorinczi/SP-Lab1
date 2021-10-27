public class Author {
    String name;

    public Author(String name)
    {
        this.name = name;
    }
    public Author (Author author)
    {
        name = author.name;
    }

    public void print()
    {
        System.out.println("Author: "+this.name);
    }

}
