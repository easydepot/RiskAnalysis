package core;

import java.util.Vector;

public class Tags {
	
	Vector<String> tags = new Vector<String>();
	
	public int size(){
		return this.tags.size();
	}
	
	public String getTag(int i){
		return tags.get(i);
	}
	
	@Override
	public String toString() {
		return "Tags [tags=" + tags + "]";
	}



	boolean hasTag(String tag){
		for (int i = 0; i < this.tags.size();i++){
			if (tags.get(i).contentEquals(tag)){
				return true;
			}
		}
		return false;
	}
	
	public void addTag(String tag){
		tags.add(tag);
	}

}
