package com.ajcp.withspring.v2javabased.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ajcp.withspring.v2annotation.main.EngineService;
import com.ajcp.withspring.v2annotation.testimpl.EngineImpl;

@Configuration
public class BeansConfig {
	
	/* same as saying
	 * <bean id="engine" class="com.ajcp.withspring.v2annotation.testimpl.Engine">
		<p:name="type" value="V4"></property>
	</bean>

	 */
	   @Bean 	
	   @Scope("prototype")
	   public EngineService 	engineService(){
	      EngineService e = new EngineImpl();
	      e.setType(EngineImpl.V6_ENGINE);
	      return e;
	   }
}
