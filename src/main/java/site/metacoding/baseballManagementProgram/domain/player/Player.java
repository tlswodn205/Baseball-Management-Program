package site.metacoding.baseballManagementProgram.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseballManagementProgram.domain.outplayer.Outplayer;
import site.metacoding.baseballManagementProgram.web.dto.request.outplayer.OutplayerReqDto;

@Getter
@Setter
public class Player {
	private Integer id;
	private String playerName;
	private Integer teamId;
	private String positions;
	private Timestamp createAt;
	
	public OutplayerReqDto playerOut(String reason) {
		OutplayerReqDto outplayerReqDto = new OutplayerReqDto(reason, this.playerName, this.id);
		return outplayerReqDto;
	}
}
