package citydaotest;

import org.apache.ibatis.session.SqlSession;
import org.dao.CityDao;
import org.entity.City;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.utils.SqlSessionUtil;

public class CityDaoTest {
	
	 //创建sqlsession和Dao层对象
	 SqlSession sqlsession;
	 CityDao cityDao;
	 
	 @Before
	 public void setup() {
		 sqlsession = SqlSessionUtil.getSqlSession();
		 cityDao = sqlsession.getMapper(CityDao.class);
	 }
	 
	 @After
	 public void teardown() {
		 if(sqlsession != null ) {
			 sqlsession.close();
		 }
	 }
	
	 @Test
	 public void testinsert() {
		City city = new City(3,"天津",3);
		city = sqlsession.getMapper(City.class);
	 }
	 
	 @Test
	 public void testinsertGetIdCity() {
		 City city = new City(1,"北京",1);
		 cityDao.insertCity(city);
	 }
	 
	 @Test
	 public void testdeleteCityById() {
		 cityDao.deleteCityById(2);
	 }
	 
	 
	 @Test
	 public void testupdateCityById() {
		 City city = new City(78,"泸州",8848);
		 cityDao.updateCity(city);
	 }
	 
	 @Test
	 public void testselectOneCityById() {
		 cityDao.selectOneCityById(80);
	 }
	 
	 @Test
	 public void testselectAllCity() {
		 cityDao.selectAllCity();
	 }

}
