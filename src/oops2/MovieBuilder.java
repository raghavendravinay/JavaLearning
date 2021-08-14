package oops2;

import java.util.ArrayList;


public class MovieBuilder {

	ArrayList<MovieTickets> list = new ArrayList<MovieTickets>();

	public void addMovieTickets(MovieTickets m) {
		boolean flag = false;
		for (MovieTickets mvt : list) {
			if (mvt.getName().equals(m.getName())) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			list.add(m);
		}
	}

	public String removeTickets(String m) {
		MovieTickets mv = null;
		boolean flag = false;
		for (MovieTickets mt : list) {
			if (mt.getName().equals(m)) {
				mv = mt;
				flag = true;
				break;
			}
		}

		if (flag) {
			list.remove(mv);
		}
		return null;
	}

	public void printTicketValues() {
		for (MovieTickets mt : list) {
			System.out.println(mt);
		}
		System.out.println();
	}

	public MovieTickets getMovieTickets(String name) {
		for (MovieTickets mt : list) {
			if (mt.getName().equals(name)) {
				return mt;
			}
		}
		return null;
	}
}
