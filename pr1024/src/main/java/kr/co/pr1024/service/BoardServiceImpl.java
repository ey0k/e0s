package kr.co.pr1024.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kr.co.pr1024.mapper.BoardMapper;
import kr.co.pr1024.vo.BoardVO;

@Service
@Qualifier("bs")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardMapper mapper;

	@Override
	public String list(Model model) {
		ArrayList<BoardVO> list=mapper.list();
		model.addAttribute("list", list);
		return "/list";
	}

	@Override
	public String write_ok(BoardVO bvo) {
		mapper.write_ok(bvo);
		return "redirect:/list";
	}

	@Override
	public String readnum(BoardVO bvo) {
		mapper.readnum(bvo);
		return "redirect:/content?id="+bvo.getId();
	}

	@Override
	public String content(Model model, BoardVO bvo) {
		bvo=mapper.content(bvo);
		model.addAttribute("bvo", bvo);
		return "/content";
	}

	@Override
	public String update(Model model, BoardVO bvo) {
		bvo=mapper.content(bvo);
		model.addAttribute("bvo", bvo);
		return "/update";
	}

	@Override
	public String update_ok(BoardVO bvo) {
		mapper.update_ok(bvo);
		return "redirect:/content?id="+bvo.getId();
	}

	@Override
	public String delete(BoardVO bvo) {
		mapper.delete(bvo);
		return "redirect:/list";
	}
}
