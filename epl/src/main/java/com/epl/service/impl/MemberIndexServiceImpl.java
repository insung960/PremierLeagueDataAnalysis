package com.epl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epl.mapper.MemberIndexMapper;
import com.epl.service.interfaces.MemberIndexService;
import com.epl.vo.MatchResult;
import com.epl.vo.MatchSchedule;
import com.epl.vo.TeamRank;
@Service
@Transactional
public class MemberIndexServiceImpl  implements MemberIndexService {

	@Autowired
	private MemberIndexMapper memberIndexMapper;

	@Override
	public List<TeamRank> getMemberTeamRank(){
		List<TeamRank> list = memberIndexMapper.selectMemberTeamRank();
		return list;
	}

	@Override
	public List<MatchSchedule> getMemberMatchSchedule(){
		List<MatchSchedule> list = memberIndexMapper.selectMatchSchedule();
		return list;

	}
	
	@Override
	public List<MatchResult> getLiveMatchList(){
		List<MatchResult> list = memberIndexMapper.selectLiveMatchList();
		return list;
	}
}
