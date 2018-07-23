package cn.kkl.mall.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kkl.mall.content.service.ContentService;
import cn.kkl.mall.pojo.TbContent;

@Controller
public class IndexController {
	
	@Value("${BIG_AD_POSITION_CAROUSEL_CID}")
	private Long bigAdPositionCid;
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/index")
	public String showIndexPage(Model model) {
		List<TbContent> ad1List = contentService.getContentListByCid(bigAdPositionCid);
		model.addAttribute("ad1List", ad1List);
		return "index";
	}

}
