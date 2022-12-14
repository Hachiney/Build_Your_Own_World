package byow.TileEngine;

import java.awt.Color;

/**
 * Contains constant tile objects, to avoid having to remake the same tiles in different parts of
 * the code.
 *
 * You are free to (and encouraged to) create and add your own tiles to this file. This file will
 * be turned in with the rest of your code.
 *
 * Ex:
 *      world[x][y] = Tileset.FLOOR;
 *
 * The style checker may crash when you try to style check this file due to use of unicode
 * characters. This is OK.
 */

public class Tileset {

    public static final TETile AVATAR = new TETile('@', Color.white, Color.black, "You");
    public static final TETile WALL = new TETile('|', new Color(216, 128, 128), Color.darkGray,
            "Wall");
    public static final TETile FLOOR = new TETile('·', new Color(128, 192, 128), new Color(0, 0, 31),
            "Floor");
    public static final TETile NOTHING = new TETile(' ', Color.black, Color.black, "Nothing");
    public static final TETile GRASS = new TETile('"', Color.green, Color.black, "Grass");
    public static final TETile WATER = new TETile('≈', Color.blue, Color.black, "Water");
    public static final TETile FLOWER = new TETile('❀', Color.magenta, Color.pink, "Flower");
    public static final TETile LOCKED_DOOR = new TETile('█', Color.gray, Color.black,
            "Locked door");
    public static final TETile UNLOCKED_DOOR = new TETile('▢', Color.orange, Color.black,
            "Unlocked door");
    public static final TETile SAND = new TETile('▒', Color.yellow, Color.black, "Sand");
    public static final TETile MOUNTAIN = new TETile('▲', Color.gray, Color.black, "Mountain");
    public static final TETile TREE = new TETile('♠', Color.green, Color.black, "Tree");

    /** Added TETileSets **/
    public static final TETile LIGHT = new TETile('⬤', Color.gray, new Color(0, 0, 51),
            "Light");
    public static final TETile LIGHT1 = new TETile('⬤', Color.gray, new Color(0, 0, 180, 240),
            "Light");
    public static final TETile FLOOR2 = new TETile('·', new Color(128, 192, 128),
            new Color(0, 0, 155, 230), "Floor");
    public static final TETile FLOOR3 = new TETile('·', new Color(128, 192, 128),
            new Color(0, 0, 150, 200), "Floor");
    public static final TETile FLOOR4 = new TETile('·', new Color(128, 192, 128),
            new Color(0, 0, 110, 200), "Floor");



    /** Avatar Appearance Options **/
    public static final TETile STAR = new TETile('☆', Color.ORANGE, Color.black, "You");
    public static final TETile BOX = new TETile('▣', Color.YELLOW, Color.black, "You");
    public static final TETile HEART = new TETile('♥', Color.RED, Color.black, "You");


}