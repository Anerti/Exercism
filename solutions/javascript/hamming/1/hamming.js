export const compute = (firstDnaStrand, lastDnaStrand) => {
    if (firstDnaStrand.length !== lastDnaStrand.length) 
      throw new Error("strands must be of equal length");
    let hamming = 0;
  
    for (let i = 0; i < firstDnaStrand.length; i++) {
        if (firstDnaStrand[i] !== lastDnaStrand[i]) hamming++;
    }
    return hamming;
};