public class Exercise11 {

    public static void main(String[] args){

        String word1 = "piece", word2 = "peace";
        
        int distance = calculatesLevenshteinDistance(word1, word2);
        System.out.println("Levenshtein distance between \"" + word1 + "\" e \""
                + word2 + "\" : " + distance);

    }

    public static int calculatesLevenshteinDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        int[][] matrixDistance = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++){
            matrixDistance[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {
            matrixDistance[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    matrixDistance[i][j] = matrixDistance[i -1][j - 1];
                }else {
                    int delete = matrixDistance[i - 1][j] + 1;
                    int insert = matrixDistance[i][j - 1] + 1;
                    int substitute = matrixDistance[i - 1][j - 1] + 1;

                    matrixDistance[i][j] = Math.min(Math.min(delete, insert),substitute);
                }
            }
        }

        return matrixDistance[m][n];

    }
}
