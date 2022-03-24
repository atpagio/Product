import java.util.*;
import java.text.NumberFormat;
public class Product
  {
    private double price;
    private int quantity;
    private String company;
    private String name;

    public Product()
    {
      this(0,"unknown","unknown");
      setQuantity(3+(int)(Math.random()*4));
    }
    public Product(double p, String co, String n)
    {
      setQuantity(3+(int)(Math.random()*4));
      setPrice(p);
      setCompany(co);
      setName(n);
    }

    //accessors
    public double getPrice()
    {
      return price;
    }
    public int getQuantity()
    {
      return quantity;
    }
    public String getName()
    {
      return name;
    }
    public String getCompany()
    {
      return company;
    }

    //mutators
    public void setPrice(double d)
    {
      price=d;
    }
    public void setQuantity(int x)
    {
      quantity=x;
    }
    public void setName(String s)
    {
      name=s;
    }
    public void setCompany(String s)
    {
      company=s;
    }

    public String toString()
    {
      NumberFormat nf=NumberFormat.getCurrencyInstance();
      return "\n"+name+"\t"+company+"\t"+quantity+"\t"+nf.format(price)+"\t"+Product.productCost(this);
    }

    //adding prices
    public static String productCost(Product a)
    {
      NumberFormat nf=NumberFormat.getCurrencyInstance();
      return nf.format(a.getPrice()*a.getQuantity());
    }
    public static double grandTotal(ArrayList<Product> a)
    {
      double d=0;
      for(Product t:a)
        {
          d+=t.getPrice()*t.getQuantity();
        }
      return d;
    }
    
  }