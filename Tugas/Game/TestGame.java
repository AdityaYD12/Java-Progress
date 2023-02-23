public class TestGame {
    public static void main(String[] args)
    {
        //player
        GamePlayer GamePlayerAdit = new GamePlayer();
        GamePlayerAdit.setDimension(20, 10);
        GamePlayerAdit.setPosition(50, 20);
        System.out.println("Width : " + GamePlayerAdit.getWidth());
        System.out.println("Height : " + GamePlayerAdit.getHeight());
        System.out.println("X Position : " + GamePlayerAdit.getX());
        System.out.println("Y Position : " + GamePlayerAdit.getY());
        GamePlayerAdit.Run(30,20);

        System.out.println(" ");

        //enemy
        GameEnemy GameEnemyAnjing = new GameEnemy();
        GameEnemyAnjing.setDimension(10, 10);
        GameEnemyAnjing.setPosition(30, 25);
        System.out.println("Width : " + GameEnemyAnjing.getWidth());
        System.out.println("Height : " + GameEnemyAnjing.getHeight());
        System.out.println("X Position : " + GameEnemyAnjing.getX());
        System.out.println("Y Position : " + GameEnemyAnjing.getY());
        GameEnemyAnjing.Run();
    }
}
