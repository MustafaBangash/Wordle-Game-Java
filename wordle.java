import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

class game {
    private String[] wordList = {
        "ABUSE", "ADULT", "AGENT", "ANGER", "APPLE", "AWARD", "BASIS", "BEACH", "BIRTH", "BLOCK", "BLOOD", "BOARD", "BRAIN", "BREAD", "BREAK", "BROWN", "BUYER", "CAUSE", "CHAIN", "CHAIR", "CHEST", "CHIEF", "CHILD", "CHINA", "CLAIM", "CLASS", "CLOCK", "COACH", "COAST", "COURT", "COVER", "CREAM", "CRIME", "CROSS", "CROWD", "CROWN", "CYCLE", "DANCE", "DEATH", "DEPTH", "DOUBT", "DRAFT", "DRAMA", "DREAM", "DRESS", "DRINK", "DRIVE", "EARTH", "ENEMY", "ENTRY", "ERROR", "EVENT", "FAITH", "FAULT", "FIELD", "FIGHT", "FINAL", "FLOOR", "FOCUS", "FORCE", "FRAME", "FRANK", "FRONT", "FRUIT", "GLASS", "GRANT", "GRASS", "GREEN", "GROUP", "GUIDE", "HEART", "HENRY", "HORSE", "HOTEL", "HOUSE", "IMAGE", "INDEX", "INPUT", "ISSUE", "JAPAN", "JONES", "JUDGE", "KNIFE", "LAURA", "LAYER", "LEVEL", "LEWIS", "LIGHT", "LIMIT", "LUNCH", "MAJOR", "MARCH", "MATCH", "METAL", "MODEL", "MONEY", "MONTH", "MOTOR", "MOUTH", "MUSIC", "NIGHT", "NOISE", "NORTH", "NOVEL", "NURSE", "OFFER", "ORDER", "OTHER", "OWNER", "PANEL", "PAPER", "PARTY", "PEACE", "PETER", "PHASE", "PHONE", "PIECE", "PILOT", "PITCH", "PLACE", "PLANE", "PLANT", "PLATE", "POINT", "POUND", "POWER", "PRESS", "PRICE", "PRIDE", "PRIZE", "PROOF", "QUEEN", "RADIO", "RANGE", "RATIO", "REPLY", "RIGHT", "RIVER", "ROUND", "ROUTE", "RUGBY", "SCALE", "SCENE", "SCOPE", "SCORE", "SENSE", "SHAPE", "SHARE", "SHEEP", "SHEET", "SHIFT", "SHIRT", "SHOCK", "SIGHT", "SIMON", "SKILL", "SLEEP", "SMILE", "SMITH", "SMOKE", "SOUND", "SOUTH", "SPACE", "SPEED", "SPITE", "SPORT", "SQUAD", "STAFF", "STAGE", "START", "STATE", "STEAM", "STEEL", "STOCK", "STONE", "STORE", "STUDY", "STUFF", "STYLE", "SUGAR", "TABLE", "TASTE", "TERRY", "THEME", "THING", "TITLE", "TOTAL", "TOUCH", "TOWER", "TRACK", "TRADE", "TRAIN", "TREND", "TRIAL", "TRUST", "TRUTH", "UNCLE", "UNION", "UNITY", "VALUE", "VIDEO", "VISIT", "VOICE", "WASTE", "WATCH", "WATER", "WHILE", "WHITE", "WHOLE", "WOMAN", "WORLD", "YOUTH", "ADMIT", "ADOPT", "AGREE", "ALLOW", "ALTER", "APPLY", "ARGUE", "ARISE", "AVOID", "BEGIN", "BLAME", "BREAK", "BRING", "BUILD", "BURST", "CARRY", "CATCH", "CAUSE", "CHECK", "CLAIM", "CLEAN", "CLEAR", "CLIMB", "CLOSE", "COUNT", "COVER", "CROSS", "DANCE", "DOUBT", "DRINK", "DRIVE", "ENJOY", "ENTER", "EXIST", "FIGHT", "FOCUS", "FORCE", "GUESS", "IMPLY", "ISSUE", "JUDGE", "LAUGH", "LEARN", "LEAVE", "LET’S", "LIMIT", "MARRY", "MATCH", "OCCUR", "OFFER", "ORDER", "PHONE", "PLACE", "POINT", "PRESS", "PROVE", "RAISE", "REACH", "REFER", "RELAX", "SERVE", "SHALL", "SHARE", "SHIFT", "SHOOT", "SLEEP", "SOLVE", "SOUND", "SPEAK", "SPEND", "SPLIT", "STAND", "START", "STATE", "STICK", "STUDY", "TEACH", "THANK", "THINK", "THROW", "TOUCH", "TRAIN", "TREAT", "TRUST", "VISIT", "VOICE", "WASTE", "WATCH", "WORRY", "WOULD", "WRITE", "ABOVE", "ACUTE", "ALIVE", "ALONE", "ANGRY", "AWARE", "AWFUL", "BASIC", "BLACK", "BLIND", "BRAVE", "BRIEF", "BROAD", "BROWN", "CHEAP", "CHIEF", "CIVIL", "CLEAN", "CLEAR", "CLOSE", "CRAZY", "DAILY", "DIRTY", "EARLY", "EMPTY", "EQUAL", "EXACT", "EXTRA", "FAINT", "FALSE", "FIFTH", "FINAL", "FIRST", "FRESH", "FRONT", "FUNNY", "GIANT", "GRAND", "GREAT", "GREEN", "GROSS", "HAPPY", "HARSH", "HEAVY", "HUMAN", "IDEAL", "INNER", "JOINT", "LARGE", "LEGAL", "LEVEL", "LIGHT", "LOCAL", "LOOSE", "LUCKY", "MAGIC", "MAJOR", "MINOR", "MORAL", "NAKED", "NASTY", "NAVAL", "OTHER", "OUTER", "PLAIN", "PRIME", "PRIOR", "PROUD", "QUICK", "QUIET", "RAPID", "READY", "RIGHT", "ROMAN", "ROUGH", "ROUND", "ROYAL", "RURAL", "SHARP", "SHEER", "SHORT", "SILLY", "SIXTH", "SMALL", "SMART", "SOLID", "SORRY", "SPARE", "STEEP", "STILL", "SUPER", "SWEET", "THICK", "THIRD", "TIGHT", "TOTAL", "TOUGH", "UPPER", "UPSET", "URBAN", "USUAL", "VAGUE", "VALID", "VITAL", "WHITE", "WHOLE", "WRONG", "YOUNG"
        };
    private Scanner scan = new Scanner(System.in);
    private String guessWord;
    private int i;
    private String answer;
    private int difficulty = 5;
    private boolean verified;
    private boolean proceed = true;
    Random rand = new Random();

