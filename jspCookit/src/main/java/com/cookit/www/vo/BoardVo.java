package com.cookit.www.vo;

import java.sql.Timestamp;

public class BoardVo {

	public BoardVo() {}
	public BoardVo(int bno) {
		this.bno = bno;
	}
	public BoardVo(int bno, String id) {
		this.bno = bno;
		this.id = id;
	}
	public BoardVo(String id, String btitle, String bcontent, String bfile, int topchk) {
		this.id = id;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bfile = bfile;
		this.topchk = topchk;
	}
	public BoardVo(int bno, String btitle, String bcontent, String bfile, int topchk) {
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bfile = bfile;
		this.topchk = topchk;
	}
	public BoardVo(int bno, String id, String btitle, String bcontent, Timestamp bdate, int bstep, int bhit, int bgroup,
			int bindent, String bfile, int topchk) {
		this.bno = bno;
		this.id = id;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bstep = bstep;
		this.bhit = bhit;
		this.bgroup = bgroup;
		this.bindent = bindent;
		this.bfile = bfile;
		this.topchk = topchk;
	}

	private int bno;
	private String id,btitle,bcontent;
	private Timestamp bdate;
	private int bstep,bhit,bgroup,bindent;
	private String bfile;
	private int topchk;
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
	public Timestamp getBdate() {
		return bdate;
	}
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
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
	public String getBfile() {
		return bfile;
	}
	public void setBfile(String bfile) {
		this.bfile = bfile;
	}
	public int getTopchk() {
		return topchk;
	}
	public void setTopchk(int topchk) {
		this.topchk = topchk;
	}
	
	
	
}
