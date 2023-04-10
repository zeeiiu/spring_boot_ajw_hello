package edu.global.ex.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.global.ex.vo.GradeVO;


@RequestMapping("/grade")
@Controller
public class GradeController {

   @GetMapping("/")
   public String kem_form() {
      return "kem_form"; 
   }   
   

   @PostMapping("/total")
   public String kem_form(HttpServletRequest request , Model model) {

	   int kor = Integer.valueOf(request.getParameter("kor"));
       int eng = Integer.valueOf(request.getParameter("eng"));
       int math = Integer.valueOf(request.getParameter("math"));
//       int total = kor + eng + math;
//       double avg = total / 3.0;
       
       GradeVO grade = new GradeVO(kor,eng,math);
      
       
        model.addAttribute("grade", grade);
        
        
        return "grade";
   }    
  
   @PostMapping("/total2")
   public String kem_form2(GradeVO gradeVO ) {

//	   int kor = Integer.valueOf(request.getParameter("kor"));
//       int eng = Integer.valueOf(request.getParameter("eng"));
//       int math = Integer.valueOf(request.getParameter("math"));
        
	   
//       GradeVO grade = new GradeVO(kor,eng,math);
      
       
//        model.addAttribute(GradeVO, gradeVO);
        
        
        return "grade";
   }
   
}