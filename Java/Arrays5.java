public class Arrays5 {
  public static void main(String[] args) {
    // Vamos criar um bi-array
    // em cada indice do array ele vai guardar referencia do sub-array

    int[][] dias = new int[2][2]; // estou dizendo que o array tira 2 índices e o sub-array tera 2 índices
    dias[0][0] = 28;
    dias[0][1] = 29;
    dias[1][0] = 30;
    dias[1][1] = 31;
    for (int i = 0; i < dias.length; i++){
      for (int j = 0; j < dias[i].length; j++){
        System.out.println(dias[i][j]); // estou mostrando os valores dos dois sub-arrays
      }
    }
    System.out.println("Abaixo utilizando forInt\n");
    for(int[] ref : dias){
      for (int aux : ref){
        System.out.println(aux);
      }
    }
  }
}
