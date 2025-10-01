export const findAnagrams = (target, words) => {
    let result = [];

    for (let word of words) {
        if  (word.toLowerCase() !== target.toLowerCase()) {
            if (word
                .toLowerCase()
                .split('')
                .sort().join('')
                ===
                target
                .toLowerCase()
                .split('')
                .sort()
                .join('')) {
                result.push(word);
            }
        }
    }
    return result;
};