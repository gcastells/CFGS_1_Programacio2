
import java.util.Scanner;
/**
 *
 * @author IOC
 */
public class AppEAC4 {

    public static final String[][] ASPIRANTS = {{"Reinwald", "Keppy", "11111111A"},{"Alfonse", "Nijssen", "22222222B"},{"Devon", "Clowes", "84284710N"},{"Sibelle", "Checchetelli", "75218483Y"},{"Nanette", "Monteaux", "40050691G"},{"Dori", "Cardo", "55748040D"},{"Gloria", "Baunton", "28510268X"},{"Melli", "Blumson", "81531907K"},{"Cymbre", "Clarke-Williams", "64083847Y"},{"Didi", "McGinty", "14713787Y"},{"Matthias", "Tuerena", "90319755M"},{"Munmro", "Eltringham", "57074037U"},{"Modesty", "Vasilyev", "73100689T"},{"Dusty", "Torbard", "85867256L"},{"Philipa", "Steely", "65413293Q"},{"Selene", "Keijser", "74323106T"},{"Virgilio", "Schwartz", "69080266S"},{"Farrel", "Oleszcuk", "99336060U"},{"Godfree", "O' Sullivan", "34021571P"},{"Laurella", "Foakes", "64884625K"},{"Putnem", "Howford", "70290911W"},{"Kenon", "Maillard", "72227665A"},{"Loralie", "Gillean", "66677539T"},{"Farah", "Abson", "84844161Y"},{"Cornell", "Hammon", "66528592X"},{"Hetti", "Ivanenko", "22130296Z"},{"Trix", "Saphin", "81391014O"},{"Estele", "Guyet", "47148577K"},{"Conrad", "Dallison", "63208490Q"},{"Rogers", "Colthard", "91816252O"},{"Eva", "Gorman", "91490448A"},{"Elka", "Blackey", "36463552T"},{"Carlita", "Jansky", "61827083P"},{"Stinky", "Caudell", "16249649S"},{"Maxy", "Arnholz", "53813609B"},{"Raquel", "Werlock", "40725601W"},{"Tam", "Phython", "35092261I"},{"Branden", "Dumbare", "85730803S"},{"Karlotta", "Nisbet", "67121986O"},{"Dermot", "Whittek", "39597482F"},{"Neron", "Bindley", "89589794J"},{"Gretchen", "Manilove", "30522576Y"},{"Artair", "Ledwidge", "48223239X"},{"Regina", "Foxwell", "20660071O"},{"Maisie", "Wilks", "63242314D"},{"Myrtie", "Danielsson", "52456635U"},{"Rodger", "Lodo", "90535992F"},{"Jolie", "Godspede", "76727958O"},{"Valentine", "Kilfeather", "32353757Z"},{"Glennie", "Pherps", "61664122P"},{"Lauri", "Thresh", "79976608U"},{"Kendre", "Giacomelli", "42988426V"},{"Siward", "Macoun", "22328257X"},{"Kristina", "Oxteby", "49556763D"},{"Forbes", "Edison", "34339223J"},{"Vinson", "Cicchelli", "55699487V"},{"Dacy", "July", "70288500J"},{"Isidor", "Cowley", "96764638T"},{"Florence", "Laughlan", "34734364C"},{"Nicolis", "Fullun", "62476709U"},{"Lucia", "Tuckwell", "74060008M"},{"Sonja", "Sparry", "33387552N"},{"Chiquita", "Loxston", "81983841V"},{"Diahann", "Assinder", "18789725K"},{"Brent", "Norrie", "94948416G"},{"Amber", "Gammade", "46593076O"},{"Suzanna", "Klimochkin", "39371000E"},{"Renaud", "Wallicker", "74089262A"},{"Mickey", "Tupman", "13870448A"},{"Caz", "Roll", "71110520N"},{"Bibby", "Skelhorn", "93900971L"},{"Thea", "Hartrick", "57472246I"},{"Gabby", "Massingham", "37252359I"},{"Wylie", "Beckey", "34858076C"},{"Tadd", "Oldale", "36472567K"},{"Carson", "Fynan", "76328683P"},{"Giselle", "Lejeune", "23135623X"},{"Verina", "Newlin", "78773892X"},{"Levi", "Mccaull", "86473239C"},{"Percy", "Klosser", "80262384X"},{"Rik", "Shorbrook", "51928669W"},{"Ardisj", "Lages", "99817132X"},{"Leon", "Duffet", "92187269S"},{"Killie", "Faro", "37458237P"},{"Mellie", "Gillions", "18356429U"},{"Antons", "Peregrine", "68316621K"},{"Nollie", "Rennels", "52545042X"},{"Agatha", "Whytock", "25930477Y"},{"Enos", "Josifovitz", "77280573A"},{"Garnet", "Haldin", "83797740Y"},{"Mal", "Piesold", "93944661N"},{"Redd", "Wildash", "62666653A"},{"Leigh", "Haston", "51635526A"},{"Louisette", "Goscomb", "57438908D"},{"Sallyanne", "Beecker", "48334263D"},{"Farrell", "Brimson", "27284417X"},{"Elisha", "Rolfo", "62804673B"},{"Marje", "Speke", "90661434D"},{"Romeo", "Sainteau", "63363641Y"},{"Vivianna", "Coveley", "44319449C"}};

    public static void main(String[] args) {
        AppEAC4 prg = new AppEAC4();
        prg.start();
    }

    private void start() {
        askForString("Hola, introdueix el teu nom", "Ets tonto, no has posat cap nom");

    }

    public static String askForString(String message, String errorMessage){
        return "";
    }

    public static float askForFloat(String message, String errorMessage) {
        return 0;
    }

    public static int askForInteger(String message, String errorMessage) {
        return 0;
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
                return 2;
            }
        }
        return -1;
    }

    public static float getGrade(int aspirantId, int testId, float[][] grades) {
        return 0;
    }

    public static int setGradeTestAspirant(int aspirantId, int testId, float grade, float[][] grades) {
        return 0;
    }

}