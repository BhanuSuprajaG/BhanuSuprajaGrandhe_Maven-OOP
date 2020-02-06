package NewYearGift;
public class KajuKatli extends Sweets
{ 
   private float kaju_weight;
   private float kaju_cost;
   KajuKatli(String name_of_sweet,float kaju_weight,float kaju_cost)
      {
           super(name_of_sweet);
           this.kaju_weight=kaju_weight;
           this.kaju_cost=kaju_cost;
      }
  public float getWeight()
     {
        return kaju_weight;
     }
  public float getPrice()
     {
        return kaju_cost;
     }
 public float gene_cost()
     {
         float c = (float)(kaju_weight*kaju_cost);
         return c;
     }
}
         

