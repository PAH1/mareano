package no.imr.geoexplorer.admindatabase.mybatis.pojo;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author endrem
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-servlet.xml"})
public class SpesialpunkttypeTest {

	@Autowired(required = true)
	private SqlSessionTemplate template;

	@SuppressWarnings("unchecked")
	@Test
	public void getSpesialpunkttype() {
		List<Spesialpunkttype> spesialpunkttype = (List<Spesialpunkttype>) template.selectList("getSpesialpunkttype");
		assertNotNull(spesialpunkttype);
	}
}
