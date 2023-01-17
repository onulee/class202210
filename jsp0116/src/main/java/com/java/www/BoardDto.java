package com.java.www;

import java.sql.Timestamp;
import java.util.Date;

public class BoardDto {
	public BoardDto() {}
	public BoardDto(int bno, String bname, String btitle, String bcontent, Timestamp bdate, int bstep, 
			int bhit, int bgroup, int bindent,String bfile) {
		this.bno = bno;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bstep = bstep;
		this.bhit = bhit;
		this.bgroup = bgroup;
		this.bindent = bindent;
		this.bfile = bfile;
	}

	private String bname,btitle,bcontent,bfile;
	private int bno,bstep,bhit,bgroup,bindent;
	private Timestamp bdate;
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getBstep() {
		return bstep;
	}
	public void setBstep(int bstep) {
		this.bstep = bstep;
	}
	public int getBhit() {
		return bhit;
	}
	public void setBhit(int bhit) {
		this.bhit = bhit;
	}
	public int getBgroup() {
		return bgroup;
	}
	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}
	public int getBindent() {
		return bindent;
	}
	public void setBindent(int bindent) {
		this.bindent = bindent;
	}
	public Timestamp getBdate() {
		return bdate;
	}
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	public String getBfile() {
		return bfile;
	}
	public void setBfile(String bfile) {
		this.bfile = bfile;
	}
	

}
