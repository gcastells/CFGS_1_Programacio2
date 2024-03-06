/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.io.ByteArrayInputStream;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mlvil
 */
public class AppEAC4Test {
    private final String[][] ASPIRANTS = {{"Reinwald", "Keppy", "78712825T"},{"Alfonse", "Nijssen", "90894124V"},{"Devon", "Clowes", "84284710N"},{"Sibelle", "Checchetelli", "75218483Y"},{"Nanette", "Monteaux", "40050691G"},{"Dori", "Cardo", "55748040D"},{"Gloria", "Baunton", "28510268X"},{"Melli", "Blumson", "81531907K"},{"Cymbre", "Clarke-Williams", "64083847Y"},{"Didi", "McGinty", "14713787Y"},{"Matthias", "Tuerena", "90319755M"},{"Munmro", "Eltringham", "57074037U"},{"Modesty", "Vasilyev", "73100689T"},{"Dusty", "Torbard", "85867256L"},{"Philipa", "Steely", "65413293Q"},{"Selene", "Keijser", "74323106T"},{"Virgilio", "Schwartz", "69080266S"},{"Farrel", "Oleszcuk", "99336060U"},{"Godfree", "O' Sullivan", "34021571P"},{"Laurella", "Foakes", "64884625K"},{"Putnem", "Howford", "70290911W"},{"Kenon", "Maillard", "72227665A"},{"Loralie", "Gillean", "66677539T"},{"Farah", "Abson", "84844161Y"},{"Cornell", "Hammon", "66528592X"},{"Hetti", "Ivanenko", "22130296Z"},{"Trix", "Saphin", "81391014O"},{"Estele", "Guyet", "47148577K"},{"Conrad", "Dallison", "63208490Q"},{"Rogers", "Colthard", "91816252O"},{"Eva", "Gorman", "91490448A"},{"Elka", "Blackey", "36463552T"},{"Carlita", "Jansky", "61827083P"},{"Stinky", "Caudell", "16249649S"},{"Maxy", "Arnholz", "53813609B"},{"Raquel", "Werlock", "40725601W"},{"Tam", "Phython", "35092261I"},{"Branden", "Dumbare", "85730803S"},{"Karlotta", "Nisbet", "67121986O"},{"Dermot", "Whittek", "39597482F"},{"Neron", "Bindley", "89589794J"},{"Gretchen", "Manilove", "30522576Y"},{"Artair", "Ledwidge", "48223239X"},{"Regina", "Foxwell", "20660071O"},{"Maisie", "Wilks", "63242314D"},{"Myrtie", "Danielsson", "52456635U"},{"Rodger", "Lodo", "90535992F"},{"Jolie", "Godspede", "76727958O"},{"Valentine", "Kilfeather", "32353757Z"},{"Glennie", "Pherps", "61664122P"},{"Lauri", "Thresh", "79976608U"},{"Kendre", "Giacomelli", "42988426V"},{"Siward", "Macoun", "22328257X"},{"Kristina", "Oxteby", "49556763D"},{"Forbes", "Edison", "34339223J"},{"Vinson", "Cicchelli", "55699487V"},{"Dacy", "July", "70288500J"},{"Isidor", "Cowley", "96764638T"},{"Florence", "Laughlan", "34734364C"},{"Nicolis", "Fullun", "62476709U"},{"Lucia", "Tuckwell", "74060008M"},{"Sonja", "Sparry", "33387552N"},{"Chiquita", "Loxston", "81983841V"},{"Diahann", "Assinder", "18789725K"},{"Brent", "Norrie", "94948416G"},{"Amber", "Gammade", "46593076O"},{"Suzanna", "Klimochkin", "39371000E"},{"Renaud", "Wallicker", "74089262A"},{"Mickey", "Tupman", "13870448A"},{"Caz", "Roll", "71110520N"},{"Bibby", "Skelhorn", "93900971L"},{"Thea", "Hartrick", "57472246I"},{"Gabby", "Massingham", "37252359I"},{"Wylie", "Beckey", "34858076C"},{"Tadd", "Oldale", "36472567K"},{"Carson", "Fynan", "76328683P"},{"Giselle", "Lejeune", "23135623X"},{"Verina", "Newlin", "78773892X"},{"Levi", "Mccaull", "86473239C"},{"Percy", "Klosser", "80262384X"},{"Rik", "Shorbrook", "51928669W"},{"Ardisj", "Lages", "99817132X"},{"Leon", "Duffet", "92187269S"},{"Killie", "Faro", "37458237P"},{"Mellie", "Gillions", "18356429U"},{"Antons", "Peregrine", "68316621K"},{"Nollie", "Rennels", "52545042X"},{"Agatha", "Whytock", "25930477Y"},{"Enos", "Josifovitz", "77280573A"},{"Garnet", "Haldin", "83797740Y"},{"Mal", "Piesold", "93944661N"},{"Redd", "Wildash", "62666653A"},{"Leigh", "Haston", "51635526A"},{"Louisette", "Goscomb", "57438908D"},{"Sallyanne", "Beecker", "48334263D"},{"Farrell", "Brimson", "27284417X"},{"Elisha", "Rolfo", "62804673B"},{"Marje", "Speke", "90661434D"},{"Romeo", "Sainteau", "63363641Y"},{"Vivianna", "Coveley", "44319449C"}};
    private final static String MESSAGE_ASK_ANYTHING = "Introdueixi alguna cosa";
    private final static String MESSAGE_ERROR = "Error en la entrada";
    
