package Hands;

import static org.junit.Assert.*;

public class TestJoker {

	
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	public static void tearDownAfterClass() throws Exception {
		
	}
	
	public void setUp() throws Exception {
		
	}
	
	public void tearDown() throws Exception {
		
	}
	
	public final void TestRoyalFlush() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be royal flush:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		assertEquals("Should be natural:",1,h.getNatural());
		
	}
	
	public final void TestJokerRoyalFlush() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be royal flush:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		assertEquals("Should not be natural:",0,h.getNatural());
		
	}
	public final void TestJokerFive() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.ACE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.ACE));
		rfHand.add(new Card(eSuit.SPADES,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be five of a kind:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());
		assertEquals("Should not be natural:",0,h.getNatural());
		
	}
	
	
	public final void TestJokerFour() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.ACE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be four of a kind:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());
		assertEquals("Should not be natural:",0,h.getNatural());
		
	}
	public final void TestJokerstraightfl() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be straight flush:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());
		assertEquals("Should not be natural:",0,h.getNatural());
		
	}
	public final void TestJokerfullHouse() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.HEARTS,eRank.JACK));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be full house:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());
		assertEquals("Should not be natural:",0,h.getNatural());
		
	}
	public final void TestJokerFlush() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be flush:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());
		assertEquals("Should not be natural:",0,h.getNatural());
		
	}
	public final void TestJokerstr8() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.HEARTS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be straight:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());
		assertEquals("Should not be natural:",0,h.getNatural());
		
	}
	public final void TestJokerthree() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be three of a kind:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());
		assertEquals("Should not be natural:",0,h.getNatural());
		
	}
	public final void TesttwoPair() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be two pair:",eHandStrength.TwoPair.getHandStrength(),h.getHandStrength());
		assertEquals("Should be natural:",1,h.getNatural());
		
	}
	public final void TestJokerpair() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be pair:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());
		assertEquals("Should not be natural:",0,h.getNatural());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
