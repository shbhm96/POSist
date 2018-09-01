package first;


import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class connectNode extends Node{
	
	static Random rand=new Random();
	static boolean possible=true;
	
	Map<String, Node> chain=new Map<String, Node>() {
		
		@Override
		public Collection<Node> values() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int size() {

			return 0;
		}
		
		@Override
		public Node remove(Object arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void putAll(Map<? extends String, ? extends Node> arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public Node put(String arg0, Node arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Set<String> keySet() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean isEmpty() {
			createGenesisblock(getdata(), possible);
			return false;
		}
		
		@Override
		public Node get(Object arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Set<Entry<String, Node>> entrySet() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean containsValue(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean containsKey(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
	}; 

	
	public static void main(String arsg[]) {
		Node n=null;
		int num=getdata();
		n=createGenesisblock(num,possible);		
	}
	
	public Node createChildNode(String genesisid,String parentid) throws Exception {
		Node n=new Node();
		n.setGenesisNodeId(genesisid);
		n.setReferenceNodeid(parentid);		
		n.setChildReferenceNodeId(null);
		n.setHashValue(createHash(isvaluepossible(parentid)));		
		
		
		return null;
		
	}
	
	private String isvaluepossible(String parentId) {
		
		
		
		return null;
	}

	private int mainfuntion(String parentid) {
		
		
		return 0;
	}

	public static Node createGenesisblock(int data,boolean possible) {
		if(possible) {
			Node GenesisBlock=new Node();
			Date d=new Date();			
			GenesisBlock.timestamp=d.getTime();
			GenesisBlock.data=data;
			GenesisBlock.setReferenceNodeid(null);			
			possible=false;
			return GenesisBlock;
		}else {
			System.out.print("Genesis Block Already Created!!!!!!");
			return null;
		}
	}//As there will be need to be only one Genesis Block inside the Node chain
	
	public String changeparent(String new_parent) {
		/*changing the parent  of the node*/ 
		
		
		return new_parent;
		
	}

	 public static int getdata() {
		 int num=0;
		 Scanner sc1=new Scanner(System.in);
		 int choice=sc1.nextInt(); 
		 if(choice%2==0) {
			 num=sc1.nextInt();
		 }else {
			 num=(int)rand.nextDouble()*1000;
		 }
		return num;
	}
	
	 public String createHash(String data) throws Exception {
		 String data1="";
		 for(int i=0;i<Integer.parseInt(data);i++)
			 data1+=data;		 		  
		return data1;		 
	 }
	 /*This function will just make the things like say data=Man so as man.length=3
			 so result will  be ManManMan and inserting .tolower will make it manmanman*/
	 
	 public boolean verifyHash(int data,String Hash) throws Exception{
		 String verify="";
		 
		 for(int i=0;i<data;i++)
			 verify+=data;
		 if(Hash==verify)
			 return true;
		 else
			 return false;
		 }
	 //Here verifying the hash getting the value from the user
}
