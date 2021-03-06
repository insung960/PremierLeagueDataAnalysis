package com.epl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.epl.vo.Coach;
import com.epl.vo.Country;

@Mapper
public interface CoachMapper {
	public int insertCoach(Coach coach);

	public List<Country> selectCountry();

	public List<Coach> selectCoachList();
	
	public int updateCoach(Coach coach);
	
	public Coach coachOne(int coachNo);

}
