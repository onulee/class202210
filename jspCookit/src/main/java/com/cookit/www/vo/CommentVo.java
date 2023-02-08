package com.cookit.www.vo;

import java.sql.Timestamp;

public class CommentVo {

	public CommentVo() {}
	
	public CommentVo(int cno) {
		this.cno = cno;
	}
	public CommentVo(int cno, String ccontent) {
		this.cno = cno;
		this.ccontent = ccontent;
	}
	public CommentVo(int bno, String id, String cpw, String ccontent) {
		this.bno = bno;
		this.id = id;
		this.cpw = cpw;
		this.ccontent = ccontent;
	}

	public CommentVo(int cno, int bno, String id, String cpw, String ccontent, Timestamp cdate) {
		this.cno = cno;
		this.bno = bno;
		this.id = id;
		this.cpw = cpw;
		this.ccontent = ccontent;
		this.cdate = cdate;
	}

	private int cno,bno;
	private String id,cpw,ccontent;
	private Timestamp cdate;
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCpw() {
		return cpw;
	}
	public void setCpw(String cpw) {
		this.cpw = cpw;
	}
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
	public Timestamp getCdate() {
		return cdate;
	}
	public void setCdate(Timestamp cdate) {
		this.cdate = cdate;
	}
	
	
	
}
