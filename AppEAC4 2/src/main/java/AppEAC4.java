
import java.sql.SQLOutput;
import java.util.Scanner;
/**
 *
 * @author IOC
 */
public class AppEAC4 {
    public static final String[][] ASPIRANTS = {{"Reinwald", "Keppy", "11111111A"}, {"Alfonse", "Nijssen", "22222222B"},{"Devon", "Clowes", "84284710N"},{"Sibelle", "Checchetelli", "75218483Y"},{"Nanette", "Monteaux", "40050691G"},{"Dori", "Cardo", "55748040D"},{"Gloria", "Baunton", "28510268X"},{"Melli", "Blumson", "81531907K"},{"Cymbre", "Clarke-Williams", "64083847Y"},{"Didi", "McGinty", "14713787Y"},{"Matthias", "Tuerena", "90319755M"},{"Munmro", "Eltringham", "57074037U"},{"Modesty", "Vasilyev", "73100689T"},{"Dusty", "Torbard", "85867256L"},{"Philipa", "Steely", "65413293Q"},{"Selene", "Keijser", "74323106T"},{"Virgilio", "Schwartz", "69080266S"},{"Farrel", "Oleszcuk", "99336060U"},{"Godfree", "O' Sullivan", "34021571P"},{"Laurella", "Foakes", "64884625K"},{"Putnem", "Howford", "70290911W"},{"Kenon", "Maillard", "72227665A"},{"Loralie", "Gillean", "66677539T"},{"Farah", "Abson", "84844161Y"},{"Cornell", "Hammon", "66528592X"},{"Hetti", "Ivanenko", "22130296Z"},{"Trix", "Saphin", "81391014O"},{"Estele", "Guyet", "47148577K"},{"Conrad", "Dallison", "63208490Q"},{"Rogers", "Colthard", "91816252O"},{"Eva", "Gorman", "91490448A"},{"Elka", "Blackey", "36463552T"},{"Carlita", "Jansky", "61827083P"},{"Stinky", "Caudell", "16249649S"},{"Maxy", "Arnholz", "53813609B"},{"Raquel", "Werlock", "40725601W"},{"Tam", "Phython", "35092261I"},{"Branden", "Dumbare", "85730803S"},{"Karlotta", "Nisbet", "67121986O"},{"Dermot", "Whittek", "39597482F"},{"Neron", "Bindley", "89589794J"},{"Gretchen", "Manilove", "30522576Y"},{"Artair", "Ledwidge", "48223239X"},{"Regina", "Foxwell", "20660071O"},{"Maisie", "Wilks", "63242314D"},{"Myrtie", "Danielsson", "52456635U"},{"Rodger", "Lodo", "90535992F"},{"Jolie", "Godspede", "76727958O"},{"Valentine", "Kilfeather", "32353757Z"},{"Glennie", "Pherps", "61664122P"},{"Lauri", "Thresh", "79976608U"},{"Kendre", "Giacomelli", "42988426V"},{"Siward", "Macoun", "22328257X"},{"Kristina", "Oxteby", "49556763D"},{"Forbes", "Edison", "34339223J"},{"Vinson", "Cicchelli", "55699487V"},{"Dacy", "July", "70288500J"},{"Isidor", "Cowley", "96764638T"},{"Florence", "Laughlan", "34734364C"},{"Nicolis", "Fullun", "62476709U"},{"Lucia", "Tuckwell", "74060008M"},{"Sonja", "Sparry", "33387552N"},{"Chiquita", "Loxston", "81983841V"},{"Diahann", "Assinder", "18789725K"},{"Brent", "Norrie", "94948416G"},{"Amber", "Gammade", "46593076O"},{"Suzanna", "Klimochkin", "39371000E"},{"Renaud", "Wallicker", "74089262A"},{"Mickey", "Tupman", "13870448A"},{"Caz", "Roll", "71110520N"},{"Bibby", "Skelhorn", "93900971L"},{"Thea", "Hartrick", "57472246I"},{"Gabby", "Massingham", "37252359I"},{"Wylie", "Beckey", "34858076C"},{"Tadd", "Oldale", "36472567K"},{"Carson", "Fynan", "76328683P"},{"Giselle", "Lejeune", "23135623X"},{"Verina", "Newlin", "78773892X"},{"Levi", "Mccaull", "86473239C"},{"Percy", "Klosser", "80262384X"},{"Rik", "Shorbrook", "51928669W"},{"Ardisj", "Lages", "99817132X"},{"Leon", "Duffet", "92187269S"},{"Killie", "Faro", "37458237P"},{"Mellie", "Gillions", "18356429U"},{"Antons", "Peregrine", "68316621K"},{"Nollie", "Rennels", "52545042X"},{"Agatha", "Whytock", "25930477Y"},{"Enos", "Josifovitz", "77280573A"},{"Garnet", "Haldin", "83797740Y"},{"Mal", "Piesold", "93944661N"},{"Redd", "Wildash", "62666653A"},{"Leigh", "Haston", "51635526A"},{"Louisette", "Goscomb", "57438908D"},{"Sallyanne", "Beecker", "48334263D"},{"Farrell", "Brimson", "27284417X"},{"Elisha", "Rolfo", "62804673B"},{"Marje", "Speke", "90661434D"},{"Romeo", "Sainteau", "63363641Y"},{"Vivianna", "Coveley", "44319449C"}};
    static Scanner scanner = new Scanner(System.in);
    public static String ASK_FOR_MENU_OPTION = "introdueixi un valor enter per l'opció";
    public static String ERROR_INPUT_NUMBER= "El valor introduït no és vàlid";
    public static String ASK_FOR_ASPIRANT_DOCUMENT = "Introdueixi el document del candidat";
    public static String ERROR_ASK_FOR_DOCUMENT = "El candidat sol·licitat no existeix";
    public static String ASK_FOR_TEST_TO_GRADE = "Quina prova vol qualificar? (0-4) Introdueix 5 per qualificar-los tots";
    public static String ASK_FOR_GRADE = "Introdueixi la qualificació de l'examen ";
    public static String GRADES_SET = "Qualificacions correctament introduïdes";
    public static String d = "";
    public static String e = "";
    public static String f = "";

