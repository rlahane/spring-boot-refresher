package in.codingcomets.user.VO;

import in.codingcomets.user.entity.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	
	private UserInfo user;
	private Department department;

	
}
