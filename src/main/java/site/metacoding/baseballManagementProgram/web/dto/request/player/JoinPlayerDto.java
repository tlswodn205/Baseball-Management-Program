package site.metacoding.baseballManagementProgram.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinPlayerDto {
	private String name;
	private int teamId;
	private String positions;
}
