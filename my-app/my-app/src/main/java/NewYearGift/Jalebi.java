package NewYearGift;
public class Jalebi extends Sweets
{ 
   private float jalebi_weight;
   private float jalebi_cost;
   Jalebi(String name_of_sweet,float jalebi_weight,float jalebi_cost)
      {
           super(name_of_sweet);
           this.jalebi_weight=jalebi_weight;
           this.jalebi_cost=jalebi_cost;
      }
 public float gene_cost()
     {
         float c = (float)(jalebi_weight*jalebi_cost);
         return c;
     }
}
        
