/**
 * Double every card in the deck.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} deck with every card doubled
 */
export const seeingDouble = deck => deck.map(e => e * 2);

/**
 *  Creates triplicates of every 3 found in the deck.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} deck with triplicate 3s
 */
export const threeOfEachThree = deck =>
  deck.reduce((accumulator, currentValue) => {
    if (currentValue === 3) 
      for (let i = 0; i < 3; i++) 
        accumulator.data.push(currentValue);
    else 
      accumulator.data.push(currentValue);
    
    return accumulator;
  },
  { data: [] },
).data;

/**
 * Extracts the middle two cards from a deck.
 * Assumes a deck is always 10 cards.
 *
 * @param {number[]} deck of 10 cards
 *
 * @returns {number[]} deck with only two middle cards
 */
export const middleTwo = deck => 
  deck.slice(Math.floor(deck.length / 2) - 1, Math.floor(deck.length / 2) + 1);

/**
 * Moves the outside two cards to the middle.
 *
 * @param {number[]} deck with even number of cards
 *
 * @returns {number[]} transformed deck
 */

export const sandwichTrick = deck => {
  const first = deck.length > 2 ? deck.slice(1, Math.floor(deck.length / 2)) : [];
    const last = deck.slice(Math.floor(deck.length / 2), deck.length - 1);
    const middle = [deck[deck.length - 1], deck[0]];
    return first.concat(middle.concat(last));
}
/**
 * Removes every card from the deck except 2s.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} deck with only 2s
 */
export const twoIsSpecial = deck => deck.filter(e => e === 2); 

/**
 * Returns a perfectly order deck from lowest to highest.
 *
 * @param {number[]} deck shuffled deck
 *
 * @returns {number[]} ordered deck
 */
export const perfectlyOrdered = deck => 
  deck.sort((a, b) => {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    });

/**
 * Reorders the deck so that the top card ends up at the bottom.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} reordered deck
 */
export const reorder = deck => deck.reverse();
