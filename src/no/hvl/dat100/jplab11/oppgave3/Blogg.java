package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];

	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];

	}

	public int getAntall() {
		return nesteledig;

	}

	public Innlegg[] getSamling() {
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) >= 0;
	}

	public boolean ledigPlass() {
		return (nesteledig < innleggtabell.length);

	}

	public boolean leggTil(Innlegg innlegg) {
		if (finnes(innlegg) || !ledigPlass())
			return false;
		innleggtabell[nesteledig] = innlegg;
		nesteledig++;
		return true;

	}

	public String toString() {
		String s = getAntall() + "\n";
		for (int i = 0; i < innleggtabell.length; i++) {
			s = s + innleggtabell[i].toString();

		}
		return s;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}
