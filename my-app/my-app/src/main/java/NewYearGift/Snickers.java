package NewYearGift;
public class Snickers extends Chocolates
{
   private float snickers_cost;
   private int no_of_snickers;
   Snickers(String name_of_candy,int no_of_snickers,float snickers_cost)
     {
        super(name_of_candy);
        this.no_of_snickers=no_of_snickers;
        this.snickers_cost=snickers_cost;
     }
   public int getCount()
     {
        return no_of_snickers;
     }
  public float getPrice()
    {
       return snickers_cost;
    }
 public float gene_cost()
  {
     float c=(float)(no_of_snickers)*(snickers_cost);
     return c;
  }
}
   
