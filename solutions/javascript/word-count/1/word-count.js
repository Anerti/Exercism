const checkFirstAndLastChar = (array) => {
  for (let i = 0; i < array.length; i++) {
    if (array[i].startsWith("'")) {
        array[i] = array[i].slice(1);
    }
    if (array[i].endsWith("'")) {
        array[i] = array[i].slice(0, array[i].length - 1);
    }
  }
  return array;
}

export const countWords = (sentence) => {
  let sanitized = sentence.toLowerCase().split(/[^\w']+/);
  sanitized = checkFirstAndLastChar(sanitized).filter(Boolean);
  
  const words = new Set(sanitized.sort());

  const result = {};
  for (const word of words) {
      result[word] = 0;
  }

  for (const word in result) {
      for (let i = 0; i < sanitized.length; i++) {
          if (word === sanitized[i]) {
              result[word]++;
          }
      }
  }
  return result;
};
