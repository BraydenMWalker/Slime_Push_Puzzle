import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {
    // creates the side of each individual pixel, the blocks of pixels, and the map size
    public static final int PixelSize = 15;
    public static int MapX = 9;
    public static int MapY = 9;
    public static final int BlockSize = 8;

    // will decide when the program ends
    public static boolean gameOver = false;
    public static boolean reset = true;
    public static int world = 1;
    public static int level = 1;
    public static long timer = System.currentTimeMillis();

    // based on the keys pressed, this will be the direction your character moves
    public static String direction = "";

    public static void main(String[] args) throws InterruptedException {
        DrawingPanel panel = new DrawingPanel(MapX * PixelSize * BlockSize, MapY * PixelSize * BlockSize);

        int counter = 0;

        KeyListener listener = new KeyListener();
        panel.addKeyListener(listener);

        ArrayList<String> world1 = new ArrayList<>();
        ArrayList<String> world2 = new ArrayList<>();

        // World 1

        world1.add(
                        "WWWWWWWWW" +
                        "WWW   WWW" +
                        "WWW S WWW" +
                        "WWW   WWW" +
                        "WWW F WWW" +
                        "WWW   WWW" +
                        "WWW G WWW" +
                        "WWW   WWW" +
                        "WWWWWWWWW");

        world1.add(
                        "WWWWWWWWW" +
                        "W   W   W" +
                        "W S B   W" +
                        "W   W   W" +
                        "WWWWW F W" +
                        "WWWWW   W" +
                        "WWWWW G W" +
                        "WWWWW   W" +
                        "WWWWWWWWW");

        world1.add(
                        "WWWWWWWWW" +
                        "WWWWWWWWW" +
                        "WW     WW" +
                        "WW     WW" +
                        "WW FW  WW" +
                        "WW  W  WW" +
                        "WW SWG WW" +
                        "WWWWWWWWW" +
                        "WWWWWWWWW");

        world1.add(
                        "WWWWWWWWW" +
                        "WWWWWWWWW" +
                        "WSWWWWWGW" +
                        "W W W W W" +
                        "W FB B  W" +
                        "W W B W W" +
                        "W       W" +
                        "WWWWWWWWW" +
                        "WWWWWWWWW");

        world1.add(
                        "WWWWWWWWW" +
                        "WWW S WWW" +
                        "WWW   WWW" +
                        "WWWBBBWWW" +
                        "WWW   WWW" +
                        "WWWWFWWWW" +
                        "WWWW WWWW" +
                        "WWWWGWWWW" +
                        "WWWWWWWWW");

        world1.add(
                        "WWWWWWWWW" +
                        "WWWWWWWWW" +
                        "W     WWW" +
                        "W B F WWW" +
                        "WWBWW  WW" +
                        "W    BBGW" +
                        "WS     WW" +
                        "WWWWWWWWW" +
                        "WWWWWWWWW");

        world1.add(
                        "WWWWWWWWW" +
                        "WWWWWWWWW" +
                        "WW     WW" +
                        "WWBBBF WW" +
                        "WWG BS WW" +
                        "WW  B  WW" +
                        "WWWWWWWWW" +
                        "WWWWWWWWW" +
                        "WWWWWWWWW");

        world1.add(
                        "WWWWWWWWW" +
                        "WW     WW" +
                        "WW  F  WW" +
                        "WWBBBBBWW" +
                        "WW     WW" +
                        "WWBBBBBWW" +
                        "WW     WW" +
                        "WWG   SWW" +
                        "WWWWWWWWW");


        world1.add(
                        "WWWWWWWWW" +
                        "WWW W  WW" +
                        "WWW F  WW" +
                        "WWWB B WW" +
                        "WWW B BWW" +
                        "WWWB B WW" +
                        "WWW B BWW" +
                        "WWWS  GWW" +
                        "WWWWWWWWW");

        // World 2

        world2.add(
                        "WWWWWWWWWWW" +
                        "WWWWWWWWWWW" +
                        "WW   W   WW" +
                        "WW   FG  WW" +
                        "WW G W   WW" +
                        "WWWFWWWFWWW" +
                        "WW   W G WW" +
                        "WW S W   WW" +
                        "WW   W   WW" +
                        "WWWWWWWWWWW" +
                        "WWWWWWWWWWW");

        world2.add(
                        "WWWWWWWWWWW" +
                        "WWWWWWWWWWW" +
                        "WWWW W WWWW" +
                        "WWWWGWGWWWW" +
                        "WWWW W WWWW" +
                        "WWWWFWFWWWW" +
                        "WWWW W WWWW" +
                        "WWWWS  WWWW" +
                        "WWWWWWSWWWW" +
                        "WWWWWWWWWWW" +
                        "WWWWWWWWWWW");

        world2.add(
                        "WWWWWWWWWWW" +
                        "WWW  WWWWWW" +
                        "WSF  W   GW" +
                        "WWW     WWW" +
                        "WWWWWW  WWW" +
                        "WWWWWWWWWWW" +
                        "WWWWWW  WWW" +
                        "WWW     WWW" +
                        "WSF  W   GW" +
                        "WWW  WWWWWW" +
                        "WWWWWWWWWWW");

        world2.add(
                        "WW  WWWWWWW" +
                        "WW   WW  WW" +
                        "WW F B   WW" +
                        "WWW W  B WW" +
                        "WWS B W  WW" +
                        "WWWWWGWWWWW" +
                        "WWWWWWW WWW" +
                        "WWWW  WGWWW" +
                        "WS F  W   W" +
                        "WWWW      W" +
                        "WWWW  W  WW");

        world2.add(
                        "WWWWWWWWWWW" +
                        "WWWWWWWWWWW" +
                        "WW  WWG  WW" +
                        "WSFG WB  WW" +
                        "WW  W B BWW" +
                        "WWWWWB   WW" +
                        "WW       WW" +
                        "WS F WW  WW" +
                        "WW   W   WW" +
                        "WWWWWWWWWWW" +
                        "WWWWWWWWWWW");

        ArrayList<ArrayList<String>> worlds = new ArrayList<>();
        worlds.add(world1);
        worlds.add(world2);

        while(!gameOver) {
            if (world == 1) {
                MapX = 9;
                MapY = 9;
            } else {
                MapX = 11;
                MapY = 11;
            }
            panel.setSize(MapX * PixelSize * BlockSize, MapY * PixelSize * BlockSize);
            Graphics g = panel.getGraphics();

            ArrayList<Box> boxArrayList = new ArrayList<>();
            ArrayList<Wall> wallArrayList = new ArrayList<>();
            ArrayList<Floor> goalArrayList = new ArrayList<>();
            ArrayList<Floor> groundArrayList = new ArrayList<>();
            ArrayList<Friend> friendArrayList = new ArrayList<>();
            ArrayList<Slime> slimeArrayList = new ArrayList<>();

            for (int i = 0; i < MapY; i++) {
                for (int j = 0; j < MapX; j++) {
                    boxArrayList.add(new Box(BlockSize, j, i));
                    wallArrayList.add(new Wall(BlockSize, j, i));
                    goalArrayList.add(new Goal(BlockSize, j, i));
                    friendArrayList.add(new Friend(BlockSize, j, i));
                    slimeArrayList.add(new Slime(BlockSize, j, i));
                    groundArrayList.add(new Ground(BlockSize, j, i));
                }
            }

            ArrayList<Block> floors = new ArrayList<>();
            ArrayList<Block> currentGoals = new ArrayList<>();
            ArrayList<Block> blocks = new ArrayList<>();
            ArrayList<Block> refresh = new ArrayList<>();
            ArrayList<Friend> currentFriends = new ArrayList<>();
            ArrayList<Slime> currentSlimes = new ArrayList<>();

            for (int i = 0; i < worlds.get(world - 1).get(level - 1).length(); i++) {
                char num = worlds.get(world - 1).get(level - 1).charAt(i);
                if (num == 'S') {
                    blocks.add(slimeArrayList.get(i));
                    currentSlimes.add(slimeArrayList.get(i));

                    floors.add(groundArrayList.get(i));
                } else if (num == 'W') {
                    blocks.add(wallArrayList.get(i));
                } else if (num == 'B') {
                    blocks.add(boxArrayList.get(i));
                    refresh.add(boxArrayList.get(i));

                    floors.add(groundArrayList.get(i));
                } else if (num == 'F') {
                    blocks.add(friendArrayList.get(i));
                    currentFriends.add(friendArrayList.get(i));
                    refresh.add(friendArrayList.get(i));

                    floors.add(groundArrayList.get(i));
                } else if (num == 'G') {
                    floors.add(groundArrayList.get(i));

                    floors.add(goalArrayList.get(i));
                    currentGoals.add(goalArrayList.get(i));
                } else {
                    floors.add(groundArrayList.get(i));
                }
            }

            reset = false;

            print(g, floors, counter);
            print(g, blocks, counter);

            while (!reset) {
                for (Block block : blocks) {
                    if (block.getClass() != Wall.class) {
                        groundArrayList.get(block.getY() * MapY + block.getX()).draw(g, PixelSize, counter, world);
                    }
                }

                ArrayList<Integer> notMoved = new ArrayList<>();

                for (Slime currentSlime : currentSlimes) {
                    currentSlime.moved = false;
                }

                for (int i = 0; i < currentSlimes.size(); i++) {
                    Slime slime = currentSlimes.get(i);

                    action(blocks, slime);

                    if (!slime.moved) {
                        notMoved.add(i);
                    }
                }

                while(!notMoved.isEmpty()) {
                    for (Integer integer : notMoved) {
                        currentSlimes.get(integer).moved = false;
                    }

                    int move = notMoved.remove(0);
                    Slime slime = currentSlimes.get(move);

                    action(blocks, slime);

                    if (!slime.moved) {
                        notMoved.add(move);
                    }
                }

                print(g, currentGoals, counter);
                print(g, refresh, counter);

                for (Slime slime : currentSlimes) {
                    slime.draw(g, PixelSize, counter, world);
                    slime.setDirection("");
                }

                direction = "";

                printStrings(g);

                TimeUnit.MILLISECONDS.sleep(100);

                counter++;
                check(currentGoals, currentFriends, worlds);
            }
            panel.clear();
        }
    }

    public static void print(Graphics g, ArrayList<Block> blocks, int counter) {
        for (Block block : blocks) {
            block.draw(g, PixelSize, counter, world);
        }
    }

    public static void printStrings(Graphics g) {

    }

    public static void action(ArrayList<Block> blocks, Slime slime) {
        if (!direction.equals("")) {
            slime.setDirection(direction);
        }

        slime.moved = CheckBlockType(blocks, slime, 1).getClass() != Slime.class || CheckBlockType(blocks, slime, 1).moved;

        if (CheckBlockType(blocks, slime, 1).getClass() == Box.class || CheckBlockType(blocks, slime, 1).getClass().getSuperclass() == Box.class) {
            slime.moved = CheckBlockType(blocks, slime, 2).getClass() != Slime.class || CheckBlockType(blocks, slime, 2).moved;
        }

        switch (slime.getDirection()) {
            case "up":
                if (slime.getY() == 0) {

                } else if (checkBlocks(blocks, slime, 1)) {
                    if (CheckBlockType(blocks, slime, 1).getY() != 0 && !checkBlocks(blocks, slime, 2)) {
                        if (CheckBlockType(blocks, slime, 1).getClass() == Box.class || CheckBlockType(blocks, slime, 1).getClass().getSuperclass() == Box.class) {
                            CheckBlockType(blocks, slime, 1).setY(CheckBlockType(blocks, slime, 1).getY() - 1);
                            slime.setY(slime.getY() - 1);
                        }
                    }
                } else {
                    slime.setY(slime.getY() - 1);
                }
                break;
            case "left":
                if (slime.getX() == 0) {

                } else if (checkBlocks(blocks, slime, 1)) {
                    if (CheckBlockType(blocks, slime, 1).getX() != 0 && !checkBlocks(blocks, slime, 2)) {
                        if (CheckBlockType(blocks, slime, 1).getClass() == Box.class || CheckBlockType(blocks, slime, 1).getClass().getSuperclass() == Box.class) {
                            CheckBlockType(blocks, slime, 1).setX(CheckBlockType(blocks, slime, 1).getX() - 1);
                            slime.setX(slime.getX() - 1);
                        }
                    }
                } else {
                    slime.setX(slime.getX() - 1);
                }
                break;
            case "down":
                if (slime.getY() == (MapY - 1)) {

                } else if (checkBlocks(blocks, slime, 1)) {
                    if (CheckBlockType(blocks, slime, 1).getY() != (MapY - 1) && !checkBlocks(blocks, slime, 2)) {
                        if (CheckBlockType(blocks, slime, 1).getClass() == Box.class || CheckBlockType(blocks, slime, 1).getClass().getSuperclass() == Box.class) {
                            CheckBlockType(blocks, slime, 1).setY(CheckBlockType(blocks, slime, 1).getY() + 1);
                            slime.setY(slime.getY() + 1);
                        }
                    }
                } else {
                    slime.setY(slime.getY() + 1);
                }
                break;
            case "right":
                if (slime.getX() == (MapX - 1)) {

                } else if (checkBlocks(blocks, slime, 1)) {
                    if (CheckBlockType(blocks, slime, 1).getX() != (MapX - 1) && !checkBlocks(blocks, slime, 2)) {
                        if (CheckBlockType(blocks, slime, 1).getClass() == Box.class || CheckBlockType(blocks, slime, 1).getClass().getSuperclass() == Box.class) {
                            CheckBlockType(blocks, slime, 1).setX(CheckBlockType(blocks, slime, 1).getX() + 1);
                            slime.setX(slime.getX() + 1);
                        }
                    }
                } else {
                    slime.setX(slime.getX() + 1);
                }
                break;
        }
    }

    public static void check(ArrayList<Block> currentGoals, ArrayList<Friend> currentFriends, ArrayList<ArrayList<String>> worlds) {
        int goalsAchieved = 0;
        for (Block currentGoal : currentGoals) {
            for (Friend currentFriend : currentFriends) {
                if (currentGoal.getX() == currentFriend.getX() && currentGoal.getY() == currentFriend.getY()) {
                    goalsAchieved++;
                }
            }
        }

        if (goalsAchieved == currentFriends.size()) {
            reset = true;

            if (level < worlds.get(world - 1).size()) {
                level++;
            } else {
                System.out.print("World ");
                System.out.print(world);
                System.out.println(":");

                System.out.print(((System.currentTimeMillis() - timer) / 60000) % 60);
                System.out.print(":");
                if (((System.currentTimeMillis()-timer) / 1000) % 60 < 10) {
                    System.out.print(0);
                }
                System.out.print(((System.currentTimeMillis()-timer) / 1000) % 60);
                System.out.print(".");
                System.out.print((System.currentTimeMillis()-timer) % 1000);
                System.out.println();

                level = 1;
                world++;
            }
        }
    }

    public static boolean checkBlocks(ArrayList<Block> blocks, Block sprite, int distance) {
        for (Block block : blocks) {
            if (direction.equals("up") && block.getY() + distance == sprite.getY() && block.getX() == sprite.getX()) {
                return true;
            }
            if (direction.equals("left") && block.getX() + distance == sprite.getX() && block.getY() == sprite.getY()) {
                return true;
            }
            if (direction.equals("down") && block.getY() - distance == sprite.getY() && block.getX() == sprite.getX()) {
                return true;
            }
            if (direction.equals("right") && block.getX() - distance == sprite.getX() && block.getY() == sprite.getY()) {
                return true;
            }
        }
        return false;
    }

    public static Block CheckBlockType(ArrayList<Block> blocks, Block block, int distance) {
        for (Block block1 : blocks) {
            if (direction.equals("up") && block1.getY() + distance == block.getY() && block1.getX() == block.getX()) {
                return block1;
            }
            if (direction.equals("left") && block1.getX() + distance == block.getX() && block1.getY() == block.getY()) {
                return block1;
            }
            if (direction.equals("down") && block1.getY() - distance == block.getY() && block1.getX() == block.getX()) {
                return block1;
            }
            if (direction.equals("right") && block1.getX() - distance == block.getX() && block1.getY() == block.getY()) {
                return block1;
            }
        }
        return blocks.get(0);
    }

    // waits for wasd to be pressed which will move your character
    public static class KeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent event) {
            int code = event.getKeyCode();
            if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
                direction = "up";
            } else if (code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT) {
                direction = "left";
            } else if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                direction = "down";
            } else if (code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT) {
                direction = "right";
            } else if (code == KeyEvent.VK_R) {
                reset = true;
            }
        }
    }
}