const translation = {
    AUG: 'Methionine',
    UUU: 'Phenylalanine',
    UUC: 'Phenylalanine',
    UUA: 'Leucine',
    UUG: 'Leucine',
    UCU: 'Serine',
    UCC: 'Serine',
    UCA: 'Serine',
    UCG: 'Serine',
    UAU: 'Tyrosine',
    UAC: 'Tyrosine',
    UGU: 'Cysteine',
    UGC: 'Cysteine',
    UGG: 'Tryptophan',
    UAA: 'STOP',
    UAG: 'STOP',
    UGA: 'STOP',
}

export const translate = (rnaSequence) => {
    if (rnaSequence === "" || rnaSequence === undefined) return [];

    rnaSequence = rnaSequence.match(/[A-Z]{3}|[A-Z]{1,2}/g);
    let output = [];
    for (const codon of rnaSequence) {
        if (translation[codon] === "STOP") break;
        output.push(translation[codon]);
    }

    if (output.includes(undefined)) throw new Error('Invalid codon');
    return output;
};