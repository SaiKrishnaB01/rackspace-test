package com.rackspace.onlinecodingtest.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class RemoveDuplicates {
	
	private static RemoveDuplicates instance = null;
	
	private RemoveDuplicates(){
		
	}
	
	public static RemoveDuplicates getInstance(){
		if(instance == null)
			instance = new RemoveDuplicates();
		return instance;
	}

	public List<Integer> removeDuplicates(int[] sortedArray) {
		int j=0;
		for(int i=0; i<sortedArray.length-1; i++){
			if(sortedArray[i] != sortedArray[i+1]){
				sortedArray[j++] = sortedArray[i];
			}
		}
		sortedArray[j++] = sortedArray[sortedArray.length - 1];
		return Arrays.stream(sortedArray).boxed().collect(Collectors.toList()).subList(0, j);
	}
	

}


