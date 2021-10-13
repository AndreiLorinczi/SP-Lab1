import java.util.ArrayList;
import java.util.List;

public class Chapter {
    String name;
    List<SubChapter> SubChapterList = new ArrayList<>();

    public Chapter(String name)
    {
        this.name = name;
    }

    public int createSubChapter(String subName)
    {
        SubChapter sub = new SubChapter(subName);
        this.SubChapterList.add(sub);
        return this.SubChapterList.indexOf(sub);

    }

    public SubChapter getSubChapter(int index) {
        return this.SubChapterList.get(index);
    }

    public void print()
    {
        System.out.println("Chapter: "+ this.name);
        for(SubChapter s : SubChapterList)
        {
            s.print();
        }
    }


}
