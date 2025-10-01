export const parse = (phrase) => {
    return phrase
        .split(new RegExp("[ ]|-", "g"))
        .map(e => e.replace(new RegExp("[^a-z]", "gi"), ""))
        .filter(Boolean)
        .map(e => e[0].toUpperCase())
        .join('');
};