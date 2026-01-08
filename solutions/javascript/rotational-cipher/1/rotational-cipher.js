export const rotate = (text, shiftKey) => {
    let output = "";
    for (let letter of text) {
        if (letter >= "A" && letter <= "Z")
            letter = String.fromCharCode(((letter.charCodeAt(0) + shiftKey - 65) % 26) + 65);
        if (letter >= "a" && letter <= "z")
            letter = String.fromCharCode(((letter.charCodeAt(0) + shiftKey - 97) % 26) + 97);
        output += letter;
    }
    return output;
};