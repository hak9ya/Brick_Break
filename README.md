# 자바 Swing 게임
----------------------------

## 프로젝트 계획이유
> 여러가지를 구상중 게임부분에 있어서 한번 시도해봤습니다.

## 프로젝트 정보(개발환경)
> 1. Eclipse2020-09 사용
> 2. JAVA swing, awt

## 프로젝트 주요 기능
![화면 캡처 2021-02-24 111638](https://user-images.githubusercontent.com/63631952/108937944-8abee080-7692-11eb-9d2c-40c8102ee43f.png)

- 전반적인 게임로직

 ``` JAVA
	public void actionPerformed(ActionEvent e) {
		timer.start();
		
		if(play) {
			if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))){
				ballYdir = -ballYdir;
			}
			A: for(int i = 0; i<map.map.length; i++) {
				for(int j = 0; j < map.map[0].length; j++) {
					if(map.map[i][j] > 0) {
						int brickX = j * map.brickWidth + 80;
						int brickY = i * map.brickHeight + 50;
						int brickWidth = map.brickWidth;
						int brickHeight = map.brickHeight;
						Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
						Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
						Rectangle brickRect = rect;
						
						if (ballRect.intersects(brickRect)) {
							map.setBrickValue(0, i, j);
							totalBricks--;
							score += 5;
							
							if (ballposX + 19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width) {
								ballXdir = -ballXdir;
							}else {
								ballYdir = -ballYdir;
							}
							
							break A;
						}
					}
				}
			}
```

