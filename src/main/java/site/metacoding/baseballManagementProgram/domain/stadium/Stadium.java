package site.metacoding.baseballManagementProgram.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stadium {
	private Integer id;
	private String stadiumName;
	private Timestamp createAt;
	private Integer rankId;
}
