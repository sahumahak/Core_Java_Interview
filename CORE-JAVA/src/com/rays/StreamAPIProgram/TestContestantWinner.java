package com.rays.StreamAPIProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestantWinner {

	public static void main(String[] args) {

		List<ContestantWinner> list = new ArrayList<ContestantWinner>();

		list.add(new ContestantWinner("8985878546", "Ishika"));
		list.add(new ContestantWinner("7596325878", "Mahak"));
		list.add(new ContestantWinner("9865325478", "Ishu"));
		list.add(new ContestantWinner("7536985245", "Rohan"));
		
		list.stream().map(e -> e.getName() + " " + e.getPhoneNo()).distinct()

				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {

					Collections.shuffle(e);

					return e.stream();

				})).limit(2).forEach(e -> System.out.println(e));

	}

}
