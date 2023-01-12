import javax.swing.*;
import java.util.*;
import java.awt.*;

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

    static JPanel[][] panels = {
        {panel_1a, panel_1b, panel_1c, panel_1d, panel_1e},
        {panel_2a, panel_2b, panel_2c, panel_2d, panel_2e},
        {panel_3a, panel_3b, panel_3c, panel_3d, panel_3e},
        {panel_4a, panel_4b, panel_4c, panel_4d, panel_4e},
        {panel_5a, panel_5b, panel_5c, panel_5d, panel_5e},
        {panel_6a, panel_6b, panel_6c, panel_6d, panel_6e}
    };

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

    static JLabel[][] labels = {
        {label_1a, label_1b, label_1c, label_1d, label_1e},
        {label_2a, label_2b, label_2c, label_2d, label_2e},
        {label_3a, label_3b, label_3c, label_3d, label_3e},
        {label_4a, label_4b, label_4c, label_4d, label_4e},
        {label_5a, label_5b, label_5c, label_5d, label_5e},
        {label_6a, label_6b, label_6c, label_6d, label_6e}
    };

    public void level() throws InterruptedException {
        do {
            setBlack();
            clearText();
            generateWord();
            for (int i = 0; i < 6; i++) {
                getGuess();
                evalWord(i);
                if (verifyWord()) {
                    Thread.sleep(2500);
                    youWin();
                    Thread.sleep(2500);
                    playAgain();
                    proceed();
                    break;
                }
            };
            if (!verifyWord()) {
                Thread.sleep(2500);
                youLose();
                Thread.sleep(2500);
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
        if (guessWord.equals(answer)) verified = true;
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

    public void evalWord(int guess_num) {
        for (int i = 0; i<=4; i++) {
            checkLetterStatus(panels[guess_num][i], labels[guess_num][i], i);
        }
    }

    public void youWin() {
        setBlack();
        clearText();
        setText(" YOU ", 2);
        setText(" WIN ", 3);
    }

    public void setText(String word, int row) {
        for (int i = 0; i<5; i++) {
            labels[row][i].setText(Character.toString(word.charAt(i)));
        };
    }

    public void youLose() {
        setBlack();
        clearText();
        setText(answer, 5);
    }

    public void setBlack() {
        for (int i = 0; i<6; i++) {
            for (int j = 0; j<5; j++){
                panels[i][j].setBackground(Color.BLACK);
            }
        }
    }
    public void clearText() {
        for (int i = 0; i<6; i++) {
            for (int j = 0; j<5; j++){
                labels[i][j].setText("");
            }
        }
    }

    public void playAgain() {
        setText("PRESS", 0);
        setText("ENTER", 1);
        setText("TO   ", 2);
        setText("PLAY ", 3);
        setText("AGAIN", 4);
        setText("_____", 5);
    }

    public void GUI() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(new GridLayout(7,5));
        frame.setLocationRelativeTo(null);
        frame.setSize(300,600);

        for (int i = 0; i<6; i++) {
            for (int j = 0; j<5; j++){
                panels[i][j] = new JPanel();
                frame.add(panels[i][j]);
                panels[i][j].setBackground(Color.BLACK);
                labels[i][j] = new JLabel();
                labels[i][j].setForeground(Color.WHITE);
                labels[i][j].setFont(new Font("Arial", Font.PLAIN, 50));
                panels[i][j].add(labels[i][j]);
            }
        }
    }
}