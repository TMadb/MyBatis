package org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.entity.City;
import org.entity.Score;
import org.entity.Stu;

public interface ScoreDao {
	
	Score selectScoreBySid(Integer scid);
	
	List<Score> selectAllScore();

}
