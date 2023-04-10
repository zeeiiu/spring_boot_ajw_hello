package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


// 1. url과 페이지 매핑방법
// 2. 뷰(jsp)에 데이터 전달

@RequestMapping("/board")
@Controller
public class BoardController {

	@GetMapping("/")
	public String main() {
		return "board/main";
	}

	@GetMapping("/content_view")
	public String content_view(Model model) {
		
		
		model.addAttribute("id", 30);
		model.addAttribute("pw", "1234"); // Attribute할 때 따옴표 쓰든 안쓰든 상관 없음.
		
		return "board/content";
	}

	@GetMapping("/reply")
	public ModelAndView mode_view() {
		
		ModelAndView mv = new ModelAndView();
         mv.addObject("id", 50);
         mv.addObject("pw", "1234");
         mv.setViewName("board/reply");
		
		return mv;
	}

}
