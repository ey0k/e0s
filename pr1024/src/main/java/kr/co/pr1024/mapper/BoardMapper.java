package kr.co.pr1024.mapper;

import java.util.ArrayList;

import kr.co.pr1024.vo.BoardVO;

public interface BoardMapper {

	public ArrayList<BoardVO> list();
	public void write_ok(BoardVO bvo);
	public void readnum(BoardVO bvo);
	public BoardVO content(BoardVO bvo);
	public void update_ok(BoardVO bvo);
	public void delete(BoardVO bvo);
	
	
}