    float [][] grades = new float[ASPIRANTS.length][5];

    public static void main(String[] args) {
        AppEAC4 prg = new AppEAC4();
        prg.start();
    }
    public void start() {
        int chosenOption = -1, aspirantId, testId, gradesResult;
        float grade;
        String aspirantDocument;
        while(chosenOption != 0) {
            aspirantId = -2;
            testId = -1;
            showMainMenu();
            chosenOption = askForInteger(ASK_FOR_MENU_OPTION, ERROR_INPUT_NUMBER);
            switch (chosenOption) {
                case 1:
                    while (aspirantId < 0) {
                        aspirantDocument = askForString(ASK_FOR_ASPIRANT_DOCUMENT, ERROR_ASK_FOR_DOCUMENT);
                        aspirantId = getAspirantByDocument(aspirantDocument, ASPIRANTS);
                        if (aspirantId < 0) {
                            System.out.println(ERROR_ASK_FOR_DOCUMENT);
                        }
                    }
                    while (testId < 0 || testId > 5) {
                        testId = askForInteger(ASK_FOR_TEST_TO_GRADE, ERROR_INPUT_NUMBER);
                        if (testId == 5) {
                            for (int i = 0; i < 5; i++) {
                                grade = askForFloat(ASK_FOR_GRADE + i, ERROR_INPUT_NUMBER);
                                gradesResult = setGradeTestAspirant(aspirantId, i, grade, grades);
                                validateGradeResult(gradesResult);
                            }
                        } else if (testId >= 0 && testId < 5) {
                            grade = askForFloat(ASK_FOR_GRADE + testId, ERROR_INPUT_NUMBER);
                            gradesResult = setGradeTestAspirant(aspirantId, testId, grade, grades);
                            validateGradeResult(gradesResult);
                        } else {
                            System.out.println("L'opció no correspon a cap prova. Introdueixi un valor entre 0 i 5");
                        }
                    }
                    System.out.println(GRADES_SET);
                    break;
                case 2:
                    while (aspirantId < 0) {
                        aspirantDocument = askForString(ASK_FOR_ASPIRANT_DOCUMENT, ERROR_ASK_FOR_DOCUMENT);
                        aspirantId = getAspirantByDocument(aspirantDocument, ASPIRANTS);
                        if (aspirantId < 0) {
                            System.out.println(ERROR_ASK_FOR_DOCUMENT);
                        }
                    }
                    printFullName(aspirantId);
                    printUserGrades(aspirantId, grades);
            }
        }
    }
    private static void printFullName(int aspirantId){
        System.out.println(ASPIRANTS[aspirantId][0] + " " + ASPIRANTS[aspirantId][1]);
    }
    private static void printUserGrades (int aspirantID, float[][] grades) {
        for (int i = 0; i < grades[aspirantID].length; i++) {
            System.out.println("Nota " + i);
            System.out.println(grades[aspirantID][i]);
        }
    }
    private static void validateGradeResult(int result){
        if(result == -1){
            System.out.println("Error. La qualificació ja existeix");
        }
    }
    public static void askForTestToGrade() {
        System.out.println("Quina prova vol qualificar? (0-4) Introdueix 5 per qualificar-los tots");
    }
    public static void showMainMenu(){
        System.out.println("----------------");
        System.out.println("GESTIO ASPIRANTS");
        System.out.println("----------------");
        System.out.println("1) Enregistrar nota.");
        System.out.println("2) Mostrar notes aspirant.");
        System.out.println("0) Sortir.");
    }
    public static String askForString(String message, String errorMessage){
        boolean stringIsValid = false;
        String stringInput = "";

        while (!stringIsValid){
            System.out.println(message);
            stringInput = scanner.nextLine();
            if (!stringInput.isEmpty()){
                stringIsValid = true;
            } else {
                System.out.println(errorMessage);
            }
        }
        return stringInput;
    }
    public static float askForFloat(String message, String errorMessage) {
        boolean floatIsValid = false;
        float floatInput = 0;

        while(!floatIsValid){
            System.out.println(message);
            if (scanner.hasNextFloat()){
                floatInput = scanner.nextFloat();
                floatIsValid = true;
            } else {
                System.out.println(errorMessage);
                scanner.next();
            }
        }
        return floatInput;
    }
    public static int askForInteger(String message, String errorMessage) {
        boolean intIsValid = false;
        int intInput = 0;

        while(!intIsValid) {
            System.out.println(message);
            if (scanner.hasNextInt()){
                intInput = scanner.nextInt();
                intIsValid = true;
            } else {
                System.out.println(errorMessage);
                scanner.next();
            }
        }
        scanner.nextLine();
        return intInput;
    }

