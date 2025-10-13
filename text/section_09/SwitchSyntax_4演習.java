package text.section_09;

public class SwitchSyntax_4演習 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		int ageGroup = 30; // 年代
		int fee;           // 料金
		
		fee  = switch (ageGroup) {
		case 10 -> 1000;
		case 20 -> 2000;
		case 30,40 -> 3000;
		case 50 -> 4000;
		default -> 500;
		};
		
		System.out.println(ageGroup + "代の料金は" + fee +"円");
		}

	}
