package org.dao;

import java.util.List;

import org.entity.City;

public interface CityDao {
	
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

}
