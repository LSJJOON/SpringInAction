package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan		//�ڵ����� ������Ʈ ��ĵ
public class CDPlayerConfig {
	
//	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
//	@Bean
	public CDPlayer cdPlayer(){
		return new CDPlayer(sgtPeppers());
	}
	
//	@Bean
//	public CDPlayer cdPlayer2(CompactDisc compactDisc){
//		return new CDPlayer(compactDisc);
//	}
	

}
