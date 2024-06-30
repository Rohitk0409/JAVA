public class pattern {
  // *****
  // *****
  // *****
  // *****
  public static void Print1() {
    for (int row = 1; row <= 4; row++) {
      for (int col = 1; col <= 5; col++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  // *****
  // *---*
  // *---*
  // *****
  public static void print2() {
    for (int row = 1; row <= 4; row++) {
      for (int col = 1; col <= 5; col++) {
        if (row == 1 || row == 4 || col == 1 || col == 5) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  // *
  // **
  // ***
  // ****
  public static void Print3() {
    for (int r = 1; r <= 4; r++) {
      for (int c = 1; c <= r; c++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  // ---*
  // --**
  // -***
  // ****
  public static void Print4() {
    for (int r = 1; r <= 4; r++) {
      for (int c = 1; c <= 4 - r; c++) {
        System.out.print(" ");
      }
      for (int c = 1; c <= r; c++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  // 1 2 3 4 5
  // 1 2 3 4
  // 1 2 3
  // 1 2
  // 1
  public static void Print5() {
    for (int r = 1; r <= 5; r++) {
      for (int c = 1; c <= 6 - r; c++) {
        System.out.print(c + " ");
      }
      System.out.println("");
    }
  }

  // 1
  // 2 3
  // 4 5 6
  // 7 8 9 1 0
  public static void Print6() {
    int count = 1;
    for (int r = 1; r <= 5; r++) {
      for (int c = 1; c <= r; c++) {
        System.out.print(count + " ");
        count++;
      }
      System.out.println("");
    }
  }

  // 1
  // 1 0
  // 0 1 0
  // 1 0 1 0
  // 0 1 0 1 0
  public static void Print7() {
    for (int r = 1; r <= 5; r++) {
      for (int c = 1; c <= r; c++) {
        if ((r + c) % 2 == 0) {
          System.out.print("1" + " ");
        } else {
          System.out.print("0" + " ");
        }
      }
      System.out.println("");
    }
  }

  // *------*
  // **----**
  // ***--***
  // ********
  // ***--***
  // **----**
  // *------*
  public static void Print8() {
    for (int r = 1; r <= 4; r++) {
      for (int c = 1; c <= r; c++) {
        System.out.print("*");
      }
      for (int c = 1; c <= (2 * (4 - r)); c++) {
        System.out.print(" ");
      }

      for (int c = 1; c <= r; c++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    for (int r = 0; r <= 3; r++) {
      for (int c = 4 - r; c >= 1; c--) {
        System.out.print("*");
      }
      for (int c = 1; c <= 2 * r; c++) {
        System.out.print(" ");
      }
      for (int c = 4 - r; c >= 1; c--) {
        System.out.print("*");
      }
      System.out.println("");
    }
    System.out.println("");
  }

  // ----*****
  // ---*****
  // --*****
  // -*****
  // *****
  public static void Print9() {
    for (int r = 1; r <= 5; r++) {
      for (int c = 1; c <= 5 - r; c++) {
        System.out.print(" ");
      }
      for (int c = 1; c <= 5; c++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    System.out.println("");
  }

  public static void print10() {
    for (int r = 1; r <= 4; r++) {
      for (int c = 1; c <= 4 - r; c++) {
        System.out.print(" ");
      }
      for (int c = 1; c <= 5; c++) {
        if (r == 4 || r == 1 || c == 1 || c == 5) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  // ---*
  // --***
  // -*****
  // *******
  // -*****
  // --***
  // ---*

  public static void Print11() {
    for (int r = 0; r <= 3; r++) {
      for (int c = 1; c <= 3 - r; c++) {
        System.out.print(" ");
      }
      for (int c = 1; c <= (2 * r + 1); c++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    for (int r = 0; r <= 4; r++) {
      for (int c = 1; c <= r + 1; c++) {
        System.out.print(" ");
      }
      for (int c = 7 - (2 * r); c > 0; c--) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  // ----1
  // ---2 2
  // --3 3 3
  // -4 4 4 4
  // 5 5 5 5 5

  public static void Print12() {
    for (int r = 1; r <= 5; r++) {
      for (int c = 1; c <= 6 - r; c++) {
        System.out.print(" ");
      }
      for (int c = 1; c <= r; c++) {
        System.out.print(r + " ");
      }
      System.out.println("");
    }
  }

  // --------1
  // ------2 1 2
  // ----3 2 1 2 3
  // --4 3 2 1 2 3 4
  // 5 4 3 2 1 2 3 4 5

  public static void Print13() {
    for (int r = 1; r <= 5; r++) {
      for (int c = 1; c <= 5 - r; c++) {
        System.out.print(" ");
      }
      for (int c = r; c > 0; c--) {
        System.out.print(c);
      }
      for (int c = 2; c <= r; c++) {
        System.out.print(c);
      }

      System.out.println("");
    }
  }

  public static void main(String[] args) {
    Print1();
    print2();
    Print4();
    Print5();
    Print6();
    Print7();
    Print8();
    Print9();
    print10();
    Print11();
    Print12();
    Print13();

  }

}