    public static int getAspirantByDocument(String aspirantDocument, String[][] aspirants) {

        if (aspirantDocument == null || aspirants == null){
            return -2;
        }

        for (int i = 0; i < aspirants.length; i++) {
            if (aspirants[i].length<3){
                return -2;
            }
            if (aspirantDocument.equals(aspirants[i][2])){
                return i;
            }
        }
        return -1;
    }

    public static float getGrade(int aspirantId, int testId, float[][] grades) {
        if (grades == null) {
            return -2f;
        }
        if (aspirantId < 0 || aspirantId >= grades.length) {
            return -2f;
        }
        if (testId < 0 || testId > 4) {
            return -2f;
        }
        if (testId >= grades[aspirantId].length) {
            return -2f;
        }
        float grade = grades[aspirantId][testId];
        if (grade > 0.0){
            return grade;
        }else{
            return -1;
        }
    }
    public static int setGradeTestAspirant(int aspirantId, int testId, float grade, float[][] grades) {
        if (grades == null) {
            return -2;
        }
        if (aspirantId < 0 || aspirantId >= grades.length) {
            return -2;
        }
        if (testId < 0 || testId > 4) {
            return -2;
        }
        if (testId >= grades[aspirantId].length) {
            return -2;
        }
        if (grade < 0 || grade > 10) {
            return -2;
        }
        if (grades[aspirantId][testId] == 0.0) {
            grades[aspirantId][testId] = grade;
        } else {
            return -1;
        }
        return aspirantId;
    }

}