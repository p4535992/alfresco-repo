package org.smartlabs;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.smartlabs.core.services.AlfrescoRepoService;
import org.smartlabs.core.services.Registry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@ContextConfiguration(locations = { "classpath*:applicationContext-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AlfrescoRepoServiceTest {

	@Autowired
	private AlfrescoRepoService repoService;
	
	
	@Test
	public void testService(){
		assertTrue("Error Login Repo", repoService.login());
		assertNotNull(Registry.getAlfrescoRepoService());
	}
	
}