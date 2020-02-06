package NewYearGift;
public class Fivestar extends Chocolates
{
   private float fivestar_cost;
   private int no_of_fivestar;
   Fivestar(String name_of_candy,int no_of_fivestar,float fivestar_cost)
     {
        super(name_of_candy);
        this.no_of_fivestar=no_of_fivestar;
        this.fivestar_cost=fivestar_cost;
     }
   public int getCount()
     {
        return no_of_fivestar;
     }
  public float getPrice()
    {
       return fivestar_cost;
    }
 public float gene_cost()
  {
     float c=(float)(no_of_fivestar)*(fivestar_cost);
     return c;
  }
}
   