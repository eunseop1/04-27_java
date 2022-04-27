package kr.human.java0427;

import kr.human.vo.PersonVO;
import java.util.*;//util의 모든 것을 임폴트
import static java.lang.System.out; //jdk1.5이상

public class ex02 {
	public static void main(String[] args) {
		//패키지가 다른데, 동일한 이름의 클래스를 여러개 사용하려면 많이 사용하는 패키지를 import하고
		//상대적으로 적게 사용하는 클래스는 전체 이름을 써서 사용
		PersonVO vo1 = new PersonVO();
		kr.human.vo.copy2.PersonVO vo2 = new kr.human.vo.copy2.PersonVO();
		
		vo2.isGender();
		
		out.println(vo1);
		
		//컨트롤+쉬프트 + O를 누르면 자동으로 필요한 것들만 import
	}
}
