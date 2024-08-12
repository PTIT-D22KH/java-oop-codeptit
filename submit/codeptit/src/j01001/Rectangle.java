package j01001;

public class Rectangle {
    private long height;
    private long width;
    private long parameter;
    private long area;
    public Rectangle(long height, long width) {
        this.height = height;
        this.width = width;
        parameter = (height + width) * 2;
        area = height * width;

    }

    public long getParameter() {
        return parameter;
    }
    public long getArea() {
        return area;
    }

    // public int getHeight() {
    //     return height;
    // }

    // public int getWidth() {
    //     return width;
    // }
    
}
