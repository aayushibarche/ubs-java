package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
	
	HashMap<Furniture, Integer> oderQuantiy = new HashMap<>();

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
    	oderQuantiy.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
    	return oderQuantiy;
    }

    public float getTotalOrderCost() {
    	float finalAmount = 0 ;
    	for(Furniture f :  oderQuantiy.keySet()) {
    		
    		float amount  = f.cost()*(float)oderQuantiy.get(f);
    		finalAmount = amount+finalAmount;
    		
    	}
    	
    	return finalAmount;
    }

    public int getTypeCount(Furniture type) {
      
    	int count=0;

    	for(Furniture f :  oderQuantiy.keySet()) {
    		if(f.label().equals(type.label())) {
    			count=count+oderQuantiy.get(f);
    		}
    	}
        return count;
    }

    public float getTypeCost(Furniture type) {

    	float cost = 0.0f;
    	
    	for(Furniture f :  oderQuantiy.keySet()) {
    		if(f.label().equals(type.label())) {
    		
    			cost=getTypeCount(type)*f.cost();
    		}
    	}
    	
    	
    	return cost;
    }

    public int getTotalOrderQuantity() {
    	int count=0;
    	for(Furniture f :  oderQuantiy.keySet()) {
    		count=count+oderQuantiy.get(f);
    	}
    	return count;
    }
}