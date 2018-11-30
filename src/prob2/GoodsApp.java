package prob2;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[3];

		/* 입력 */
		for (int i = 0; i < goods.length; i++) {
			String line = scanner.nextLine();
			String[] infos = line.split("\\s");

//			goods[i].setName(infos[0]);
//			goods[i].setPrice(infos[1]);
//			goods[i].setCount(infos[2]);

			goods[1].setName("Q");
//			goods[1].setPrice("100");
//			goods[1].setCount("50");
		}

		/* 출력 */
		for (int i1 = 0; i1 < goods.length; i1++) {
			goods[i1].showInfo(); //
		}

		/* 키보드 닫기 */
		scanner.close();
	}

}
