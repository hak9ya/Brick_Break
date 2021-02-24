# 자바 Swing 게임
----------------------------

## 프로젝트 계획이유
> 여러가지를 구상중 게임부분에 있어서 한번 시도해봤습니다.

## 프로젝트 정보(개발환경)
> 1. Eclipse2020-09 사용
> 2. JAVA swing, awt

## 프로젝트 주요 기능


- 데이터베이스를 이용해 회원정보와 게시글리스트 관리
  - 소스폴더에 패키지를 생성해서 자바빈을 이용하여 관리했습니다.
 ``` JAVA
 package user;

public class User {
	
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
