package com.spring.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.example.beans.InsertBean;
import com.spring.example.studentrepository.StudentRepository;

@Controller
public class MainController {

	@Autowired
	private StudentRepository repository;

	@GetMapping("/Student")
	public String showIndexPage() {
		return "index";
	}

	@GetMapping("/Student/View")
	public String showViewPage(Model model) {
		List<InsertBean> studentList = new ArrayList<InsertBean>();
		studentList = repository.findAll();
		System.out.println(studentList.toString());
		model.addAttribute("studentList", studentList);
		return "view";
	}

	@GetMapping("/Student/Insert")
	public String showInsertPage() {
		return "insert";
	}

	@PostMapping("/Student/InsertData")
	public String insertData(InsertBean bean) {
		System.out.println(bean.getName());
		System.out.println(bean.getAddress());
		repository.save(bean);
		return "insert";
	}

	@GetMapping("/Student/Update/{sId}")
	public String showUpdatePage(@PathVariable("sId") int sId, Model model) {
		InsertBean bean = repository.findBysId(sId);
		model.addAttribute("student", bean);
		return "update";
	}

	@PostMapping("/Student/UpdateData")
	public String updateData(InsertBean bean,Model model) {
		repository.save(bean);
		showViewPage(model);
		return "view";
	}
	
	@GetMapping("/Student/Update/{sId}")
	public String deleteData(@PathVariable("sId") int sId, Model model) {
		repository.deleteById(sId);
		showViewPage(model);
		return "view";
	}
}
