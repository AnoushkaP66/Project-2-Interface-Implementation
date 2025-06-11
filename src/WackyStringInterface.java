package cmsc256;

/**
 * This is an interface for a class that represents a string,
 * defined as a sequence of characters. It provides methods
 * that
 */
public interface WackyStringInterface {

	/**
	 * Sets the value of the current string.
	 *
	 * @param string
	 *            The value to be set
	 */
	public void setWackyString(String string);

	/**
	 * Returns the current string
	 *
	 * @return Current string
	 */
	public String getWackyString();

	/**
	 * Returns a string that consists of all and only the characters
	 * in every other position in the current string beginning with position 1,
	 * in the same order and with the same case as in the current string.
	 * The first character in the string is considered to be in Position 1.
	 *
	 * @return String made of characters in every other position in the
	 * current string
	 */
	public String getEveryOtherCharacter();

	/**
	 * Returns a string that consists of all and only the characters
	 * in either the odd positions (i.e., first, third, fifth, and so on)
	 * or in the even positions (i.e., second, fourth, sixth, and so on)
	 * current string, in the same order and with the same case as in
	 * the current string.
	 * Odd or even is determined by the length of the string. If the string length
	 * is odd, return the odd characters; if the length is even, return the even
	 * characters.
	 * The first character in the string is considered to be in Position 1.
	 *
	 * @return String made of characters in odd positions in the current string
	 */
	public String getEvenOrOddCharacters();

	/**
	 * Returns the number of characters that are digits in the current string.
	 *
	 * @return Number of digits in the current string
	 */
	public int countDigits();

	/**
	 * Returns the number of times that a distinct number between 10 - 99 occurs.
	 *
	 * @return Number of double digits in the current string
	 */
	public int countRangeOfNumbers();

	/**
	 * Replace the _individual_ digits in the current string, between
	 * startPosition and endPosition (included), with the same charcters
	 * but in reversed order. The first character in the string is
	 * considered to be in Position 1.
	 *
	 * @param startPosition  Position of the first character to consider
	 * @param endPosition    Position of the last character to consider
	 * @throws MyIndexOutOfBoundsException
	 *            If either "startPosition" or "endPosition" are out of
	 *            bounds (i.e., either less than 1 or greater than the
	 *            length of the string)
	 * @throws IllegalArgumentException
	 *            If "startPosition" > "endPosition" (but both are
	 *            within bounds)
	 */
	public void reverseSubstring(int startPosition, int endPosition)
			throws MyIndexOutOfBoundsException, IllegalArgumentException;
}
