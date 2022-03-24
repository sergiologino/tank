public class Tank {

    int x;
    int y;
    int d;
    int fuel;

    public Tank(){
        x=0;
        y=0;
        d=1;
        fuel=100;
    }
    public Tank(int x, int y) {
        this();
        x = x;
        y = y;
    }
    public Tank(int x, int y, int fuel){
        this(x,y);
        fuel=fuel;
    }
    public void turnRight(){
        if (d != 4)
            d += 1;
        else d = 1;
    }
    public void turnLeft(){
        if (d != 1)
            d -= 1;
        else d = 4;
    }
    public void goForward(int i) {
        switch (d)
        {
            case 1:
                x += i;
                break;
            case 2:
                y += i;
                break;
            case 3:
                x -= i;
                break;
            case 4:
                y -= i;
                break;
        }
    }
    public void printPosition() {
        System.out.println("The Tank is at " + x + ","+y+" now.");
    }
    public void goBackward(int i) {
        goForward(-i);
    }
}
