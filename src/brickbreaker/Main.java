//기본창 띄우기
package brickbreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();		//객체 생성
		Gamelogic gameLogic = new Gamelogic();
		obj.setBounds(700, 300, 700, 600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로세스까지 함께 종료
		obj.add(gameLogic);
	}
}
