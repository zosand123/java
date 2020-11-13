package test;

import java.util.Date;

public class BoardDTO {
	private int no;
	private String writer;
	private String title;
	private String content;
	private Date writeDate;
	private int hit;
	
	public BoardDTO() {}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "BoardDTO [no=" + no + ", writer=" + writer + ", title=" + title + ", content=" + content
				+ ", writeDate=" + writeDate + ", hit=" + hit + "]";
	}
	
	
}
