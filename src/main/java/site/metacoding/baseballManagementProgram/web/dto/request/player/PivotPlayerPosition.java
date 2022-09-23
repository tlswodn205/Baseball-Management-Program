package site.metacoding.baseballManagementProgram.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PivotPlayerPosition {
	private String teamName;
	private String firstBasemane;
	private String secondBasemane;
	private String thirdBasemane;
	private String catcher;
	private String leftFielder;
	private String rightFielder;
	private String shortstop;
}
