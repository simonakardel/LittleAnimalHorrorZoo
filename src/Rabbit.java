public class Rabbit {
    // x and y are location on the x, y axes
    private String NAME = "Rabbit";
    private int x;
    private int y;

    // constructor with starting points of the rabbit
    public Rabbit(int x, int y)
    {
        this.setX(x);
        this.setY(y);
    }

    // setters for x and y location
    public void setX(int newX)
    {
        x = newX;
    }

    public void setY(int newY)
    {
        y = newY;
    }

    // getter for x location
    public int getX()
    {
        return x;
    }

    // getter for y location
    public int getY()
    {
        return y;
    }

    // prints the current position
    public String toString()
    {
        return "I am the nice " + NAME + ", I am now standing on square " + x + " , " + y + ".";
    }

    // move methods, using if to detect whether move is outside of the field(10x10)
    public void moveLeft()
    {
        if (this.x >= 2) {
            --x;
        } else {
            System.out.println("Move is outside of the field! Try again.");
        }
    }

    public void moveRight()
    {
        if (this.x <= 9) {
            ++x;
        }
        else {
            System.out.println("Move is outside of the field! Try again.");
        }
    }

    public void moveUp()
    {
        if (this.y <= 9) {
            ++y;
        }
        else {
            System.out.println("Move is outside of the field! Try again.");
        }
    }

    public void moveDown()
    {
        if (this.y >= 2) {
            --y;
        }
        else {
            System.out.println("Move is outside of the field! Try again.");
        }
    }

    public String scream()
    {
        return "Nooo, please don´t eat me!";
    }
}