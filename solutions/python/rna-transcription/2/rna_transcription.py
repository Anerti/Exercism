def translate(nucleotide):
    if nucleotide == "":
        return nucleotide
    if nucleotide == "C" : 
        return "G"
    if nucleotide == "G" : 
        return "C"
    if nucleotide == "A" : 
        return "U"
    if nucleotide == "T" : 
        return "A"
    return TypeError("Invalid nucleotide")

def to_rna(dna_strand):
    return ''.join([ translate(nucleotide) for nucleotide in dna_strand ])

