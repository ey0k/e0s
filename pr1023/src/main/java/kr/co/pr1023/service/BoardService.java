package kr.co.pr1023.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import kr.co.pr1023.vo.BoardVO;

public interface BoardService {

	public String list(Model model);
	public String write_ok(BoardVO bvo, Model model);
	public String readnum(HttpServletRequest request);
	public String content(HttpServletRequest request, Model model);
	public String update(HttpServletRequest request, Model model);
	public String update_ok(BoardVO bvo);
	public String delete(HttpServletRequest request);

}
