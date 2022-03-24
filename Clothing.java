public class Clothing extends Product
  {
    private String brand;
    private String size;

    public Clothing()
    {
      super();
      setBrand("unknown");
      setSize("m");
    }

    public Clothing(double p, String co, String n, String br, String s)
    {
      super(p,co,n);
      setBrand(br);
      setSize(s);
    }

    public String getBrand()
    {
      return brand;
    }
    public String getSize()
    {
      return size;
    }

    public void setBrand(String s)
    {
      brand=s;
    }
    public void setSize(String s)
    {
      size=s;
    }

    public String toString()
    {
      return super.toString()+"\n\t\""+brand+"\" size "+size;
    }
  }