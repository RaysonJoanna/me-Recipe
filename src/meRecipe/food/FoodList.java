package meRecipe.food;

import java.util.ArrayList;

public class FoodList {
	public ArrayList<Food> foodList = new ArrayList<Food>();
	
	public ArrayList<Food> addFood() {
		Food fd1 = new Food("김치찌개",3,1);
			fd1.ingAmou("묵은지", 300);
			fd1.ingAmou("돼지고기 찌개용",150);
			fd1.ingAmou("대파", 30);
			fd1.ingAmou("양파", 100);
			fd1.ingAmou("고춧가루", 20);
			fd1.ingAmou("국간장", 15);
			fd1.ingAmou("참치액", 20);
		
		Food fd2 = new Food("제육볶음",4,2);
			fd2.ingAmou("돼지고기 앞다리살", 500);
			fd2.ingAmou("양파", 150);
			fd2.ingAmou("대파", 200);
			fd2.ingAmou("고추장", 80);
			fd2.ingAmou("매실 액기스", 30);
			fd2.ingAmou("후추",2);
			fd2.ingAmou("설탕", 15);
			fd2.ingAmou("진간장", 20);
			
		Food fd3 = new Food("계란말이",1,3);
			fd3.ingAmou("계란",150);
			fd3.ingAmou("양파", 15);
			fd3.ingAmou("소금", 3);
			fd3.ingAmou("후추", 1);
			fd3.ingAmou("식용유", 15);
			fd3.ingAmou("당근", 10);
		
		Food fd4 = new Food("오일 파스타",2,4);
			fd4.ingAmou("올리브오일", 20);
			fd4.ingAmou("베이컨", 50);
			fd4.ingAmou("마늘",80);
			fd4.ingAmou("페퍼론치노", 5);
			fd4.ingAmou("통후추", 3);
			fd4.ingAmou("굴소스", 20);
			fd4.ingAmou("스파게티 면", 250);
			
		Food fd5 = new Food("크림 파스타",2,5);
			fd5.ingAmou("올리브오일", 10);
			fd5.ingAmou("올리브오일", 20);
			fd5.ingAmou("베이컨", 50);
			fd5.ingAmou("마늘",80);
			fd5.ingAmou("페퍼론치노", 8);
			fd5.ingAmou("통후추", 4);
			fd5.ingAmou("굴소스", 20);
			fd5.ingAmou("스파게티 면", 250);
			fd5.ingAmou("생크림", 100);
			fd5.ingAmou("우유", 150);
			fd5.ingAmou("모짜렐라 치즈", 20);
				
		Food fd6 = new Food("수육",4,6);
			fd6.ingAmou("돼지고기 앞다리살", 1000);
			fd6.ingAmou("된장", 50);
			fd6.ingAmou("통후추",10);
			fd6.ingAmou("월계수잎", 2);
			fd6.ingAmou("커피가루",10);
			fd6.ingAmou("양파", 80);
			fd6.ingAmou("대파",150);
			fd6.ingAmou("사과",100);
			
		Food fd7 = new Food("겉절이",4,7);	
			fd7.ingAmou("상추", 200);
			fd7.ingAmou("깻잎", 100);
			fd7.ingAmou("파채", 100);
			fd7.ingAmou("다진마늘", 10);
			fd7.ingAmou("고추가루", 10);
			fd7.ingAmou("멸치액젓", 10);
			fd7.ingAmou("참기름", 10);
			fd7.ingAmou("매실 액기스", 10);
			fd7.ingAmou("설탕", 10);
			fd7.ingAmou("통깨",5);
			
		Food fd8 = new Food("감바스",2,8);
			fd8.ingAmou("새우", 150);
			fd8.ingAmou("마늘", 70);
			fd8.ingAmou("페퍼론치노", 10);
			fd8.ingAmou("통후추", 3);
			fd8.ingAmou("올리브오일", 50);
			fd8.ingAmou("치아바타", 200);
			
		foodList.add(fd1);
		foodList.add(fd2);
		foodList.add(fd3);
		foodList.add(fd4);
		foodList.add(fd5);
		foodList.add(fd6);
		foodList.add(fd7);
		foodList.add(fd8);
		
		return foodList;
	}
	
	public void showFoodList() {
		for(int i=0; i<foodList.size();i++) {
		System.out.print(foodList.get(i).foodName + " ");
		}
	}
}
	