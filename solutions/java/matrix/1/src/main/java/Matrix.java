import java.util.List;

class Matrix {
    private final String matrixAsString;
    Matrix(String matrixAsString) {
        this.matrixAsString = matrixAsString;
    }

    int[] getRow(int rowNumber) {
        List<String> data = List.of(this.matrixAsString.split("\n")[rowNumber - 1].split(" "));
        if (rowNumber - 1> data.size()) throw new IllegalArgumentException("Index Error");;

        int[] output = new int[data.size()];

        for (int i = 0; i < data.size(); i++)
            output[i] = Integer.parseInt(data.get(i));
        return output;
    }

    int[] getColumn(int columnNumber) {
        List<String> data = List.of(this.matrixAsString.split("\n"));
        if (columnNumber - 1> data.size()) throw new IllegalArgumentException("Index Error");

        int [] output = new int[data.size()];

        for (int i = 0; i < data.size(); i++)
            output[i] = Integer.parseInt(data.get(i).split(" ")[columnNumber - 1]);
        return output;
    }
}
