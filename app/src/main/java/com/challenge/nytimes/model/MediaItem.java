package com.challenge.nytimes.model;

import java.util.List;

public class MediaItem{
	private String copyright;
	private List<MediaMetadataItem> mediaMetadata;
	private String subtype;
	private String caption;
	private String type;
	private int approvedForSyndication;

	public String getCopyright(){
		return copyright;
	}

	public List<MediaMetadataItem> getMediaMetadata(){
		return mediaMetadata;
	}

	public String getSubtype(){
		return subtype;
	}

	public String getCaption(){
		return caption;
	}

	public String getType(){
		return type;
	}

	public int getApprovedForSyndication(){
		return approvedForSyndication;
	}
}