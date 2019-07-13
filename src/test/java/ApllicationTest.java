import model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application.xml")
public class ApllicationTest {
	@Autowired
	private User user;
	
	@Test
	public void beanTest(){
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("application.xml");
		User user =(User) applicationContext.getBean("user");
		System.out.println("success,user="+user.getUsername());
	}

	@Test
	public void beanAutowireTest(){
		System.out.println(user.getPassword());
		System.out.println(JSON.toJSONString(user));
	}
}
