package com.xworkz.collection;

public class RemoteDto {

	private int remoteId;
	private String remoteName;
	
	public RemoteDto(int remoteId,String remoteName) {
		this.remoteId=remoteId;
		this.remoteName=remoteName;
	}
	
	
	public int getRemoteId() {
		return remoteId;
	}
	
	public void setRemoteId(int remoteId) {
		this.remoteId=remoteId;
	}
	
	
	public String getRemoteName() {
		return remoteName;
	}
	
	public void setRemoteName(String remoteName) {
		this.remoteName=remoteName;
	}
	
	
	public String toString() {
		return "RemoteDtor={remoteId="+this.remoteId+",remoteName="+this.remoteName+"}";
	}
	
	
	
}
