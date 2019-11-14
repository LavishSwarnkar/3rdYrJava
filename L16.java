//Rectangle Class

class L16 {

    static class Rectangle{
        private double width, length, area;
        private String color;

        Rectangle(double width, double length, String color) {
            this.width = width;
            this.length = length;
            this.color = color;
        }

        double getWidth() {
            return width;
        }

        double getLength() {
            return length;
        }

        double findArea(){
            area = width * length;
            return area;
        }

        String getColor() {
            return color;
        }
    }

    public static void main(String args[]){
        Rectangle r1 = new Rectangle(7, 5, "Red")
                , r2 = new Rectangle(5, 7, "Red");

        System.out.print(r1.findArea() == r2.findArea()
                && r1.getColor().equals(r2.getColor()) ?
                "Matching rectangles" : "Non-Matching rectangles");
    }
}