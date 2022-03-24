public class Media extends Product
  {
    private String type;

    public Media()
    {
      super();
      setType("unknown");
    }
    public Media(double p, String co, String n, String t)
    {
      super(p,co,n);
      setType(t);
    }

    public String getType()
    {
      return type;
    }
    
    public void setType(String t)
    {
      type=t;
    }

    public String toString()
    {
      return super.toString()+"\n\t"+type;
    }
    
  }