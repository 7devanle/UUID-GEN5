package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

class TestController {
	@Mock 
	private UuidRepo repo;

	
	@Test
	void testList() {
		UUIDClass uuid = Mockito.mock(UUIDClass.class);
		when(repo.save(Mockito.any(UUIDClass.class))).thenAnswer(i -> i.getArguments()[0]);
		when(repo.findAll()).thenReturn(Arrays.asList(uuid));
		assertEquals(1, repo.count());
	}

//	@Test
//	void testListOfUuids() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testListOfUuidsUUID() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testCreatUuid() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeleteuuid() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testUpdateuuid() {
//		fail("Not yet implemented");
//	}

}
