package j01001;

public class Rectangle {
    private int height;
    private int width;
    private int parameter;
    private int area;
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        if (height <= 0 || width <= 0) {
            parameter = 0;
            area = 0;
        } else {
            parameter = (height + width) * 2;
            area = height * width;
        }
    }

    public int getParameter() {
        return parameter;
    }
    public int getArea() {
        return area;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
}
