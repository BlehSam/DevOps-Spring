package com.nagarro.DevOps;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class DevOpsApplicationTests {

	@Test
	void contextLoads() {
	}
	  @Autowired
	    private MockMvc mockMvc;

	    @Test
	    public void testGetHello() throws Exception {
	        mockMvc.perform(get("/Hello/"))
	                .andExpect(status().isOk());
	    }

	    @Test
	    public void testGetNew() throws Exception {
	        mockMvc.perform(get("/Hello/new"))
	                .andExpect(status().isOk());
	    }

}
