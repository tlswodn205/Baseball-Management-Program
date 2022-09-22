package site.metacoding.baseballManagementProgram.domain.outplayer;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Outplayer {
	private Integer id;
	private String reason;
	private String playerName;
	private Integer playerId;
	private Timestamp createAt;
}
