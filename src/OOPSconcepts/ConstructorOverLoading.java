package OOPSconcepts;

public class ConstructorOverLoading {
    double width, height, depth;

    ConstructorOverLoading()
    {
        width = 10;
        height = 5;
        depth = 2;
    }

    ConstructorOverLoading(double a, double b, double c)
    {
        this.width = a;
        this.height = b;
        this.depth = c;
    }

    ConstructorOverLoading(double d)
    {
        depth = d;
    }

    double CalculateBox()
    {
        return(width * height * depth);

    }
    void CalculateBox2()
    {
        System.out.println(depth);

    }
}