    static JPanel panel_1a;
    static JPanel panel_1b;
    static JPanel panel_1c;
    static JPanel panel_1d;
    static JPanel panel_1e;

    static JPanel panel_2a;
    static JPanel panel_2b;
    static JPanel panel_2c;
    static JPanel panel_2d;
    static JPanel panel_2e;

    static JPanel panel_3a;
    static JPanel panel_3b;
    static JPanel panel_3c;
    static JPanel panel_3d;
    static JPanel panel_3e; 

    static JPanel panel_4a;
    static JPanel panel_4b;
    static JPanel panel_4c;
    static JPanel panel_4d;
    static JPanel panel_4e;

    static JPanel panel_5a;
    static JPanel panel_5b;
    static JPanel panel_5c;
    static JPanel panel_5d;
    static JPanel panel_5e;

    static JPanel panel_6a;
    static JPanel panel_6b;
    static JPanel panel_6c;
    static JPanel panel_6d;
    static JPanel panel_6e;

    static JLabel label_1a;
    static JLabel label_1b;
    static JLabel label_1c;
    static JLabel label_1d;
    static JLabel label_1e;

    static JLabel label_2a;
    static JLabel label_2b;
    static JLabel label_2c;
    static JLabel label_2d;
    static JLabel label_2e;

    static JLabel label_3a;
    static JLabel label_3b;
    static JLabel label_3c;
    static JLabel label_3d;
    static JLabel label_3e;

    static JLabel label_4a;
    static JLabel label_4b;
    static JLabel label_4c;
    static JLabel label_4d;
    static JLabel label_4e;

