public class Men extends Clothing
{
  private String material;
    
    public Men()
    {
      super();
      setMaterial("cotton");
    }
    public Men(double p, String co, String n, String br, String s, String m)
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
      return super.toString()+", Men's "+material;
    }
}