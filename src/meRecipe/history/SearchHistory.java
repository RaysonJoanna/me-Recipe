package meRecipe.history;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import meRecipe.food.Food;
import meRecipe.member.Member;

public class SearchHistory {
	ArrayList<Food> foodList = new ArrayList<Food>();
	HashMap<Integer, ArrayList<Food>> foodHistory = new HashMap<Integer, ArrayList<Food>>();
	LinkedHashSet<String> searchList = new LinkedHashSet<>();
	
	
	public void addSearchList(Member member, Food food) {		
		foodList.add(food);
		foodHistory.put(member.getCustNum(),foodList);
	}
	
//	public void showSearchHistory(Member member) {	-- 중복 처리불가로 폐기
//		System.out.println(member.getName() + "님의 레시피 조회내역입니다.");
//		for(int i = 0; i < foodList.size(); i++) {		
//		System.out.println(foodHistory.get(member.getCustNum()).get(i).foodName);
//		}
//	}
	
	public void showSearchHistory(Member member) {
		for(Food food : foodList) {
			searchList.add(food.foodName);
		}
		System.out.println("\n"+ member.getID()+"님이 검색한 레시피입니다~");
		System.out.println(searchList);		
	}
	
	public void frequentRecipe() {
		
	}
	
	
	
}
