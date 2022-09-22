package site.metacoding.baseballManagementProgram.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
	private Integer id;
	private String playerName;
	private Integer teamId;
	private String positions;
	private Timestamp createAt;
}
