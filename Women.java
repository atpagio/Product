public class Women extends Clothing
  {
    private String material;
    
    public Women()
    {
      super();
      setMaterial("cotton");
    }
    public Women(double p, String co, String n, String br, String s, String m)
    {
      super(p,co,n,br,s);
      setMaterial(m);
    }

    public String getMaterial()
    {
      return material;
    }

    public void setMaterial(String m)
    {
      material=m;
    }

    public String toString()
    {
      return super.toString()+", Women's "+material;
    }
  }