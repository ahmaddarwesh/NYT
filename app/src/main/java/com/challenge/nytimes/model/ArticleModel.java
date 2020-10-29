package com.challenge.nytimes.model;

import java.util.List;

public class ArticleModel{
	private String copyright;
	private List<ResultsItem> results;
	private int numResults;
	private String status;

	public String getCopyright(){
		return copyright;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	public int getNumResults(){
		return numResults;
	}

	public String getStatus(){
		return status;
	}
}