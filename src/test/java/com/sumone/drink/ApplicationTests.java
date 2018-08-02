package com.sumone.drink;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = Application.class)
public class ApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	RestTemplateBuilder restTemplateBuilder;

	protected TestRestTemplate restTemplate;

	@PostConstruct
	public void init() {
		this.restTemplate = new TestRestTemplate(restTemplateBuilder.rootUri("http://localhost:" + port));
	}

	@Test
	public void contextLoads() {
	}

}
