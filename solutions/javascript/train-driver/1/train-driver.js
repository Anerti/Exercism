export function getListOfWagons(...id) {
  return id;
}

export function fixListOfWagons(ids) {
  const [first, second, ...remainders] = [...ids];
  remainders.push(first, second);
  return remainders;
}

export function correctListOfWagons(ids, missingWagons) {
  const [first, ...remaining] = ids;
  return [first, ...missingWagons, ...remaining];
}

export function extendRouteInformation(information, additional) {
  return {...information, ...additional};
}

export function separateTimeOfArrival(information) {
  const { timeOfArrival, ...data} = information;
  return [timeOfArrival, data];
}
