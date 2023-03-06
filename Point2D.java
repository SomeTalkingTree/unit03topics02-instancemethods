public class Point2D {
    private double getpointX;
    private double setpointX;
    private double getpointY;
    private double setpointY;


    public Point2D(double getpointx,double getpointy,double setpointx,double setpointy){
        getpointX=getpointx;
        getpointY=getpointy;
        setpointX=setpointx;
        setpointY=setpointy;
    }

    public double getpointx(){
        return getpointX;
    }public double getpointy(){
        return getpointY;
    }public double setpointx(){
        return setpointX;
    }public double setpointy(){
        return setpointY;
    }


    public double distanceTo(){
        double answer =0;
        answer = Math.sqrt(((getpointX-setpointX)*(getpointX-setpointX))+((getpointY-setpointY)*(getpointY-setpointY)));
        return answer;
    }
    public String toString(){
        String text = "";
        String num =""; 
        num+=distanceTo();
        double disx = getpointX-setpointX;
        double disy = getpointY-setpointY;
        text= "The is distance is "+num+" while the graph would be ("+disx+","+disy+").";
        return text;
    }

    public static void main(String[] args) {
        Point2D d1 = new Point2D(5,15,12,2);
        Point2D d2 = new Point2D(6,2,20,16);
        Point2D d3 = new Point2D(4,9,15,64);

        Point2D[] allPoint2ds = new Point2D[]{d1,d2,d3};
        for(Point2D points:allPoint2ds){
            System.out.println(points);
        } 
        
    }



}
// javac Point2D.java; java Point2D