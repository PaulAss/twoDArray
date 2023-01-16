class Main {
  public static void main(String[] args) {
   int [] fap = {3,7,90};
    System.out.println(fap[1]);
//intefer
    int[][] pack = {
      {4,10,70},
      {9,1},
      {56,5,30}
   
    };
    System.out.println(pack[1][1]);
    System.out.println(pack[2][0]);
    System.out.println(pack[0][0]);
    System.out.println(pack[0][2]);
//text
    String[][] text = new String[2][3]; //2D array of references to strings
    System.out.println(text[0][1]);

    text[0][0]="Hi there";
    text[0][1]="How are you?";
    text[0][2]="Happy to hear";
    
    
  }
}