const applyOperator = (op, a, b) => {
    switch (op) {
        case 'plus': return a + b;
        case 'minus': return a - b;
        case 'multiplied': return a * b;
        case 'divided': return a / b;
        default: return a;
    }
}

export const answer = (question) => {
    if (/^What is (-)?[0-9]+\?$/.test(question)) return +question.match(/(-)?[0-9]+/g)[0];
    if (!question.match(/plus|minus|divided by|multiplied by|^What is\?$/g)) throw new Error("Unknown operation");

    if (/^What is (-)?[0-9]+\s(\s?(plus|minus|divided by|multiplied by)\s(-)?[0-9]+)+\?$/g.test(question)){
        const operator = question.split(/What is | |by|\?/).filter(Boolean).filter(e => e.match(/[a-z]/g));
        const numbers = question.split(/What is | |by|\?/).filter(Boolean).filter(e => e.match(/[0-9]/g)).map(e => +(e));

        let result = numbers[0];
        for (let i = 0; i < operator.length; i++) {
            result = applyOperator(operator[i], result, numbers[i + 1]);
        }
        return result;
    }
    throw new Error("Syntax error");
};