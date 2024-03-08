package Tutorial6.Shape;

abstract public  class Shape2D implements Shape2DCalculation {
    private Colors colors;
    private boolean filled;
    private Point2D position;

    Shape2D(){
        this.colors = Colors.WHITE;
        this.filled = false;
        this.position = new Point2D();
    }

    Shape2D(Point2D position){
        this(); //cons: will an extra Point2D method which is then discarded
                //pro: re-use the code to initialize color and filled
        this.position = position;
    }

    Shape2D(Colors colors, boolean filled, Point2D position){
        this.colors = colors;
        this.filled = filled;
        this.position = position;
    }

    public Colors getColor(){
        return colors;
    }
    
    public void setColors(Colors colors){
        this.colors = colors;
    }

    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Point2D getPosition(){
        return position;
    }

    public void setPosition(Point2D position){
        this.position = position;
    }

    public String toString(){
        return "";
    }
}
