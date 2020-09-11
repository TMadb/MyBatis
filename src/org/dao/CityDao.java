package org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.entity.City;

public interface CityDao {
	
	/**
	 * 基本的增删改查方法(单表)
	 * @param city
	 */
	
	//添加方法
	void insertCity(City city);
	//删除方法
	void deleteCityById(Integer cid);
	//插入后并且获得插入的主键
	void insertGetIdCity(City city);
	//修改方法
	void updateCity(City city);
	
	//查询单个
	City selectOneCityById(Integer id);
	
	//查询全部数据
	List<City> selectAllCity();
	
	//多参数查询数据
	List<City> selectAllCityBySort(@Param("city")City city);
	
	//多参数查询数据
	List<City> selectAllCityByMoreSort(@Param("cname")String cname,@Param("pid")Integer pid);
	
	//多参数查询数据
	List<City> selectAllCityByMoresSort(@Param("cname")String cname,@Param("city")City city);
	
	/**
	 * 动态sql开启，其语法类似jstl
	 * @param cname
	 * @param city
	 * @return
	 */
	//多参数查询数据(if)
	List<City> selectAllCityByIf(City city);
	
	//多参数查询数据(where)
	List<City> selectAllCityByWhere(City city);
	
	//多参数查询数据(array)
	List<City> selectAllCityByArray(int[] array);
	
	//多参数查询数据(list)
	List<City> selectAllCityByList(List<Integer> pids);
	
	//多参数查询数据(list)
	List<City> selectAllCityByLists(List<City> pids);

}
