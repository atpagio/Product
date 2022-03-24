public class Electronics extends Product
  {
    private boolean batteryIncluded;
    private boolean fragile;

    public Electronics()
    {
      super();
      setBattInc(false);
      setFragile(false);
    }

    public Electronics(double p, String co, String n, boolean bi, boolean f)
    {
      super(p,co,n);
      setBattInc(bi);
      setFragile(f);
    }

    public boolean getBattInc()
    {
      return batteryIncluded;
    }
    public boolean getFragile()
    {
      return fragile;
    }

    public void setBattInc(boolean b)
    {
      batteryIncluded=b;
    }
    public void setFragile(boolean f)
    {
      fragile=f;
    }
    
    public String toString()
    {
      String a="";
      a+=super.toString()+"\n\t";
      if(fragile)
      {
        a+="fragile with";
      } else{
        a+="non-fragile with";
      }
      if(batteryIncluded)
      {
        a+=" battery included";
      } else {
        a+="out batter included";
      }
      return a;
    }
  }