package org.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	
	//创建SqlSession的工厂只需要创建一个，采用单例模式封装
	static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSession getSqlSession() {
		SqlSession sqlSession = null;
		InputStream inputStream = null;
		//如果sqlsession为空，则创建一个sqlsession
		if(sqlSessionFactory == null) {
			try {
				inputStream = Resources.getResourceAsStream("mybatisconfig.xml");
			    sqlSessionFactory=  new SqlSessionFactoryBuilder().build(inputStream);
			    sqlSession = sqlSessionFactory.openSession();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return sqlSession;
	}
}
