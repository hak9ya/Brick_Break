//�⺻â ����
package brickbreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();		//��ü ����
		Gamelogic gameLogic = new Gamelogic();
		obj.setBounds(700, 300, 700, 600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���μ������� �Բ� ����
		obj.add(gameLogic);
	}
}
