package p1122;

public interface PlayingCard {
	public static final int SPADE = 4;
	public static final int DIAMOND = 3;
	public static final int HEART = 2;
	public static final int CLOVER = 1;
	
	public abstract String getCardNumber();
	public abstract String getCardKind();

}
