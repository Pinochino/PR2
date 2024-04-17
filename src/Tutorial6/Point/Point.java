public class Point {
   private float x;
   private float y;


   
   public Point() {
      this.x = 0.0f;
      this.y = 0.0f;
      System.out.println("Point() involked...");
   } 

   Point(float x, float y) {
      this.x = x;
      this.y = y;
   }

   public float getX() {
      return x;
   }

   public void setX(float x) {
      this.x = x;
   }

   public float getY() {
      return y;
   }

   public void setY(float y) {
      this.y = y;
   }

   public void setXY(float x, float y) {
      this.x = x;
      this.y = y;
   }

   public float[] getXY() {
      // float[] point = {this.x, this.y};
      // return point;
      return new float[]{x, y};
   }

   public String toString(){
      return "(" + x + " ," + y + ")";
   }

}
