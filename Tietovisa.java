package Tietovisa;

import java.util.Scanner;

public class Tietovisa {
	public static void main(String[] args) {

		// Kutsutaan tervetTuloajaNimi-metodia josta palautetaan pelaajan nimi
		String nimi = terveTuloajaNimi();
		System.out.println();
		// Kutsutaan visailua-metodia josta palautetaan pelaajan saamat pisteet
		int pisteet = visailua();
		// Kerrotaan pelaajan saamat pisteet
		System.out.println("Vastasit kaikkiin kysymyksiin.");
		System.out.println("Katsotaan, miten onnistuit!");
		System.out.println(nimi + ", sait " + pisteet + " pistettä.");
		// Kutsutaan palaute-metodia pisteet-arvolla josta saadaan pelaajalle palaute
		palaute(pisteet);

	}

	public static String terveTuloajaNimi() {
		// Luodaan lukija
		Scanner lukija = new Scanner(System.in);
		String nimi = "";

		// Tervehditään ja kerrotaan pelin nimi

		System.out.println("Hei! Tämä on monivalintatietovisa.");
		System.out.println();
		// Kysytään pelaajan nimi ja toivotetaan pelaaja tervetulleeksi
		System.out.print("Kerro ensin nimesi: ");
		nimi = lukija.next();
		System.out.println("Lämpimästi tervetuloa visailemaan " + nimi + "!");
		// Kerrotaan pelin säännöt ja toivotetaan onnea pelaajalle
		System.out.println("Seuraavaksi saat lyhyet ohjeet peliin: ");
		System.out.println();
		System.out.println("Kysymyksiä on yhteensä 15.");
		System.out.println(
				"Jokaisessa kysymyksessä on kolme vastausvaihtoehtoa (A, B ja C) ja vain yksi vaihtoehdoista on oikea.");
		System.out.println("Vastaa kysymykseen kirjoittamalla oikea vastausvaihtoehto ISOLLA KIRJAIMELLA.");
		System.out.println("Onnea peliin " + nimi + ", nyt aloitetaan!");
		// Palautetaan pelaajan nimi main-metodiin
		return nimi;
	}

