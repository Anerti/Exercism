export const steps = number => {
    if (number <= 0) throw new Error('Only positive integers are allowed');

    let output= 0;
    while (number !== 1) {
        number = number % 2 === 0 ? number /= 2 : (number * 3) + 1;
        output++;
    }
    return output;
};
