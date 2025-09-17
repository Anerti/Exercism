class IsogramChecker {

    boolean isIsogram(String phrase) {
        String[] temp = phrase.toLowerCase().split("");
        boolean result = true;
        for (int i = 0; i < temp.length; i++)
        {
            if (i == temp.length - 1)
            {
                break;
            }
            for (int j = i + 1; j < temp.length; j++)
            {
                if (temp[i].equals(temp[j]) && !temp[i].equals(" ") && !temp[i].equals("-"))
                {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
