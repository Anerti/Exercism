import re


def valid_nucleotide(nucleotide):
    return nucleotide in ['A', 'C', 'G', 'T', '']

def distance(strand_a, strand_b):
    if len(strand_a) != len(strand_b):
        raise ValueError("Strands must be of equal length.")

    if re.findall('[^ATCG]', strand_a) or re.findall('[^ATCG]', strand_b):
        raise TypeError("Invalid nucleotide.")

    return len([ nucleotide_a for nucleotide_a, nucleotide_b in zip(strand_a, strand_b)
             if nucleotide_a != nucleotide_b ])
