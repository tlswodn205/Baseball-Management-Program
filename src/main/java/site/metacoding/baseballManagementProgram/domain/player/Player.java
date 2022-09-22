package site.metacoding.baseballManagementProgram.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseballManagementProgram.domain.outplayer.Outplayer;

@Getter
@Setter
public class Player {
	private Integer id;
	private String playerName;
	private Integer teamId;
	private String positions;
	private Timestamp createAt;
	
	public Outplayer playerOut(String reason) {
		Outplayer outplayer = new Outplayer(reason, this.playerName, this.id);
		return outplayer;
	}
}
