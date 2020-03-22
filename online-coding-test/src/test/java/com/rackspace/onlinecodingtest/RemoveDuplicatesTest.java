package com.rackspace.onlinecodingtest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rackspace.onlinecodingtest.service.RemoveDuplicates;

@SpringBootTest
public class RemoveDuplicatesTest {

	@Autowired
	private RemoveDuplicates rd;

	@Test
	public void testCase1() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> result = rd.removeDuplicates(arr);
		assertEquals(Arrays.stream(arr).boxed().collect(Collectors.toList()), result);
	}

	@Test
	public void testCase2() {
		int[] arr = { 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> result = rd.removeDuplicates(arr);
		assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), result);
	}

	@Test
	public void testCase3() {
		int[] arr = { 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 9, 10, 10 };
		List<Integer> result = rd.removeDuplicates(arr);
		assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), result);
	}

	@Test
	public void testCase4() {
		int[] arr = { 25, 31, 76, 76, 76, 89, 98, 98, 99 };
		List<Integer> result = rd.removeDuplicates(arr);
		assertEquals(Arrays.asList(25, 31, 76, 89, 98, 99), result);
	}
}
