public class Clothing extends Product
  {
    private String brand;
    private String size;

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
      super.toString();
      return brand+" in size "+size;
    }
  }