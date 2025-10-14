const translation = nucleotide => {
    switch (nucleotide) {
        case 'G': return 'C';
        case 'C': return 'G';
        case 'T': return 'A';
        case 'A': return 'U';
        default: return nucleotide;
    }
}

export const toRna = sequence => 
  sequence.split('').map(e => translation(e)).join('');