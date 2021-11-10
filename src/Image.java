import java.util.concurrent.TimeUnit;

public class Image implements Element{
    String image;

    public Image(String image)
    {
        this.image = image;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public Image (Image img){
        image = img.image;
    }
    public String toString()
    {
      return "Image with name: "+this.image;
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