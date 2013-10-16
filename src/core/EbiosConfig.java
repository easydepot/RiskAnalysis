package core;

public class EbiosConfig {
    
	String ident="";
	Tags tags = new Tags();
	Tags excludedtags = new Tags();
	
	
	@Override
	public String toString() {
		String result="";
		result+= "Excluded Tags:";
		for (int i= 0; i < this.excludedtags.size();i++){
			result+= this.excludedtags.getTag(i) +" ";	
		}
		return result;
	}
	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}
	public Tags getTags() {
		return tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
	
	public void addExcludedTag(String tag){
		this.excludedtags.addTag(tag);
	}
	
	public boolean isExcluded(String tag){
		
			if (this.excludedtags.hasTag(tag)){return true;} 
			else {return false;}
	}
	
	public boolean isEmpty() {
		if (this.excludedtags.size()!=0){return false;}
		return true;
	}
		  
		  
}
