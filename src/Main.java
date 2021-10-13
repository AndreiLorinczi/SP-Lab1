public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");

        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne  = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter sc1One = chp1.getSubChapter(indexSubChapterOne);

        sc1One.createNewParagraph("Paragraph 1");
        sc1One.createNewParagraph("Paragraph 2");
        sc1One.createNewParagraph("Paragraph 3");
        sc1One.createNewImage("Image 1");
        sc1One.createNewParagraph("Paragraph 4");
        sc1One.createNewTable("Table 1");
        sc1One.createNewParagraph("Paragraph 5");

        //sc1One.print();
        discoTitanic.print();
    }
}
