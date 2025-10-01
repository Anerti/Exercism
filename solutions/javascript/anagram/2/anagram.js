export const findAnagrams = (target, words) => {
    return words
                .filter((word => (word.toLowerCase() !== target.toLowerCase())))
                .filter((word) => word
                    .toLowerCase()
                    .split('')
                    .sort().join('')
                    ===
                        target
                        .toLowerCase()
                        .split('')
                        .sort()
                        .join(''));
};