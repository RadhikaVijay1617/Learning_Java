package Arrays;

public class SearchingElementInArray {
    public static void main(String[] args) {
        //SearchElement1();
        SearchElement2();
    }
    //Normal For loop
    public static void SearchElement1() {
        int[] a = {10, 20, 30, 40, 50};
        int search_element = 30;
        boolean status = false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == search_element) {
                System.out.println("Element Found");
                status = true;
                break;
            }
        }
        if (status == false) {
            System.out.println("Element Not Found");
        }
    }
        //Enhanced For loop
        public static void SearchElement2() {
            int[] a1 = {10, 20, 30, 40, 50, 50};
            int search_element2 = 90;
            boolean status1 = false;

            for (int x:a1){
                if(x==search_element2){
                    System.out.println("Element Found");
                    status1=true;
                    break;
                }
            }
            if(status1==false){
                System.out.println("Element Not Found");
            }

        }
    }


