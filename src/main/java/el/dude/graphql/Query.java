package el.dude.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.List;

/**
 * (C) Copyright 2020 Hewlett Packard Enterprise Development LP
 *
 * @author Gabriel Inäbnit - 2020-07-17
 */
public class Query implements GraphQLQueryResolver
{
	private PersonDao personDao;

	public Query(PersonDao personDao)
	{
		this.personDao = personDao;
	}

	public List<Person> getListByAge(int age)
	{
		return personDao.listByAge(age);
	}

	public List<Person> getList()
	{
		return personDao.list();
	}

	public Person getOldest()
	{
		return personDao.getOldestPerson();
	}
}
