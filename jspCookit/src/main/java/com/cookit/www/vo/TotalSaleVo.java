package com.cookit.www.vo;

public class TotalSaleVo {

	public TotalSaleVo() {};
	public TotalSaleVo(int sno, int syear, int smonth, int ssale) {
		super();
		this.sno = sno;
		this.syear = syear;
		this.smonth = smonth;
		this.ssale = ssale;
	}

	private int sno,syear,smonth,ssale;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getSyear() {
		return syear;
	}

	public void setSyear(int syear) {
		this.syear = syear;
	}

	public int getSmonth() {
		return smonth;
	}

	public void setSmonth(int smonth) {
		this.smonth = smonth;
	}

	public int getSsale() {
		return ssale;
	}

	public void setSsale(int ssale) {
		this.ssale = ssale;
	}
	
	
	
}
