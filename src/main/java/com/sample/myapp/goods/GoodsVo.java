package com.sample.myapp.goods;

import java.sql.Date;
import java.util.Arrays;


public class GoodsVo {
	private int goodsId;
	private int goodsType;
	private String goodsName;
	private int goodsPrice;
	private String goodsColor;
	private String goodsSize;
	private String goodsOption1;
	private String goodsOption2;
	private String goodsOption3;
	private String[] goodsImage;
	private String dbGoodsImage;
	private Date goodsDate;
	private String goodsHTML;
	
	
	@Override
	public String toString() {
		return "GoodsVo [goodsId=" + goodsId + ", goodsType=" + goodsType + ", goodsName=" + goodsName + ", goodsPrice="
				+ goodsPrice + ", goodsColor=" + goodsColor + ", goodsSize=" + goodsSize + ", goodsOption1="
				+ goodsOption1 + ", goodsOption2=" + goodsOption2 + ", goodsOption3=" + goodsOption3 + ", goodsImage="
				+ Arrays.toString(goodsImage) + ", dbGoodsImage=" + dbGoodsImage + ", goodsDate=" + goodsDate
				+ ", goodsHTML=" + goodsHTML + "]";
	}
	public String getGoodsHTML() {
		return goodsHTML;
	}
	public void setGoodsHTML(String goodsHTML) {
		this.goodsHTML = goodsHTML;
	}
	public String getGoodsColor() {
		return goodsColor;
	}
	public void setGoodsColor(String goodsColor) {
		this.goodsColor = goodsColor;
	}
	public String getGoodsSize() {
		return goodsSize;
	}
	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	public String getGoodsOption1() {
		return goodsOption1;
	}
	public void setGoodsOption1(String goodsOption1) {
		this.goodsOption1 = goodsOption1;
	}
	public String getGoodsOption2() {
		return goodsOption2;
	}
	public void setGoodsOption2(String goodsOption2) {
		this.goodsOption2 = goodsOption2;
	}
	public String getGoodsOption3() {
		return goodsOption3;
	}
	public void setGoodsOption3(String goodsOption3) {
		this.goodsOption3 = goodsOption3;
	}
	
	public String[] getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(String[] goodsImage) {
		this.dbGoodsImage = Arrays.toString(goodsImage);
		this.goodsImage = goodsImage;
	}
	public Date getGoodsDate() {
		return goodsDate;
	}
	public void setGoodsDate(Date goodsDate) {
		this.goodsDate = goodsDate;
	}
	
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(int goodsType) {
		this.goodsType = goodsType;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
}