	public static int visailua() {
		Scanner lukija = new Scanner(System.in);
		int pisteet = 0;

		// Kysymykset otettu Trivial Pursuit CLassic Edition 2016 -lautapelistä
		// Joitain kysymyksiä ja vastausvaihtoehtoja muokkasin itse

		// ENSIMMÄINEN KYSYMYS
		// Esitellään ja alustetaan muuttuja vastaus
		String vastaus = "";
		// Kysytään kysymys ja annetaan vastausvaihtoehdot
		System.out.println("1. Kuinka monta säettä on limerikissä?\n" + "(A) kolme\n(B) seitsemän\n(C) viisi");
		// Luetaan vastaus
		vastaus = lukija.next();
		// Jos vastaus oikein, pelaaja saa pisteen ja pistemäärä kasvaa yhdellä
		if (vastaus.equals("C")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
			// Jos vastaus väärin, kerrotaan oikea vastaus ja pistemäärä ei kasva
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (C) viisi.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// TOINEN KYSYMYS
		String vastaus2 = "";
		System.out.println("2. Mikä kädellinen on maailman suurin puussa asuva nisäkäs, ja voi painaa jopa 90 kiloa?\n"
				+ "(A) laiskiainen\n(B) oranki\n(C) apina");
		vastaus2 = lukija.next();
		if (vastaus2.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (B) oranki.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// KOLMAS KYSYMYS
		String vastaus3 = "";
		System.out.println("3. Missä kaupungissa sijaitsee sanomoalehti Kalevan pääkonttori?\n"
				+ "(A) Tampereella\n(B) Seinäjoella\n(C) Oulussa");
		vastaus3 = lukija.next();
		if (vastaus3.equals("C")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (C) Oulussa.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// NELJÄS KYSYMYS
		String vastaus4 = "";
		System.out.println("4. Mikä seuraavista taistelulajeista ei ole kotoisin Japanista?\n"
				+ "(A) jujutsu\n(B) taekwondo\n(C) karate");
		vastaus4 = lukija.next();
		if (vastaus4.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (B) taekwondo.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// VIIDES KYSYMYS
		String vastaus5 = "";
		System.out.println("5. Millä termillä kutsutaan tähteä ympäröivää elinkelpoista vyöhykettä?\n"
				+ "(A) kultakutri\n(B) ruusunen\n(C) susihukka");
		vastaus5 = lukija.next();
		if (vastaus5.equals("A")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (A) kultakutri.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// KUUDES KYSYMYS
		String vastaus6 = "";
		System.out.println("6. Mikä on koonto?\n" + "(A) voimisteluliike\n(B) ihmispyramidi\n(C) uimahyppy");
		vastaus6 = lukija.next();
		if (vastaus6.equals("A")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (A) voimisteluliike.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// SEITSEMÄS KYSYMYS
		String vastaus7 = "";
		System.out.println(
				"7. Minkä maan pääkaupunki on San Salvador?\n" + "(A) El Salvador\n(B) Guatemala\n(C) Nicaragua");
		vastaus7 = lukija.next();
		if (vastaus7.equals("A")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (A) El Salvador.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// KAHDEKSAS KYSYMYS
		String vastaus8 = "";
		System.out.println("8. Kuinka usein järjestetään jalkapallon MM-kisat?\n"
				+ "(A) joka viides vuosi\n(B) joka vuosi\n(C) joka neljäs vuosi");
		vastaus8 = lukija.next();
		if (vastaus8.equals("C")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (C) joka neljäs vuosi.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// YHDEKSÄS KYSYMYS
		String vastaus9 = "";
		System.out.println(
				"9. Mikä seuraavista ei ole sosiaalisen median kirpputoripalstoilla käyttöön vakiintunut lyhenne?\n"
						+ "(A) AV\n(B) UV\n(C) MMM");
		vastaus9 = lukija.next();
		if (vastaus9.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (B) UV.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// KYMMENES KYSYMYS
		String vastaus10 = "";
		System.out.println("10. Mikä 1900-luvun vuosikymmenistä ansaitsi lisänimen \"iloinen\"?\n"
				+ "(A) 1910-luku\n(B) 1920-luku\n(C) 1940-luku");
		vastaus10 = lukija.next();
		if (vastaus10.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (B) 1920-luku.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// YHDESTOISTA KYSYMYS
		String vastaus11 = "";
		System.out.println("11. Mikä viidestä aistista puuttuu, jos henkilö kärsii anosmiasta?\n"
				+ "(A) näkoaisti\n(B) kuuloaisti\n(C) hajuaisti");
		vastaus11 = lukija.next();
		if (vastaus11.equals("C")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (C) hajuaisti.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// KAHDESTOISTA KYSYMYS
		String vastaus12 = "";
		System.out.println("12. Minkä tyyppisiä makeisia Ronald Reagan tarjoili vierailleen Valkoisessa talossa?\n"
				+ "(A) hedelmärakeita\n(B) toffeeta\n(C) salmiakkia");
		vastaus12 = lukija.next();
		if (vastaus12.equals("A")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (A) hedelmärakeita.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// KOLMASTOISTA KYSYMYS
		String vastaus13 = "";
		System.out.println("13. Millä muodolla kuvataan samankaltaisuuksia Venn-diagrammissa?\n"
				+ "(A) neliöllä\n(B) ympyrällä\n(C) kolmiolla");
		vastaus13 = lukija.next();
		if (vastaus13.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (B) ympyrällä.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// NELJÄSTOISTA KYSYMYS
		String vastaus14 = "";
		System.out.println("14. Minkä päällä wakeboardingia harrastetaan?\n" + "(A) lumen\n(B) veden\n(C) hiekan");
		vastaus14 = lukija.next();
		if (vastaus14.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (B) veden.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();

		// VIIDESTOISTA KYSYMYS
		String vastaus15 = "";
		System.out.println("15. Mitä antofobiasta kärsivä ihminen pelkää?\n"
				+ "(A) korkeita paikkoja\n(B) muurahaisia\n(C) kukkia");
		vastaus15 = lukija.next();
		if (vastaus15.equals("C")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		} else {
			System.out.println("Väärä vastaus, oikea vastaus on (C) kukkia.");
			System.out.println("Sinulla on " + pisteet + " pistettä.");
		}
		System.out.println();
		// Tulostetaan pelaajan vastausrivi
		System.out.println("Tässä antamasi vastausrivi: " + vastaus + vastaus2 + vastaus3 + vastaus4 + vastaus5
				+ vastaus6 + vastaus7 + vastaus8 + vastaus9 + vastaus10 + vastaus11 + vastaus12 + vastaus13 + vastaus14
				+ vastaus15);
		// Tulostetaan oikea vastausrivi
		System.out.println("Tässä oikeat vastaukset:    " + "CBCBAAACBBCABBC");
		System.out.println();
		// Palautetaan pelaajan pisteet main-metodiin
		return pisteet;
	}

	public static void palaute(int pisteet) {

		// Tässä metodissa annetaan palaute saatujen pisteiden perusteella
		// Myös jos pistemäärä joku muu kuin 0-15 ilmoitetaan sen olevan mahdoton

		if (pisteet >= 0 && pisteet <= 5) {
			System.out.println("Menipä kehnosti...");
		} else if (pisteet >= 6 && pisteet <= 10) {
			System.out.println("Se meni aika hyvin!");
		} else if (pisteet >= 11 && pisteet <= 15) {
			System.out.println("Vau, se meni todella hyvin. Hyvä sinä!");
		} else {
			System.out.println("Tällainen pistemäärä ei voi olla mahdollinen.");
		}

	}
}
