import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int price = 0;
		for(String str : s.split("；")){
			str.trim();
			int a = str.indexOf("：");
			String ss = str.substring(a+1, str.length());
			ss = ss.trim();
			int pri = Integer.parseInt(ss);
			System.out.println(str);
			price = price + pri;
		}
		System.out.println("总价格为" + price);
	}
}
