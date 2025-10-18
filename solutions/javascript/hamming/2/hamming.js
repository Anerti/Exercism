export const compute = (firstDnaStrand, lastDnaStrand) => {
    if (firstDnaStrand.length !== lastDnaStrand.length) 
      throw new Error("strands must be of equal length");
    return firstDnaStrand.split('').filter((e, i) => e !== lastDnaStrand[i]).length;
};