public class Snake {
    private String NAME = "Snake";
    private int x;
    private int y;

    public Snake(int x, int y)
    {
        this.setX(x);
        this.setY(y);
    }

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

    public String toString()
    {
        return "I am the evil " + NAME + ", I am now standing on square " + x + " , " + y + ".";
    }

/*    public void moveLeft() {
        if (this.x <= 9) {
            ++x;
        } else {
            System.out.println("Move is outside of the field! Try again.");
        }
    }

    public void moveRight() {
        if (this.x >= 2) {
            --x;
        } else {
            System.out.println("Move is outside of the field! Try again.");
        }
    }

    public void moveUp() {
        if (this.y <=9) {
            ++y;
        } else {
            System.out.println("Move is outside of the field! Try again.");
        }
    }

    public void moveDown() {
        if (this.y >=2) {
            --y;
        } else {
            System.out.println("Move is outside of the field! Try again.");
        }
    }*/

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

    public String kill()
    {
        return "Aaarrhh I´m eating you ha ha ha!";
    }
}
