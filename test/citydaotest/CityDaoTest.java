package citydaotest;

import java.util.ArrayList;
import java.util.List;

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
	 
	 @Test
	 public void testselectAllCityBySort() {
		 City city = new City();
		 city.setCname("西");
		 cityDao.selectAllCityBySort(city);
	 }
	 
	 @Test
	 public void selectAllCityByMoreSort() {
		 cityDao.selectAllCityByMoreSort("西",4);
	 }
	 
	 @Test
	 public void selectAllCityByMoresSort() {
		 City city = new City();
		 city.setPid(4);
		 cityDao.selectAllCityByMoresSort("西",city);
	 }
	 
	 @Test
	 public void selectAllCityByIf() {
		 City city = new City();
		 city.setCname("西");;
		 cityDao.selectAllCityByIf(city);
	 }
	 
	 @Test
	 public void selectAllCityByWhere() {
		 City city = new City();
		 city.setCname("西");
		 city.setPid(5);
		 cityDao.selectAllCityByIf(city);
	 }
	 
	 @Test
	 public void selectAllCityByArray() {
		int[] city = new int[] {2,4,5};
		cityDao.selectAllCityByArray(city);
	 }
	 
	 @Test
	 public void selectAllCityByList() {
		List<Integer> city = new ArrayList<Integer>();
		city.add(1);
		city.add(2);
		city.add(8);
		cityDao.selectAllCityByList(city);
	 }
	 
	 @Test
	 public void selectAllCityByLists() {
		 List<City> citys = new ArrayList<>();
		 City city1 = new City();
		 city1.setPid(1);
		 City city2 = new City();
		 city2.setPid(3);
		 City city3 = new City();
		 city3.setPid(8);
		 citys.add(city1);
		 citys.add(city2);
		 citys.add(city3);
		 cityDao.selectAllCityByLists(citys);
	 }

}
