public class Amministrazione {

    private double bilancio;

    public void pagamenti(double totaleRetta) {
        double rettamensile = totaleRetta / 4;
        System.out.println("La retta mensile è: " + rettamensile + ".");
        System.out.println("Il totale da pagare è: " + totaleRetta + ".");
    }

    public void versamentoRetta(double versamento) {
        if (versamento > 0.0) {
            bilancio = bilancio + versamento;
        }
        System.out.println(bilancio);
    }

    public double calcolobilancio(double bilancio) {
        if (bilancio > 0.0) {
            this.bilancio = bilancio;
        }
        System.out.println("Il bilancio attuale è: " + bilancio + ".");
        return bilancio;
    }

    public void elencoCorsi() {
        String corso1 = "Interpretariato inglese";
        String corso2 = "Traduzione francese";
        String corso3 = "Linguistica computazionale";
        System.out.println("Elenco corsi: " + corso1 + ", " + corso2 + ", " + corso3 + ".");
    }

}
