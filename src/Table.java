public class Table implements Element {
    String table;

    public Table (String table)
    {
        this.table = table;
    }
    public String toString()
    {
        return "Table with Title: "+this.table;
    }

    public void print()
    {
        System.out.println(this.toString());
    }

}