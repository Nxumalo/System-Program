public class GeneratingNumbers{
	
	public static void main(String[] args){
		GeneratingNumbers.generate();
	}
	public static void generate(){
		int[] shuffledDeck = new int[53];
		for (int deck = 1; deck <= 52; deck ++) shuffledDeck[deck] = deck;
		int k = 0,j;
		while (k < 52){
			int r = (int)(Math.random()*52);
			System.out.println("the r: " + r);
			for (j = 1; j <= k; j++) if (shuffledDeck[j] == r) break;
			if(j == k + 1) shuffledDeck[k++] = r;
		}
		for (int i = 0; i < 52; i ++) System.out.println(shuffledDeck[i]);
	}
}
