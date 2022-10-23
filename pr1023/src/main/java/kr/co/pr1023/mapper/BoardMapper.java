package kr.co.pr1023.mapper;

import java.util.ArrayList;

import kr.co.pr1023.vo.BoardVO;

public interface BoardMapper {
	public ArrayList<BoardVO> list();
	public void write_ok(BoardVO bvo);
	public void readnum(String id);
	public BoardVO content(String id);
	public void update_ok(BoardVO bvo);
	public void delete(String id);
	
}
