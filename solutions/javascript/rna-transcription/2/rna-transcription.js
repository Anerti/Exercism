const translation = {
    G: 'C',
    C: 'G',
    T: 'A',
    A: 'U'
}

export const toRna = dnaStrand => 
  dnaStrand.split('').map(e => translation[e]).join('');
