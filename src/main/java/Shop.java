import iSellable.ISellable;
import java.util.ArrayList;

public class Shop {

    private ArrayList<ISellable> stock;

public Shop(){
    stock = new ArrayList<ISellable>();
 }


 public int getStockAmount(){
    return stock.size();
 }

 public void addItemToStock(ISellable item){
    this.stock.add(item);
 }

 public void removeItemFromStock(ISellable item){
     // if (stock.contains(item)) {
         this.stock.remove(item);
    // }
 }


}