    static JLabel label_5a;
    static JLabel label_5b;
    static JLabel label_5c;
    static JLabel label_5d;
    static JLabel label_5e;

    static JLabel label_6a;
    static JLabel label_6b;
    static JLabel label_6c;
    static JLabel label_6d;
    static JLabel label_6e;

    public void level() throws InterruptedException {
        do {
            setBlack();
            clearText();
            generateWord();
            getGuess();
            checkLetterStatus(panel_1a, label_1a, 0);
            checkLetterStatus(panel_1b, label_1b, 1);
            checkLetterStatus(panel_1c, label_1c, 2);
            checkLetterStatus(panel_1d, label_1d, 3);
            checkLetterStatus(panel_1e, label_1e, 4);
            if (verifyWord() == true) {
                Thread.sleep(4000);
                youWin();
                Thread.sleep(4000);
                playAgain();
                proceed();
            }
            getGuess();
            checkLetterStatus(panel_2a, label_2a, 0);
            checkLetterStatus(panel_2b, label_2b, 1);
            checkLetterStatus(panel_2c, label_2c, 2);
            checkLetterStatus(panel_2d, label_2d, 3);
            checkLetterStatus(panel_2e, label_2e, 4);
            if (verifyWord() == true) {
                Thread.sleep(4000);
                youWin();
                Thread.sleep(4000);
                playAgain();
                proceed();
            }
            getGuess();
            checkLetterStatus(panel_3a, label_3a, 0);
            checkLetterStatus(panel_3b, label_3b, 1);
            checkLetterStatus(panel_3c, label_3c, 2);
            checkLetterStatus(panel_3d, label_3d, 3);
            checkLetterStatus(panel_3e, label_3e, 4);
            if (verifyWord() == true) {
                Thread.sleep(4000);
                youWin();
                Thread.sleep(4000);
                playAgain();
                proceed();
            }
            getGuess();
            checkLetterStatus(panel_4a, label_4a, 0);
            checkLetterStatus(panel_4b, label_4b, 1);
            checkLetterStatus(panel_4c, label_4c, 2);
            checkLetterStatus(panel_4d, label_4d, 3);
            checkLetterStatus(panel_4e, label_4e, 4);
            if (verifyWord() == true) {
                Thread.sleep(4000);
                youWin();
                Thread.sleep(4000);
                playAgain();
                proceed();
            }
            getGuess();
            checkLetterStatus(panel_5a, label_5a, 0);
            checkLetterStatus(panel_5b, label_5b, 1);
            checkLetterStatus(panel_5c, label_5c, 2);
            checkLetterStatus(panel_5d, label_5d, 3);
            checkLetterStatus(panel_5e, label_5e, 4);
            if (verifyWord() == true) {
                Thread.sleep(4000);
                youWin();
                Thread.sleep(4000);
                playAgain();
                proceed();
            }
            getGuess();
            checkLetterStatus(panel_6a, label_6a, 0);
            checkLetterStatus(panel_6b, label_6b, 1);
            checkLetterStatus(panel_6c, label_6c, 2);
            checkLetterStatus(panel_6d, label_6d, 3);
            checkLetterStatus(panel_6e, label_6e, 4);
            if (verifyWord() == true) {
                Thread.sleep(4000);
                youWin();
                Thread.sleep(4000);
                playAgain();
                proceed();
            }
            else {
                Thread.sleep(4000);
                youLose();
                Thread.sleep(4000);
                playAgain();
                proceed(); 
            }
        } while (proceed == true);
    }

    public void proceed() {
        String x = scan.nextLine();
        if (x.equals("")) {
            proceed = true;
        }
        else proceed = false;

    }
    
    public String getGuess() {
        do {
            guessWord = scan.nextLine();
        } while (guessWord.length() != difficulty);
        return guessWord;
    }

    public String generateWord() {
        i = rand.nextInt(wordList.length);
        answer = wordList[i];
        return answer;
    }

    public boolean verifyWord() {
        if (guessWord.equals(answer))
            verified = true;
        else verified = false;
        return verified;
    }

