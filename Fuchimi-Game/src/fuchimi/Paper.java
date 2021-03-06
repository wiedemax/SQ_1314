package fuchimi;

public class Paper extends Hand{
	
	@Override
	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}

	@Override
	protected Boolean loseAgainst(Rock rock) {
		return new Boolean("false");
	}

	@Override
	protected Boolean loseAgainst(Paper paper) {
		return null;
	}

	@Override
	protected Boolean loseAgainst(Shotgun shotgun) {
		return new Boolean("true");
	}

	@Override
	public String toString()
	{
		return "Paper";
	}
}
