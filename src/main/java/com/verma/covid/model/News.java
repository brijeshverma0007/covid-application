package com.verma.covid.model;

import lombok.Setter;

import java.util.List;

import lombok.Getter;

@Getter
@Setter
public class News {
	private String status;
	private int totalResults;
	private List<Articles> articles;
	
}