    public void checkLetterStatus(JPanel panel, JLabel label, int index) {
        label.setText(Character.toString(guessWord.charAt(index)));
        for (int x = 0; x < difficulty; x++){
            if (guessWord.charAt(index) == answer.charAt(x)) {
                panel.setBackground(new Color(255, 204, 51));
                break;
            }
            else panel.setBackground(new Color(51, 51, 51));
        }
        if (guessWord.charAt(index) == answer.charAt(index)) {
            panel.setBackground(new Color(0, 153, 0));
        }
    }

    public void youWin() {
        setBlack();
        clearText();
        label_3b.setText("Y");
        label_3c.setText("O");
        label_3d.setText("U");
        label_4b.setText("W");
        label_4c.setText("I");
        label_4d.setText("N");
    }

    public void youLose() {
        setBlack();
        clearText();
        label_4a.setText(Character.toString(answer.charAt(0)));
        label_4b.setText(Character.toString(answer.charAt(1)));
        label_4c.setText(Character.toString(answer.charAt(2)));
        label_4d.setText(Character.toString(answer.charAt(3)));
        label_4e.setText(Character.toString(answer.charAt(4)));
    }

    public void setBlack() {
        panel_1a.setBackground(Color.BLACK);
        panel_1b.setBackground(Color.BLACK);
        panel_1c.setBackground(Color.BLACK);
        panel_1d.setBackground(Color.BLACK);
        panel_1e.setBackground(Color.BLACK);

        panel_2a.setBackground(Color.BLACK);
        panel_2b.setBackground(Color.BLACK);
        panel_2c.setBackground(Color.BLACK);
        panel_2d.setBackground(Color.BLACK);
        panel_2e.setBackground(Color.BLACK);

        panel_3a.setBackground(Color.BLACK);
        panel_3b.setBackground(Color.BLACK);
        panel_3c.setBackground(Color.BLACK);
        panel_3d.setBackground(Color.BLACK);
        panel_3e.setBackground(Color.BLACK);

        panel_4a.setBackground(Color.BLACK);
        panel_4b.setBackground(Color.BLACK);
        panel_4c.setBackground(Color.BLACK);
        panel_4d.setBackground(Color.BLACK);
        panel_4e.setBackground(Color.BLACK);

        panel_5a.setBackground(Color.BLACK);
        panel_5b.setBackground(Color.BLACK);
        panel_5c.setBackground(Color.BLACK);
        panel_5d.setBackground(Color.BLACK);
        panel_5e.setBackground(Color.BLACK);

        panel_6a.setBackground(Color.BLACK);
        panel_6b.setBackground(Color.BLACK);
        panel_6c.setBackground(Color.BLACK);
        panel_6d.setBackground(Color.BLACK);
        panel_6e.setBackground(Color.BLACK);
    }

    public void clearText() {
        label_1a.setText("");
        label_1b.setText("");
        label_1c.setText("");
        label_1d.setText("");
        label_1e.setText("");

        label_2a.setText("");
        label_2b.setText("");
        label_2c.setText("");
        label_2d.setText("");
        label_2e.setText("");

        label_3a.setText("");
        label_3b.setText("");
        label_3c.setText("");
        label_3d.setText("");
        label_3e.setText("");

        label_4a.setText("");
        label_4b.setText("");
        label_4c.setText("");
        label_4d.setText("");
        label_4e.setText("");

        label_5a.setText("");
        label_5b.setText("");
        label_5c.setText("");
        label_5d.setText("");
        label_5e.setText("");

        label_6a.setText("");
        label_6b.setText("");
        label_6c.setText("");
        label_6d.setText("");
        label_6e.setText("");
    }

    public void playAgain() {
        label_1a.setText("P");
        label_1b.setText("R");
        label_1c.setText("E");
        label_1d.setText("S");
        label_1e.setText("S");

        label_2a.setText("E");
        label_2b.setText("N");
        label_2c.setText("T");
        label_2d.setText("E");
        label_2e.setText("R");

        label_3a.setText("T");
        label_3b.setText("O");
        label_3c.setText("");
        label_3d.setText("");

        label_4a.setText("P");
        label_4b.setText("L");
        label_4c.setText("A");
        label_4d.setText("Y");

        label_5a.setText("A");
        label_5b.setText("G");
        label_5c.setText("A");
        label_5d.setText("I");
        label_5e.setText("N");
    }

