package meRecipe.template;

public class Screen {

	public void login_screen() {
		System.out.println("╭◜◝ ͡ ◜◝        ╭◜◝ ͡ ◜◝\r\n"
				+ " ( •‿•。   ) ☆   ( •‿•。   ) ☆\r\n"
				+ " ╰◟◞ ͜ ◟◞╭◜◝ ͡ ◜◝╮ ͜ ◟◞╯\r\n"
				+ "               ( •‿•。     ) ☆\r\n"
				+ "     　      ╰◟◞ ͜ ◟◞╯\r\n"
				+ ""
				+ "          美Recipe                "
				+"\n\n"
				+"  1.로그인 | 2.회원가입 | 3.관리자 "
				+"\n\n--- 종료를 원하면 5번을 눌러주세요 ---");
	}
	
	public void main_screen() {
		System.out.println("╭◜◝ ͡ ◜◝        ╭◜◝ ͡ ◜◝\r\n"
				+ " ( •‿•。   ) ☆   ( •‿•。   ) ☆\r\n"
				+ " ╰◟◞ ͜ ◟◞╭◜◝ ͡ ◜◝╮ ͜ ◟◞╯\r\n"
				+ "               ( •‿•。     ) ☆\r\n"
				+ "     　      ╰◟◞ ͜ ◟◞╯\r\n"
				+ ""
				+ "          美Recipe                "
				+"\n\n"
				+"  1.레시피 검색 | 2.검색기록 | 3.뒤로 ");
	}
	
	public void recipe_menu(String foodName) {
		System.out.println(
				"-------------------------------------\r\n"
				+ "          美Recipe                \r\n"
				+"\n\n"
				+"      "+foodName+"무엇을 조회할까요?\r\n"
				+"    1.재료 조회 | 2.몇 인분? | 3.뒤로\n"
				+"-------------------------------------\r\n");
	}
	
	public void mgr_screen() {
		System.out.println("╭◜◝ ͡ ◜◝        ╭◜◝ ͡ ◜◝\r\n"
				+ " ( •‿•。   ) ☆   ( •‿•。   ) ☆\r\n"
				+ " ╰◟◞ ͜ ◟◞╭◜◝ ͡ ◜◝╮ ͜ ◟◞╯\r\n"
				+ "               ( •‿•。     ) ☆\r\n"
				+ "     　      ╰◟◞ ͜ ◟◞╯\r\n"
				+ ""
				+ "       美Recipe 관리자 페이지            "
				+"\n\n"
				+"       1.레시피 등록 | 2.뒤로 ");
	}
	
}
