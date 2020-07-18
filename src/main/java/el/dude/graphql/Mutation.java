package el.dude.graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;

import java.util.UUID;

/**
 * (C) Copyright 2020 Hewlett Packard Enterprise Development LP
 *
 * @author Gabriel Inäbnit - 2020-07-17
 */
public class Mutation implements GraphQLMutationResolver
{
	private PersonDao personDao;

	public Mutation(PersonDao personDao)
	{
		this.personDao = personDao;
	}

	public Person addPerson(String name, int age)
	{
		Person person = new Person();
		person.setId(UUID.randomUUID().toString());
		person.setName(name);
		person.setAge(age);
		personDao.addPerson(person);
		return person;
	}
}
