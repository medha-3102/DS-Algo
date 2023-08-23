package strings;

public class BinaryStringAlternate {

		public static char flip(char ch)
		{
			return (ch == '0') ? '1' : '0';
		}
		public static int getFlipWithStartingCharacter(String str,
										char expected)
		{
			int flipCount = 0;
			for (int i = 0; i < str.length(); i++)
			{
				if (str.charAt(i) != expected)
					flipCount++;
		
				expected = flip(expected);
			}
			return flipCount;
		}
		public static int minFlipToMakeStringAlternate(String str)
		{
			return Math.min(getFlipWithStartingCharacter(str, '0'),
					getFlipWithStartingCharacter(str, '1'));
		}
		public static void main(String args[])
		{
			String str = "0001010111";
			System.out.println(minFlipToMakeStringAlternate(str));
		}

}//O(N), O(1)
