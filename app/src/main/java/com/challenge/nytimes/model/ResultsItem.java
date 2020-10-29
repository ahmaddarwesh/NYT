package com.challenge.nytimes.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultsItem{
	private List<String> perFacet;
	private int etaId;
	@SerializedName("subsection")
	private String subsection;
	private List<String> orgFacet;
	private String nytdsection;
	private Object column;
	@SerializedName("section")
	private String section;
	private long assetId;
	private String source;
	private String jsonMemberAbstract;
	private List<ArticleModel> media;
	@SerializedName("type")
	private String type;
	@SerializedName("title")
	private String title;
	private List<String> desFacet;
	private String uri;
	@SerializedName("url")
	private String url;
	private String adxKeywords;
	private List<Object> geoFacet;
	@SerializedName("id")
	private String id;
	@SerializedName("published_date")
	private String published_date;
	private String updated;
	@SerializedName("byline")
	private String byline;
	@SerializedName("abstract")
	private String abstractText;

	public List<String> getPerFacet(){
		return perFacet;
	}

	public int getEtaId(){
		return etaId;
	}

	public String getSubsection(){
		return subsection;
	}

	public List<String> getOrgFacet(){
		return orgFacet;
	}

	public String getNytdsection(){
		return nytdsection;
	}

	public String getabstractText(){
		return abstractText;
	}


	public Object getColumn(){
		return column;
	}

	public String getSection(){
		return section;
	}

	public long getAssetId(){
		return assetId;
	}

	public String getSource(){
		return source;
	}

	public String getJsonMemberAbstract(){
		return jsonMemberAbstract;
	}

	public List<ArticleModel> getMedia(){
		return media;
	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}

	public List<String> getDesFacet(){
		return desFacet;
	}

	public String getUri(){
		return uri;
	}

	public String getUrl(){
		return url;
	}

	public String getAdxKeywords(){
		return adxKeywords;
	}

	public List<Object> getGeoFacet(){
		return geoFacet;
	}

	public String getId(){
		return id;
	}

	public String getPublishedDate(){
		return published_date;
	}

	public String getUpdated(){
		return updated;
	}

	public String getByline(){
		return byline;
	}
}