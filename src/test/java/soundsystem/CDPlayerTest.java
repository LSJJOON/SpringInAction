package soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=CDPlayerConfig.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/beanConfing.xml"})
public class CDPlayerTest {
	@Rule
	public final SystemOutRule log = 
							new SystemOutRule().enableLog();
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
	}
	
	@Test
	public void play(){
		player.play();
		assertEquals("playing Sgt.Pepper's ~~~~~ by The Beatles",
				log.getLog());
	}
}