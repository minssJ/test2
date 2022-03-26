package books3;

import java.util.Scanner;

public class booksMain {

	public static void main(String[] args) {
		member mb = new member();
		account aco = new account();
		goods gd =new goods();
		buyer buy = new buyer();
		review rev = new review();
		booksSql sql = new booksSql();
		
		int amount=0;
		int Gstock=0;
		String Gname= null;
		Scanner sc = new Scanner(System.in);
		boolean run =true;
		boolean run2=true;
		boolean check;
		int menu =0;
		int menu1=0;
		String Ac=null;
		while(run) {
			System.out.println("=====================================");
			System.out.println("    1.접속    2.해제                        ");
			System.out.println("  	3.회원가입  4.로그인	                   ");
			System.out.println("=====================================");
			System.out.println("선택   >>");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				sql.connect();
				break;
			case 2:
				sql.conClose();
			case 3:
				System.out.println("회원가입");

				System.out.println("아이디>>");
				String id = sc.next();

				System.out.println("비밀번호>>");
				String pw = sc.next();

				System.out.println("이름 >>");
				String Mname = sc.next();
				
				System.out.println("생년월일>>");
				String Birth = sc.next();

				System.out.println("이메일 작성>>");
				String Email = sc.next();

				System.out.println("휴대폰번호 >>");
				String Phone = sc.next();
				
				System.out.println("주소작성 >>");
				String Adress = sc.next();
				
				System.out.println("계좌등록 >>");
				 Ac = sc.next();
				
				mb.setId(id);
				mb.setPw(pw);
				mb.setMname(Mname);
				mb.setBirth(Birth);
				mb.setEmail(Email);
				mb.setPhone(Phone);
				mb.setAdress(Adress);
				mb.setAc(Ac);
				aco.setAc(Ac);
				sql.insert(mb);
				//amount=0;
				aco.setId(id);
				aco.setAmount(amount);
				sql.insert3(aco);
				// -------------------------------
				break;
	
				case 4:
					System.out.println("로그인아이디입력>> ");
					id = sc.next();		
					System.out.println("로그인비밀번호입력>> ");
					pw = sc.next();
					// 아이디 존재 유무
					check = sql.checkcheck(id, pw);
					if(check) {
						while(run2) {
							System.out.println("===========================");
							System.out.println("1.구매     2.판매   3.금액충전  	");
							System.out.println("4.후기등록  5.정보수정   6.로그아웃  ");
							System.out.println("===========================");
							System.out.print("선택 >> ");
							menu1 = sc.nextInt();
							switch (menu1) {
							case 1:
								System.out.println("등록된 도서 목록");
								sql.select();
								System.out.println();
									Gname  = sc.next();
									Gstock = sc.nextInt();
								break;
							case 2:
								System.out.println("상품등록");
								
								System.out.println("책이름");
									Gname=sc.next();
								
								System.out.println("가격입력");
								int Gprice=sc.nextInt();
								
								System.out.println("출판일");
								String Gdate=sc.next();
								
								System.out.println("저자이름");
								String Gauthor=sc.next();
								
								System.out.println("장르입력");
								String Ggenre=sc.next();
								
								System.out.println("책가격");
									Gstock=sc.nextInt();
								
								System.out.println("판매자이름");
								String Gseller=sc.next();
								
								
								gd.setGname(Gname);
								gd.setGprice(Gprice);
								gd.setGdate(Gdate);
								gd.setGauthor(Gauthor);
								gd.setGgenre(Ggenre);
								gd.setGstock(Gstock);
								gd.setGseller(Gseller);
								sql.insert2(gd);
								
								break;
								
							case 3:
								System.out.println("충전");
								
								sql.select2(id);
							//	System.out.println(id);//;id값을 check에 담았기 때문에 id값으로 비교를해서 출력을 해야함
							//  System.out.println(Ac);//;값이 안들어있음
							//	System.out.println(result);
								
								System.out.println("충전금액 입력>>");
								amount = sc.nextInt();
								sql.Charging(amount,id);
								
								
								sql.select2(id);
								
								//amount=0;
								
								//int amount=sc.nextInt();
								//aco.setAmount(amount);
								break;
							
								
							}
						}
					}
			}
		}
	}

}
