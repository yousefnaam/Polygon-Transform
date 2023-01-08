public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

    double[] array2 = new double[array.length]; 

    for(int i = 0; i < array2.length; i++)
    {
        array2[i] = array[i];
    }
    return array2;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

    // WRITE YOUR CODE HERE

    for(int i = 0; i < x.length; i++)
    {
        x[i] *= alpha;
        y[i] *= alpha;
    }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

    // WRITE YOUR CODE HERE
    for(int i = 0; i < x.length; i++)
    {
        x[i] += dx;
        y[i] += dy;
    }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

        double rad = Math.toRadians(theta);
        for(int i = 0; i < x.length; i++)
        {
            double temp = x[i];
            x[i] = x[i]*Math.cos(rad) - y[i]*Math.sin(rad);
            y[i] = y[i]*Math.cos(rad) + temp*Math.sin(rad);
        }

    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double alpha = 2.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        scale(x, y, alpha); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);


        StdDraw.setScale(-5.0, +5.0); 


double dx = 2.0, dy = 1.0; 
StdDraw.setPenColor(StdDraw.RED); 
StdDraw.polygon(x, y); 
translate(x, y, dx, dy); 
StdDraw.setPenColor(StdDraw.BLUE);
StdDraw.polygon(x, y);

StdDraw.setScale(-5.0, +5.0); 
 
double theta = 45.0; 
StdDraw.setPenColor(StdDraw.RED); 
StdDraw.polygon(x, y); 
rotate(x, y, theta); 
StdDraw.setPenColor(StdDraw.BLUE);
StdDraw.polygon(x, y);
    }
}
}