    private final static String MESSAGE_TEST_INPUT = "This message tests the input";
    private final static float FLOAT_TEST_INPUT = 6.3f;
    private final static int INT_TEST_INPUT = 6;
    private float[][] GRADES;
    private final int ERROR = -1;
    public static final int ERROR_INCORRECT_VALUE = -2;
    private final int ASPIRANT_ID = 34;
    private final int TEST_ID = 2;
    private final float GRADE = 5.6f;
    private final String CORRECT_DOCUMENT = "53813609B";
    private final String INCORRECT_DOCUMENT = "53813609F";

    public AppEAC4Test() {
    }

    @BeforeEach
    public void setUp() {
        GRADES = new float[ASPIRANTS.length][5];
        for (var row: GRADES) {
            Arrays.fill(row, 0f);
        }
    }
    
    /**
     * Test of askForString method, of class AppEAC4.
     */
    @Test
    public void testAskForStringOK() {
        System.out.println("testAskForStringOK");
        provideInput(MESSAGE_TEST_INPUT);
        String result = AppEAC4.askForString(MESSAGE_ASK_ANYTHING, MESSAGE_ERROR);
        assertEquals(MESSAGE_TEST_INPUT, result);
    }

    @Test
    public void testAskForStringNotOKIfEmpty() {
        System.out.println("testAskForStringNotOKIfEmpty");
        provideInput("\n" + MESSAGE_TEST_INPUT);
        String result = AppEAC4.askForString(MESSAGE_ASK_ANYTHING, MESSAGE_ERROR);
        assertEquals(MESSAGE_TEST_INPUT, result);
    }

    /**
     * Test of askForFloat method, of class AppEAC4.
     */
    @Test
    public void testAskForFloatOK() {
        System.out.println("testAskForFloatOK");
        provideInput(String.valueOf(FLOAT_TEST_INPUT)+"\n");
        float result = AppEAC4.askForFloat(MESSAGE_ASK_ANYTHING, MESSAGE_ERROR);
        assertEquals(FLOAT_TEST_INPUT, result);
    }
    
