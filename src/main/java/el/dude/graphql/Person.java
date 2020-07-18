package el.dude.graphql;

import lombok.Data;

/**
 * (C) Copyright 2020 Hewlett Packard Enterprise Development LP
 *
 * @author Gabriel Inäbnit - 2020-07-17
 */

@Data
public class Person
{
	private String id;
	private String name;
	private int    age;
}
