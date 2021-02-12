package com.springcarrito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springcarrito.dao.LangInterface;
import com.springcarrito.entity.Lang;

@Controller
public class LangController {

	@Autowired
	private LangInterface langInterface;
	
	@GetMapping("/lang")
	public String lang(@ModelAttribute("lang") Lang lang, BindingResult result ,Model model) {
		List<Lang> list = langInterface.findByAll();
		model.addAttribute("langs", list);
		model.addAttribute("name", "Kiwisaki");
		return "admin/lang";
	}
	
	@PostMapping("/lang-create")
	public String langCreate(Lang lang) {
		langInterface.save(lang);
		return "redirect:/lang";
	}
	
	@GetMapping("/lang-delete/{id}")
	public String langDelete(@PathVariable("id") Integer id) {
		langInterface.delete(id);
		return "redirect:/lang";
	}
	
}
