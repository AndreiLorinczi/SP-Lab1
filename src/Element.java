public interface Element extends Visitee {
    public void print();
    void add(Element element);
    void remove(Element element);
    Element get(int index);
}
