package meRecipe.method;

import java.util.Scanner;
import meRecipe.food.FoodList;
import meRecipe.history.SearchHistory;
import meRecipe.member.Member;

public class SearchRecipe {
	Scanner sc = new Scanner(System.in);
	
	public void searching(FoodList fl, Member mem, SearchHistory sch, String name) {
		for(int i=0; i<fl.foodList.size(); i++) {
			if(name.equals(fl.foodList.get(i).foodName)) {
				fl.foodList.get(i).showIngredient();
				sch.addSearchList(mem, fl.foodList.get(i));
			} 
		}
	}
	
	public void searchFood(FoodList fl, String name, double wantServing) {
		for(int i=0; i<fl.foodList.size(); i++) {
			if(name.equals(fl.foodList.get(i).foodName)) {
				fl.foodList.get(i).calcServing(wantServing, fl.foodList.get(i).serving);
			}
		}
	}
	
	

}