    @Test
    public void testAskForFloatNotOkIfString() {
        System.out.println("testAskForFloatNotOkIfString");
        provideInput(MESSAGE_TEST_INPUT + "\n" + String.valueOf(FLOAT_TEST_INPUT)+"\n");
        float result = AppEAC4.askForFloat(MESSAGE_ASK_ANYTHING, MESSAGE_ERROR);
        assertEquals(FLOAT_TEST_INPUT, result);
    }

    /**
     * Test of askForInteger method, of class AppEAC4.
     */
    @Test
    public void testAskForIntegerOK() {
        System.out.println("testAskForIntegerOK");
        provideInput(String.valueOf(INT_TEST_INPUT)+"\n");
        int result = AppEAC4.askForInteger(MESSAGE_ASK_ANYTHING, MESSAGE_ERROR);
        assertEquals(INT_TEST_INPUT, result);
    }
    
    @Test
    public void testAskForIntegerNotOKIfString() {
        System.out.println("testAskForIntegerNotOKIfString");
        provideInput(MESSAGE_TEST_INPUT + "\n" + String.valueOf(INT_TEST_INPUT)+"\n");
        int result = AppEAC4.askForInteger(MESSAGE_ASK_ANYTHING, MESSAGE_ERROR);
        assertEquals(INT_TEST_INPUT, result);
    }
 
    @Test
    public void testAskForIntegerNotOKIfFloat() {
        System.out.println("testAskForIntegerNotOKIfFloat");
        provideInput(FLOAT_TEST_INPUT + "\n" + String.valueOf(INT_TEST_INPUT)+"\n");
        int result = AppEAC4.askForInteger(MESSAGE_ASK_ANYTHING, MESSAGE_ERROR);
        assertEquals(INT_TEST_INPUT, result);
    }

    /**
     * Test of GetAspirantByDocument method, of class AppEAC4.
     */
    @Test
    public void testGetAspirantByDocumentOK() {
        System.out.println("testGetAspirantByDocumentOK");
        int result = AppEAC4.getAspirantByDocument(CORRECT_DOCUMENT, ASPIRANTS);
        assertEquals(ASPIRANT_ID, result,"La funció GetAspirantByDocumentOK no torna un resultat correcte quan el DNI es troba en el llistat");
    }
    @Test
    public void testGetAspirantByDocumentNotOKIfNotAspirant() {
        System.out.println("testGetAspirantByDocumentNotOKIfNotAspirant");
        int result = AppEAC4.getAspirantByDocument(INCORRECT_DOCUMENT, ASPIRANTS);
        assertEquals(ERROR, result,"La funció testGetAspirantByDocumentOK no torna un error quan el DNI no es troba en el llistat");
    }
    @Test
    public void testGetAspirantByDocumentNotOKIfDocumentNull() {
        System.out.println("testGetAspirantByDocumentNotOKIfDocumentNull");
        int result = AppEAC4.getAspirantByDocument(null, ASPIRANTS);
        assertEquals(ERROR_INCORRECT_VALUE, result,"La funció testGetAspirantByDocumentOK no torna un error quan el DNI és null");
    }

    @Test
    public void testGetAspirantByDocumentNotOKIfAspirantsNull() {
        System.out.println("testGetAspirantByDocumentNotOKIfAspirantsNull");
        int result = AppEAC4.getAspirantByDocument(CORRECT_DOCUMENT, null);
        assertEquals(ERROR_INCORRECT_VALUE, result,"La funció testGetAspirantByDocumentOK no torna un error quan el DNI és null");
    }
    /**
     * Test of setGradeTestAspirant method, of class AppEAC4.
     */
    @Test
    public void testSetGradeTestAspirantOK() {
        System.out.println("setGradeTestAspirantOK");
        int result = AppEAC4.setGradeTestAspirant(ASPIRANT_ID, TEST_ID, GRADE, GRADES);
        assertEquals(ASPIRANT_ID, result, "La funció ha de retornar l'index del candidat");
    }

