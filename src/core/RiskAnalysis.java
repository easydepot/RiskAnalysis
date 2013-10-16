package core;

import java.util.ArrayList;

import contremesure.CounterMeasure;

import menaceBienSupport.Vulnerability;
import core.asset.Asset;
import core.asset.Functionnality;
import core.asset.SystemDescription;
import core.threat.Threat;



public class RiskAnalysis {
	
	
	
	
	public class SystemEnvironment {
		ArrayList<Asset> assetArrayList = new ArrayList<Asset>();

		public ArrayList<Asset> getAssetArrayList() {
			return assetArrayList;
		}
		
		
	}
	
	SystemEnvironment systemEnvironement = new SystemEnvironment();
	
	
	
	public SystemEnvironment getSystemEnvironement() {
		return systemEnvironement;
	}



	public void setSystemEnvironement(SystemEnvironment systemEnvironement) {
		this.systemEnvironement = systemEnvironement;
	}



	public SystemDescription getSystemDescription() {
		return systemDescription;
	}



	public void setSystemDescription(SystemDescription systemDescription) {
		this.systemDescription = systemDescription;
	}









	SystemDescription systemDescription = new SystemDescription();
	
	
	





	


	
	
	

	ArrayList<Threat> listeMenaceBienEssentiel = new ArrayList<Threat>();
	
	

	
	
	ArrayList<Vulnerability> listeMenaceBienSupport = new ArrayList<Vulnerability>();
	ArrayList<CounterMeasure> listeContreMesure =  new ArrayList<CounterMeasure>();
	ArrayList<CounterMeasure> listeContreMesureOnHold =  new ArrayList<CounterMeasure>();
	
	public void addContreMesureOnHold(CounterMeasure c){
		this.listeContreMesureOnHold.add(c);
	}
	
	public int getNumberOfContreMesureOnHold(){
	  return this.listeContreMesureOnHold.size();	
	}
	
	public CounterMeasure getContreMesureOnHold(int i){
		return this.listeContreMesureOnHold.get(i);
	}
	
	public void addContreMesure(CounterMeasure c){
		this.listeContreMesure.add(c);
	}
	
	public int getNumberOfContreMesure(){
	  return this.listeContreMesure.size();	
	}
	
	public CounterMeasure getContreMesure(int i){
		return this.listeContreMesure.get(i);
	}
	


	public Threat searchMenaceBienEssentiel(String id){
		for (int i = 0; i < this.listeMenaceBienEssentiel.size();i++){
			if (this.listeMenaceBienEssentiel.get(i).getId().equals(id)){
				return this.listeMenaceBienEssentiel.get(i);
			}
		}
		return null;
	}
	
	
	
	public Functionnality searchBienEssentiel(String id){
		return this.getSystemDescription().searchBienEssentiel(id);
	}
	
	public Asset searchBienSupport(String id) throws Exception{
		return this.getSystemDescription().searchBienSupport(id);
	}
	
	public CounterMeasure searchContreMesure(String id){
		for (int i = 0; i < this.listeContreMesure.size();i++){
			if (this.listeContreMesure.get(i).getId().equals(id)){
				return this.listeContreMesure.get(i);
			}
		}
		return null;
	}
	
	public CounterMeasure searchNewContreMesure(String id){
		for (int i = 0; i < this.listeContreMesureOnHold.size();i++){
			if (this.listeContreMesureOnHold.get(i).getId().equals(id)){
				return this.listeContreMesureOnHold.get(i);
			}
		}
		return null;
	}
	
	public Vulnerability searchMenaceBienSupport(String bienId,String type){
		for (int i = 0; i < this.listeMenaceBienSupport.size();i++){
			if (this.listeMenaceBienSupport.get(i).getType().equals(type)&& this.listeMenaceBienSupport.get(i).getCible().getId().equals(bienId) ){
				return this.listeMenaceBienSupport.get(i);
			}
		}
		return null;
	}
	
	
	public ArrayList<Vulnerability> getListeMenaceBienSupport() {
		return listeMenaceBienSupport;
	}

	public void setListeMenaceBienSupport(
			ArrayList<Vulnerability> listeMenaceBienSupport) {
		this.listeMenaceBienSupport = listeMenaceBienSupport;
	}

	/*public Vector<BienEssentiel> getListeBienEssentiel() {
		return listeBienEssentiel;
	}*/
	
	public int getNumberOfBienEssentiel() {
		return this.getSystemDescription().getFunctionalityList().size();
	}
	
	public void addBienEssentiel(Functionnality b){
		this.getSystemDescription().addFunctionnality(b);
	}
	
	public Functionnality getBienEssentiel(int i){
		return this.getSystemDescription().getFunctionalityList().get(i);
	}
	
	
	
	public ArrayList<Asset> getListeBienSupport() {
		return this.getSystemDescription().getAssetList();
	}
	
	public ArrayList<Threat> getListeMenaceBienEssentiel() {
		return listeMenaceBienEssentiel;
	}



	public void addThreat(Threat t) {
		this.listeMenaceBienEssentiel.add(t);
	}
	
	
}
