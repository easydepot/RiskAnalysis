package core.printer;


import core.RiskAnalysis;
import core.printing.Doc;
import core.printing.list.ListItem;


public abstract class RiskAnalysisPrinter {

	public RiskAnalysisPrinter(RiskAnalysis project2) {
		this.project = project2;
	}

	protected RiskAnalysis project;


	public Doc createDoc() {
		try {
		return createDocWithThrowException();
		} catch (Exception e) {
		
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	

	protected abstract Doc createDocWithThrowException() throws Exception ;

	protected Doc result = new Doc();


	public RiskAnalysis getProject() {
		
		return this.project;
	}



	protected ListItem convertListOfFunctionalityInListItem() throws Exception {
		ListItem listOfOperation = new ListItem();
		for (int i = 0; i < this.getProject().getNumberOfBienEssentiel();i++){
			listOfOperation.addItem(this.getProject().getBienEssentiel(i).getDescription());
			
		}
		return listOfOperation;
	}

}