    @Test
    public void testSetGradeTestAspirantOKIfGradeZero() {
        System.out.println("testSetGradeTestAspirantOKIfGradeZero");
        int grade = 0;
        int result = AppEAC4.setGradeTestAspirant(ASPIRANT_ID, TEST_ID, grade, GRADES);
        assertEquals(ASPIRANT_ID, result, "La funció ha de retornar l'index del candidat");
    }

    @Test
    public void testSetGradeTestAspirantNotOKIfGradeExists() {
        System.out.println("testSetGradeTestAspirantNotOKIfGradeExists");
        GRADES[ASPIRANT_ID][TEST_ID]= GRADE;
        int result = AppEAC4.setGradeTestAspirant(ASPIRANT_ID, TEST_ID, GRADE, GRADES);
        assertEquals(ERROR, result, "La funció ha de retornar error si la qualificació ja existeix");
    }

    @Test
    public void testSetGradeTestAspirantNotOKIfNegativeGrade() {
        System.out.println("testSetGradeTestAspirantNotOKIfNegativeGrade");
        int grade = -1;
        int result = AppEAC4.setGradeTestAspirant(ASPIRANT_ID, TEST_ID, grade, GRADES);
        assertEquals(ERROR_INCORRECT_VALUE, result, "La funció ha de retornar error si la qualificació no és positiva o zero");
    }

    @Test
    public void testSetGradeTestAspirantNotOKIfGradeGreaterThanTen() {
        System.out.println("testSetGradeTestAspirantNotOKIfNegativeGrade");
        int grade = 11;
        int result = AppEAC4.setGradeTestAspirant(ASPIRANT_ID, TEST_ID, grade, GRADES);
        assertEquals(ERROR_INCORRECT_VALUE, result, "La funció ha de retornar error si la qualificació és superior a 10");
    }

    @Test
    public void testSetGradeTestAspirantNotOKIfNegativeIdAspirant() {
        System.out.println("testSetGradeTestAspirantNotOKIfNegativeIdAspirant");
        int idAspirant = -1;
        int result = AppEAC4.setGradeTestAspirant(idAspirant, TEST_ID, GRADE, GRADES);
        assertEquals(ERROR_INCORRECT_VALUE, result, "La funció ha de retornar error si l'aspirantId no és positiva o zero");
    }

    @Test
    public void testSetGradeTestAspirantNotOKIfNegativeIdExamNumber() {
        System.out.println("testSetGradeTestAspirantNotOKIfNegativeIdAspirant");
        int testId = -1;
        int result = AppEAC4.setGradeTestAspirant(ASPIRANT_ID, testId, GRADE, GRADES);
        assertEquals(ERROR_INCORRECT_VALUE, result, "La funció ha de retornar error si el nombre de l'examen és menor que zero o major que el nombre d'exàmens");
    }

    @Test
    public void testSetGradeTestAspirantNotOKIfTestIdIncorrect() {
        System.out.println("testSetGradeTestAspirantNotOKIfTestIdIncorrect");
        int testId = GRADES[0].length;
        int result = AppEAC4.setGradeTestAspirant(ASPIRANT_ID, testId, GRADE, GRADES);
        assertEquals(ERROR_INCORRECT_VALUE, result, "La funció ha de retornar error si el nombre de l'examen és menor que zero o major que el nombre d'exàmens");
    }

    @Test
    public void testSetGradeTestAspirantNotOKIfNegativeTestId() {
        System.out.println("testSetGradeTestAspirantNotOKIfNegativeTestId");
        int testId = -1;
        int result = AppEAC4.setGradeTestAspirant(ASPIRANT_ID, testId, GRADE, GRADES);
        assertEquals(ERROR_INCORRECT_VALUE, result, "La funció ha de retornar error si el nombre de l'examen és menor que zero o major que el nombre d'exàmens");
    }
    @Test
    public void testSetGradeTestAspirantNotOKIfAspirantNotInList() {
        System.out.println("testSetGradeTestAspirantNotOKIfAspirantNotInList");
        int fakeAspirantId = ASPIRANTS.length;
        int result = AppEAC4.setGradeTestAspirant(fakeAspirantId, TEST_ID, GRADE, GRADES);
        assertEquals(ERROR_INCORRECT_VALUE, result, "La funció ha de retornar error si la qualificació no és positiva o zero");
    }

