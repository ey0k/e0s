package kr.co.pr1023.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kr.co.pr1023.mapper.BoardMapper;
import kr.co.pr1023.vo.BoardVO;

@Service
@Qualifier("bs")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardMapper mapper;

	@Override
	public String list(Model model) {
		ArrayList<BoardVO> list=mapper.list();
		model.addAttribute("list",list);
		return "/list";
	}

	@Override
	public String write_ok(BoardVO bvo, Model model) {
		mapper.write_ok(bvo);
		return "redirect:/list";
	}

	@Override
	public String readnum(HttpServletRequest request) {
		String id=request.getParameter("id");
		mapper.readnum(id);
		return "redirect:/content?id="+id;
	}

	@Override
	public String content(HttpServletRequest request, Model model) {
		String id=request.getParameter("id");
		BoardVO bvo=mapper.content(id);
		model.addAttribute("bvo", bvo);
		return "/content";
	}

	@Override
	public String update(HttpServletRequest request, Model model) {
		String id=request.getParameter("id");
		BoardVO bvo=mapper.content(id);
		model.addAttribute("bvo", bvo);
		return "/update";
	}

	@Override
	public String update_ok(BoardVO bvo) {
		mapper.update_ok(bvo);
		
		return "redirect:content?id="+bvo.getId();
	}

	@Override
	public String delete(HttpServletRequest request) {
		String id=request.getParameter("id");
		mapper.delete(id);
		return "redirect:/list";
	}

	
}
