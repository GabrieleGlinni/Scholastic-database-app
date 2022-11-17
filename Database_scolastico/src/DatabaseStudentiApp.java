public class DatabaseStudentiApp {

    // ✓ 1. Costruttore studenti che include SSN e nome,
    // ✓ 2. Crea un'email in modo automatico partendo dal nome,
    // ✓ 3. ID private + static,
    // ✓ 4. L'ID è generato da una combinazione di ID statico, numeri random tra
    // 1000
    // e 9000, e ultime 4 cifre del SSN,
    // ✓ 5. Metodi: iscrizione(), pagamenti(), bilancio(), toString(), corsi(),
    // ✓ 6. Usare incapsulamento per le seguenti variabili: telefono, città, stato
    public static void main(String[] args) {
        Studente GabrieleGlinni = new Studente();
        GabrieleGlinni.setName("Gabriele Glinni");
        GabrieleGlinni.setCodicefiscale("GLNGRL2223334445");
        GabrieleGlinni.setStato("Italia");
        GabrieleGlinni.setCitta("Roma");
        GabrieleGlinni.setnumeroCellulare("3382558779");
        GabrieleGlinni.iscrizione();

        Amministrazione talentschool = new Amministrazione();
        talentschool.pagamenti(5000);
        talentschool.calcolobilancio(10000);
        talentschool.elencoCorsi();

    }
}