    public void GUI() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(new GridLayout(7,5));
        frame.setLocationRelativeTo(null);
        frame.setSize(300,600);

        panel_1a = new JPanel();
        panel_1b = new JPanel();
        panel_1c = new JPanel();
        panel_1d = new JPanel();
        panel_1e = new JPanel();

        panel_2a = new JPanel();
        panel_2b = new JPanel();
        panel_2c = new JPanel();
        panel_2d = new JPanel();
        panel_2e = new JPanel();

        panel_3a = new JPanel();
        panel_3b = new JPanel();
        panel_3c = new JPanel();
        panel_3d = new JPanel();
        panel_3e = new JPanel(); 

        panel_4a = new JPanel();
        panel_4b = new JPanel();
        panel_4c = new JPanel();
        panel_4d = new JPanel();
        panel_4e = new JPanel();

        panel_5a = new JPanel();
        panel_5b = new JPanel();
        panel_5c = new JPanel();
        panel_5d = new JPanel();
        panel_5e = new JPanel();

        panel_6a = new JPanel();
        panel_6b = new JPanel();
        panel_6c = new JPanel();
        panel_6d = new JPanel();
        panel_6e = new JPanel();

        frame.add(panel_1a);
        frame.add(panel_1b);
        frame.add(panel_1c);
        frame.add(panel_1d);
        frame.add(panel_1e);
        frame.add(panel_2a);
        frame.add(panel_2b);
        frame.add(panel_2c);
        frame.add(panel_2d);
        frame.add(panel_2e);
        frame.add(panel_3a);
        frame.add(panel_3b);
        frame.add(panel_3c);
        frame.add(panel_3d);
        frame.add(panel_3e);
        frame.add(panel_4a);
        frame.add(panel_4b);
        frame.add(panel_4c);
        frame.add(panel_4d);
        frame.add(panel_4e);
        frame.add(panel_5a);
        frame.add(panel_5b);
        frame.add(panel_5c);
        frame.add(panel_5d);
        frame.add(panel_5e);
        frame.add(panel_6a);
        frame.add(panel_6b);
        frame.add(panel_6c);
        frame.add(panel_6d);
        frame.add(panel_6e);

        label_1a = new JLabel();
        label_1b = new JLabel();
        label_1c = new JLabel();
        label_1d = new JLabel();
        label_1e = new JLabel();

        label_2a = new JLabel();
        label_2b = new JLabel();
        label_2c = new JLabel();
        label_2d = new JLabel();
        label_2e = new JLabel();

        label_3a = new JLabel();
        label_3b = new JLabel();
        label_3c = new JLabel();
        label_3d = new JLabel();
        label_3e = new JLabel();

        label_4a = new JLabel();
        label_4b = new JLabel();
        label_4c = new JLabel();
        label_4d = new JLabel();
        label_4e = new JLabel();

        label_5a = new JLabel();
        label_5b = new JLabel();
        label_5c = new JLabel();
        label_5d = new JLabel();
        label_5e = new JLabel();

        label_6a = new JLabel();
        label_6b = new JLabel();
        label_6c = new JLabel();
        label_6d = new JLabel();
        label_6e = new JLabel();

        setBlack();

        label_1a.setForeground(Color.WHITE);
        label_1b.setForeground(Color.WHITE);
        label_1c.setForeground(Color.WHITE);
        label_1d.setForeground(Color.WHITE);
        label_1e.setForeground(Color.WHITE);

        label_2a.setForeground(Color.WHITE);
        label_2b.setForeground(Color.WHITE);
        label_2c.setForeground(Color.WHITE);
        label_2d.setForeground(Color.WHITE);
        label_2e.setForeground(Color.WHITE);

        label_3a.setForeground(Color.WHITE);
        label_3b.setForeground(Color.WHITE);
        label_3c.setForeground(Color.WHITE);
        label_3d.setForeground(Color.WHITE);
        label_3e.setForeground(Color.WHITE);

