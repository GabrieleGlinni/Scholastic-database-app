import java.util.List;
import java.util.ArrayList; // serve l'import per creare una lista!!!

public class Studente {

    // identificativo studenti //

    private String nomeStudente;
    private String codicefiscale; // 16 NUMERI E/O LETTERE
    private static int ID = 52;
    private String citta;
    private String stato;
    private String nCellulare;
    private List<Studente> listastudenti = new ArrayList<Studente>(50);

    // GET-SET //

    public String getName() {
        return nomeStudente;
    }

    public String getCodicefiscale() {
        return codicefiscale;
    }

    public String getCitta() {
        return citta;
    }

    public String getStato() {
        return stato;
    }

    public String getnumeroCellulare() {
        return nCellulare;
    }

    public void setName(String nomeStudente) {
        this.nomeStudente = nomeStudente;
    }

    public void setCodicefiscale(String codicefiscale) {
        this.codicefiscale = codicefiscale;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public void setnumeroCellulare (String nCellulare) {
        this.nCellulare = nCellulare;
    }

    
    public void setStato(String stato) {
        this.stato = stato;
    }

    // METODI //

    public void nuovoStudente() {
        System.out.println("Nuovo studente registrato correttamente. Nome: " + nomeStudente + ", codice fiscale: "
                + codicefiscale + ", città: " + citta + ", stato: " + stato + ", cellulare: " + nCellulare + ".");

    }

    public void generaEmail() {
        String emailStudente;
        String mailnospazi = nomeStudente.replaceAll("\\s", "");
        emailStudente = mailnospazi.toLowerCase() + "@talentuniversity.com";
        System.out.println("Email generata: " + emailStudente);
    }

    public void generaID() {
        int random = (int) (Math.random() * 1000);
        String IDStudente = String.valueOf(ID) + String.valueOf(random) + (codicefiscale.substring(12, 16));
        System.out.println("ID studente generato: " + IDStudente);
    }

    public void iscrizione() {
        System.out.println(toString());
        nuovoStudente();
        listastudenti.add(new Studente());
        generaEmail();
        generaID();
    }

    @Override
    public String toString() {
        String login = "Aggiornamenti dei dati.";
        return login;
    }

    // INUTILIZZATI //

    // public void bilancio(int obiettivo) {
    // for (int i = 0; i < listastudenti.size(); i++) {
    // if (i < listastudenti.size()) {
    // obiettivo = listastudenti.size() - i;
    // System.out.println("Mancano " + obiettivo + " studenti all'obiettivo");
    // } else {
    // System.out.println("Obiettivo raggiunto.");
    // }
    // }
    // }

}
