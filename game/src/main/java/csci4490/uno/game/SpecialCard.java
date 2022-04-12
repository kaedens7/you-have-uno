package csci4490.uno.game;

abstract class SpecialCard extends Card{

	public SpecialCard(String color, String value) {
		this.color = color;
		this.value = value;
		setScoreValue(20);
	}

	@Override
	public Boolean matchCard(Card card) {

		if (card.getColor().equals(this.getColor()) || card.getValue() == this.getValue() || card.getValue().equals("WILD"))
		{
			return true;
		}
		
		return false;
	}
	
	
	
}
