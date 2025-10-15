import java.util.ArrayList;
import java.util.List;


class ProteinTranslator {
    String verifyCodon(String codon){
        return switch (codon) {
            case "AUG" -> "Methionine";
            case "UUU", "UUC" -> "Phenylalanine";
            case "UUA", "UUG" -> "Leucine";
            case "UCU", "UCC", "UCA", "UCG" -> "Serine";
            case "UAU", "UAC" -> "Tyrosine";
            case "UGU", "UGC" -> "Cysteine";
            case "UGG" -> "Tryptophan";
            case "UAA", "UAG", "UGA" -> "STOP";
            case "" -> codon;
            default -> throw new IllegalArgumentException("Invalid codon");
        };
    }

    List<String> codonList(String rnaSequence){
        List<String> codonList = new ArrayList<>();
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            if (i + 3 < rnaSequence.length()) codonList.add(rnaSequence.substring(i, i + 3));
            else codonList.add(rnaSequence.substring(i));
        }
        return codonList;
    }

    List<String> translate(String rnaSequence) {
        List<String> codonTranslation = new ArrayList<>();

        for (String codon : codonList(rnaSequence)) {
            String aminoAcid = verifyCodon(codon);
            if (aminoAcid.equals("STOP")) break;
            codonTranslation.add(aminoAcid);
        }
        return codonTranslation;
    }
}