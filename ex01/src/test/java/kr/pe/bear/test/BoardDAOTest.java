package kr.pe.bear.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.pe.bear.domain.BoardVO;
import kr.pe.bear.domain.Criteria;
import kr.pe.bear.persistence.BoardDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"classpath:spring/root-context.xml"}
		)
public class BoardDAOTest {

	@Autowired
	private BoardDAO dao;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Test @Ignore
	public void testCreate() throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글을 넣습니다");
		board.setContent("새로운 글을 넣습니다");
		board.setWriter("user00");
		dao.create(board);
		
	}
	
	@Test @Ignore
	public void testRead() throws Exception {
		logger.info(dao.read(2).toString());
	}
	
	@Test @Ignore
	public void testUpdate() throws Exception{
		BoardVO board = new BoardVO();
		board.setBno(1);
		board.setTitle("수정된 글입니다.");
		board.setContent("수정된 테스트 입니다.");
		//dao.update(board);
	}
	
	@Test @Ignore
	public void testDelte () throws Exception{
		//dao.delete(1);
		
	}
	@Test @Ignore
	public void testListPage() throws Exception{
		int page = 1;
		List<BoardVO> list = dao.listPage(page);
		
		for(BoardVO boardVO : list ) {
			logger.info(boardVO.getBno()+"123");
			
		}
	}
	@Test
	public void testListCriteria() throws Exception{
		Criteria cri = new Criteria();
		cri.setPage(1);
		cri.setPerPageNum(10);
		List<BoardVO> list = dao.listCriteria(cri);
		
		for(BoardVO boardVO : list ) {
			logger.info(boardVO.getBno()+"123");
			
		}
	}

}
