package 课程作业1;

import java.util.*;

public class classwork1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("请输入数字1-6");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			System.out.print("请输入数字1-6");
			System.out.println("\n");
			switch (number) {
			case 1:
				unicode();
				break;
			case 2:
				scoregrade();
				break;
			case 3:
				MAXANMIN();
				break;
			case 4:
				break;
			case 5:
				YangHui();
				break;
			case 6:spiltString();
				break;
			}

		}

	}

	/*
	 * 1.编写程序，获得汉字’物’、’联’、’网’在 unicode 码中对应的十进制编码。
	 */
	public static void unicode() {
		System.out.println("请输入一个汉字");
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();

		int a = number.charAt(0);
		;
		System.out.println(number + "\t" + a);
		System.out.println("\n");
	}

	/*
	 * 2.编写程序，输入某一个成绩（满分，100 分）计算其相应等级信息。 等级信息如下： A+:97 B+:87 C+:77 D+:67 F:60 分以下
	 * 缓考：-1 A:93 B:83 C:73 D:63 A-:90 B-:80 C-:70 D-:60
	 * 
	 */
	private static void scoregrade() {
		System.out.println("清输入成绩：");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if (100 >= score && score >= 97) {
			System.out.println("A+");
		} else if (97 > score && score >= 93) {
			System.out.println("A");
		} else if (93 > score && score >= 90) {
			System.out.println("A-");
		} else if (90 > score && score >= 87) {
			System.out.println("B+");
		} else if (87 > score && score >= 83) {
			System.out.println("B");
		} else if (83 > score && score >= 80) {
			System.out.println("B-");
		} else if (80 > score && score >= 77) {
			System.out.println("C+");
		} else if (77 > score && score >= 73) {
			System.out.println("C");
		} else if (73 > score && score >= 70) {
			System.out.println("C-");
		}

		else if (70 > score && score >= 67) {
			System.out.println("D+");
		} else if (67 > score && score >= 63) {
			System.out.println("D");
		} else if (63 > score && score >= 60) {
			System.out.println("D-");
		} else if (60 > score && score >= 0) {
			System.out.println("F");
		} else if (score == -1) {
			System.out.println("缓考");

		} else {
			System.out.println("输入成绩出错，清检查后重新输入");
		}
	}

	/*
	 * 3.编写程序。输入两个正整数 m 和 n，求其最大公约数和最小公倍数。
	 */
	private static void MAXANMIN() {
		System.out.println("请输入第一个整数：");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println("请输入第二个整数：");
		Scanner scanner2 = new Scanner(System.in);
		int n = scanner2.nextInt();
		int r = 0, max, min, pub = 0;
		max = (n > m) ? n : m;
		min = (n < m) ? n : m;
		boolean jutice = true;
		/*
		 * for(;(r=max%min)==0;) { max=min; min=r; }
		 */
		if (max % min == 0) {
			pub = min;
		} else { // 辗转相除法
			while (jutice) {
				r = max % min;
				pub = r;
				max = min;
				min = r;
				if ((max % min) == 0) {
					jutice = false;
				}
			}
		}
		System.out.println("最大公约数为：" + pub);
		System.out.println("最小公倍数为：" + m * n / pub);
	}
	/*
	 * 4.编写程序。输入某年某月某日，判断这一天是这一年的第几天？
	 * 
	 */

	/*
	 * 5.编写程序。打印杨辉三角形（要求打印出 10 行）。具体如下图： 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1 1 5 10 10 5 1
	 */
	private static void YangHui() {
		int[][] list = new int[10][10];
		int i = 0;
		int j = 0;
		list[0][0] = 1;
		list[1][0] = 1;
		list[1][1] = 1;
		for (i = 1; i < 10; i++) {
			for (j = 1; j < i + 1; j++) {
				list[i][0] = 1;
				list[i][i] = 1;
				list[i][j] = list[i - 1][j - 1] + list[i - 1][j];
			}
		}
		for (i = 0; i < 10; i++) {
			System.out.println("\n");
			for (j = 0; j < i + 1; j++)
				System.out.print(list[i][j] + "\t");

		}
	}
	/*
	 * 编写程序。输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。 
	 */
	private static void spiltString() {
		System.out.println("plese input String:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int englishNumber=0;
		int spaceNumber=0;
		int number=0;
		int otherNumber=0;
		for(int i=0;i<st.length();i++) {
			if("0".hashCode()<=st.charAt(i)&&st.charAt(i)<="9".hashCode()) {
				number++;
			}
			else if(st.charAt(i)==" ".hashCode()) {
				spaceNumber++;
			}
			else if("A".hashCode()<=st.charAt(i)&&st.charAt(i)<="z".hashCode()) {
				englishNumber++;
			}
			else {
				otherNumber++;
			}
		}
		System.out.println("英文字符个数为"+englishNumber+"\t"+"空格字符个数为"+spaceNumber+"\t"+"数字个数为"+number+"\t"+"其他为"+otherNumber);
		
		
	}

}