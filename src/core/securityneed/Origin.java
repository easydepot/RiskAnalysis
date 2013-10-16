package core.securityneed;

public class Origin extends SecurityNeed{

	public Origin() {
		super("origin");
	}

	@Override
	public String getValue() {
		return "origin authentication";
	}

}
