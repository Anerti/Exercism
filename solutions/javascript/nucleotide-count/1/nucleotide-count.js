export const countNucleotides = strand => {
    if (!/^[ACGT]*$/.test(strand)) throw new Error("Invalid nucleotide in strand");
    
    const nucleotidesCountList = { A: 0, C: 0, G: 0, T: 0 };
    for (const nucleotide of strand) nucleotidesCountList[nucleotide]++;
    return Object.values(nucleotidesCountList).join(' ');
}