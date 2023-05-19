package com.sample.myapp.goods;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/goods")
@Controller
public class GoodsController {
	@Autowired
	private GoodsDAO goodsDAO;

	/* 상품 상세 페이지 이동 */
	@RequestMapping("/detail")
	public String goodsDetail(int goodsId, Model model) {
		GoodsStep1 index = goodsDAO.selectGoodsIndex(goodsId);
		index.setImageUrls(index.getDbImages().replaceAll("\\[", "").replaceAll("\\]", "").trim().split(","));
		index.setGoodsColor(index.getDbGoodsColor().replaceAll("\\[", "").replaceAll("\\]", "").trim().split(","));
		index.setGoodsSize(index.getDbGoodsSize().replaceAll("\\[", "").replaceAll("\\]", "").trim().split(","));
		CheckVo check = goodsDAO.selectCheck(index.getGoodsIndexId());
		List<SizeVo> sizeVos = goodsDAO.selectSizeList(index.getGoodsIndexId());
		SizeImgVo sizeImgVo = goodsDAO.selectSizeImg();
		model.addAttribute("sizeImg",sizeImgVo);
		model.addAttribute("sizes",sizeVos);
		model.addAttribute("check",check);
		model.addAttribute("goods", index);
		return "goods/detail";
	}
	
	@RequestMapping(value = "/haca",method = { RequestMethod.POST })
	public String haca( HttpServletRequest request,@RequestParam(required = false, defaultValue = "hyj1077") String userId, Model model) {
		System.out.println("hyj1077");
		return userId;
	}
}
