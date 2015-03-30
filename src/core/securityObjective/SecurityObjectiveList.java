package core.securityObjective;

import java.util.ArrayList;

public class SecurityObjectiveList extends ArrayList<SecurityObjective>{

	public SecurityObjective findByIdent(String objectiveIdent) throws Exception {
		for (SecurityObjective obj: this){
			if (obj.getId().contentEquals(objectiveIdent)){
				return obj;
			}

		}
		throw new Exception("SecurityObjective " + objectiveIdent +" not found");
	}

}
