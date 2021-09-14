public class Main {
    public static void main(String[] args)
    {
       Rabbit rabbit = new Rabbit(9, 3);
       Snake snake = new Snake(4, 8);

       System.out.println(rabbit.toString());
       System.out.println(snake.toString());
       rabbit.moveUp();
       snake.moveDown();
       System.out.println(rabbit.toString());
       System.out.println(snake.toString());
       rabbit.moveRight();
       snake.moveDown();
       System.out.println(rabbit.toString());
       System.out.println(snake.toString());
       rabbit.moveUp();
       snake.moveRight();
       System.out.println(rabbit.toString());
       System.out.println(snake.toString());
       rabbit.moveLeft();
       snake.moveRight();
       System.out.println(rabbit.toString());
       System.out.println(snake.toString());
       rabbit.moveLeft();
       snake.moveDown();
       System.out.println(rabbit.toString());
       System.out.println(snake.toString());
       rabbit.moveDown();
       snake.moveRight();
       System.out.println(rabbit.toString());
       System.out.println(snake.toString());
       rabbit.moveLeft();
       snake.moveDown();
       System.out.println(rabbit.toString());
       System.out.println(rabbit.scream());
       System.out.println(snake.toString());
       System.out.println(snake.kill());


    }
}
