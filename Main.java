import java.util.*;
import java.text.NumberFormat;
class Main {
  public static void main(String[] args) {
    NumberFormat nf=NumberFormat.getCurrencyInstance();
    ArrayList <Product> prods=new ArrayList <Product>();

    //new products added
    Product a=new Product(9.12, "Amazon", "pencil Pack");
    Product b=new Clothing(69.50, "Macy's", "maxi skirt","Nicole Williams","m");
    Clothing c=new Women(8.81, "Target", "t-shirt", "Wild Fable","s","polyester");
    Clothing d=new Men(3.03, "Old Navy", "jacket", "Nike","xL","cotton");
    Product e=new Media(12.54, "Barnes and Noble", "The Hobbit", "paper-back book");
    Product f=new Electronics(105.72, "Radio Shack", "headphones", true, false);
    prods.add(a);
    prods.add(b);
    prods.add(c);
    prods.add(d);
    prods.add(e);
    prods.add(f);

    //printing
    for(Product p:prods)
      {
        System.out.println(p);
      } System.out.println("*************************************************************************");
    System.out.printf("\tTotal Price %50s", nf.format(Product.grandTotal(prods)));
  }

}
