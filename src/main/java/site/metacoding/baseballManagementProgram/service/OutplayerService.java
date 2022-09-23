package site.metacoding.baseballManagementProgram.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagementProgram.domain.outplayer.Outplayer;
import site.metacoding.baseballManagementProgram.domain.outplayer.OutplayerDao;

@RequiredArgsConstructor
//@Service
public class OutplayerService {
	
	public final OutplayerDao outplayerDao;
	
	public List<Outplayer> 퇴출선수목록보기() {
		List<Outplayer> outplayerList = outplayerDao.findAll();
		return outplayerList;
	}
}

