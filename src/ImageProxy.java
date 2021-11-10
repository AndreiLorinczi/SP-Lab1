
public class ImageProxy implements Element {
    String url;
    Image realImage;

    ImageProxy(String url)
    {
        this.url = url;
    }
    private Image loadImage()
    {
        if(realImage == null)
        {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void print()
    {
        loadImage().print();
    }

    @Override
    public void add(Element element)
    {

    }

    @Override
    public void remove(Element element)
    {

    }

    @Override
    public Element get(int index)
    {
        return null;
    }
}