    @Test
    public void testSetGradeTestAspirantNotOKIfGradesNull() {
        System.out.println("testSetGradeTestAspirantNotOKIfGradesNull");
        int result = AppEAC4.setGradeTestAspirant(ASPIRANT_ID, TEST_ID, GRADE,  null);
        assertEquals(ERROR_INCORRECT_VALUE, result, "La funció ha de retornar error si l'array de qualificacions és null");
    }
    /**
     * Test of getGrade method, of class AppEAC4.
     */
    @Test
    public void testGetGradeOK() {
        System.out.println("getGrade");
        GRADES[ASPIRANT_ID][TEST_ID]= GRADE;
        float result = AppEAC4.getGrade(ASPIRANT_ID, TEST_ID, GRADES);
        assertEquals(GRADE, result, 0,"La qualificació rescatada per la funció cercaQualificació no és correcta");
    }

    @Test
    public void testGetGradeNotOKIfNotGrade() {
        System.out.println("testGetGradeNotOKIfNotGrade");
        float result = AppEAC4.getGrade(ASPIRANT_ID, TEST_ID, GRADES);
        assertEquals(ERROR, result, 0,"Si no hi ha qualificació introduïda, el resultat haurà de ser error");
    }

    @Test
    public void testGetGradeNotOKIfTestIdIncorrect() {
        System.out.println("testGetGradeNotOKIfTestIdIncorrect");
        int testId = GRADES[0].length;
        float result = AppEAC4.getGrade(ASPIRANT_ID, testId, GRADES);
        assertEquals(ERROR_INCORRECT_VALUE, result, 0,"Si el nombre de l'examenm no és correcte, el resultat haurà de ser error");
    }

    @Test
    public void testGetGradeNotOKIfNegativeTestId() {
        System.out.println("testGetGradeNotOKIfNegativeTestId");
        int testId = -1;
        float result = AppEAC4.getGrade(ASPIRANT_ID, testId, GRADES);
        assertEquals(ERROR_INCORRECT_VALUE, result, 0,"Si el nombre de l'examenm no és correcte, el resultat haurà de ser error");
    }

    @Test
    public void testGetGradeNotOKIfAspirantIncorrect() {
        System.out.println("testGetGradeNotOKIfTestIdIncorrect");
        int idCandidat = GRADES.length;
        float result = AppEAC4.getGrade(idCandidat, TEST_ID, GRADES);
        assertEquals(ERROR_INCORRECT_VALUE, result, 0,"L'id de l'aspirant no és correcte, el resultat haurà de ser error");
    }

    @Test
    public void testGetGradeNotOKIfNegativeAspirant() {
        System.out.println("testGetGradeNotOKIfNegativeAspirant");
        int idCandidat = -1;
        float result = AppEAC4.getGrade(idCandidat, TEST_ID, GRADES);
        assertEquals(ERROR_INCORRECT_VALUE, result, 0,"L'id de l'aspirant no és correcte, el resultat haurà de ser error");
    }

    @Test
    public void testGetGradeNotOKIfGradesNull() {
        System.out.println("testGetGradeNotOKIfGradesNull");
        float result = AppEAC4.getGrade(ASPIRANT_ID, TEST_ID, null);
        assertEquals(ERROR_INCORRECT_VALUE, result, 0,"L'array de qualificacions és null, el resultat haurà de ser error");
    }
    /**
     * Test of showAspirantGradesByDocument method, of class AppEAC4.
     */

    void provideInput(String data) {
        if (data != null) {
            ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
            System.setIn(testIn);
        }
    }    
    
}
