package jdbc;

import java.util.Date;

//DTO(Data Transfer Object) : Data를 Object로 변환하는 객체
//일반적으로 로직을 갖고 있지 않은  순수한 데이터 객체
//필드, 그 필드에 접근하기위한 getter & setter메소드만 가진 클래스

public class MemberDTO {
	//field - [접근제어자] [속성] 데이터타입 변수명[=초기값]
	private int    mNo;	//회원번호
	private String mName;	//이름
	private String mHp; //전화번호 
	private String mId;	//id
	private String mPw;	//비번
	private Date   mJoindate;	//회원가입일
	
	//constructor -[접근제어자] 클래스명(매개변수리스트){}
	public MemberDTO() {}
	public MemberDTO(String mName,String mId,String mPwd) {
		this.mName	= mName;
		this.mId	= mId;
		this.mPw	= mPwd;
	}
	public MemberDTO(int mNo,String mName, String mHp, String mId,String mPwd,Date mJoindate) {
		this.mNo 	= mNo;
		this.mName	= mName;
		this.mHp = mHp;
		this.mId	= mId;
		this.mPw	= mPwd;
		this.mJoindate 	= mJoindate;
	}

	//method - [접근제어자] [속성]  리턴유형 함수명(매개변수리스트){}
	//getter & setter
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmHp() {
		return mHp;
	}
	public void setmHp(String mHp) {
		this.mHp = mHp;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPw() {
		return mPw;
	}
	public void setmPwd(String mPw) {
		this.mPw = mPw;
	}
	public Date getDate() {
		return mJoindate;
	}
	public void setDate(Date date) {
		mJoindate = date;
	}
	@Override
	public String toString() {
		return "MemberDTO [mNo=" + mNo + ", mName=" + mName + ", mHp=" + mHp + ", mId=" + mId + ", mPw=" + mPw
				+ ", mJoindate=" + mJoindate + "]";
	}
}











