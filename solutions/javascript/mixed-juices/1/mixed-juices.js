/**
 * Determines how long it takes to prepare a certain juice.
 *
 * @param {string} name
 * @returns {number} time in minutes
 */
export function timeToMixJuice(name) {
  switch (name) {
    case 'Pure Strawberry Joy':
      return 0.5;
      break;
    case 'Green Garden':
    case 'Energizer':
      return 1.5;
      break;
    case 'Tropical Island':
      return 3;
      break;
    case 'All or Nothing':
      return 5;
      break;
    default:
      return 2.5;
  }
}

/**
 * Calculates the number of limes that need to be cut
 * to reach a certain supply.
 *
 * @param {number} wedgesNeeded
 * @param {string[]} limes
 * @returns {number} number of limes cut
 */
export function limesToCut(wedgesNeeded, limes) {
    let total = 0;
    let index = 0;
    while (total < wedgesNeeded && limes.length > index) {
        switch (limes[index]) {
            case 'small':
                total += 6;
                break;
            case 'medium':
                total += 8;
                break;
            default:
                total += 10;
        }
        index++;
    }
    return index;
}

/**
 * Determines which juices still need to be prepared after the end of the shift.
 *
 * @param {number} timeLeft
 * @param {string[]} orders
 * @returns {string[]} remaining orders after the time is up
 */
export function remainingOrders(timeLeft, orders) {
  let time = 0;
  let index = 0;
  
  while (time < timeLeft) {
    time += timeToMixJuice(orders[index]);
    index++;
  }
  
  let output = [];
  for (let i = index; i < orders.length; i++) {
    output.push(orders[i]);
  }
  return output;
}
