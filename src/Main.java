public class Main {
    public static void Printing(){
        DocumentManager.getInstance().getBook().print();
    }
    public static void main(String[] args) {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        GenerateToC printer = new GenerateToC();
        BookStatistics bookStatistics = new BookStatistics();
        cap1.accept(printer);
        cap1.accept(bookStatistics);
        bookStatistics.printCounter();
    }
}

