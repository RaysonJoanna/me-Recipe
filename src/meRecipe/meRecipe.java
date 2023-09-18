package meRecipe;

import java.util.Scanner;

import meRecipe.food.Food;
import meRecipe.food.FoodList;
import meRecipe.history.SearchHistory;
import meRecipe.member.Member;
import meRecipe.method.SearchRecipe;
import meRecipe.template.Screen;

public class meRecipe {
	static Member member = new Member();
	static FoodList fl = new FoodList();
	static SearchHistory sch = new SearchHistory();
	static int manager_num = 9999;

	public static void main(String[] args) {
		Screen screen = new Screen();
		Scanner scn = new Scanner(System.in);
		Member newMem = new Member("12121212","12121212");
		SearchRecipe sr = new SearchRecipe();
		member.addMem(newMem);
		fl.addFood();

		boolean login = true;
		
		while(login) {
			screen.login_screen();
			int login_ = scn.nextInt();
			
			//로그인
			if(login_ == 1) {			
				boolean login_menu = true;
				
				while(login_menu) {
					System.out.print("아이디 : ");
					scn.nextLine();
					String ID = scn.nextLine();
					if(member.searchID(ID)) {
						System.out.println("비밀번호 :");
						String pw = scn.nextLine();
						if(member.searchPW(pw)) {
							System.out.println(ID + "님 반갑습니다!");
							member = member.findMem(ID);
							
							//로그인 완료
							//메인 메뉴
							boolean main_menu = true;
							while(main_menu) {
								screen.main_screen();
								int main_ = scn.nextInt();
								
								//레시피 검색
								if(main_ == 1) {
									boolean main_recipe = true;
									while(main_recipe) {
										System.out.println("-----------------------------------------");
										fl.showFoodList();
										System.out.println();
										System.out.println("-----------------------------------------");
										System.out.println("궁금한 음식 이름을 입력해주세요!");
										scn.nextLine();
										String fdName = scn.nextLine();
										screen.recipe_menu(fdName);
										int recipe_menu_choice = scn.nextInt();
										//재료 조회
										if(recipe_menu_choice == 1) {
											sr.searching(fl, member, sch, fdName);
										//몇 인분	
										}else if(recipe_menu_choice == 2) {
											System.out.println("몇 인분 만드실건가요?");
											double serving = scn.nextDouble();
											sr.searchFood(fl, fdName, serving);
										//뒤로
										}else if(recipe_menu_choice == 3) {
											main_recipe = false;
										} else {
											System.out.println("입력한 메뉴번호가 올바르지 않습니다.");
										}
									}//메인-레시피검색 반복문 끝
									
								//검색기록 조회
								}else if(main_ == 2) {
									sch.showSearchHistory(member);
								//뒤로가기
								}else if(main_ == 3) {
									login = false;
									login_menu = false;
									
								}else {
									System.out.println("입력한 메뉴번호가 올바르지 않습니다.");
								}
								
							}//메인메뉴 반복문 끝
						} else {
							System.out.println("비밀번호가 일치하지 않습니다.");
						}
					} else {
						System.out.println("아이디가 일치하지 않습니다.");
					}
				}//로그인 메뉴 반복문 끝
			//회원가입
			} else if(login_ == 2) {
				boolean register_menu = true;
				boolean pw = true;
				boolean pw_check = true;

				while (register_menu) {
					System.out.println("사용할 아이디를 입력하세요 (8~20자리)");
					scn.nextLine();
					String user_ID = scn.nextLine();

					if (user_ID.length() < 8 || user_ID.length() > 20) {
						System.out.println("아이디 길이가 범위를 벗어났습니다. " + "다시 입력하세요");
					} else if (member.searchID(user_ID)) {
						System.out.println("입력한 아이디가 존재합니다.");
					} else {

						while (pw) {
							System.out.println("사용할 비밀번호를 입력하세요 (8~20자리)");
							String user_pw = scn.nextLine();

							if (user_pw.length() < 8 || user_pw.length() > 20) {
								System.out.println("비밀번호 길이가 범위를 벗어났습니다. " + "다시 입력하세요");
							} else {
								while (pw_check) {
									System.out.println("확인을 위해 비밀번호를 한번 더 입력하세요");
									String check_pw = scn.nextLine();

									if (check_pw.equals(user_pw)) {
										Member new_m = new Member(user_ID, user_pw);
										member.addMem(new_m);
										System.out.println(user_ID + "님! 회원가입이 완료되었습니다.");
										pw_check = false;
										pw = false;
										register_menu = false;		
									} else {
										System.out.println("입력한 비밀번호가 다릅니다.");
									}
								}//비밀번호 확인
							}//else문 끝
						}//비밀번호 반복문 끝
					}//회원가입 else문 끝
				}//회원가입 반복문 끝
			//관리자페이지
			}else if(login_ == 3) {
				boolean mgr_login = true;
				while(mgr_login) {
					System.out.println("관리자번호를 입력하세요.");
					int mgrNum = scn.nextInt();
					if(mgrNum == manager_num) {
						boolean mgr_menu = true;
						//관리자페이지
						while(mgr_menu) {
							screen.mgr_screen();
							int mgr_menu_choice = scn.nextInt();
							if(mgr_menu_choice == 1) {
								//음식 등록
								System.out.println("새로 등록할 음식의 이름을 입력하세요");
								scn.nextLine();
								String foodName = scn.nextLine();
								System.out.println(foodName + "레시피는 몇 인분 기준인가요?");
								double new_recipe_serving = scn.nextDouble();
								System.out.println("등록을 위해 번호를 부여해주세요");
								int foodNum = scn.nextInt();
								
								Food food = new Food(foodName,new_recipe_serving,foodNum);
								fl.foodList.add(food);
								
								//재료-양 등록
								boolean ingAmo = true;
								while(ingAmo) {
									System.out.println(foodName+"의 재료와 양을 입력해주세요.\n 입력을 그만하려면 9999를 입력해주세요");
									System.out.print("재료 이름 : ");
									scn.nextLine();
									String ingName = scn.nextLine();
									if(ingName.equals("9999")) {
										ingAmo = false;
									}else {
										System.out.print("재료의 양 : ");
										int ingAmou = scn.nextInt();
										food.ingAmou(ingName, ingAmou);
									}
								}
								
							} else if(mgr_menu_choice == 2) {
								mgr_login = false;
								mgr_menu = false;
							}else {
								System.out.println("입력한 메뉴번호가 올바르지 않습니다.");
							}
						}//관리자페이지 반복문 끝
					} else {
						System.out.println("관리자번호가 일치하지 않습니다.");
					}	
				}
			//프로그램 종료	
			} else if(login_ == 5) {
				System.out.println("프로그램이 종료됩니다");
				login = false;
			}
		} //로그인메뉴 while문
		
		
		
		
		
		
		
		
		
	}
}
