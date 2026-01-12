def translate(nucleotide):
    match nucleotide:
        case "" : return nucleotide
        case "C" : return "G"
        case "G" : return "C"
        case "A" : return "U"
        case "T" : return "A"
        case _ : return TypeError("Invalid nucleotide")

def to_rna(dna_strand):
    return ''.join([ translate(nucleotide) for nucleotide in dna_strand ])

