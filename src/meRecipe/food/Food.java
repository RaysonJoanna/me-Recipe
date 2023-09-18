package meRecipe.food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Food {  
	public HashMap <String, Integer> ingredientAmount = new HashMap<String, Integer>();
	public ArrayList<HashMap<String,Integer>> ingredients = new ArrayList<HashMap<String,Integer>>();
	
	public String foodName;
	public int foodNum;
	public String ingredient;
	public int amount;
	public double serving;
	
	public Food() {}
	
	public Food(String foodName, double serving, int foodNum) {
		this.foodName = foodName;
		this.serving = serving;
		this.foodNum = foodNum;
	}
	
	public void ingAmou(String ingredient, int amount) {
		ingredientAmount.put(ingredient, amount);
		ingredients.add(ingredientAmount);
	}
	
	public void calcServing(double wantServing, double serving) {
		Iterator<String> ir = ingredientAmount.keySet().iterator();
			while (ir.hasNext()) {
				String ingredient = ir.next();
				System.out.println(ingredient+" "
						+ Math.round(ingredientAmount.get(ingredient)/serving*wantServing)+"g");
			}
	}
	
	public void showIngredient() {
		Iterator<String> ir = ingredientAmount.keySet().iterator();
		while (ir.hasNext()) {
			String ingredient = ir.next();
			System.out.print(ingredient+ " / ");
		}
	}
	
}
