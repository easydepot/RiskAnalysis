package core.asset;

import java.util.ArrayList;

import core.RiskAnalysisObject;
import core.securityneed.Origin;
import core.securityneed.SecurityNeed;

public class Asset extends RiskAnalysisObject {
  String name ="";
  ArrayList<Functionnality> listOfLinkedFunctionnality = new ArrayList<Functionnality>();
  ArrayList<SecurityNeed> listOfSecurityNeed = new ArrayList<SecurityNeed>();
  

 

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public ArrayList<Functionnality> getListeBienEssentiels() {
	return listOfLinkedFunctionnality;
}


/*
 * Biens Essentiels.
 */
public void addBienEssentiel(Functionnality b){
	this.listOfLinkedFunctionnality.add(b);
}

public int getNumberOfBiensEssentiels(){
	return this.listOfLinkedFunctionnality.size();
}

public Functionnality getBienEssentiel(int i){
	return this.listOfLinkedFunctionnality.get(i);
}

public boolean isLinkedToAnEssentialAsset(){
	
	for (int i = 0; i < getNumberOfBiensEssentiels();i++){
		if (getBienEssentiel(i).belongToConfig()){return true;}
	}
	return false;
}

public Asset(String id) {
	super(id);
	
}

public ArrayList<SecurityNeed> getListOfSecurityNeed() {
	ArrayList<SecurityNeed> securityNeed = new ArrayList<SecurityNeed>();
	securityNeed.addAll(this.listOfSecurityNeed);
	return securityNeed;
}



public void addSecurityNeed(SecurityNeed securityNeed) {
  this.listOfSecurityNeed.add(securityNeed);	
}

 
  
  
}
