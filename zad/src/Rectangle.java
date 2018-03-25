// ustaw warunek o wartości większą/mniejsza w seterach!!! na stronie 317
public class Rectangle {
    private float length;
    private float width;
    float area;
    float perimeter;


    /*public void check(){
        setLength((float) 12.0);
        setWidth((float) 4.0);

        if (length > 0.0 && length < 20.00 && width > 0.0 && width < 20.00) {
            calculateArea();
            calculatePerimeter();
            returnValues();
        } else {
            System.out.println("Błędne dane");
        }
    }*/


    public void calculateArea(){
            area = getLength()*getWidth();
    }

    public void calculatePerimeter(){
            perimeter = 2*getLength() + 2*getWidth();
    }


    public void setLength(float length){

        if (length > 0.0 && length < 20.00){
            this.length = length;

        }else{
            throw new IllegalArgumentException(
                    "length is out of range");
        }

    }
    public void setWidth(float width){
        if (width > 0.0 && width < 20.00){
            this.width = width;

        }else{
            throw new IllegalArgumentException(
                    "width is  out of range");
        }

    }
    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    public float getArea(){
        return area;
    }
    public float getPerimeter(){
        return perimeter;
    }
    public void returnValues(){
        System.out.println("Rectangle area is: " + getArea());
        System.out.println("Rectangle perimeter is "+ getPerimeter());
    }



}
