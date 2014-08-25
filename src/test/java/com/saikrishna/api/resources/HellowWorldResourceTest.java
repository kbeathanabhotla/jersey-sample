package com.saikrishna.api.resources;

import static org.junit.Assert.*;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Assert;
import org.junit.Test;

import com.saikrishna.api.configuration.SpringContextJerseyTest;
import com.saikrishna.api.configuration.WebAppResourceConfig;

public class HellowWorldResourceTest extends SpringContextJerseyTest {
	
	@Override
	protected Application configure() {
		ResourceConfig resourceConfig = new WebAppResourceConfig();
		enable(TestProperties.LOG_TRAFFIC);
		enable(TestProperties.DUMP_ENTITY);
		resourceConfig.property("contextConfigLocation",
				"classpath:applicationContext.xml");
		return resourceConfig;
	}

	@Test
	public void test_get_message() {

		Response response = target("hello").request().get(Response.class);
		Assert.assertEquals(200, response.getStatus());
		//Assert.assertEquals("Hello Jersye and spring world", response.getEntity());

	}
}
