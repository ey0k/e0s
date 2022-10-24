package kr.co.pr1024.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.pr1024.service.BoardService;
import kr.co.pr1024.vo.BoardVO;

@Controller
public class BoardController {
	@Qualifier("bs")
	@Autowired
	private BoardService service;
	
	@RequestMapping("/list")
	public String list(Model model)
	{
		return service.list(model);
	}
	
	@RequestMapping("/write")
	public String write()
	{
		return "/write";
	}
	
	@RequestMapping("/write_ok")
	public String write_ok(BoardVO bvo)
	{
		return service.write_ok(bvo);
	}
	
	@RequestMapping("/readnum")
	public String readnum(BoardVO bvo)
	{
		return service.readnum(bvo);
	}
	
	@RequestMapping("/content")
	public String content(Model model, BoardVO bvo)
	{
		return service.content(model, bvo); 
	}
	
	@RequestMapping("/update")
	public String update(Model model, BoardVO bvo)
	{
		return service.update(model,bvo);
	}
	
	@RequestMapping("/update_ok")
	public String update_ok(BoardVO bvo)
	{
		return service.update_ok(bvo);
	}
	
	@RequestMapping("/delete")
	public String delete(BoardVO bvo)
	{
		return service.delete(bvo);
	}
	
	
	
	
}





















