package com.java.www;

import java.sql.Timestamp;

public class FreeboardDto {
	
	public FreeboardDto(){}
	public FreeboardDto(String id, String btitle, String bcontent,String bfile) {
		this.id = id;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bfile = bfile;
	}
	public FreeboardDto(int bno, String id, String btitle, String bcontent, Timestamp bdate, int bstep, int bhit,
			int bgroup, int bindent, String bfile) {
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
	}
	public FreeboardDto(int bno, String id, String btitle, String bcontent, Timestamp bdate, int bstep, int bhit,
			int bgroup, int bindent, String bfile,String name) {
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
		this.name = name;
	}

	private int bno;
	private String id,btitle,bcontent;
	private Timestamp bdate;
	private int bstep,bhit,bgroup,bindent;
	private String bfile;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	

}
