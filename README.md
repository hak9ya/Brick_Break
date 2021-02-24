# 자바 Swing 게임
----------------------------

## 프로젝트 계획이유
> 여러가지를 구상중 게임부분에 있어서 한번 시도해봤습니다.

## 프로젝트 정보(개발환경)
> 1. Eclipse2020-09 사용
> 2. JAVA swing, awt

## 프로젝트 주요 기능
![화면 캡처 2021-02-24 111638](https://user-images.githubusercontent.com/63631952/108937944-8abee080-7692-11eb-9d2c-40c8102ee43f.png)



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
![1](https://user-images.githubusercontent.com/63631952/94245412-2b2e9e80-ff55-11ea-8339-d01ca0fd906c.png)

``` JAVA
package user;

//외부 라이브러리 추가
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	
	//데이터베이스에 접근하겠다는 하나의 객체
	private Connection conn;
	
	//SQL 구문을 실행하는 하나의 객체
	private PreparedStatement pstmt;
	
	//어떠한 정보를 담을수 있는 하나의 객체
	private ResultSet rs;
	
	//생성자 생성, 자동으로 db connection이 이루어 질 수 있도록 함
	public UserDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/BOARDTEST";
			String dbID = "";
			String dbPassword = "";
			
			//Driver는 mysql에 접속할 수 있게 해주는 하나의 라이브러리
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
```
- 자바빈을 이용해서 로그인, 회원가입을 구현했습니다.
- 게시판
  - 게시글 작성 후 게시판리스트에 출력했습니다.
  - 로그인한 아이디가 일치할 경우 게시글을 수정하고 삭제가 가능합니다.
