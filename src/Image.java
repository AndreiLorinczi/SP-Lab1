public class Image implements Element{
    String image;

    public Image(String image)
    {
        this.image = image;
    }

    public String toString()
    {
      return "Image with name: "+this.image;
    }

    public void print()
    {
        System.out.println(this.toString());
    }

}