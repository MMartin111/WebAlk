package com.course.WebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.course.WebApp.Stock;
import com.course.WebApp.DAO.StockRepository;

@Controller
public class StockController {
	
	@Autowired
	StockRepository repo;
	
	
	@RequestMapping("/")
	public String Index() {
		
		return "index.jsp";
	}
	
	@RequestMapping("/back")
	public String Back() {
		
		return "index.jsp";
	}
	
	@RequestMapping("/add")
	public String Add(){
		return "add.jsp";
	}
	
	@RequestMapping("/addItem")
	public String addItem(Stock item){
		
		repo.save(item);
		
		return "add.jsp";
	}

	@RequestMapping(value="/showItems",method=RequestMethod.GET)
		public String getAllItem(Model model){
		model.addAttribute("items",getItems());
		return "Items.jsp";				
	}
	
	
	
	@RequestMapping(value="/selected", method=RequestMethod.GET )
	public ModelAndView getItem(@RequestParam int id){
		
		ModelAndView mv = new ModelAndView("selected.jsp");
		Stock item = repo.findById(id).orElse(new Stock());
		mv.addObject(item);
		
		return mv;
	}
	
	public List<Stock> getItems(){
		List<Stock> items = repo.findAll();
		
		return items;
		
	}

}
