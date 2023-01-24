//package com.example.demo;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.ResponseEntity;
//import org.springframework.mock.web.MockHttpServletRequest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import com.example.demo.config.DemoConfig;
//import com.example.demo.controller.CommitInfoController;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = DemoApplication.class)
//@SpringBootApplication(scanBasePackages = { "com.example.demo" })
//@SpringBootTest(classes = ServletWebServerFactoryAutoConfiguration.class)
//@TestPropertySource("classpath:git.properties")
//
////@RunWith(MockitoJUnitRunner.class)
//class DemoApplicationTests {
//
//	private static final String SALES_ORDER_CREATED = "SalesOrderCreated";
//	private static final String TEST_ID = "12345";
//
//	@InjectMocks
//	CommitInfoController controller;
//
//	@Value("${git.commit.id}")
//	private String commitId;
//
//	@Mock
//	ObjectMapper mapper;
//
//	@Test
//	public void testAddEmployee() {
//		MockHttpServletRequest request = new MockHttpServletRequest();
//		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
//
//		assertNotNull(controller.getCommitId(), "commitId is Null");
//	}
//
//}
