public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");

        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne  = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter sc1One = chp1.getSubChapter(indexSubChapterOne);

        sc1One.addElement(new Paragraph("Paragraph 1"));
        sc1One.addElement(new Paragraph("Paragraph 2"));
        sc1One.addElement(new Paragraph("Paragraph 3"));
        sc1One.addElement(new Image("Image 1"));
        sc1One.addElement(new Paragraph("Paragraph 4"));
        sc1One.addElement(new Table("Table 1"));
        sc1One.addElement(new Paragraph("Paragraph 5"));

        //sc1One.print();
        discoTitanic.print();
    }
}
