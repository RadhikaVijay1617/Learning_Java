package Z_Exercises;

public class CODEpRACTICE {

    static public void main(String[] args) {
        int a[]={30,40,23,45,99,123,345};
        int max = a[0];

        for (int i=1; i<a.length; i++){
            if (a[i]>max)
                max = a[i];
        }
        System.out.println("maximum number:" + max);

    }
}

