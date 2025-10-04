/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
  const number1 = array1.reduce((acc, curr) => acc + curr, "");
  const number2 = array2.reduce((acc, curr) => acc + curr, "");
  return (+number1) + (+number2);
}

/**
 * Checks whether a number is a palindrome.
 *
 * @param {number} value
 * @returns {boolean} whether the number is a palindrome or not
 */
export const luckyNumber = (value) => +String(value).split("").reverse().join("") === value;

/**
 * Determines the error message that should be shown to the user
 * for the given input value.
 *
 * @param {string|null|undefined} input
 * @returns {string} error message
 */
export function errorMessage(input) {
  if (!input) return 'Required field';
  if (!(+input)) return 'Must be a number besides 0';
  else return '';
}
