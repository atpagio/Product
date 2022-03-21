import java.util.*;
public class Product
  {
    private double price;
    private int quantity;
    private String company;
    private String name;

//+toString()

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
      return name+"\t"+company+"\t"+quantity;
    }

  }