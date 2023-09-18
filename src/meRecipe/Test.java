package meRecipe;

import java.util.ArrayList;
import java.util.Scanner;

import meRecipe.food.Food;
import meRecipe.food.FoodList;
import meRecipe.history.SearchHistory;
import meRecipe.member.Member;

public class Test {

	public static void main(String[] args) {
		Food food = new Food();
		SearchHistory sh = new SearchHistory();
		FoodList fl = new FoodList();		
		ArrayList<Food> foodList = fl.addFood();
		Scanner sc = new Scanner(System.in);
		
		Member mem1 = new Member("sh","1234");
		mem1.addMem(mem1);
		
		fl.showFoodList();
		System.out.println();
		System.out.println("무슨 음식 조회?");
		String search = sc.nextLine();
		System.out.println("필요한 재료?");
		
		//sh.addSearchList(mem1, ); foodList에서 음식이름으로 객체 찾아서 넣어야함
		for(int i=0; i<foodList.size(); i++) {
			if(search.equals(foodList.get(i).foodName)) {
				foodList.get(i).showIngredient();
				sh.addSearchList(mem1, foodList.get(i));
			} 
		}
		System.out.println();
		sh.showSearchHistory(mem1);
		
		System.out.println("무슨 음식 조회?");
		String search2 = sc.nextLine();
		System.out.println("필요한 재료?");
		
		//sh.addSearchList(mem1, ); foodList에서 음식이름으로 객체 찾아서 넣어야함
		for(int i=0; i<foodList.size(); i++) {
			if(search2.equals(foodList.get(i).foodName)) {
				foodList.get(i).showIngredient();
				sh.addSearchList(mem1, foodList.get(i));
			} 
		}
		System.out.println();
		sh.showSearchHistory(mem1);
		
		System.out.println("무슨 음식 조회?");
		String search3 = sc.nextLine();
		System.out.println("필요한 재료?");
		
		//sh.addSearchList(mem1, ); foodList에서 음식이름으로 객체 찾아서 넣어야함
		for(int i=0; i<foodList.size(); i++) {
			if(search3.equals(foodList.get(i).foodName)) {
				foodList.get(i).showIngredient();
				sh.addSearchList(mem1, foodList.get(i));
			} 
		}
		System.out.println();
		sh.showSearchHistory(mem1);
		
	}
}
