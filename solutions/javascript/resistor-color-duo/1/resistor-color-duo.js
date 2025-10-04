const bandColors = {
    black: 0,
    brown: 1,
    red: 2,
    orange: 3,
    yellow: 4,
    green: 5,
    blue: 6,
    violet: 7,
    grey: 8,
    white: 9,
};

export const decodedValue = (colorName) => {
    const [color1, color2] = [...colorName];
    return +`${bandColors[color1]}${bandColors[color2]}`;
};