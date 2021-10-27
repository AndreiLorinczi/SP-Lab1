public class Image implements Element{
    String image;

    public Image(String image)
    {
        this.image = image;
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