        label_4a.setForeground(Color.WHITE);
        label_4b.setForeground(Color.WHITE);
        label_4c.setForeground(Color.WHITE);
        label_4d.setForeground(Color.WHITE);
        label_4e.setForeground(Color.WHITE);

        label_5a.setForeground(Color.WHITE);
        label_5b.setForeground(Color.WHITE);
        label_5c.setForeground(Color.WHITE);
        label_5d.setForeground(Color.WHITE);
        label_5e.setForeground(Color.WHITE);

        label_6a.setForeground(Color.WHITE);
        label_6b.setForeground(Color.WHITE);
        label_6c.setForeground(Color.WHITE);
        label_6d.setForeground(Color.WHITE);
        label_6e.setForeground(Color.WHITE);

        label_1a.setFont(new Font("Arial", Font.PLAIN, 50));
        label_1b.setFont(new Font("Arial", Font.PLAIN, 50));
        label_1c.setFont(new Font("Arial", Font.PLAIN, 50));
        label_1d.setFont(new Font("Arial", Font.PLAIN, 50));
        label_1e.setFont(new Font("Arial", Font.PLAIN, 50));

        label_2a.setFont(new Font("Arial", Font.PLAIN, 50));
        label_2b.setFont(new Font("Arial", Font.PLAIN, 50));
        label_2c.setFont(new Font("Arial", Font.PLAIN, 50));
        label_2d.setFont(new Font("Arial", Font.PLAIN, 50));
        label_2e.setFont(new Font("Arial", Font.PLAIN, 50));

        label_3a.setFont(new Font("Arial", Font.PLAIN, 50));
        label_3b.setFont(new Font("Arial", Font.PLAIN, 50));
        label_3c.setFont(new Font("Arial", Font.PLAIN, 50));
        label_3d.setFont(new Font("Arial", Font.PLAIN, 50));
        label_3e.setFont(new Font("Arial", Font.PLAIN, 50));

        label_4a.setFont(new Font("Arial", Font.PLAIN, 50));
        label_4b.setFont(new Font("Arial", Font.PLAIN, 50));
        label_4c.setFont(new Font("Arial", Font.PLAIN, 50));
        label_4d.setFont(new Font("Arial", Font.PLAIN, 50));
        label_4e.setFont(new Font("Arial", Font.PLAIN, 50));

        label_5a.setFont(new Font("Arial", Font.PLAIN, 50));
        label_5b.setFont(new Font("Arial", Font.PLAIN, 50));
        label_5c.setFont(new Font("Arial", Font.PLAIN, 50));
        label_5d.setFont(new Font("Arial", Font.PLAIN, 50));
        label_5e.setFont(new Font("Arial", Font.PLAIN, 50));

        label_6a.setFont(new Font("Arial", Font.PLAIN, 50));
        label_6b.setFont(new Font("Arial", Font.PLAIN, 50));
        label_6c.setFont(new Font("Arial", Font.PLAIN, 50));
        label_6d.setFont(new Font("Arial", Font.PLAIN, 50));
        label_6e.setFont(new Font("Arial", Font.PLAIN, 50));

        panel_1a.add(label_1a);
        panel_1b.add(label_1b);
        panel_1c.add(label_1c);
        panel_1d.add(label_1d);
        panel_1e.add(label_1e);

        panel_2a.add(label_2a);
        panel_2b.add(label_2b);
        panel_2c.add(label_2c);
        panel_2d.add(label_2d);
        panel_2e.add(label_2e);

        panel_3a.add(label_3a);
        panel_3b.add(label_3b);
        panel_3c.add(label_3c);
        panel_3d.add(label_3d);
        panel_3e.add(label_3e);

        panel_4a.add(label_4a);
        panel_4b.add(label_4b);
        panel_4c.add(label_4c);
        panel_4d.add(label_4d);
        panel_4e.add(label_4e);

        panel_5a.add(label_5a);
        panel_5b.add(label_5b);
        panel_5c.add(label_5c);
        panel_5d.add(label_5d);
        panel_5e.add(label_5e);

        panel_6a.add(label_6a);
        panel_6b.add(label_6b);
        panel_6c.add(label_6c);
        panel_6d.add(label_6d);
        panel_6e.add(label_6e);

    }
}