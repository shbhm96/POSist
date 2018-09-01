package first;

import java.util.Date;
import java.util.Map;

public class Node {
	//Date date;
	int data;
	long timestamp;
	int nodeNumber;
	String nodeId;
	String referenceNodeid;
	String[] childReferenceNodeId;
	String genesisNodeId;
	String HashValue;
	connectNode conNode;
	
	public Node() {
		
	}
	
	public boolean isvaluePossible(String parentId,String[] childReferencrNodeId) {
		Node parent=new Node();
		Node child[];
		int sum=0;
		int no_of_child=childReferenceNodeId.length;
		for(int i=0;i<no_of_child;i++) {
			sum=sum;//+data of each child;
		}
		if(sum<data) 
			return true;
		else
			return false;
		
	}
	
	public void changeParent(String new_parent) throws Exception {
		if(isvaluePossible(new_parent, childReferenceNodeId)&&conNode.verifyHash(data, HashValue))
			referenceNodeid=new_parent;		
	}
	
	
	
	public long getTimestamp() {
		return timestamp;
	}



	public void setTimestamp() {
		Date d=new Date();
		timestamp=d.getTime();
	}

	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}



	public int getNodeNumber() {
		return nodeNumber;
	}



	public void setNodeNumber() {
		this.nodeNumber = childReferenceNodeId.length;
	}



	public String getNodeId() {
		return nodeId;
	}



	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}



	public String getReferenceNodeid() {
		return referenceNodeid;
	}



	public void setReferenceNodeid(String referenceNodeid) {
		this.referenceNodeid = referenceNodeid;
	}



	public String[] getChildReferenceNodeId() {
		return childReferenceNodeId;
	}



	public void setChildReferenceNodeId(String[] childReferenceNodeId) {
		this.childReferenceNodeId = childReferenceNodeId;
	}



	public String getGenesisNodeId() {
		return genesisNodeId;
	}



	public void setGenesisNodeId(String genesisNodeId) {
		this.genesisNodeId = genesisNodeId;
	}



	public String getHashValue() {
		return HashValue;
	}



	public void setHashValue(String hashValue) {
		this.HashValue = hashValue;
	}
	
	
	public Node(int data, int nodeNumber, String nodeId, String referenceNodeid, String[] childReferenceNodeId,
			String genesisNodeId, String hashValue) {
		super();
		this.data = data;
		this.nodeNumber = nodeNumber;
		this.nodeId = nodeId;
		this.referenceNodeid = referenceNodeid;
		this.childReferenceNodeId = childReferenceNodeId;
		this.genesisNodeId = genesisNodeId;
		HashValue = hashValue;
	}



	

}
