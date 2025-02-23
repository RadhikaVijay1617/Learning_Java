package ControlStructures;

public class BreakStatementInForLoop {
    public static void main(String[] args) {
        //ForLoopBreakEx1();
        //ForLoopBreakEx2();
    }
//Need to skip at number10
    public static void ForLoopBreakEx1() {
        for (int i = 0; i <= 20; i++) {
            if (i == 10) {
                continue;
            }
            System.out.println(i);

        }
    }
    //Need to skip at number3, 5 and 7
    public static void ForLoopBreakEx2() {
        for (int i = 0; i <= 20; i++) {
            if (i == 3 || i==5 || i==7) {
                continue;
            }
            System.out.println(i);

        }
    }
}
