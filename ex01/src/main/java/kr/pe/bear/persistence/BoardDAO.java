package kr.pe.bear.persistence;

import java.util.List;
import java.util.Map;

import kr.pe.bear.domain.BoardVO;
import kr.pe.bear.domain.Criteria;

public interface BoardDAO {
	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void update(Map map) throws Exception;
	
	public void delete(Map map) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public List<BoardVO> listPage(int page) throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	public int countPaging(Criteria cri) throws Exception;
}
