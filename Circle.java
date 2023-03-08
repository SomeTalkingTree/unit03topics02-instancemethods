public class Circle {
    private double centerofcircle;
    private double radiusofcircle;


    public double RadiusofCircle(){
        return radiusofcircle;
    }
    public double CenterofCircle(){
        return centerofcircle;
    }
    public Bigcircle(double CenterofCircle,double RadiusofCircle){
        radiusofcircle=RadiusofCircle;
        centerofcircle=CenterofCircle;    
        
    }

    
    
    public double areaof(){
        double answer =0;
        answer=Math.PI*(radiusofcircle*radiusofcircle);
        return answer;
    }
    public double getCircumference(){
        double answer =0;
        answer= Math.PI*2*radiusofcircle;
        return answer;
    }
    public static void main(String[] args) {
        Circle d1 = new BigCircle(5,15);
        Point2D d2 = new Point2D(6,2,20,16);
        Point2D d3 = new Point2D(4,9,15,64);

        Point2D[] allPoint2ds = new Point2D[]{d1,d2,d3};
        for(Point2D points:allPoint2ds){
            System.out.println(points);
        } 
        
    }
}
