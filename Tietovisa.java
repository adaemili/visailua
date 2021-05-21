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
		System.out.println(nimi + ", sait " + pisteet + " pistett�.");
		// Kutsutaan palaute-metodia pisteet-arvolla josta saadaan pelaajalle palaute
		palaute(pisteet);

	}

	public static String terveTuloajaNimi() {
		// Luodaan lukija
		Scanner lukija = new Scanner(System.in);
		String nimi = "";

		// Tervehdit��n ja kerrotaan pelin nimi

		System.out.println("Hei! T�m� on monivalintatietovisa.");
		System.out.println();
		// Kysyt��n pelaajan nimi ja toivotetaan pelaaja tervetulleeksi
		System.out.print("Kerro ensin nimesi: ");
		nimi = lukija.next();
		System.out.println("L�mpim�sti tervetuloa visailemaan " + nimi + "!");
		// Kerrotaan pelin s��nn�t ja toivotetaan onnea pelaajalle
		System.out.println("Seuraavaksi saat lyhyet ohjeet peliin: ");
		System.out.println();
		System.out.println("Kysymyksi� on yhteens� 15.");
		System.out.println(
				"Jokaisessa kysymyksess� on kolme vastausvaihtoehtoa (A, B ja C) ja vain yksi vaihtoehdoista on oikea.");
		System.out.println("Vastaa kysymykseen kirjoittamalla oikea vastausvaihtoehto ISOLLA KIRJAIMELLA.");
		System.out.println("Onnea peliin " + nimi + ", nyt aloitetaan!");
		// Palautetaan pelaajan nimi main-metodiin
		return nimi;
	}

	public static int visailua() {
		Scanner lukija = new Scanner(System.in);
		int pisteet = 0;

		// Kysymykset otettu Trivial Pursuit CLassic Edition 2016 -lautapelist�
		// Joitain kysymyksi� ja vastausvaihtoehtoja muokkasin itse

		// ENSIMM�INEN KYSYMYS
		// Esitell��n ja alustetaan muuttuja vastaus
		String vastaus = "";
		// Kysyt��n kysymys ja annetaan vastausvaihtoehdot
		System.out.println("1. Kuinka monta s�ett� on limerikiss�?\n" + "(A) kolme\n(B) seitsem�n\n(C) viisi");
		// Luetaan vastaus
		vastaus = lukija.next();
		// Jos vastaus oikein, pelaaja saa pisteen ja pistem��r� kasvaa yhdell�
		if (vastaus.equals("C")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
			// Jos vastaus v��rin, kerrotaan oikea vastaus ja pistem��r� ei kasva
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (C) viisi.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// TOINEN KYSYMYS
		String vastaus2 = "";
		System.out.println("2. Mik� k�dellinen on maailman suurin puussa asuva nis�k�s, ja voi painaa jopa 90 kiloa?\n"
				+ "(A) laiskiainen\n(B) oranki\n(C) apina");
		vastaus2 = lukija.next();
		if (vastaus2.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (B) oranki.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// KOLMAS KYSYMYS
		String vastaus3 = "";
		System.out.println("3. Miss� kaupungissa sijaitsee sanomoalehti Kalevan p��konttori?\n"
				+ "(A) Tampereella\n(B) Sein�joella\n(C) Oulussa");
		vastaus3 = lukija.next();
		if (vastaus3.equals("C")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (C) Oulussa.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// NELJ�S KYSYMYS
		String vastaus4 = "";
		System.out.println("4. Mik� seuraavista taistelulajeista ei ole kotoisin Japanista?\n"
				+ "(A) jujutsu\n(B) taekwondo\n(C) karate");
		vastaus4 = lukija.next();
		if (vastaus4.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (B) taekwondo.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// VIIDES KYSYMYS
		String vastaus5 = "";
		System.out.println("5. Mill� termill� kutsutaan t�hte� ymp�r�iv�� elinkelpoista vy�hykett�?\n"
				+ "(A) kultakutri\n(B) ruusunen\n(C) susihukka");
		vastaus5 = lukija.next();
		if (vastaus5.equals("A")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (A) kultakutri.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// KUUDES KYSYMYS
		String vastaus6 = "";
		System.out.println("6. Mik� on koonto?\n" + "(A) voimisteluliike\n(B) ihmispyramidi\n(C) uimahyppy");
		vastaus6 = lukija.next();
		if (vastaus6.equals("A")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (A) voimisteluliike.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// SEITSEM�S KYSYMYS
		String vastaus7 = "";
		System.out.println(
				"7. Mink� maan p��kaupunki on San Salvador?\n" + "(A) El Salvador\n(B) Guatemala\n(C) Nicaragua");
		vastaus7 = lukija.next();
		if (vastaus7.equals("A")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (A) El Salvador.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// KAHDEKSAS KYSYMYS
		String vastaus8 = "";
		System.out.println("8. Kuinka usein j�rjestet��n jalkapallon MM-kisat?\n"
				+ "(A) joka viides vuosi\n(B) joka vuosi\n(C) joka nelj�s vuosi");
		vastaus8 = lukija.next();
		if (vastaus8.equals("C")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (C) joka nelj�s vuosi.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// YHDEKS�S KYSYMYS
		String vastaus9 = "";
		System.out.println(
				"9. Mik� seuraavista ei ole sosiaalisen median kirpputoripalstoilla k�ytt��n vakiintunut lyhenne?\n"
						+ "(A) AV\n(B) UV\n(C) MMM");
		vastaus9 = lukija.next();
		if (vastaus9.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (B) UV.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// KYMMENES KYSYMYS
		String vastaus10 = "";
		System.out.println("10. Mik� 1900-luvun vuosikymmenist� ansaitsi lis�nimen \"iloinen\"?\n"
				+ "(A) 1910-luku\n(B) 1920-luku\n(C) 1940-luku");
		vastaus10 = lukija.next();
		if (vastaus10.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (B) 1920-luku.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// YHDESTOISTA KYSYMYS
		String vastaus11 = "";
		System.out.println("11. Mik� viidest� aistista puuttuu, jos henkil� k�rsii anosmiasta?\n"
				+ "(A) n�koaisti\n(B) kuuloaisti\n(C) hajuaisti");
		vastaus11 = lukija.next();
		if (vastaus11.equals("C")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (C) hajuaisti.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// KAHDESTOISTA KYSYMYS
		String vastaus12 = "";
		System.out.println("12. Mink� tyyppisi� makeisia Ronald Reagan tarjoili vierailleen Valkoisessa talossa?\n"
				+ "(A) hedelm�rakeita\n(B) toffeeta\n(C) salmiakkia");
		vastaus12 = lukija.next();
		if (vastaus12.equals("A")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (A) hedelm�rakeita.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// KOLMASTOISTA KYSYMYS
		String vastaus13 = "";
		System.out.println("13. Mill� muodolla kuvataan samankaltaisuuksia Venn-diagrammissa?\n"
				+ "(A) neli�ll�\n(B) ympyr�ll�\n(C) kolmiolla");
		vastaus13 = lukija.next();
		if (vastaus13.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (B) ympyr�ll�.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// NELJ�STOISTA KYSYMYS
		String vastaus14 = "";
		System.out.println("14. Mink� p��ll� wakeboardingia harrastetaan?\n" + "(A) lumen\n(B) veden\n(C) hiekan");
		vastaus14 = lukija.next();
		if (vastaus14.equals("B")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (B) veden.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();

		// VIIDESTOISTA KYSYMYS
		String vastaus15 = "";
		System.out.println("15. Mit� antofobiasta k�rsiv� ihminen pelk��?\n"
				+ "(A) korkeita paikkoja\n(B) muurahaisia\n(C) kukkia");
		vastaus15 = lukija.next();
		if (vastaus15.equals("C")) {
			System.out.println("Oikein meni, sait yhden pisteen!");
			pisteet = pisteet + 1;
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		} else {
			System.out.println("V��r� vastaus, oikea vastaus on (C) kukkia.");
			System.out.println("Sinulla on " + pisteet + " pistett�.");
		}
		System.out.println();
		// Tulostetaan pelaajan vastausrivi
		System.out.println("T�ss� antamasi vastausrivi: " + vastaus + vastaus2 + vastaus3 + vastaus4 + vastaus5
				+ vastaus6 + vastaus7 + vastaus8 + vastaus9 + vastaus10 + vastaus11 + vastaus12 + vastaus13 + vastaus14
				+ vastaus15);
		// Tulostetaan oikea vastausrivi
		System.out.println("T�ss� oikeat vastaukset:    " + "CBCBAAACBBCABBC");
		System.out.println();
		// Palautetaan pelaajan pisteet main-metodiin
		return pisteet;
	}

	public static void palaute(int pisteet) {

		// T�ss� metodissa annetaan palaute saatujen pisteiden perusteella
		// My�s jos pistem��r� joku muu kuin 0-15 ilmoitetaan sen olevan mahdoton

		if (pisteet >= 0 && pisteet <= 5) {
			System.out.println("Menip� kehnosti...");
		} else if (pisteet >= 6 && pisteet <= 10) {
			System.out.println("Se meni aika hyvin!");
		} else if (pisteet >= 11 && pisteet <= 15) {
			System.out.println("Vau, se meni todella hyvin. Hyv� sin�!");
		} else {
			System.out.println("T�llainen pistem��r� ei voi olla mahdollinen.");
		}

	}
}
