public class Table implements Element {
    String table;

    public Table (String table)
    {
        this.table = table;
    }
    public Table (Table tab)
    {
        table= tab.table;
    }
    public String toString()
    {
        return "Table with Title: "+this.table;
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