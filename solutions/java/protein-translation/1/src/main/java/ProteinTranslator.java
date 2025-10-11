import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {
    String verifyCodon(String codon){
        return codon.equals("AUG") ? "Methionine"
                : codon.equals("UUU") || codon.equals("UUC") ? "Phenylalanine"
                : codon.equals("UUA") || codon.equals("UUG") ? "Leucine"
                : codon.equals("UCU") || codon.equals("UCC") || codon.equals("UCA") || codon.equals("UCG") ? "Serine"
                : codon.equals("UAU") || codon.equals("UAC") ? "Tyrosine"
                : codon.equals("UGU") || codon.equals("UGC") ? "Cysteine"
                : codon.equals("UGG") ? "Tryptophan"
                : codon.equals("UAA") || codon.equals("UAG") || codon.equals("UGA") ? "STOP"
                : codon.isEmpty() ? codon
                : null;
    }

    List<String> codonList(String rnaSequence){
        List<String> codonList = new ArrayList<>();
        StringBuilder codon = new StringBuilder();

        for (String c : rnaSequence.split("")) {
            codon.append(c);
            if (codon.length() == 3) {
                codonList.add(codon.toString());
                codon = new StringBuilder();
            }
        }
        if (!codon.isEmpty()) codonList.add(codon.toString());
        return codonList;
    }

    List<String> translate(String rnaSequence) {
        List<String> codonTranslation = new ArrayList<>();
        for (String codon : codonList(rnaSequence)) {
            String aminoAcid = verifyCodon(codon);

            if (aminoAcid == null) throw new IllegalArgumentException("Invalid codon");
            if (aminoAcid.equals("STOP")) break;
            codonTranslation.add(aminoAcid);
        }
        return codonTranslation;
    }
}