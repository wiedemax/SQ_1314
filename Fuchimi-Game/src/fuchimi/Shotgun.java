package fuchimi;

public class Shotgun extends Hand {

	@Override
	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}

	@Override
	protected Boolean loseAgainst(Rock rock) {
		return true;
	}

	@Override
	protected Boolean loseAgainst(Paper paper) {
		return false;
	}

	@Override
	protected Boolean loseAgainst(Shotgun shotgun) {
		return null;
	}

	@Override
	public String toString()
	{
		return "Shotgun";
	}
}
