export const isIsogram = (word) => 
  new Set(word.replaceAll(new RegExp("[- ]", "g"), "").toLowerCase().split('')).size 
  === 
  word.replaceAll(new RegExp("[- ]", "g"), "").length;