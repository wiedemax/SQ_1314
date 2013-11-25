package fuchimi;

public class Rock extends Hand{

	@Override
	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}

	@Override
	protected Boolean loseAgainst(Rock rock) {
		return null;
	}

	@Override
	protected Boolean loseAgainst(Paper paper) {
		return true;
	}

	@Override
	protected Boolean loseAgainst(Shotgun shotgun) {
		return false;
	}

	@Override
	public String toString()
	{
		return "Rock";
	}
}
