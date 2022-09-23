package site.metacoding.baseballManagementProgram.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerUpdateDto {
	private int id;
	private String positions;
	private String playerName;
}
