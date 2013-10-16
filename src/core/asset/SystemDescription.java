package core.asset;

import java.util.ArrayList;


public class SystemDescription {
	private ArrayList<Functionnality> functionalityList = new ArrayList<Functionnality>();
	private ArrayList<Asset> assetList = new ArrayList<Asset>();
	
	
	
	
	public ArrayList<Functionnality> getFunctionalityList() {
		return functionalityList;
	}

	

	public ArrayList<Asset> getAssetList() {
		ArrayList<Asset> result = new ArrayList<Asset>();
		for (Asset asset: this.assetList){
			if (asset.isEnabled()){
				result.add(asset);
			}
		}
		return result;
	}
	
	

	
	

	public Functionnality searchBienEssentiel(String id){
		for (int i = 0; i < this.functionalityList.size();i++){
			if (this.functionalityList.get(i).getId().equals(id)){
				return this.functionalityList.get(i);
			}
		}
		return null;
	}
	
	public Asset searchBienSupport(String id) throws Exception{
		for (int i = 0; i < this.assetList.size();i++){
			if (this.assetList.get(i).getId().equals(id)){
				return this.assetList.get(i);
			}
		}
		throw new Exception("Asset " + id + "cannot be found");
	}



	public void addAsset(Asset asset) {
		this.assetList.add(asset);
	}



	public void addFunctionnality(Functionnality f) {
		this.functionalityList.add(f);
		
	}
	
	

}
