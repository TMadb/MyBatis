package scoredaotest;

import org.apache.ibatis.session.SqlSession;
import org.dao.ScoreDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.utils.SqlSessionUtil;

public class ScoreDaoTest {
	
	
	//创建sqlsession和Dao层对象
		 SqlSession sqlsession;
		 ScoreDao scoreDao;
		 
		 @Before
		 public void setup() {
			 sqlsession = SqlSessionUtil.getSqlSession();
			 scoreDao = sqlsession.getMapper(ScoreDao.class);
		 }
		 
		 @After
		 public void teardown() {
			 if(sqlsession != null ) {
				 sqlsession.close();
			 }
		 }
		
		 @Test
		 public void testselectScoreBySid() {
			System.out.println(scoreDao.selectScoreBySid(1));
		 }
		 
		 @Test
		 public void testselectAllScore() {
			 System.out.println(scoreDao.selectAllScore());
		 }
		 
}
