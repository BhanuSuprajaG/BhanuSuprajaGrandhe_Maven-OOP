package NewYearGift;
public class DairyMilk extends Chocolates
{
   private float dairymilk_cost;
   private int no_of_dairymilk;
   DairyMilk(String name_of_candy,int no_of_dairymilk,float dairymilk_cost)
     {
        super(name_of_candy);
        this.no_of_dairymilk=no_of_dairymilk;
        this.dairymilk_cost=dairymilk_cost;
     }
   public int getCount()
     {
        return no_of_dairymilk;
     }
  public float getPrice()
    {
       return dairymilk_cost;
    }
 public float gene_cost()
  {
     float c=(float)(no_of_dairymilk)*(dairymilk_cost);
     return c;
  }
}
   
