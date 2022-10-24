package kr.co.pr1024.service;

import org.springframework.ui.Model;

import kr.co.pr1024.vo.BoardVO;

public interface BoardService {

	public String list(Model model);
	public String write_ok(BoardVO bvo);
	public String readnum(BoardVO bvo);
	public String content(Model model, BoardVO bvo);
	public String update(Model model, BoardVO bvo);
	public String update_ok(BoardVO bvo);
	public String delete(BoardVO bvo);

}
