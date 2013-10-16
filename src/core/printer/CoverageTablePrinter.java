package core.printer;

import java.util.ArrayList;

import core.RiskAnalysisObject;
import core.coverageTable.CoverageTable;
import core.printing.SimpleText;
import core.printing.table.TablePrinter;

public class CoverageTablePrinter {
	public static final String NOT_COVERED = "Not Covered";

	CoverageTable coverageTable;
	TablePrinter table = new TablePrinter();;
	ArrayList<RiskAnalysisObject> listOfObjectToBeCovered;
	
	protected TablePrinter getTable() {
		return table;
	}

	boolean detailledCoverage = false;
	
	public void setDetailledCoverage(){
		detailledCoverage = true;
	}

	public CoverageTablePrinter(CoverageTable coverageTable,
			ArrayList<RiskAnalysisObject> listOfObjectToBeCovered) {
		super();
		this.coverageTable = coverageTable;
		this.listOfObjectToBeCovered = listOfObjectToBeCovered;
	}
	
	public TablePrinter generateTable() throws Exception{
		if (this.listOfObjectToBeCovered==null) {return new TablePrinter();}
		
			this.table = new TablePrinter();
			fillTable();
			
		
		
		return table;
	}

	


	private void fillTable() {
		
		for (RiskAnalysisObject leftobject:listOfObjectToBeCovered){
			  addCoverageLine(leftobject);
		}
	}

	protected void addCoverageLine(RiskAnalysisObject leftobject) {
		  table.newline();
		  table.add(new SimpleText(leftobject.getId()));
		  if (isCovered(leftobject)){
			  table.add(new SimpleText("COVERED"));  
		  }else {
			  table.add(getNotCoveredText());
		  }
		  
		  
	}

	private boolean isCovered(RiskAnalysisObject leftobject) {
		return this.coverageTable!=null && this.coverageTable.isCovered(leftobject);
	}

	private SimpleText getNotCoveredText() {
		SimpleText t =  new SimpleText(NOT_COVERED);
		t.setColor("red");
		return t;
	}
	

}
